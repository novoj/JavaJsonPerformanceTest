package org.novoj.json

import org.novoj.json.model.PhotoAlbum
import org.novoj.json.model.PhotoAlbumFactory
import org.novoj.json.transformer.gson.GsonIO

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: GsonIOTest,28.1.12 22:17 u_jno Exp $
*/
abstract class AbstractPerformanceTest extends GroovyTestCase {
	private final static Integer WARM_UP_ITERATION_COUNT = 250;
	private final static Integer ITERATION_COUNT = 3000;
	private final static Integer PHOTO_COUNT = 200
	
	File getStoreFolder() {
		String path = System.getProperty("java.io.tmpdir") + "/" + this.class.simpleName + "/"
		File folder = new File(path)
		if (!folder.exists()) {
			folder.mkdirs();
		}
		return folder
	}

	void testSerializePhotoAlbum() {
		File baseFolder = getStoreFolder()
		PhotoAlbumFactory factory = new PhotoAlbumFactory()
		Long timeElapsed = 0
		Long totalByteCount = 0
		for (i in 1 .. ITERATION_COUNT + WARM_UP_ITERATION_COUNT) {
			PhotoAlbum album = factory.generatePhotoAlbum("Generic album ${i}", PHOTO_COUNT)
			Long startTime = System.currentTimeMillis()
			String json = serialize(album)
			Long endTime = System.currentTimeMillis()
			if (i > WARM_UP_ITERATION_COUNT) {
				timeElapsed += endTime - startTime
				totalByteCount += json.getBytes("utf-8").length
			}
			File targetFile = new File("${baseFolder.absolutePath}/photoAlbum_${i}.json")
			targetFile.write(json, "utf-8")
			if (i % 200 == 0) {
				print "."
			}
		}

		println """
${this.class.simpleName} serialized ${ITERATION_COUNT} albums in ${timeElapsed} ms, one per ${(float)timeElapsed / (float)ITERATION_COUNT}.
Written ${Math.round(totalByteCount / 1000)} KB, ${Math.round(totalByteCount/ITERATION_COUNT/1000)} KB per per file.
"""
	}

	protected abstract String serialize(PhotoAlbum album);

	void testDeserializePhotoAlbum() {
		GsonIO gsonIO = new GsonIO()
		File baseFolder = getStoreFolder()
		Long timeElapsed = 0
		Long totalByteCount = 0
		for (i in 1 .. ITERATION_COUNT + WARM_UP_ITERATION_COUNT) {
			File targetFile = new File("${baseFolder.absolutePath}/photoAlbum_${i}.json")
			String json = targetFile.getText("utf-8")
			Long startTime = System.currentTimeMillis()
			PhotoAlbum album = deserialize(json)
			Long endTime = System.currentTimeMillis()
			assertNotNull("Deserialized album is null!", album)
			assertEquals("Generic album ${i}", album.name)
			assertEquals(PHOTO_COUNT, album.getPhotos().size())
			if (i > WARM_UP_ITERATION_COUNT) {
				timeElapsed += endTime - startTime
				totalByteCount += json.getBytes("utf-8").length
			}			
			if (i % 200 == 0) {
				print "."
			}
		}

		println """
${this.class.simpleName} deserialized ${ITERATION_COUNT} albums in ${timeElapsed} ms, one per ${(float)timeElapsed / (float)ITERATION_COUNT}.
Read ${Math.round(totalByteCount / 1000)} KB, ${Math.round(totalByteCount/ITERATION_COUNT/1000)} KB per per file."""
	}

	protected abstract PhotoAlbum deserialize(String json);

}

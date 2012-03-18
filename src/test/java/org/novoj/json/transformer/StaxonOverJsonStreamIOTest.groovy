package org.novoj.json.transformer

import org.novoj.json.AbstractPerformanceTest
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.staxon.StaxonOverJsonStreamIO

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: GsonIOTest,28.1.12 22:17 u_jno Exp $
*/
class StaxonOverJsonStreamIOTest extends AbstractPerformanceTest {
	private StaxonOverJsonStreamIO staxonIO = new StaxonOverJsonStreamIO()

	protected String serialize(PhotoAlbum album) {
		String json = staxonIO.serializePhotoAlbum(album)
		return json
	}

	protected PhotoAlbum deserialize(String json) {
		PhotoAlbum album = staxonIO.deserializePhotoAlbum(json)
		return album
	}

}

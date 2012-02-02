package org.novoj.json.transformer

import org.novoj.json.AbstractPerformanceTest
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.protostuff.ProtostuffIO

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: GsonIOTest,28.1.12 22:17 u_jno Exp $
*/
class ProtostuffIOTest extends AbstractPerformanceTest {
	private ProtostuffIO protostuffIO = new ProtostuffIO()

	protected String serialize(PhotoAlbum album) {
		String json = protostuffIO.serializePhotoAlbum(album)
		return json
	}

	protected PhotoAlbum deserialize(String json) {
		PhotoAlbum album = protostuffIO.deserializePhotoAlbum(json)
		return album
	}

}

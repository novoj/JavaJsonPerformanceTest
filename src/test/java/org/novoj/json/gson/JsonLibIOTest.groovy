package org.novoj.json.gson

import org.novoj.json.jsonLib.JsonLibIO
import org.novoj.json.model.PhotoAlbum

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: GsonIOTest,28.1.12 22:17 u_jno Exp $
*/
class JsonLibIOTest extends AbstractPerformanceTest {
	private JsonLibIO jsonLibIO = new JsonLibIO()

	protected String serialize(PhotoAlbum album) {
		String json = jsonLibIO.serializePhotoAlbum(album)
		return json
	}

	protected PhotoAlbum deserialize(String json) {
		PhotoAlbum album = jsonLibIO.deserializePhotoAlbum(json)
		return album
	}

}

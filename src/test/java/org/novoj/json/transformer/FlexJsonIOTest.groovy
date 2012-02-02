package org.novoj.json.transformer

import org.novoj.json.AbstractPerformanceTest
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.flexJson.FlexJsonIO

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: GsonIOTest,28.1.12 22:17 u_jno Exp $
*/
class FlexJsonIOTest extends AbstractPerformanceTest {
	private FlexJsonIO flexJsonIO = new FlexJsonIO()

	protected String serialize(PhotoAlbum album) {
		String json = flexJsonIO.serializePhotoAlbum(album)
		return json
	}

	protected PhotoAlbum deserialize(String json) {
		PhotoAlbum album = flexJsonIO.deserializePhotoAlbum(json)
		return album
	}

}

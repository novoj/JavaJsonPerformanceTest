package org.novoj.json.transformer

import org.novoj.json.AbstractPerformanceTest
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.jackson.JacksonIO

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: GsonIOTest,28.1.12 22:17 u_jno Exp $
*/
class JacksonIOTest extends AbstractPerformanceTest {
	private JacksonIO jacksonIO = new JacksonIO()

	protected String serialize(PhotoAlbum album) {
		String json = jacksonIO.serializePhotoAlbum(album)
		return json
	}

	protected PhotoAlbum deserialize(String json) {
		PhotoAlbum album = jacksonIO.deserializePhotoAlbum(json)
		return album
	}

}

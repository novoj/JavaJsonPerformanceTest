package org.novoj.json.transformer

import org.novoj.json.AbstractPerformanceTest
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.jsonMarshaller.JsonMarshallerIO

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: GsonIOTest,28.1.12 22:17 u_jno Exp $
*/
class JsonMarshallerIOTest extends AbstractPerformanceTest {
	private JsonMarshallerIO jsonMarshallerIO = new JsonMarshallerIO()

	protected String serialize(PhotoAlbum album) {
		String json = jsonMarshallerIO.serializePhotoAlbum(album)
		return json
	}

	protected PhotoAlbum deserialize(String json) {
		PhotoAlbum album = jsonMarshallerIO.deserializePhotoAlbum(json)
		return album
	}

}

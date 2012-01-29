package org.novoj.json.jsonMarshaller

import com.twolattes.json.Json
import com.twolattes.json.Marshaller
import com.twolattes.json.TwoLattes
import org.novoj.json.JsonIO
import org.novoj.json.model.PhotoAlbum

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: GsonIO,28.1.12 22:13 u_jno Exp $
 */
class JsonMarshallerIO implements JsonIO {
	private Marshaller<PhotoAlbum> marshaller = TwoLattes.createMarshaller(PhotoAlbum.class);

	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		Json.Value o = marshaller.marshall(photoAlbum)
		return o.toString();
	}

	PhotoAlbum deserializePhotoAlbum(String json) {
		Json.Value o = Json.fromString(json)
		return marshaller.unmarshall(o, json)
	}

}

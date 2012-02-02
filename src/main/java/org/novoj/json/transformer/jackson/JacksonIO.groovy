package org.novoj.json.transformer.jackson

import org.codehaus.jackson.map.ObjectMapper
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.JsonIO

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: GsonIO,28.1.12 22:13 u_jno Exp $
 */
class JacksonIO implements JsonIO {
	private ObjectMapper mapper = new ObjectMapper();

	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		return mapper.writeValueAsString(photoAlbum)
	}

	PhotoAlbum deserializePhotoAlbum(String json) {
		return mapper.readValue(json, PhotoAlbum.class)
	}

}

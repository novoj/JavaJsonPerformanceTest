package org.novoj.json.transformer.gson

import com.google.gson.Gson
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.JsonIO

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: GsonIO,28.1.12 22:13 u_jno Exp $
 */
class GsonIO implements JsonIO {
	private Gson gson = new Gson();

	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		return gson.toJson(photoAlbum);
	}

	PhotoAlbum deserializePhotoAlbum(String json) {
		return gson.fromJson(json, PhotoAlbum.class)
	}

}

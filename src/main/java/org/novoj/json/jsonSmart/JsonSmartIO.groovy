package org.novoj.json.jsonSmart

import net.minidev.json.JSONValue
import org.apache.commons.lang.NotImplementedException
import org.novoj.json.JsonIO
import org.novoj.json.model.PhotoAlbum

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: GsonIO,28.1.12 22:13 u_jno Exp $
 */
class JsonSmartIO implements JsonIO {

	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		StringBuilder result = new StringBuilder()
		JSONValue.writeJSONString(photoAlbum, result);
		return result.toString()
	}

	PhotoAlbum deserializePhotoAlbum(String json) {
		throw new NotImplementedException("Available in version 2 which is beta.");
	}

}

package org.novoj.json.jsonLib

import net.sf.json.JSONObject
import net.sf.json.JsonConfig
import org.novoj.json.JsonIO
import org.novoj.json.model.PhotoAlbum

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: JsonLibIO,29.1.12 13:48 u_jno Exp $
*/
class JsonLibIO implements JsonIO {
	private JsonConfig config;

	JsonLibIO() {
		config = new JsonConfig()
		config.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor())
	}

	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		JSONObject jsonObj = JSONObject.fromObject(photoAlbum, config)
		return jsonObj.toString()
	}

	PhotoAlbum deserializePhotoAlbum(String json) {
		JSONObject jsonObj = JSONObject.fromObject(json, config)
		return JSONObject.toBean(jsonObj, PhotoAlbum.class)
	}

}

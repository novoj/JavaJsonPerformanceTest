package org.novoj.json.transformer.fastjson

import com.alibaba.fastjson.JSON
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.JsonIO

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: GsonIO,28.1.12 22:13 u_jno Exp $
 */
class FastJsonIO implements JsonIO {

	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		return JSON.toJSONString(photoAlbum)
	}

	PhotoAlbum deserializePhotoAlbum(String json) {
		return JSON.parseObject(json, PhotoAlbum.class);
	}

}

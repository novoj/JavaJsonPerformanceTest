package org.novoj.json.transformer.flexJson

import flexjson.JSONDeserializer
import flexjson.JSONSerializer
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.JsonIO

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: GsonIO,28.1.12 22:13 u_jno Exp $
 */
class FlexJsonIO implements JsonIO {
	private JSONSerializer serializer;
	private JSONDeserializer<PhotoAlbum> deserializer;

	FlexJsonIO() {
		serializer = new JSONSerializer()
		serializer.exclude("*.class")
		serializer.include("photos")
		deserializer = new JSONDeserializer<PhotoAlbum>()
	}



	String serializePhotoAlbum(PhotoAlbum photoAlbum) {
		return serializer.serialize( photoAlbum )
	}

	PhotoAlbum deserializePhotoAlbum(String json) {
		return deserializer.deserialize( json, PhotoAlbum.class );
	}

}

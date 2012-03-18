package org.novoj.json.transformer.staxon

import de.odysseus.staxon.json.jaxb.JsonXMLMapper
import de.odysseus.staxon.json.stream.gson.GsonStreamFactory
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.transformer.JsonIO

/**
 * No documentation needed, just look at the methods.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
 * @version $Id: GsonIO,28.1.12 22:13 u_jno Exp $
 */
class StaxonOverGsonIO implements JsonIO {
	private JsonXMLMapper<PhotoAlbum> mapper;

    StaxonOverGsonIO() {
        ConfigurableJsonXMLMapper.streamFactoryFactory = {new GsonStreamFactory()}
        this.mapper = new ConfigurableJsonXMLMapper<PhotoAlbum>(PhotoAlbum.class)
    }

    String serializePhotoAlbum(PhotoAlbum photoAlbum) {
        StringWriter sw = new StringWriter(300000)
        mapper.writeObject(sw, photoAlbum)
		return sw.toString();
	}

	PhotoAlbum deserializePhotoAlbum(String json) {
		return mapper.readObject(new StringReader(json))
	}

}

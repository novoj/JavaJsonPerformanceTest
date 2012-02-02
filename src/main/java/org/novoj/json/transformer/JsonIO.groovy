package org.novoj.json.transformer

import org.novoj.json.model.PhotoAlbum

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: JsonIO,28.1.12 22:11 u_jno Exp $
*/
interface JsonIO {

	String serializePhotoAlbum(PhotoAlbum photoAlbum);

	PhotoAlbum deserializePhotoAlbum(String json);

}

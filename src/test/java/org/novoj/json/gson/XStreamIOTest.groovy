package org.novoj.json.gson

import org.novoj.json.model.PhotoAlbum
import org.novoj.json.xstream.XStreamIO

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: GsonIOTest,28.1.12 22:17 u_jno Exp $
*/
class XStreamIOTest extends AbstractPerformanceTest {
	private XStreamIO xstreamIO = new XStreamIO()

	protected String serialize(PhotoAlbum album) {
		String json = xstreamIO.serializePhotoAlbum(album)
		return json
	}

	protected PhotoAlbum deserialize(String json) {
		PhotoAlbum album = xstreamIO.deserializePhotoAlbum(json)
		return album
	}

}

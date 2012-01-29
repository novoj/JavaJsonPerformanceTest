package org.novoj.json.model

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: Photo,28.1.12 21:52 u_jno Exp $
*/class Photo {
	String name;
	String description;
	Integer width;
	Integer height;
	Boolean horizontal;
	Boolean vertical;
	String path;
	Float rating;
	Integer ratingCount;
	Integer displayCount;
	Date created;
	User author;
	
}

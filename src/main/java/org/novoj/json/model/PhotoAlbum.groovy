package org.novoj.json.model

class PhotoAlbum {
	String name;
	String description;
	User owner;
	Integer photoCount;
	Date created;
	Date modified;
	List<Photo> photos;
	
}
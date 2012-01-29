package org.novoj.json.model

import com.twolattes.json.Entity
import com.twolattes.json.Value
import org.novoj.json.jsonMarshaller.DateMarshaller

@Entity
class PhotoAlbum {
	@Value String name;
	@Value String description;
	@Value User owner;
	@Value Integer photoCount;
	@Value(type = DateMarshaller.class) Date created;
	@Value(type = DateMarshaller.class) Date modified;
	@Value List<Photo> photos;
	
}
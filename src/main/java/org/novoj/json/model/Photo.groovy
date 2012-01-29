package org.novoj.json.model

import com.twolattes.json.Entity
import com.twolattes.json.Value
import org.novoj.json.jsonMarshaller.DateMarshaller

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: Photo,28.1.12 21:52 u_jno Exp $
*/
@Entity
class Photo {
	@Value String name;
	@Value String description;
	@Value Integer width;
	@Value Integer height;
	@Value Boolean horizontal;
	@Value Boolean vertical;
	@Value String path;
	@Value Float rating;
	@Value Integer ratingCount;
	@Value Integer displayCount;
	@Value(type = DateMarshaller.class) Date created;
	@Value User author;
	
}

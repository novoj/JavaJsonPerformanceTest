package org.novoj.json.model

import com.twolattes.json.Entity
import com.twolattes.json.Value
import org.novoj.json.jsonMarshaller.DateMarshaller

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: User,28.1.12 21:50 u_jno Exp $
*/
@Entity
class User {
	@Value String login;
	@Value String firstName;
	@Value String lastName;
	@Value String email;
	@Value Integer age;
	@Value(type = DateMarshaller.class) Date birthDate;
	
}

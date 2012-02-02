package org.novoj.json.model;

import com.twolattes.json.Entity;
import com.twolattes.json.Value;
import net.minidev.json.annotate.JsonIgnore;
import org.novoj.json.transformer.jsonMarshaller.DateMarshaller;

import java.util.Date;

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: User,28.1.12 21:50 u_jno Exp $
*/
@Entity
public class User {
	@Value private String login;
	@Value private String firstName;
	@Value private String lastName;
	@Value private String email;
	@Value private Integer age;
	@Value(type = DateMarshaller.class) @JsonIgnore	private Date birthDate;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}

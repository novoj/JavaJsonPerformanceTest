package org.novoj.json.model;

import com.twolattes.json.Entity;
import com.twolattes.json.Value;
import de.odysseus.staxon.json.jaxb.JsonXML;
import net.minidev.json.annotate.JsonIgnore;
import org.novoj.json.transformer.jsonMarshaller.DateMarshaller;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@JsonXML(
    multiplePaths = "/photos"
)
@XmlRootElement
@Entity
public class PhotoAlbum {
	@Value private String name;
	@Value private String description;
	@Value private User owner;
	@Value private Integer photoCount;
	@Value(type = DateMarshaller.class) @JsonIgnore	private Date created;
	@Value(type = DateMarshaller.class) @JsonIgnore private Date modified;
	@Value private List<Photo> photos;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Integer getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(Integer photoCount) {
		this.photoCount = photoCount;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
}
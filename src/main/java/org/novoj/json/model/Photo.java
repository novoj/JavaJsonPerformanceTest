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
* @version $Id: Photo,28.1.12 21:52 u_jno Exp $
*/
@Entity
public class Photo {
	@Value private String name;
	@Value private String description;
	@Value private Integer width;
	@Value private Integer height;
	@Value private Boolean horizontal;
	@Value private Boolean vertical;
	@Value private String path;
	@Value private Float rating;
	@Value private Integer ratingCount;
	@Value private Integer displayCount;
	@Value(type = DateMarshaller.class)  @JsonIgnore private Date created;
	@Value private User author;

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

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Boolean getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(Boolean horizontal) {
		this.horizontal = horizontal;
	}

	public Boolean getVertical() {
		return vertical;
	}

	public void setVertical(Boolean vertical) {
		this.vertical = vertical;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Integer getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(Integer ratingCount) {
		this.ratingCount = ratingCount;
	}

	public Integer getDisplayCount() {
		return displayCount;
	}

	public void setDisplayCount(Integer displayCount) {
		this.displayCount = displayCount;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
}

package com.brahalla.PhotoAlbum.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "photos")
public class Photo implements Serializable {

	private static final long serialVersionUID = 4223487423467416073L;

	@Id
	@Column(name = "photo_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "photos_photo_id_seq")
	@SequenceGenerator(name = "photos_photo_id_seq", sequenceName = "photos_photo_id_seq", allocationSize = 1)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "file_path")
	private String filePath;

	@Column(name = "album_id")
	private Long albumId;

	public Photo() {
		super();
	}

	public Photo(String title, Date createdDate, String filePath, Long albumId) {
		this.setTitle(title);
		this.setCreatedDate(createdDate);
		this.setFilePath(filePath);
		this.setAlbumId(albumId);
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	public String toString() {

		final String tab = "    ";

		StringBuilder retValue = new StringBuilder();

		retValue.append("Photo ( ")
			.append(super.toString()).append(tab)
			.append("id = ").append(this.id).append(tab)
			.append("title = ").append(this.title).append(tab)
			.append("createdDate = ").append(this.createdDate).append(tab)
			.append("filePath = ").append(this.filePath).append(tab)
			.append("albumId = ").append(this.albumId).append(tab)
			.append(" )");

		return retValue.toString();
	}


}

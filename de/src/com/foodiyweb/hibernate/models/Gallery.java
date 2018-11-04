package com.foodiyweb.hibernate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="gallery")
public class Gallery {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GALLERY_ID")
	private int galleryId;
	
	@Column(name="GALLERY_IMG_URL")
	private String  galleryImgUrl;
	
	@ManyToOne
	@JoinColumn(name="RESTAURANT_ID")
	private Restaurant restaurant;

	@Column(name="PRIMARY_INDICATOR")
	private boolean primaryIndicator;
	
	
	
	

	public int getGalleryId() {
		return galleryId;
	}

	public void setGalleryId(int galleryId) {
		this.galleryId = galleryId;
	}

	public String getGalleryImgUrl() {
		return galleryImgUrl;
	}

	public void setGalleryImgUrl(String galleryImgUrl) {
		this.galleryImgUrl = galleryImgUrl;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public boolean isprimaryIndicator() {
		return primaryIndicator;
	}

	public void setprimaryIndicator(boolean primaryIndicator) {
		this.primaryIndicator = primaryIndicator;
	}

	

	

	
	
}

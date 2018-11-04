package com.foodiyweb.hibernate.models;

/*
 * @author:Pankaj Tandakar
 * 
 */
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MENU_ID")
	private int menuId;
	
	@Column(name="MENU_IMG_URL")
	private String  menuImgUrl;
	
	@ManyToOne
	@JoinColumn(name="RESTAURANT_ID")
	private Restaurant restaurant;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuImgUrl() {
		return menuImgUrl;
	}

	public void setMenuImgUrl(String menuImgUrl) {
		this.menuImgUrl = menuImgUrl;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	
}

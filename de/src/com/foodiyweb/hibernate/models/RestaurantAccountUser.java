package com.foodiyweb.hibernate.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="restaurant_account_user")
public class RestaurantAccountUser implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RESTAURANT_ACCOUNT_USERID")
	private int restaurantAccountUserId;
	
	@Column(name="RESTAURANT_ACCOUNT_USERNM")
	private String username;
	
	@Column(name="RESTAURANT_ACCOUNT_PASSWORD")
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="RESTAURANT_ID")
	private Restaurant restaurant;
	
	public int getRestaurantAccountUserId() {
		return restaurantAccountUserId;
	}

	public void setRestaurantAccountUserId(int restaurantAccountUserId) {
		this.restaurantAccountUserId = restaurantAccountUserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}

package com.foodiyweb.hibernate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurants {
	
	@Id
	@Column(name="RESTAURANT_NAME")
	private String restaurantName;

	@Column(name="RESTAURANT_TELEPHN")
	private String restaurantPhn;
	
	@Column(name="RESTAURANT_START_TIME")
	private String restaurantStartTime;
	
	@Column(name="RESTAURANT_STOP_TIME")
	private String restaurantStopTime;
	
	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantPhn() {
		return restaurantPhn;
	}

	public void setRestaurantPhn(String restaurantPhn) {
		this.restaurantPhn = restaurantPhn;
	}

	public String getRestaurantStartTime() {
		return restaurantStartTime;
	}

	public void setRestaurantStartTime(String restaurantStartTime) {
		this.restaurantStartTime = restaurantStartTime;
	}

	public String getRestaurantStopTime() {
		return restaurantStopTime;
	}

	public void setRestaurantStopTime(String restaurantStopTime) {
		this.restaurantStopTime = restaurantStopTime;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantDescription() {
		return restaurantDescription;
	}

	public void setRestaurantDescription(String restaurantDescription) {
		this.restaurantDescription = restaurantDescription;
	}

	@Column(name="RESTAURANT_ID")
	private int  restaurantId;
	
	@Column(name="RESTAURANT_DESCRIPTION")
	private String restaurantDescription;

	

}

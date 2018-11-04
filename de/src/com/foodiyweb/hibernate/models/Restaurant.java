/*
 * @author:Pankaj Tandakar
 * 
 */
package com.foodiyweb.hibernate.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="restaurant")
public class Restaurant implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RESTAURANT_ID")
	private int  restaurantId;
	
	@Column(name="RESTAURANT_NAME")
	private String restaurantName;

	

	@Column(name="RESTAURANT_TELEPHN")
	private String restaurantPhn;
	
	@Column(name="RESTAURANT_START_TIME")
	private String restaurantStartTime;
	
	@Column(name="RESTAURANT_STOP_TIME")
	private String restaurantStopTime;
	
	
	
	@Column(name="RESTAURANT_DESCRIPTION")
	private String restaurantDescription;

	@Column(name="RESTAURANT_FOODTYPE")
	private String foodTypeServed;
	
	

	@Column(name="RESTAURANT_SEATCAPACITY")
	private int seatCapacity;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="restaurant",fetch=FetchType.EAGER)
	private transient List<Dish> dishes;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="restaurant",fetch=FetchType.LAZY)
	private  Address address;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="restaurant",fetch=FetchType.LAZY)
	private transient RestaurantAccountUser restaurantAccountUser;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="restaurant",fetch=FetchType.LAZY)
	private List<Menu> menu ;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="restaurant",fetch=FetchType.LAZY)
	private List<Gallery> gallery ;
	

	public List<Gallery> getGallery() {
		return gallery;
	}

	public void setGallery(List<Gallery> gallery) {
		this.gallery = gallery;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

	public String getFoodTypeServed() {
		return foodTypeServed;
	}

	public void setFoodTypeServed(String foodTypeServed) {
		this.foodTypeServed = foodTypeServed;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public RestaurantAccountUser getRestaurantAccountUser() {
		return restaurantAccountUser;
	}

	public void setRestaurantAccountUser(RestaurantAccountUser restaurantAccountUser) {
		this.restaurantAccountUser = restaurantAccountUser;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
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

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result=true;
		if(this==obj)result= true;
		
		if(!(obj instanceof Restaurant)) result= false;
		
		else if(obj instanceof Restaurant){
			Restaurant restaurant=(Restaurant) obj;
			if (this.address.equals(restaurant.address)&& this.restaurantId==restaurant.restaurantId && this.restaurantName==restaurant.restaurantName){
				result=true;
			}
					
		}
			
		return result;	
		}
	
	

}

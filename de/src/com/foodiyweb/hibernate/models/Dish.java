/*
 * @author:Pankaj Tandakar
 * 
 */

package com.foodiyweb.hibernate.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dishes")
public class Dish implements Serializable {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="DISH_ID")
private int dishId;

@Column(name="DISH_NAME")
	private String dishName;

@Column(name="DISH_IMG")
	private String dishImg;

@Column(name="DISH_TYPE")
private String dishType;
 
@Column(name="DISH_AVAILABILITY_STATUS")
private  int dishAvailabilityStatus;

@Column(name="DISH_COST")
private float dishCost;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="RESTAURANT_ID")
private Restaurant restaurant;


public float getDishCost() {
	return dishCost;
}

public void setDishCost(float dishCost) {
	this.dishCost = dishCost;
}




public int getDishId() {
	return dishId;
}

public void setDishId(int dishId) {
	this.dishId = dishId;
}

public String getDishName() {
	return dishName;
}

public void setDishName(String dishName) {
	this.dishName = dishName;
}

public String getDishImg() {
	return dishImg;
}

public void setDishImg(String dishImg) {
	this.dishImg = dishImg;
}

public String getDishType() {
	return dishType;
}

public void setDishType(String dishType) {
	this.dishType = dishType;
}

public int getDishAvailabilityStatus() {
	return dishAvailabilityStatus;
}

public void setDishAvailabilityStatus(int dishAvailabilityStatus) {
	this.dishAvailabilityStatus = dishAvailabilityStatus;
}

public Restaurant getRestaurant() {
	return restaurant;
}

public void setRestaurant(Restaurant restaurant) {
	this.restaurant = restaurant;
}


	
	
	
	
	
	
	
}

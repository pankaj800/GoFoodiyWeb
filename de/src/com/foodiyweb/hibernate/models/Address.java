
/*
 * @author:Pankaj Tandakar
 * 
 */
package com.foodiyweb.hibernate.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="ADDRESS_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	
	@Column(name="STREET1")
	private String street1;
	
	@Column(name="STREET2")
	private String street2;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="PIN")
	private long pin;
	
	@Column(name="STATE")
	private String state;

	@OneToOne
	@JoinColumn(name="RESTAURANT_ID")
	private  Restaurant restaurant;
	
	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result=true;
		if(this==obj)result= true;
		
		if(!(obj instanceof Address)) result= false;
		
		else if(obj instanceof Address){
			Address address=(Address) obj;
			if (this.addressId==address.addressId && this.street1.equalsIgnoreCase(address.street1)
					&& this.street2.equalsIgnoreCase(address.street2)
					&& this.city.equalsIgnoreCase(address.city)
					&& this.state.equalsIgnoreCase(address.state)
					&& this.pin==address.pin){
				result=true;
			}
					
		}
			
		return result;	
		}
	}	


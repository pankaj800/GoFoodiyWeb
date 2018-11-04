/*
 * @author:Pankaj Tandakar
 * 
 */
package com.foodiyweb.hibernate.models;

import java.util.List;

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
@Table(name="fooder")
public class Fooder {

	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="FOODER_ID")
	private int  fooderId;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="CONTACT_DETAILS")
	private String contactDetails;
	
	@OneToMany(mappedBy="fooder",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<FooderAddress>  addresses;
	
	@OneToMany(mappedBy="fooder",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<OrderSummary> orderSummary;

	public boolean isGuestUser() {
		return isGuestUser;
	}

	public void setGuestUser(boolean isGuestUser) {
		this.isGuestUser = isGuestUser;
	}

	@Column(name="IS_GUEST_USER")
	private boolean isGuestUser;
	
	public int getFooderId() {
		return fooderId;
	}

	public List<OrderSummary> getOrderSummary() {
		return orderSummary;
	}

	public void setOrderSummary(List<OrderSummary> orderSummary) {
		this.orderSummary = orderSummary;
	}

	public void setFooderId(int fooderId) {
		this.fooderId = fooderId;
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
	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}


	public List<FooderAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<FooderAddress> addresses) {
		this.addresses = addresses;
	}
}

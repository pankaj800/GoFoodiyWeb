package com.foodiyweb.hibernate.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="orders")
public class Order {

	public OrderSummary getOrderSummary() {
		return orderSummary;
	}

	public void setOrderSummary(OrderSummary orderSummary) {
		this.orderSummary = orderSummary;
	}

	public int getDishQuantity() {
		return dishQuantity;
	}

	public void setDishQuantity(int dishQuantity) {
		this.dishQuantity = dishQuantity;
	}

	@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="ORDER_ID")
	private int orderId;
	
	@OneToOne
	@JoinColumn(name="DISH_ID")
	private Dish dish;
	
	@ManyToOne
	@JoinColumn(name="ORDER_SUMMARY_ID")
	private OrderSummary orderSummary;

	@Column(name="DISH_QUANTITY")
	private int dishQuantity;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	
	
	
	
}

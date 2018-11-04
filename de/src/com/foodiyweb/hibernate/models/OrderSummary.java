package com.foodiyweb.hibernate.models;

import java.sql.Timestamp;
import java.util.Date;
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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="order_summary")
public class OrderSummary {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_SUMMARY_ID")
private int orderSummaryId;
	
	@OneToMany(mappedBy="orderSummary",cascade=CascadeType.ALL)
	@LazyCollection	(LazyCollectionOption.FALSE)
	private List<Order> orderList;
	
	@Column(name="ORDER_DATE")
	private Timestamp orderDate;
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name="ORDER_STATUS")
	private String status;
	
	@Column(name="TOTAL_PRICE")
	private float totalPrice;
	
	@ManyToOne
	@JoinColumn(name="FOODER_ID")
private Fooder fooder;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	
	public int getOrderSummaryId() {
		return orderSummaryId;
	}

	public void setOrderSummaryId(int orderSummaryId) {
		this.orderSummaryId = orderSummaryId;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Fooder getFooder() {
		return fooder;
	}

	public void setFooder(Fooder fooder) {
		this.fooder = fooder;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	
}

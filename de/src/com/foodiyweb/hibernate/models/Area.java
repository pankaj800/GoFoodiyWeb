package com.foodiyweb.hibernate.models;

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
import javax.persistence.Table;

@Entity
@Table(name="area")
public class Area {

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@Column(name="AREA_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  areaId;
	
	@Column(name="AREA_NAME")
	private String areaName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="DISTRICT_ID")
	private District  district;
	
}

package com.foodiyweb.hibernate.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="district")
public class District implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="DISTRICT_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int districtId;
	
	@Column(name="DISTRICT_NAME")
	private String districtName;
	
	@Column(name="STATE_NAME")
	private String stateName;
	
	@Column(name="COUNTRY_NAME")
	private String countryName;
	
	@OneToMany(mappedBy="district",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Area>  areas;
	

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	
	

}

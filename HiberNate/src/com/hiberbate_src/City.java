package com.hiberbate_src;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "City")

public class City {

	@Id
	@Column(name = "ID")
	private int ıd;
	@Column(name = "Name")
	private String Name;
	@Column(name = "CountryCode")
	private String CountryCode;
	@Column(name = "District")
	private String District;
	@Column(name = "Info")
	private String Info;


	public int getId() {
		return ıd;
	}
	public void setId(int id) {
		ıd = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}

	public String getInfo() {
		return Info;
	}
	public void setInfo(String info) {
		Info = info;
	}
	
	
}

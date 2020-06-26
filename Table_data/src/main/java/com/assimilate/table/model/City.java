package com.assimilate.table.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cc")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cityid")
	private int cityid;
	
	@Column(name ="city")
	private String city;


	private int statefk;
	
	public City()
	{
		
	}

	public City(int cityid, String city, int statefk) {
		super();
		this.cityid = cityid;
		this.city = city;
		this.statefk = statefk;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStatefk() {
		return statefk;
	}

	public void setStatefk(int statefk) {
		this.statefk = statefk;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", city=" + city + ", statefk=" + statefk + "]";
	}

	

	
	
	
}

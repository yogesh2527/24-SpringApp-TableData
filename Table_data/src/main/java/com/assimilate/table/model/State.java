package com.assimilate.table.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "ss")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="stateid")
	private int stateid;
	
	@Column(name = "state")
	private String state;
		@OneToMany(targetEntity = City.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
		@JoinColumn(name="statefk" ,referencedColumnName = "stateid")
		@Autowired
		private List<City> cityObject;
//	
//	@OneToMany(mappedBy = "state")
//	private List<City> cityObj;
//	
	
	
	public State()
	{
		
	}


	@Override
	public String toString() {
		return "State [stateid=" + stateid + ", state=" + state + ", cityObject=" + cityObject + "]";
	}


	public int getStateid() {
		return stateid;
	}


	public void setStateid(int stateid) {
		this.stateid = stateid;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public List<City> getCityObject() {
		return cityObject;
	}


	public void setCityObject(List<City> cityObject) {
		this.cityObject = cityObject;
	}


	public State(int stateid, String state, List<City> cityObject) {
		super();
		this.stateid = stateid;
		this.state = state;
		this.cityObject = cityObject;
	}

	


	

	

	
	
	
}

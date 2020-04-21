package com.shahnaz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project_details")
public class Projects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String ln_no;
	private String project_name;
	private int units;
	private String em_no;
	@Column(name = "country_cd")
	private int country_code;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLn_no() {
		return ln_no;
	}
	public void setLn_no(String ln_no) {
		this.ln_no = ln_no;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getCountry_code() {
		return country_code;
	}
	public void setCountry_code(int country_code) {
		this.country_code = country_code;
	}
	public String getEm_no() {
		return em_no;
	}
	public void setEm_no(String em_no) {
		this.em_no = em_no;
	}
	@Override
	public String toString() {
		return "Projects [id=" + id + ", ln_no=" + ln_no + ", project_name=" + project_name + ", units=" + units
				+ ", country_code=" + country_code + "]";
	}
	
	

}

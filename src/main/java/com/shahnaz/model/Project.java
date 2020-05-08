package com.shahnaz.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="project_details")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String ln_no;
	private String project_name;
	private String em_no;
	@Column(name="job_type_id")
	private int jobType;
	private int units;
	@Column(name = "country_cd")
	private int country_code;
	@Column(name = "date_received")
	private Date dateReceived;
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
	public int getJobType() {
		return jobType;
	}
	public void setJobType(int jobType) {
		this.jobType = jobType;
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
	public Date getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", ln_no=" + ln_no + ", project_name=" + project_name + ", em_no=" + em_no
				+ ", jobType=" + jobType + ", units=" + units + ", country_code=" + country_code + "]";
	}

	

}

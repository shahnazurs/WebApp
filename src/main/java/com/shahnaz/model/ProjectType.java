package com.shahnaz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project_type")
public class ProjectType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="type_name")
	private String jobType;
	
	public int getId() {
		return id;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ProjectType [id=" + id + ", jobType=" + jobType + "]";
	}
	
	
	

}

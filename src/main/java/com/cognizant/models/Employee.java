package com.cognizant.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "em_id")
	private Integer id;

	@Column(name = "em_name")
	private String name;

	@Column(name = "em_salary")
	private Double salary;

	@Column(name = "em_permanent")
	private Boolean permanent;

	@Column(name = "em_date_of_birth")
	private Date dateOfBirth;

	@ManyToMany
	@JoinTable(name = "employee_skill", joinColumns = { @JoinColumn(name = "es_em_id") }, inverseJoinColumns = {
			@JoinColumn(name = "es_sk_id") })
	private Set<Skill> skillList = new HashSet<Skill>();

	@ManyToOne
	@JoinColumn(name = "em_dp_id")
	private Department department;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Boolean getPermanent() {
		return permanent;
	}

	public void setPermanent(Boolean permanent) {
		this.permanent = permanent;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



}

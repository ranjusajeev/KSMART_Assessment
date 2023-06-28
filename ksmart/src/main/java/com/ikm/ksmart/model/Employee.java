package com.ikm.ksmart.model;

import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.validation.constraints.Past;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder

@Entity
@Table(name = "employees")
public class Employee {
   	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "empid")
	@NotNull
	private int empid;
	
	@Column(name = "name")
	@NotNull
	private String name;

	@Column(name = "designation")
	@NotNull
	private String designation;
	
	@Column(name = "phone")	
	private String phone;
	
	@Column(name = "dateofbirth")
	@Past
	private Date dateofbirth;

}
package com.StudentReportingSystem.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "students")
public class Student {
	
	
	@Id
	private Integer roll;
	
	//name of the Student
	@Field(type = FieldType.Text, name = "name")
	private String name;
	
	//semester one Mathematics marks
	@Field(type = FieldType.Integer, name = "semOneMaths")
	private Integer semOneMaths;
	
	//semester one English marks
	@Field(type = FieldType.Integer, name = "semOneEnglish")
	private Integer semOneEnglish;
	
	//semester one Science marks
	@Field(type = FieldType.Integer, name = "semOneScience")
	private Integer semOneScience;
	
	
	
	//semester two Mathematics marks
	@Field(type = FieldType.Integer, name = "semTwoEnglish")
	private Integer semTwoEnglish;
	
	//semester two English marks
	@Field(type = FieldType.Integer, name = "name")
	private Integer semTwoMaths;
	
	//semester two Science marks
	@Field(type = FieldType.Integer, name = "semTwoScience")
	private Integer semTwoScience;
	
	
	
	public Integer getRoll() {
		return roll;
	}


	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getSemOneMaths() {
		return semOneMaths;
	}


	public void setSemOneMaths(Integer semOneMaths) {
		this.semOneMaths = semOneMaths;
	}


	public Integer getSemOneEnglish() {
		return semOneEnglish;
	}


	public void setSemOneEnglish(Integer semOneEnglish) {
		this.semOneEnglish = semOneEnglish;
	}


	public Integer getSemOneScience() {
		return semOneScience;
	}

	public void setSemOneScience(Integer semOneScience) {
		this.semOneScience = semOneScience;
	}


	public Integer getSemTwoEnglish() {
		return semTwoEnglish;
	}

	public void setSemTwoEnglish(Integer semTwoEnglish) {
		this.semTwoEnglish = semTwoEnglish;
	}

	public Integer getSemTwoMaths() {
		return semTwoMaths;
	}

	public void setSemTwoMaths(Integer semTwoMaths) {
		this.semTwoMaths = semTwoMaths;
	}


	public Integer getSemTwoScience() {
		return semTwoScience;
	}

	public void setSemTwoScience(Integer semTwoScience) {
		this.semTwoScience = semTwoScience;
	}

	public Student() {
		super();
	}
	
	

}

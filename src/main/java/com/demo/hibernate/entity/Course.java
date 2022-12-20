package com.demo.hibernate.entity;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
@Builder
public class Course {

	@Id
	@GeneratedValue
	private UUID id;
	private String code;
	private String name;
	private Integer duration;

	@OneToMany(mappedBy = "course")
	Set<CourseRegistration> registrations;

}

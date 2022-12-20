package com.demo.hibernate.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "course_registration")
@Data
@Builder
public class CourseRegistration implements Serializable {
	@Id
	UUID id;

	@ManyToOne
	@JoinColumn(name = "student_code", referencedColumnName = "code")
	Student student;

	@ManyToOne
	@JoinColumn(name = "course_code", referencedColumnName = "code")
	Course course;

	LocalDateTime registeredAt;

	int grade;
}

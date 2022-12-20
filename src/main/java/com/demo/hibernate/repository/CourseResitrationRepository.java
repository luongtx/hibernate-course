package com.demo.hibernate.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.hibernate.entity.CourseRegistration;

@Repository
public interface CourseResitrationRepository extends JpaRepository<CourseRegistration, UUID> {

}

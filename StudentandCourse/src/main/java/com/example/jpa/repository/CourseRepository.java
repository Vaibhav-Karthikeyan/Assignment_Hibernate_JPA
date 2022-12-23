package com.example.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.entity.Course;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	EntityManager em;

	public void saveOrUpdateCourse(Course course) {
		System.out.println("In the save student method");
		if (course.getId() == 0)
			em.persist(course);
		else
			em.merge(course);
		System.out.println("Student persisted successfully in DB");
	}

	public Course getCourseById(int id) {
		Course course = em.find(Course.class, id);
		return course;
	}

	public boolean deleteCourse(int id) {
		Course course = getCourseById(id);
		em.remove(course);
		return true;
	}
}

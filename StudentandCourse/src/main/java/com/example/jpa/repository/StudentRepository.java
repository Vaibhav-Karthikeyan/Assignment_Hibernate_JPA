package com.example.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class StudentRepository {

	@Autowired
	EntityManager em;

	public void saveOrUpdateStudent(Student student) {
		System.out.println("In the save student method");
		if (student.getId() == 0)
			em.persist(student);
		else
			em.merge(student);
		System.out.println("Student persisted successfully in DB");
	}

	public Student getStudentById(int id) {
		Student student = em.find(Student.class, id);
		return student;
	}

	public boolean deleteStudent(int id) {
		Student st = getStudentById(id);
		em.remove(st);
		return true;
	}

}


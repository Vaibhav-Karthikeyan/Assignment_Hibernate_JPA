package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa.entity.Student;
import com.example.jpa.entity.Course;
import com.example.jpa.repository.StudentRepository;
import com.example.jpa.repository.CourseRepository;


@SpringBootApplication
public class StudentandCourseApplication implements CommandLineRunner {

	@Autowired
	StudentRepository stu;
	@Autowired
	CourseRepository cou;

	public static void main(String[] args) {
		SpringApplication.run(StudentandCourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Student student = new Student(1, "Harish", "K", "hr@gmail.com", "hr@123","Delhi");
		//System.out.println(student.getId());
		//stu.saveOrUpdateStudent(student);
		// Student st = stu.getStudentById(1);
		// System.out.println(st);
		// stu.deleteStudent(52);
		Course course=new Course(1,"vaibhav Karthikeyan","2 hrs");
		System.out.println(course.getId());
		cou.saveOrUpdateCourse(course);
	}
}

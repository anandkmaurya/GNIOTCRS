package com.gniot.crs.business;

import java.util.List;

import com.gniot.crs.bean.Course;
import com.gniot.crs.bean.Student;

/**
 * Interface for Professor operations.
 */
public interface ProfessorInterface {
	void addGrade(int studentId, int courseId, String grade,int professorId, int gradeId);
	void printCoursesTable(List<Course> courses);
	void printStudentTable(List<Student> students);
	List<Student> viewEnrolledStudents(int professorId);
	List<Course> getProfessorCourses(int professorId);
}
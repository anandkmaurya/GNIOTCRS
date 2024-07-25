/**
 * 
 */
package com.gniot.crs.rest;

import java.util.List;

import com.gniot.crs.bean.Course;
import com.gniot.crs.bean.Grade;
import com.gniot.crs.bean.Payment;
import com.gniot.crs.bean.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.gniot.crs.business.*;

/**
 * 
 */
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private final StudentInterface studentService;
	 public StudentController(StudentInterface studentService) {
	        this.studentService = studentService;
	    }
	 @GetMapping(value = "/courses", produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<Course> browseCatalogForCoures() {
	        studentService.browseCatalogForCoures();
	        return studentService.browseCatalogForCoures();
	    }
	 @PostMapping(value = "/addCourse", produces = MediaType.APPLICATION_JSON_VALUE)
	    public String addCourse(@RequestParam int studentId, @RequestParam int courseId) {
	        studentService.addCourse(studentId,courseId);
	        return "Course Added successfully";
	    }
	 @DeleteMapping(value = "/removeCourse", produces = MediaType.APPLICATION_JSON_VALUE)
	    public String removeCourse(@RequestParam int studentId, @RequestParam String courseId) {
	        studentService.removeCourse(studentId,courseId);
	        return "Course Removed successfully";
	    }
	 @GetMapping(value = "/grades", produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<Grade> viewGrades(@RequestParam int studentId,@RequestParam int courseId) {
	        return studentService.viewGrades(studentId,courseId);
	    }
	 @GetMapping(value = "/accountInfo", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Student accountInfo(@RequestParam int studentId) {
	        return studentService.accountInfo(studentId);
	    }
	 @GetMapping(value = "/payment", produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<Payment> displayPaymentHistory(@RequestParam int studentId) {
	        return studentService.displayPaymentHistory(studentId);
	    }
}
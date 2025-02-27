/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.university.repository;

import java.util.*;
import com.example.university.model.*;

public interface CourseRepository {
    List<Course> getCourses();

    Course getCourseById(int courseId);

    Course addCourse(Course course);

    Course updateCourse(int courseId, Course course);

    void deleteCourse(int courseId);

    Professor getCouProfessor(int courseId);

    List<Student> getCourseStudents(int courseId);
}
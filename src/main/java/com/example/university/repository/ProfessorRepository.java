/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.university.repository;

import com.example.university.model.Professor;
import com.example.university.model.Course;

import java.util.ArrayList;

public interface ProfessorRepository {
    ArrayList<Professor> getProfessor();

    Professor getProfessorById(int professorId);

    Professor addProfessor(Professor professor);

    Professor updateProfessor(int professorId, Professor professor);

    void deleteProfessor(int professorId);

    Course getProfessorCourse(int professorId);
}

package com.proje.repository;

import com.proje.model.Course;
import com.proje.model.Student;

import java.util.List;

public interface CourseRepository {

    List<Student> getCourseStudentList(Course course);

    List<Course> findGreatCreditScore(int creditScore);

    List<Course> findBetweenCreditScore(int minCreditScore, int maxCreditScore);

    List<Course> findOrderByCourseCreditScore();
}

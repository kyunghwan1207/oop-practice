package org.example.grade;

import java.util.List;

public class GradeCalculator {
//    List<Course> courses;
    Courses courses;
    public GradeCalculator(List<Course> courses){
        this.courses = new Courses(courses);
//        this.courses = courses;
    }
    public double calculateGrade(){
        // (학점 수 x 교과목 평점)의 합계
        double multipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        // 수강신청 총 학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}

package org.example.grade;

import java.util.List;

public class GradeCalculator {
    List<Course> courses;
    public GradeCalculator(List<Course> courses){
        this.courses = courses;
    }
    public double calculateGrade(){
        // (학점 수 x 교과목 평점)의 합계
        double multipliedCreditAndCourseGrade = 0;
        for (Course course: this.courses) {
            multipliedCreditAndCourseGrade += course.multiplyCreditAndGrade();

        }
        // 수강신청 총 학점 수
        int totalCompletedCredit = courses.stream()
                .mapToInt(c -> c.getCredit())
                .sum();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}

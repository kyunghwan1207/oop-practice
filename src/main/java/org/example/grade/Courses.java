package org.example.grade;

import java.util.List;

public class Courses {
    List<Course> courses;
    public Courses(List<Course> courses){
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for (Course course: this.courses) {
            multipliedCreditAndCourseGrade += course.multiplyCreditAndGrade();

        }
        return multipliedCreditAndCourseGrade;
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(c -> c.getCredit())
                .sum();
    }
}

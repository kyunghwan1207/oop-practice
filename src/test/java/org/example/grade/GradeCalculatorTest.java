package org.example.grade;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * - 평균학점 계산 방법 = (학점 수 x 교과목 평점) 의 합계 / 수강신청 총 학점 수
 * - 일급 컬렉션 사용
 * */
public class GradeCalculatorTest {
    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"), new Course("Data Structure", 3, "A+"));
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        Assertions.assertThat(gradeResult).isEqualTo(4.5);
    }
}

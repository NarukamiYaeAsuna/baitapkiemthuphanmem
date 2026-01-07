import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents_NormalCase_MixedValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Danh sách có nhiều điểm hợp lệ và không hợp lệ
        // 9.0, 8.5 >= 8.0 (Giỏi), 7.0 < 8.0, 11.0 và -1.0 bị bỏ qua
        assertEquals(2, analyzer.countExcellentStudents(
            Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }

    @Test
    public void testCountExcellentStudents_NormalCase_AllValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Danh sách toàn bộ hợp lệ
        assertEquals(3, analyzer.countExcellentStudents(
            Arrays.asList(8.0, 9.5, 7.0, 8.5, 6.0)));
    }

    @Test
    public void testCountExcellentStudents_EdgeCase_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp biên: Danh sách trống
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_EdgeCase_NullList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp biên: Danh sách null
        assertEquals(0, analyzer.countExcellentStudents(null));
    }

    @Test
    public void testCountExcellentStudents_EdgeCase_BoundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp biên: Danh sách chỉ chứa giá trị 0 hoặc 10
        assertEquals(1, analyzer.countExcellentStudents(
            Arrays.asList(0.0, 10.0, 7.9)));
        // 10.0 >= 8.0, 0.0 và 7.9 < 8.0
    }

    @Test
    public void testCountExcellentStudents_EdgeCase_ExactlyEight() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Điểm chính xác 8.0 được coi là Giỏi
        assertEquals(1, analyzer.countExcellentStudents(
            Arrays.asList(8.0, 7.99)));
    }

    @Test
    public void testCountExcellentStudents_ExceptionCase_InvalidScores() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp ngoại lệ: Có điểm < 0 hoặc > 10
        assertEquals(0, analyzer.countExcellentStudents(
            Arrays.asList(-1.0, -5.5, 11.0, 15.0)));
    }

    @Test
    public void testCountExcellentStudents_ExceptionCase_MixedInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp ngoại lệ: Kết hợp điểm hợp lệ và không hợp lệ
        assertEquals(2, analyzer.countExcellentStudents(
            Arrays.asList(9.0, 8.0, -1.0, 11.0, -5.0, 12.5)));
    }

    @Test
    public void testCalculateValidAverage_NormalCase_MixedValidInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Danh sách có nhiều điểm hợp lệ và không hợp lệ
        // Chỉ tính: 9.0, 8.5, 7.0 (bỏ qua 11.0, -1.0)
        // (9.0 + 8.5 + 7.0) / 3 = 24.5 / 3 = 8.1666...
        assertEquals(8.17, analyzer.calculateValidAverage(
            Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_NormalCase_AllValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Danh sách toàn bộ hợp lệ
        // (8.0 + 9.0 + 7.0) / 3 = 24.0 / 3 = 8.0
        assertEquals(8.0, analyzer.calculateValidAverage(
            Arrays.asList(8.0, 9.0, 7.0)), 0.001);
    }

    @Test
    public void testCalculateValidAverage_EdgeCase_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp biên: Danh sách trống
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001);
    }

    @Test
    public void testCalculateValidAverage_EdgeCase_NullList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp biên: Danh sách null
        assertEquals(0.0, analyzer.calculateValidAverage(null), 0.001);
    }

    @Test
    public void testCalculateValidAverage_EdgeCase_BoundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp biên: Danh sách chỉ chứa giá trị 0 hoặc 10
        // (0.0 + 10.0) / 2 = 5.0
        assertEquals(5.0, analyzer.calculateValidAverage(
            Arrays.asList(0.0, 10.0)), 0.001);
    }

    @Test
    public void testCalculateValidAverage_ExceptionCase_AllInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp ngoại lệ: Tất cả điểm đều không hợp lệ
        assertEquals(0.0, analyzer.calculateValidAverage(
            Arrays.asList(-1.0, -5.5, 11.0, 15.0)), 0.001);
    }

    @Test
    public void testCalculateValidAverage_ExceptionCase_MixedInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp ngoại lệ: Kết hợp điểm hợp lệ và không hợp lệ
        // Chỉ tính: 9.0, 8.0, 7.5 (bỏ qua -1.0, 11.0, -5.0, 12.5)
        // (9.0 + 8.0 + 7.5) / 3 = 24.5 / 3 = 8.1666...
        assertEquals(8.17, analyzer.calculateValidAverage(
            Arrays.asList(9.0, 8.0, 7.5, -1.0, 11.0, -5.0, 12.5)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_SingleValue() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp chỉ có một giá trị hợp lệ
        assertEquals(9.5, analyzer.calculateValidAverage(
            Arrays.asList(9.5)), 0.001);
    }

    @Test
    public void testCalculateValidAverage_WithNullValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Trường hợp có giá trị null trong danh sách
        List<Double> scores = Arrays.asList(9.0, null, 8.0, 7.0);
        assertEquals(8.0, analyzer.calculateValidAverage(scores), 0.001);
        // Chỉ tính: (9.0 + 8.0 + 7.0) / 3 = 8.0
    }
}


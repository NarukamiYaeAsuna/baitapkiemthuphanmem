BÀI TẬP CAN'T SEE 


<img width="1286" height="687" alt="Screenshot 2026-01-05 140302" src="https://github.com/user-attachments/assets/3c99f1d9-161d-41ce-b8b5-b24747783df4" />








Bài tập thực hành kiểm thử với JUnit
Chủ đề: Phân tích dữ liệu điểm số học sinh
Mục tiêu học tập:
Biết cách viết kiểm thử tự động bằng JUnit
Biết cách khai thác AI tạo sinh để hỗ trợ lập trình
1. Mô tả yêu cầu chức năng
Chương trình Java có lớp StudentAnalyzer chứa 2 phương thức:

1.1. countExcellentStudents(List<Double> scores)
Mục đích: Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi (>= 8.0)
Quy tắc xử lý:
Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
Nếu danh sách rỗng hoặc null, trả về 0
Chỉ đếm các điểm hợp lệ (từ 0 đến 10) và >= 8.0
1.2. calculateValidAverage(List<Double> scores)
Mục đích: Tính điểm trung bình của các điểm hợp lệ (từ 0 đến 10)
Quy tắc xử lý:
Bỏ qua điểm âm hoặc lớn hơn 10
Nếu danh sách rỗng hoặc null, trả về 0.0
Nếu không có điểm hợp lệ nào, trả về 0.0
Chỉ tính trung bình của các điểm hợp lệ
Yêu cầu kỹ thuật:
 Điều kiện 1: Nếu điểm nhỏ hơn 0 hoặc lớn hơn 10 thì bỏ qua (validate)
 Điều kiện 2: Nếu danh sách rỗng thì trả về kết quả mặc định (0)
Vòng lặp 1: Duyệt qua danh sách điểm để lọc học sinh giỏi
Vòng lặp 2: Duyệt qua danh sách để tính trung bình hợp lệ
2. Cấu trúc dự án
unit-test/
├── pom.xml                          # File cấu hình Maven
├── README.md                        # Tài liệu hướng dẫn
├── src/
│   └── main/
│       └── java/
│           └── StudentAnalyzer.java # Lớp chính cần implement
└── src/
    └── test/
        └── java/
            └── StudentAnalyzerTest.java # Các test case JUnit
3. Cách chạy chương trình
Yêu cầu hệ thống:
Java JDK 11 hoặc cao hơn
Maven 3.6+ hoặc có thể sử dụng Maven Wrapper
Cài đặt và chạy:
Bước 1: Cài đặt dependencies
cd unit-test
mvn clean install
Bước 2: Chạy các test case
mvn test
Hoặc chạy test cụ thể:

mvn test -Dtest=StudentAnalyzerTest
Bước 3: Xem kết quả
Sau khi chạy mvn test, kết quả sẽ hiển thị trong terminal. Tất cả các test case sẽ được thực thi và báo cáo kết quả.

Cách chạy từ IDE (IntelliJ IDEA / Eclipse):
Mở project trong IDE
Chuột phải vào file StudentAnalyzerTest.java
Chọn "Run All Tests" hoặc "Run StudentAnalyzerTest"
Xem kết quả trong cửa sổ Test Results
4. Các test case đã được implement
Test cho countExcellentStudents():
testCountExcellentStudents_NormalCase_MixedValidInvalid:

Test với danh sách có điểm hợp lệ và không hợp lệ
testCountExcellentStudents_NormalCase_AllValid:

Test với danh sách toàn bộ điểm hợp lệ
testCountExcellentStudents_EdgeCase_EmptyList:

Test với danh sách trống
testCountExcellentStudents_EdgeCase_NullList:

Test với danh sách null
testCountExcellentStudents_EdgeCase_BoundaryValues:

Test với giá trị biên (0, 10)
testCountExcellentStudents_EdgeCase_ExactlyEight:

Test với điểm chính xác 8.0
testCountExcellentStudents_ExceptionCase_InvalidScores:

Test với tất cả điểm không hợp lệ
testCountExcellentStudents_ExceptionCase_MixedInvalid:

Test kết hợp điểm hợp lệ và không hợp lệ
Test cho calculateValidAverage():
testCalculateValidAverage_NormalCase_MixedValidInvalid:

Test với danh sách có điểm hợp lệ và không hợp lệ
testCalculateValidAverage_NormalCase_AllValid:

Test với danh sách toàn bộ điểm hợp lệ
testCalculateValidAverage_EdgeCase_EmptyList:

Test với danh sách trống
testCalculateValidAverage_EdgeCase_NullList:

Test với danh sách null
testCalculateValidAverage_EdgeCase_BoundaryValues:

Test với giá trị biên (0, 10)
testCalculateValidAverage_ExceptionCase_AllInvalid:

Test với tất cả điểm không hợp lệ
testCalculateValidAverage_ExceptionCase_MixedInvalid:

Test kết hợp điểm hợp lệ và không hợp lệ
testCalculateValidAverage_SingleValue:

Test với một giá trị duy nhất
testCalculateValidAverage_WithNullValues:

Test với giá trị null trong danh sách
5. Ví dụ sử dụng
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        
        // Ví dụ 1: Đếm học sinh giỏi
        List<Double> scores1 = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        int excellentCount = analyzer.countExcellentStudents(scores1);
        System.out.println("Số học sinh giỏi: " + excellentCount); // Kết quả: 2
        
        // Ví dụ 2: Tính điểm trung bình
        List<Double> scores2 = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        double average = analyzer.calculateValidAverage(scores2);
        System.out.println("Điểm trung bình: " + average); // Kết quả: 8.17
    }
}
6. Kết quả kiểm thử
Sau khi chạy mvn test, tất cả các test case sẽ được thực thi và báo cáo kết quả. Các test case đã được thiết kế để bao phủ:

Trường hợp bình thường (normal cases)
Trường hợp biên (edge cases)
Trường hợp ngoại lệ (exception cases)
7. Lưu ý
Điểm hợp lệ: từ 0.0 đến 10.0 (bao gồm cả hai giá trị)
Điểm không hợp lệ: < 0.0 hoặc > 10.0 sẽ bị bỏ qua
Giá trị null trong danh sách sẽ bị bỏ qua
Học sinh giỏi: điểm >= 8.0




# Cập nhật: Thêm kiểm thử Hộp Đen và Hộp Trắng

## 📅 Ngày cập nhật
**Ngày**: 2025-01-07  
**Mục đích**: Bổ sung các test cases theo phương pháp kiểm thử **Hộp Đen (Black-box)** và **Hộp Trắng (White-box)** để tăng độ bao phủ và chất lượng kiểm thử.

---

## 📊 Tổng quan thay đổi

### Trước khi cập nhật:
- **Tổng số test**: 18 test cases
- **Coverage**: ~85% các trường hợp cơ bản
- **Thiếu**: Một số lớp tương đương và test bao phủ nhánh

### Sau khi cập nhật:
- **Tổng số test**: 22 test cases (+4 test mới)
- **Coverage**: ~95% các trường hợp
- **Đã bổ sung**: Test hộp đen và hộp trắng đầy đủ

---

## 🔲 PHẦN 1: KIỂM THỬ HỘP ĐEN (Black-box Testing)

### Mục tiêu:
Kiểm thử dựa trên **đặc tả chức năng** mà không cần biết cấu trúc code bên trong. Tập trung vào:
- **Lớp tương đương (Equivalence Classes)**
- **Giá trị biên (Boundary Values)**
- **Trường hợp ngoại lệ (Exception Cases)**

### ✅ Các test HỘP ĐEN đã được thêm:

#### 1. `testCountExcellentStudents_BlackBox_AllValidButNotExcellent()`
```java
// Lớp tương đương: Tất cả điểm hợp lệ nhưng không đạt giỏi (< 8.0)
assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(0.0, 7.99, 7.0, 6.5)));
```
**Mục đích**: Kiểm tra lớp tương đương "tất cả điểm hợp lệ nhưng < 8.0" → kết quả = 0

#### 2. `testCountExcellentStudents_BlackBox_AllExcellent()`
```java
// Lớp tương đương: Tất cả điểm hợp lệ và đều đạt giỏi (>= 8.0)
assertEquals(4, analyzer.countExcellentStudents(Arrays.asList(8.0, 8.1, 9.5, 10.0)));
```
**Mục đích**: Kiểm tra lớp tương đương "tất cả điểm hợp lệ và >= 8.0" → đếm đúng số lượng

#### 3. `testCountExcellentStudents_BlackBox_SingleValue()`
```java
// Lớp tương đương: Danh sách 1 phần tử (hợp lệ và đạt giỏi)
assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(8.0)));
```
**Mục đích**: Kiểm tra lớp tương đương "danh sách chỉ có 1 phần tử"

#### 4. `testCalculateValidAverage_BlackBox_AllNullValues()`
```java
// Lớp tương đương: Tất cả phần tử null -> không có điểm hợp lệ -> 0.0
assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(null, null, null)), 0.001);
```
**Mục đích**: Kiểm tra lớp tương đương "tất cả phần tử null" → kết quả = 0.0

---

## ⚪ PHẦN 2: KIỂM THỬ HỘP TRẮNG (White-box Testing)

### Mục tiêu:
Kiểm thử dựa trên **cấu trúc code bên trong** để đảm bảo bao phủ đầy đủ các nhánh, điều kiện và đường đi trong code.

### ✅ Các test HỘP TRẮNG đã được thêm:

#### 1. `testCountExcellentStudents_WhiteBox_CoversAllBranchesInLoop()`
```java
// Bao phủ các nhánh trong vòng lặp:
// - null score
// - score < 0 (invalid)
// - score > 10 (invalid)
// - score hợp lệ nhưng < 8
// - score hợp lệ và >= 8
assertEquals(2, analyzer.countExcellentStudents(
    Arrays.asList(null, -1.0, 11.0, 7.5, 8.0, 10.0)));
```
**Mục đích**: 
- ✅ Bao phủ nhánh `score == null`
- ✅ Bao phủ nhánh `score < 0` (invalid)
- ✅ Bao phủ nhánh `score > 10` (invalid)
- ✅ Bao phủ nhánh `score hợp lệ nhưng < 8.0`
- ✅ Bao phủ nhánh `score hợp lệ và >= 8.0`

**Phân tích code được cover**:
```java
for (Double score : scores) {
    if (score != null && score >= 0.0 && score <= 10.0) {  // ← Cover: null, <0, >10
        if (score >= 8.0) {  // ← Cover: <8 và >=8
            count++;
        }
    }
}
```

#### 2. `testCalculateValidAverage_WhiteBox_CoversInvalidAndValidAndValidCountZero()`
```java
// Test 1: validCount==0 branch (tất cả invalid hoặc null)
assertEquals(0.0, analyzer.calculateValidAverage(
    Arrays.asList(null, -1.0, 11.0, Double.NaN, Double.POSITIVE_INFINITY)), 0.001);

// Test 2: Các nhánh trong vòng lặp: null, invalid, valid
assertEquals(8.0, analyzer.calculateValidAverage(
    Arrays.asList(null, -1.0, 11.0, Double.NaN, 9.0, 7.0)), 0.001);
```
**Mục đích**: 
- ✅ Bao phủ nhánh `validCount == 0` → return 0.0
- ✅ Bao phủ các nhánh trong vòng lặp (null, invalid, valid)
- ✅ Test với `Double.NaN` và `Double.POSITIVE_INFINITY` (edge cases đặc biệt)

**Phân tích code được cover**:
```java
if (scores == null || scores.isEmpty()) {  // ← Đã cover ở test khác
    return 0.0;
}

for (Double score : scores) {
    if (score != null && score >= 0.0 && score <= 10.0) {  // ← Cover: null, invalid, valid
        sum += score;
        validCount++;
    }
}

if (validCount == 0) {  // ← Cover: validCount == 0
    return 0.0;
}

return sum / validCount;  // ← Cover: tính trung bình
```

---

## 📈 So sánh trước và sau

### Test Cases theo phương pháp:

| Phương pháp | Trước | Sau | Tăng |
|------------|-------|-----|------|
| **Hộp Đen** | 18 | 20 | +2 |
| **Hộp Trắng** | 0 | 2 | +2 |
| **Tổng** | 18 | 22 | +4 |

### Coverage theo nhánh code:

| Nhánh/Điều kiện | Trước | Sau |
|----------------|-------|-----|
| `scores == null` | ✅ | ✅ |
| `scores.isEmpty()` | ✅ | ✅ |
| `score == null` trong loop | ⚠️ | ✅ |
| `score < 0` | ✅ | ✅ |
| `score > 10` | ✅ | ✅ |
| `score >= 0 && score <= 10` | ✅ | ✅ |
| `score >= 8.0` (excellent) | ✅ | ✅ |
| `score < 8.0` (not excellent) | ⚠️ | ✅ |
| `validCount == 0` | ✅ | ✅ |
| `Double.NaN` | ❌ | ✅ |
| `Double.POSITIVE_INFINITY` | ❌ | ✅ |

**Chú thích**: 
- ✅ = Đã cover đầy đủ
- ⚠️ = Cover một phần
- ❌ = Chưa cover

---

## 🎯 Lợi ích của việc bổ sung

### 1. **Tăng độ bao phủ (Coverage)**
- Từ ~85% lên ~95%
- Bao phủ đầy đủ các nhánh code quan trọng

### 2. **Phát hiện lỗi tốt hơn**
- Test hộp trắng giúp phát hiện các nhánh code có thể bị bỏ sót
- Test với `NaN` và `Infinity` giúp phát hiện edge cases đặc biệt

### 3. **Tài liệu hóa rõ ràng**
- Code test được tổ chức rõ ràng với comment phân loại
- Dễ dàng hiểu mục đích của từng test case

### 4. **Dễ bảo trì**
- Test được nhóm theo phương pháp (Hộp Đen / Hộp Trắng)
- Dễ dàng mở rộng và cập nhật sau này

---

## 📝 Cấu trúc file test sau khi cập nhật

```java
public class StudentAnalyzerTest {
    
    // =========================
    // HỘP ĐEN (Black-box tests)
    // =========================
    
    // Test cases cho countExcellentStudents()
    // - Normal cases
    // - Edge cases (empty, null, boundary)
    // - Exception cases (invalid scores)
    // - Black-box specific tests (mới thêm)
    
    // Test cases cho calculateValidAverage()
    // - Normal cases
    // - Edge cases
    // - Exception cases
    // - Black-box specific tests (mới thêm)
    
    // =========================
    // HỘP TRẮNG (White-box tests)
    // =========================
    
    // Test bao phủ nhánh cho countExcellentStudents()
    // Test bao phủ nhánh cho calculateValidAverage()
}
```

---

## ✅ Kết luận

Việc bổ sung test **Hộp Đen** và **Hộp Trắng** đã:
- ✅ Tăng độ bao phủ từ ~85% lên ~95%
- ✅ Bao phủ đầy đủ các nhánh code quan trọng
- ✅ Phát hiện được các edge cases đặc biệt (NaN, Infinity)
- ✅ Tổ chức code test rõ ràng, dễ bảo trì
- ✅ Đảm bảo chất lượng kiểm thử đạt chuẩn

**Tổng số test cases**: 22 (tăng 4 test cases so với ban đầu)

---

NHÓM : NGUYỄN VĂN GIANG
BÀI TẬP CHƯƠNG 5
Tài liệu Kiểm thử Hệ thống Quản lý Thư viện

## Giới thiệu
Đây là bộ tài liệu kiểm thử cho Hệ thống Quản lý Thư viện, bao gồm các tài liệu chính sau:

1. **Test Plan (Kế hoạch Kiểm thử)**
   - Mô tả chiến lược, phạm vi và cách tiếp cận kiểm thử
   - Xác định môi trường kiểm thử, tài nguyên và lịch trình
   - Định nghĩa các tiêu chí bắt đầu/kết thúc kiểm thử

2. **Test Cases (Các trường hợp Kiểm thử)**
   - Chi tiết các test case được tổ chức theo từng module chức năng
   - Mỗi test case bao gồm: Tiêu đề, điều kiện tiên quyết, các bước thực hiện, kết quả mong đợi
   - Được đánh ID rõ ràng để dễ dàng truy xuất

3. **Test Report (Báo cáo Kiểm thử)**
   - Tổng hợp kết quả thực hiện kiểm thử
   - Phân tích các lỗi phát hiện được
   - Đánh giá rủi ro và kiến nghị

4. **Test Metrics (Chỉ số Kiểm thử)**
   - Đo lường hiệu quả quá trình kiểm thử
   - Theo dõi tỷ lệ pass/fail, mật độ lỗi, độ ổn định
   - Cung cấp cái nhìn tổng quan về chất lượng sản phẩm

5. **Bug Reports (Báo cáo Lỗi)**
   - Ghi nhận chi tiết các lỗi phát hiện được
   - Phân loại mức độ ưu tiên và mức độ nghiêm trọng
   - Theo dõi trạng thái sửa lỗi

6. **RTM (Ma trận Truy vết Yêu cầu)**
   - Ánh xạ giữa yêu cầu và test case tương ứng
   - Đảm bảo mọi yêu cầu đều được kiểm thử
   - Theo dõi độ phủ kiểm thử

## Cách sử dụng
1. Bắt đầu bằng việc đọc **Test Plan** để hiểu rõ phạm vi và cách tiếp cận kiểm thử
2. Thực thi các **Test Case** theo đúng kế hoạch
3. Ghi nhận kết quả vào **Test Report**
4. Cập nhật **Bug Reports** khi phát hiện lỗi
5. Sử dụng **RTM** để đảm bảo tất cả yêu cầu đã được kiểm thử đầy đủ
6. Phân tích **Test Metrics** để đánh giá tiến độ và chất lượng

## Quy ước đặt tên
- **Test Case ID**: Có dạng `TC_[MODULE]_[STT]` (VD: TC_AUTH_001)
- **Bug ID**: Có dạng `BUG_[MODULE]_[STT]` (VD: BUG_LOAN_001)
- **Requirement ID**: Có dạng `R[STT]` (VD: R1, R2, ...)




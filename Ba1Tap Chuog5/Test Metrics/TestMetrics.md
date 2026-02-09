# CHỈ SỐ KIỂM THỬ (TEST METRICS)

## 1. Tỷ lệ thực thi (Test Execution Rate)
Đo lường tiến độ thực hiện test.
- Công thức: `(Số TC đã chạy / Tổng số TC) * 100%`
- Tính toán: `(45 / 45) * 100%`
- **Kết quả: 100%** (Đã hoàn thành chạy toàn bộ test)

## 2. Tỷ lệ Pass/Fail (Pass/Fail Rate)
- Pass Rate: `(35 / 45) * 100%` = **77.8%**
- Fail Rate: `(10 / 45) * 100%` = **22.2%**

## 3. Mật độ lỗi theo Module (Defect Density)
Đo lường số lượng bug tìm thấy trên mỗi module.

| Module | Số Bug | Tỷ trọng |
| :--- | :--- | :--- |
| Xác thực (Auth) | 2 | 20% |
| Quản lý sách | 3 | 30% |
| Mượn/Trả sách | 5 | 50% |
| Quản trị | 0 | 0% |

=> **Nhận xét:** Module Mượn/Trả sách đang chứa nhiều lỗi nhất, cần tập trung fix và re-test kỹ chức năng này.

## 4. Phân bố mức độ nghiêm trọng (Severity Distribution)
Đánh giá mức độ ảnh hưởng của lỗi.
- **Critical:** 1 (10%)
- **Major:** 4 (40%)
- **Minor:** 5 (50%)

=> **Chỉ số Sức khỏe:** Trung bình. Tỷ lệ Critical + Major chiếm 50% tổng số lỗi.

## 5. Độ bao phủ yêu cầu (Requirement Coverage)
- Tổng yêu cầu (Reqs): 16
- Số yêu cầu đã có Test Case: 16
- **Coverage: 100%**

## 6. Chất lượng mã nguồn (Code Quality)
- Độ phủ kiểm thử đơn vị (Unit Test Coverage): 75%
- Số lỗi bảo mật: 2 (Mức độ trung bình)
- Số lỗi hiệu năng: 1 (Thời gian phản hồi chậm khi tải danh sách sách lớn)

## 7. Khả năng bảo trì (Maintainability Index)
- Điểm số: 85/100
- **Đánh giá:** Tốt, code được tổ chức rõ ràng, có comment đầy đủ.

## 8. Tỷ lệ tái phát lỗi (Defect Reopen Rate)
- Tổng số lỗi đã sửa: 8
- Số lỗi tái phát: 1
- Tỷ lệ: 12.5%

## 9. Thời gian trung bình sửa lỗi (Mean Time To Repair - MTTR)
- Tổng thời gian sửa lỗi: 16 giờ
- Số lỗi đã sửa: 8
- MTTR: 2 giờ/lỗi

## 10. Đánh giá tổng thể
- **Điểm chất lượng hiện tại:** 7.5/10
- **Khuyến nghị:** Cần tập trung vào việc sửa các lỗi nghiêm trọng trong module Mượn/Trả sách và cải thiện hiệu năng tải dữ liệu.

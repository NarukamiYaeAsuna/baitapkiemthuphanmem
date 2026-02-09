# CHỈ SỐ KIỂM THỬ (TEST METRICS)
**Dự án:** Website Bán hàng Trực tuyến (E-commerce)

## 1. Tổng quan (Overview)
- **Tổng số Test Case:** 36
- **Đã thực thi (Executed):** 36 (100%)
- **Passed:** 30 (83.3%)
- **Failed:** 6 (16.7%)
- **Chưa thực thi (Not Run):** 0 (0%)

## 2. Chi tiết lỗi (Defect Breakdown)
### 2.1 Theo mức độ nghiêm trọng (By Severity)
- **Critical:** 1 (16.7%)
- **Major:** 4 (66.6%)
- **Minor:** 1 (16.7%)

### 2.2 Theo module (By Module)
| Module | Số Bug | Tỷ trọng |
| :--- | :--- | :--- |
| Xác thực (Auth) | 2 | 33.3% |
| Sản phẩm | 2 | 33.3% |
| Giỏ hàng | 1 | 16.7% |
| Thanh toán | 1 | 16.7% |

## 3. Chất lượng mã nguồn (Code Quality)
- **Độ phủ code (Code Coverage):** 75%
  - Dòng lệnh: 73%
  - Nhánh: 65%
  - Hàm: 80%
- **Số lỗi phát hiện:** 10
  - Lỗi cú pháp: 2
  - Cảnh báo bảo mật: 3
  - Vấn đề hiệu năng: 2
  - Lỗi logic: 3

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

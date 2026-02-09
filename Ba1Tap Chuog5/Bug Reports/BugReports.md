# BÁO CÁO LỖI (BUG REPORTS)
**Tổng số Bug:** 10 (1 Critical, 5 Major, 4 Minor)

## Danh sách lỗi chi tiết

| Bug ID | Tóm tắt (Summary) | Severity | Priority | Trạng thái |
| :--- | :--- | :--- | :--- | :--- |
| **BUG_AUTH_011** | Không thể đăng ký tài khoản | **Major** | High | Open |
| **BUG_AUTH_012** | Token đăng nhập hết hạn ngay sau khi đăng nhập thành công | Major | High | Open |
| **BUG_PRD_013** | Kết quả tìm kiếm sản phẩm trả về kết quả không liên quan | Major | Medium | Open |
| **BUG_PRD_014** | Trang chi tiết sản phẩm bị lỗi layout khi mô tả dài > 500 ký tự | Major | Medium | Fixed |
| **BUG_CART_015** | Giỏ hàng không cập nhật số lượng khi thay đổi từ trang chi tiết | Major | High | Open |
| **BUG_CART_016** | Không giới hạn số lượng sản phẩm trong giỏ hàng | Major | Low | Open |
| **BUG_CHK_017** | Lỗi xử lý thanh toán khi địa chỉ quá dài | Critical | High | Open |
| **BUG_UI_018** | Modal thông báo không có nút đóng (X) trên màn hình nhỏ | Minor | Low | Fixed |
| **BUG_UI_019** | Tooltip mô tả sản phẩm bị che bởi footer trên mobile | Minor | Low | Open |
| **BUG_PRD_020** | Ảnh sản phẩm bị mất tỉ lệ (stretched) trên Safari | Minor | Low | Open |

---

## Chi tiết lỗi điển hình (Sample)

### 1. BUG_AUTH_011
- **Tóm tắt:** Không thể đăng ký tài khoản khi tên người dùng chứa dấu tiếng Việt (ví dụ "Nguyễn Văn A").
- **Môi trường:** Chrome 120, Windows 10; Chrome 120, Android (mobile).
- **Các bước tái hiện:**
    1. Mở trang Đăng ký.
    2. Nhập Email hợp lệ, mật khẩu hợp lệ.
    3. Nhập Họ tên: "Nguyễn Văn A".
    4. Nhấn Register.
- **Kết quả mong đợi:** Tài khoản được tạo thành công, chuyển sang trang xác nhận.
- **Kết quả thực tế:** Hiển thị lỗi: "Tên không hợp lệ" và không cho đăng ký. Server trả về validation error 400.
- **Severity:** Major.
- **Priority:** High.
- **Ghi chú:** Khả năng regex validation phía client/server không hỗ trợ ký tự Unicode.

### 2. BUG_LOAN_017
- **Tóm tắt:** Hệ thống không tự động cập nhật trạng thái sách khi quá hạn, dẫn đến không tính phí trả muộn.
- **Môi trường:** Firefox 115, Windows 11; Backend staging.
- **Các bước tái hiện:**
    1. Mượn sách với ngày trả dự kiến là hôm nay.
    2. Đợi quá hạn 1 ngày.
    3. Kiểm tra trạng thái mượn sách.
- **Kết quả mong đợi:** Hệ thống tự động cập nhật trạng thái thành "Quá hạn" và bắt đầu tính phí.
- **Kết quả thực tế:** Sách vẫn hiển thị trạng thái "Đang mượn" dù đã quá hạn, không tính phí trả muộn.
- **Severity:** Critical.
- **Priority:** High.
- **Ghi chú:** Kiểm tra job tự động cập nhật trạng thái sách quá hạn.

---

# BÁO CÁO LỖI (BUG REPORTS)
**Tổng số Bug:** 10 (1 Critical, 5 Major, 4 Minor)

## Danh sách lỗi chi tiết

| Bug ID | Tóm tắt (Summary) | Severity | Priority | Trạng thái |
| :--- | :--- | :--- | :--- | :--- |
| **BUG_AUTH_011** | Không thể đăng ký tài khoản khi tên chứa dấu tiếng Việt | **Major** | High | Open |
| **BUG_AUTH_012** | Token đăng nhập hết hạn ngay sau khi đăng nhập thành công | Major | High | Open |
| **BUG_BOOK_013** | Kết quả tìm kiếm sách trả về kết quả không liên quan | Major | Medium | Open |
| **BUG_BOOK_014** | Trang chi tiết sách bị lỗi layout khi mô tả dài > 300 ký tự | Major | Medium | Fixed |
| **BUG_LOAN_015** | Phí trả muộn tính sai khi sách trả quá hạn | Major | High | Open |
| **BUG_LOAN_016** | Số lượng sách mượn tối đa không giới hạn (nên có giới hạn) | Major | Low | Open |
| **BUG_LOAN_017** | Hệ thống không tự động cập nhật trạng thái sách khi quá hạn | Critical | High | Open |
| **BUG_UI_018** | Modal thông báo không có nút đóng (X) trên màn hình nhỏ | Minor | Low | Fixed |
| **BUG_UI_019** | Tooltip mô tả sách bị che bởi footer trên mobile | Minor | Low | Open |
| **BUG_BOOK_020** | Ảnh bìa sách bị mất tỉ lệ (stretched) trên Safari | Minor | Low | Open |

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
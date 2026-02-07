# BÁO CÁO LỖI (BUG REPORTS)
**Tổng số Bug:** 10 (1 Critical, 5 Major, 4 Minor)

## Danh sách lỗi chi tiết

| Bug ID | Tóm tắt (Summary) | Severity | Priority | Trạng thái |
| :--- | :--- | :--- | :--- | :--- |
| **BUG_AUTH_011** | Không thể đăng ký tài khoản khi tên chứa dấu tiếng Việt | **Major** | High | Open |
| **BUG_AUTH_012** | Token đăng nhập hết hạn ngay sau khi đăng nhập thành công | Major | High | Open |
| **BUG_PROD_013** | Kết quả tìm kiếm trả về sản phẩm không liên quan | Major | Medium | Open |
| **BUG_PROD_014** | Trang chi tiết sản phẩm bị lỗi layout khi mô tả dài > 300 ký tự | Major | Medium | Fixed |
| **BUG_CART_015** | Giá khuyến mãi hiển thị sai khi áp mã giảm giá 10% | Major | High | Open |
| **BUG_CART_016** | Số lượng tối đa nhập cho 1 sản phẩm không giới hạn (nên có giới hạn) | Major | Low | Open |
| **BUG_CHECKOUT_017** | Thanh toán thử nghiệm (COD) tạo đơn với trạng thái "Pending" vô thời hạn | Critical | High | Open |
| **BUG_UI_018** | Modal thông báo không có nút đóng (X) trên màn hình nhỏ | Minor | Low | Fixed |
| **BUG_UI_019** | Tooltip mô tả sản phẩm bị che bởi footer trên mobile | Minor | Low | Open |
| **BUG_PROD_020** | Thumbnail sản phẩm bị mất tỉ lệ (stretched) trên Safari | Minor | Low | Open |

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
- **Kết quả mong đợi:** Tài khoản được tạo thành công, chuyển sang trang Verify/Welcome.
- **Kết quả thực tế:** Hiển thị lỗi: "Tên không hợp lệ" và không cho đăng ký. Server trả về validation error 400.
- **Severity:** Major.
- **Priority:** High.
- **Ghi chú:** Khả năng regex validation phía client/server không hỗ trợ ký tự Unicode.

### 2. BUG_CHECKOUT_017
- **Tóm tắt:** Đơn hàng đặt bằng phương thức COD giữ trạng thái "Pending" vô thời hạn, không chuyển sang "Processing" hoặc "Completed".
- **Môi trường:** Firefox 115, Windows 11; Backend staging.
- **Các bước tái hiện:**
    1. Thêm sản phẩm vào giỏ, Proceed to Checkout.
    2. Nhập địa chỉ giao hàng hợp lệ.
    3. Chọn phương thức thanh toán: COD.
    4. Xác nhận đặt hàng.
- **Kết quả mong đợi:** Đơn được tạo với trạng thái "Processing" hoặc "Confirmed".
- **Kết quả thực tế:** Đơn tạo thành công nhưng trạng thái hiển thị "Pending" > 48 giờ, webhook/payment callback không gọi.
- **Severity:** Critical.
- **Priority:** High.
- **Ghi chú:** Kiểm tra luồng xử lý trạng thái đơn và webhook/service queue.

---
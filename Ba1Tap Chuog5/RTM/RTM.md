# MA TRẬN TRUY VẾT YÊU CẦU (RTM)
**Requirement Traceability Matrix**

| Req ID | Mô tả Yêu cầu (Requirement Description) | Test Case ID (Mapping) | Trạng thái (Status) |
| :--- | :--- | :--- | :--- |
| **R1** | Người dùng đăng ký bằng email hợp lệ | TC_AUTH_001, TC_AUTH_002 | Covered |
| **R2** | Không cho đăng ký khi email sai định dạng | TC_AUTH_003, TC_AUTH_004 | Covered |
| **R3** | Mật khẩu tối thiểu 8 ký tự | TC_AUTH_005, TC_AUTH_006 | Covered |
| **R4** | Đăng nhập thành công với thông tin hợp lệ | TC_AUTH_007, TC_AUTH_008 | Covered |
| **R5** | Đăng nhập thất bại khi sai mật khẩu | TC_AUTH_009, TC_AUTH_010 | Covered |
| **R6** | Quên mật khẩu gửi email đặt lại | TC_AUTH_011, TC_AUTH_012 | Covered |
| **R7** | Tìm kiếm hiển thị đúng kết quả | TC_PRODUCT_001, TC_PRODUCT_002 | Covered |
| **R8** | Lọc theo giá hoạt động đúng | TC_PRODUCT_003, TC_PRODUCT_004 | Covered |
| **R9** | Xem chi tiết sản phẩm | TC_PRODUCT_005, TC_PRODUCT_006 | Covered |
| **R10** | Thêm sản phẩm vào giỏ thành công | TC_CART_001, TC_CART_002 | Covered |
| **R11** | Cập nhật số lượng trong giỏ | TC_CART_003, TC_CART_004 | Covered |
| **R12** | Xoá sản phẩm khỏi giỏ | TC_CART_005, TC_CART_006 | Covered |
| **R13** | Thanh toán bắt buộc nhập địa chỉ | TC_CHECKOUT_001, TC_CHECKOUT_002 | Covered |
| **R14** | Chọn phương thức thanh toán | TC_CHECKOUT_003, TC_CHECKOUT_004 | Covered |
| **R15** | Đặt hàng thành công | TC_CHECKOUT_005, TC_CHECKOUT_006 | Covered |
| **R16** | Lưu lịch sử đơn hàng | TC_ORDER_001, TC_ORDER_002 | Covered |

**Tổng kết:**
- Tổng số yêu cầu: 16
- Số yêu cầu đã phủ (Covered): 16
- Tỷ lệ bao phủ (Coverage): 100%
- Tổng số Test Case (theo phân bổ): 45 (Auth:10, Book:10, Loan:10, Return:5, Admin:5, System:5)
- Trung bình TC/Req: 2.8 (45 / 16)
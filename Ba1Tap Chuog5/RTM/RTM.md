# MA TRẬN TRUY VẾT YÊU CẦU (RTM)
**Requirement Traceability Matrix**

| Req ID | Mô tả Yêu cầu (Requirement Description) | Test Case ID (Mapping) | Trạng thái (Status) |
| :--- | :--- | :--- | :--- |
| **R1** | Người dùng đăng ký bằng email hợp lệ | TC_AUTH_001, TC_AUTH_002, TC_AUTH_003 | Covered |
| **R2** | Không cho đăng ký khi email sai định dạng | TC_AUTH_004, TC_AUTH_005 | Covered |
| **R3** | Mật khẩu tối thiểu 8 ký tự | TC_AUTH_006, TC_AUTH_007 | Covered |
| **R4** | Đăng nhập thành công với thông tin hợp lệ | TC_AUTH_008, TC_AUTH_009, TC_AUTH_010 | Covered |
| **R5** | Đăng nhập thất bại khi sai mật khẩu | TC_AUTH_011, TC_AUTH_012 | Covered |
| **R6** | Quên mật khẩu gửi email đặt lại | TC_AUTH_013, TC_AUTH_014, TC_AUTH_015 | Covered |
| **R7** | Tìm kiếm hiển thị đúng kết quả | TC_PROD_001, TC_PROD_002, TC_PROD_003 | Covered |
| **R8** | Lọc theo giá hoạt động đúng | TC_PROD_004, TC_PROD_005, TC_PROD_006 | Covered |
| **R9** | Xem chi tiết sản phẩm | TC_PROD_007, TC_PROD_008, TC_PROD_009, TC_PROD_010, TC_PROD_011, TC_PROD_012 | Covered |
| **R10** | Thêm sản phẩm vào giỏ thành công | TC_CART_001, TC_CART_002, TC_CART_003 | Covered |
| **R11** | Cập nhật số lượng trong giỏ | TC_CART_004, TC_CART_005, TC_CART_006 | Covered |
| **R12** | Xoá sản phẩm khỏi giỏ | TC_CART_007, TC_CART_008 | Covered |
| **R13** | Thanh toán bắt buộc nhập địa chỉ | TC_CHECKOUT_001, TC_CHECKOUT_002 | Covered |
| **R14** | Chọn phương thức thanh toán | TC_CHECKOUT_003, TC_CHECKOUT_004 | Covered |
| **R15** | Đặt hàng thành công | TC_CHECKOUT_005, TC_CHECKOUT_006, TC_CHECKOUT_007 | Covered |
| **R16** | Lưu lịch sử đơn hàng | TC_CHECKOUT_008, TC_CHECKOUT_009, TC_CHECKOUT_010 | Covered |

**Tổng kết:**
- Tổng số yêu cầu: 16
- Số yêu cầu đã phủ (Covered): 16
- Tỷ lệ bao phủ (Coverage): 100%
- Tổng số Test Case (theo phân bổ): 45 (Auth:15, Product:12, Cart:8, Checkout:10)
- Trung bình TC/Req: 2.8 (45 / 16)
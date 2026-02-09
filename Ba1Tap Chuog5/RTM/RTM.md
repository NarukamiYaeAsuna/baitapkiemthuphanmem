# MA TRẬN TRUY VẾT YÊU CẦU (RTM)
**Requirement Traceability Matrix**

| Req ID | Mô tả Yêu cầu (Requirement Description) | Test Case ID (Mapping) | Trạng thái (Status) |
| :--- | :--- | :--- | :--- |
| **R1** | Người dùng đăng ký thẻ thư viện | TC_AUTH_001, TC_AUTH_002, TC_AUTH_003 | Covered |
| **R2** | Xác thực thông tin đăng nhập | TC_AUTH_004, TC_AUTH_005, TC_AUTH_006 | Covered |
| **R3** | Quản lý thông tin cá nhân | TC_AUTH_007, TC_AUTH_008, TC_AUTH_009 | Covered |
| **R4** | Tìm kiếm sách theo tiêu chí | TC_BOOK_001, TC_BOOK_002, TC_BOOK_003 | Covered |
| **R5** | Xem chi tiết thông tin sách | TC_BOOK_004, TC_BOOK_005, TC_BOOK_006 | Covered |
| **R6** | Đặt giữ sách trước | TC_RESERVE_001, TC_RESERVE_002, TC_RESERVE_003 | Covered |
| **R7** | Mượn sách | TC_LOAN_001, TC_LOAN_002, TC_LOAN_003 | Covered |
| **R8** | Gia hạn thời gian mượn sách | TC_LOAN_004, TC_LOAN_005 | Covered |
| **R9** | Trả sách | TC_RETURN_001, TC_RETURN_002, TC_RETURN_003 | Covered |
| **R10** | Tính phí trả muộn | TC_FINE_001, TC_FINE_002, TC_FINE_003 | Covered |
| **R11** | Quản lý danh mục sách | TC_ADMIN_001, TC_ADMIN_002 | Covered |
| **R12** | Thống kê báo cáo | TC_REPORT_001, TC_REPORT_002, TC_REPORT_003 | Covered |
| **R13** | Quản lý thành viên | TC_MEMBER_001, TC_MEMBER_002, TC_MEMBER_003 | Covered |
| **R14** | Gửi thông báo nhắc trả sách | TC_NOTIFY_001, TC_NOTIFY_002 | Covered |
| **R15** | Tự động cập nhật trạng thái sách quá hạn | TC_SYSTEM_001, TC_SYSTEM_002 | Covered |
| **R16** | Sao lưu và phục hồi dữ liệu | TC_SYSTEM_003, TC_SYSTEM_004 | Covered |

**Tổng kết:**
- Tổng số yêu cầu: 16
- Số yêu cầu đã phủ (Covered): 16
- Tỷ lệ bao phủ (Coverage): 100%
- Tổng số Test Case (theo phân bổ): 45 (Auth:10, Book:10, Loan:10, Return:5, Admin:5, System:5)
- Trung bình TC/Req: 2.8 (45 / 16)
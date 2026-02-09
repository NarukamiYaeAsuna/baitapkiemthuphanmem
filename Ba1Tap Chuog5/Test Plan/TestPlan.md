# KẾ HOẠCH KIỂM THỬ (TEST PLAN)
**Dự án:** Website Bán hàng Trực tuyến (E-commerce)

## 1. Giới thiệu (Introduction)
Tài liệu này mô tả kế hoạch kiểm thử cho Website Bán hàng Trực tuyến. Mục đích là xác định phạm vi, phương pháp, nguồn lực và lịch trình cho các hoạt động kiểm thử nhằm đảm bảo chất lượng phần mềm trước khi triển khai.

## 2. Phạm vi kiểm thử (Scope)
### 2.1 Trong phạm vi (In-scope)
Kiểm thử chức năng (Functional Testing) và giao diện (UI Testing) cho các module sau:
- **Module 1 - Xác thực (Authentication):** 
  - Đăng ký tài khoản
  - Đăng nhập/Đăng xuất
  - Quên mật khẩu
  - Đổi mật khẩu

- **Module 2 - Sản phẩm & Giỏ hàng (Product & Cart):**
  - Tìm kiếm sản phẩm
  - Lọc theo giá/danh mục
  - Xem chi tiết sản phẩm
  - Thêm/Xóa sản phẩm vào giỏ
  - Cập nhật số lượng sản phẩm

- **Module 3 - Thanh toán (Checkout):**
  - Nhập địa chỉ giao hàng
  - Chọn phương thức thanh toán
  - Xác nhận đơn hàng
  - Xem lịch sử đơn hàng

### 2.2 Ngoài phạm vi (Out-of-scope)
- Kiểm thử hiệu năng (Performance Testing) với số lượng người dùng lớn
- Kiểm thử tự động (Automation Testing)
- Kiểm thử bảo mật chuyên sâu (Security Penetration Testing)
- Tích hợp thực tế với cổng thanh toán (chỉ kiểm thử với cổng thanh toán giả lập)

## 3. Phương pháp kiểm thử (Test Approach)
- **Kiểm thử chức năng (Functional testing):** Xác minh các chức năng hoạt động đúng theo yêu cầu.
- **Kiểm thử giao diện (UI testing):** Đảm bảo giao diện thân thiện, dễ sử dụng trên các thiết bị khác nhau.
- **Kiểm thử hồi quy (Regression testing):** Đảm bảo các tính năng cũ vẫn hoạt động sau khi có thay đổi.
- **Kiểm thử tích hợp (Integration testing):** Kiểm tra sự tương tác giữa các module.

## 4. Môi trường kiểm thử (Test Environment)
- **Phần cứng:** 
  - Máy chủ: CPU 4 cores, RAM 8GB, Ổ cứng 100GB
  - Máy trạm: PC/Laptop cấu hình từ trung bình trở lên
- **Hệ điều hành:** 
  - Server: Ubuntu Server 20.04 LTS
  - Client: Windows 10/11 hoặc macOS 10.15+
- **Trình duyệt:** 
  - Google Chrome (phiên bản mới nhất)
  - Mozilla Firefox (phiên bản mới nhất)
  - Microsoft Edge (phiên bản mới nhất)
- **Cơ sở dữ liệu:** MySQL 8.0
- **Dữ liệu test:** Sử dụng dữ liệu giả lập cho sách, thành viên và phiếu mượn.

## 5. Điều kiện vào / ra (Entry / Exit Criteria)
### Entry Criteria (Điều kiện bắt đầu):
1. Các module đã được phát triển xong và triển khai lên môi trường test.
2. Tài liệu yêu cầu (SRS) đã được phê duyệt.
3. Test Plan và Test Cases đã được review và phê duyệt.
4. Môi trường test đã được chuẩn bị sẵn sàng.
5. Dữ liệu test đã được chuẩn bị đầy đủ.

### Exit Criteria (Điều kiện kết thúc):
1. 100% Test case trọng yếu (Critical) đã được thực thi và pass.
2. Tỷ lệ pass tổng thể đạt ít nhất 90%.
3. Tất cả các lỗi nghiêm trọng (Critical/High Severity) đã được sửa và xác nhận.
4. Các vấn đề còn tồn đọng đã được đánh giá và chấp nhận bởi ban quản lý dự án.
5. Tài liệu Test Report đã được hoàn thành và phê duyệt.

## 6. Rủi ro & biện pháp giảm thiểu (Risks & Mitigation)
| Rủi ro | Mức độ | Tác động | Biện pháp giảm thiểu |
| :--- | :---: | :--- | :--- |
| Thiếu thời gian kiểm thử | Cao | Không đủ thời gian kiểm thử toàn diện | - Ưu tiên kiểm thử các luồng chính (Happy path) và chức năng nghiệp vụ quan trọng trước.<br>- Sử dụng kỹ thuật kiểm thử dựa trên rủi ro. |
| Thay đổi yêu cầu | Trung bình | Ảnh hưởng đến tiến độ và phạm vi kiểm thử | - Cập nhật RTM và Test Case kịp thời.<br>- Duy trì giao tiếp chặt chẽ với nhóm phát triển và BA. |
| Môi trường test không ổn định | Trung bình | Gián đoạn quá trình kiểm thử | - Có kế hoạch dự phòng môi trường test.<br>- Báo cáo sớm các vấn đề về môi trường. |
| Thiếu dữ liệu test | Thấp | Không đủ dữ liệu để kiểm thử đầy đủ | - Chuẩn bị sẵn bộ dữ liệu test đa dạng.<br>- Sử dụng công cụ tạo dữ liệu giả lập. |
| Lỗi tích hợp giữa các module | Cao | Ảnh hưởng đến luồng nghiệp vụ chính | - Thực hiện kiểm thử tích hợp sớm và thường xuyên.<br>- Tự động hóa các test case tích hợp quan trọng. |

## 7. Vai trò & trách nhiệm (Roles & Responsibilities)
- **Trưởng nhóm QA:**
  - Phê duyệt Test Plan và Test Cases
  - Giám sát tiến độ và chất lượng kiểm thử
  - Đánh giá rủi ro và đưa ra quyết định
  - Báo cáo kết quả kiểm thử cho ban quản lý dự án

- **Kiểm thử viên (QA Tester):**
  - Phân tích yêu cầu và thiết kế test case
  - Thực hiện kiểm thử theo kế hoạch
  - Báo cáo lỗi và theo dõi quá trình sửa lỗi
  - Thực hiện kiểm thử hồi quy
  - Viết báo cáo kiểm thử

- **Nhà phát triển (Developer):**
  - Cung cấp thông tin kỹ thuật cần thiết
  - Sửa lỗi và xác nhận đã sửa
  - Hỗ trợ khắc phục sự cố môi trường
  - Tham gia đánh giá test case

- **Quản lý dự án (Project Manager):**
  - Phê duyệt phạm vi và kế hoạch kiểm thử
  - Điều phối nguồn lực
  - Giải quyết các vấn đề phát sinh giữa các bên

## 8. Lịch trình kiểm thử (Test Schedule)

### 8.1 Tổng thời gian: 10 ngày làm việc

| Ngày | Công việc | Đầu ra mong đợi |
| :---: | :--- | :--- |
| **Ngày 1** | - Chuẩn bị môi trường test<br>- Xem xét tài liệu yêu cầu | - Môi trường test sẵn sàng<br>- Danh sách câu hỏi/clarification |
| **Ngày 2** | - Xây dựng Test Cases cho Module Xác thực<br>- Review nội bộ test cases | - Test Cases Module Xác thực<br>- Biên bản review |
| **Ngày 3** | - Xây dựng Test Cases cho Module Quản lý sách<br>- Review nội bộ test cases | - Test Cases Module Quản lý sách<br>- Biên bản review |
| **Ngày 4** | - Xây dựng Test Cases cho Module Mượn/Trả sách<br>- Review nội bộ test cases | - Test Cases Module Mượn/Trả sách<br>- Biên bản review |
| **Ngày 5** | - Xây dựng Test Cases cho Module Quản trị<br>- Review toàn bộ test cases | - Test Cases Module Quản trị<br>- Biên bản review cuối cùng |
| **Ngày 6** | - Thực thi test case Module Xác thực<br>- Báo cáo lỗi | - Kết quả test Module Xác thực<br>- Danh sách lỗi phát hiện được |
| **Ngày 7** | - Thực thi test case Module Quản lý sách<br>- Báo cáo lỗi | - Kết quả test Module Quản lý sách<br>- Danh sách lỗi phát hiện được |
| **Ngày 8** | - Thực thi test case Module Mượn/Trả sách<br>- Báo cáo lỗi | - Kết quả test Module Mượn/Trả sách<br>- Danh sách lỗi phát hiện được |
| **Ngày 9** | - Thực thi test case Module Quản trị<br>- Kiểm thử hồi quy các lỗi đã sửa | - Kết quả test Module Quản trị<br>- Kết quả kiểm thử hồi quy |
| **Ngày 10** | - Tổng hợp kết quả kiểm thử<br>- Viết báo cáo kiểm thử<br>- Đánh giá tổng thể | - Báo cáo kiểm thử hoàn chỉnh<br>- Đề xuất cho các giai đoạn tiếp theo |

### 8.2 Phân bổ nguồn lực
- **Nhân sự:** 2 QA Testers
- **Thiết bị:** 2 máy tính cấu hình tốt
- **Công cụ:** Jira, TestRail, Postman, Selenium

### 8.3 Tiêu chí đánh giá
- **Hoàn thành đúng hạn:** 100% test case được thực thi đúng kế hoạch
- **Chất lượng:** Tỷ lệ pass test case đạt tối thiểu 90%
- **Bảo mật:** Không có lỗi bảo mật nghiêm trọng
- **Hiệu suất:** Thời gian phản hồi trung bình dưới 3 giây cho các tác vụ chính

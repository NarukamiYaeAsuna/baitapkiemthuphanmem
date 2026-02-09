# CA KIỂM THỬ (TEST CASES)

## Tổng quan
- **Tổng số:** 45 Test Cases
- **Phân bổ:** Xác thực (10), Sách (10), Mượn/Trả (15), Quản trị (10)

## Module 1: Xác thực (Authentication) - 10 Cases

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại Test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_AUTH_001 | Đăng ký thẻ thư viện thành công | Chưa có tài khoản | 1. Vào trang Đăng ký <br> 2. Điền đủ thông tin <br> 3. Bấm Đăng ký | Tạo thẻ thành công, chuyển về trang chủ | High | Positive |
| TC_AUTH_002 | Đăng ký thất bại khi thiếu thông tin bắt buộc | - | 1. Để trống các trường bắt buộc <br> 2. Bấm Đăng ký | Báo lỗi yêu cầu nhập đủ thông tin | High | Negative |
| TC_AUTH_003 | Đăng ký thất bại khi email đã tồn tại | Email đã đăng ký | 1. Nhập email đã có <br> 2. Bấm Đăng ký | Báo lỗi email đã được sử dụng | Medium | Negative |
| TC_AUTH_004 | Đăng nhập thành công với thông tin đúng | Đã có tài khoản | 1. Nhập email, mật khẩu đúng <br> 2. Bấm Đăng nhập | Đăng nhập thành công, vào trang chủ | High | Positive |
| TC_AUTH_005 | Đăng nhập thất bại sai mật khẩu | - | 1. Nhập mật khẩu sai <br> 2. Bấm Đăng nhập | Báo lỗi sai thông tin đăng nhập | High | Negative |
| TC_AUTH_006 | Đăng nhập thất bại tài khoản bị khóa | Tài khoản bị khóa | 1. Nhập thông tin tài khoản bị khóa <br> 2. Bấm Đăng nhập | Thông báo tài khoản đã bị khóa | Medium | Negative |
| TC_AUTH_007 | Đổi mật khẩu thành công | Đã đăng nhập | 1. Vào trang đổi mật khẩu <br> 2. Nhập mật khẩu cũ và mới <br> 3. Xác nhận | Đổi mật khẩu thành công | Medium | Positive |
| TC_AUTH_008 | Đổi mật khẩu thất bại khi nhập sai mật khẩu cũ | Đã đăng nhập | 1. Nhập sai mật khẩu cũ <br> 2. Bấm Xác nhận | Báo lỗi mật khẩu cũ không đúng | Medium | Negative |
| TC_AUTH_009 | Đăng xuất hệ thống | Đang đăng nhập | 1. Bấm Đăng xuất | Đăng xuất thành công, về trang đăng nhập | High | Positive |
| TC_AUTH_010 | Truy cập trang quản trị không có quyền | Tài khoản thường | 1. Truy cập URL quản trị | Báo lỗi không có quyền truy cập | High | Security |

## Module 2: Quản lý sách (Book Management) - 10 Cases

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại Test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_BOOK_001 | Tìm kiếm sách theo tên | - | 1. Nhập tên sách vào ô tìm kiếm <br> 2. Enter | Hiển thị danh sách sách phù hợp | High | Positive |
| TC_BOOK_002 | Tìm kiếm sách theo tác giả | - | 1. Chọn tìm theo tác giả <br> 2. Nhập tên tác giả | Hiển thị sách của tác giả | High | Positive |
| TC_BOOK_003 | Tìm kiếm không có kết quả | - | 1. Nhập từ khóa không tồn tại | Hiển thị "Không tìm thấy sách" | Medium | Negative |
| TC_BOOK_004 | Xem chi tiết sách | - | 1. Click vào tên sách | Hiển thị đầy đủ thông tin sách | High | Positive |
| TC_BOOK_005 | Kiểm tra tình trạng sách | Sách còn trong kho | 1. Xem trang chi tiết | Hiển thị "Có sẵn" hoặc "Đã mượn" | High | Functional |
| TC_BOOK_006 | Lọc sách theo thể loại | - | 1. Chọn thể loại "Khoa học" | Chỉ hiện sách thuộc thể loại đã chọn | Medium | Positive |
| TC_BOOK_007 | Sắp xếp sách theo năm xuất bản | - | 1. Chọn sắp xếp "Mới nhất" | Danh sách sắp xếp từ mới đến cũ | Low | Functional |
| TC_BOOK_008 | Đặt giữ sách thành công | Sách còn trong kho | 1. Bấm "Đặt giữ" <br> 2. Xác nhận | Nhận được thông báo đặt giữ thành công | High | Positive |
| TC_BOOK_009 | Đặt giữ sách đã có người khác đặt | Sách đã được đặt hết | 1. Bấm "Đặt giữ" | Thông báo hết sách, gợi ý đặt trước | Medium | Negative |
| TC_BOOK_010 | Hủy đặt giữ sách | Đã đặt giữ sách | 1. Vào mục sách đã đặt <br> 2. Bấm "Hủy đặt giữ" | Xác nhận hủy thành công | Medium | Positive |

## Module 3: Mượn/Trả sách (Loan/Return) - 15 Cases

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại Test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_LOAN_001 | Mượn sách thành công | Có sách trong kho | 1. Chọn sách <br> 2. Bấm "Mượn sách" | Nhận được phiếu mượn, trạng thái "Đang mượn" | High | Positive |
| TC_LOAN_002 | Mượn sách quá số lượng cho phép | Đã mượn đủ số sách | 1. Thử mượn thêm sách | Báo lỗi vượt quá hạn mức | High | Negative |
| TC_LOAN_003 | Gia hạn thời gian mượn sách | Sách chưa quá hạn | 1. Vào mục sách đang mượn <br> 2. Bấm "Gia hạn" | Cập nhật ngày trả dự kiến mới | Medium | Positive |
| TC_LOAN_004 | Không thể gia hạn sách đã quá hạn | Sách đã quá hạn | 1. Thử gia hạn | Báo lỗi không thể gia hạn | Medium | Negative |
| TC_LOAN_005 | Trả sách đúng hạn | Đang mượn sách | 1. Bấm "Trả sách" <br> 2. Xác nhận | Cập nhật trạng thái "Đã trả" | High | Positive |
| TC_LOAN_006 | Trả sách quá hạn | Sách quá hạn | 1. Bấm "Trả sách" | Tính phí trả muộn | High | Positive |
| TC_LOAN_007 | Kiểm tra lịch sử mượn trả | Đã từng mượn sách | 1. Vào mục lịch sử | Hiển thị đầy đủ thông tin các lần mượn | Medium | Functional |
| TC_LOAN_008 | Tự động gửi email nhắc trả sách | Sắp đến hạn trả | Hệ thống tự động | Gửi email nhắc nhở 3 ngày trước hạn | Medium | System |
| TC_LOAN_009 | Tự động khóa thẻ khi quá hạn nhiều lần | Vi phạm nội quy nhiều lần | Hệ thống tự động | Khóa thẻ và thông báo cho người dùng | High | System |
| TC_LOAN_010 | Tự động cập nhật trạng thái sách quá hạn | Sách quá hạn chưa trả | Hệ thống tự động | Cập nhật trạng thái "Quá hạn" | High | System |
| TC_LOAN_011 | Thống kê sách mượn nhiều nhất | - | 1. Vào mục thống kê | Hiển thị top sách được mượn nhiều | Low | Report |
| TC_LOAN_012 | Thống kê số lượng sách đang mượn | - | 1. Vào mục thống kê | Hiển thị chính xác số lượng sách đang được mượn | Low | Report |
| TC_LOAN_013 | Thống kê số lượng sách quá hạn | - | 1. Vào mục thống kê | Hiển thị chính xác số sách quá hạn | Medium | Report |
| TC_LOAN_014 | Xuất báo cáo mượn trả | - | 1. Chọn khoảng thời gian <br> 2. Bấm "Xuất báo cáo" | Tải xuống file báo cáo đầy đủ | Medium | Report |
| TC_LOAN_015 | Tìm kiếm lịch sử mượn theo ngày | - | 1. Chọn ngày bắt đầu/kết thúc <br> 2. Bấm Tìm kiếm | Hiển thị kết quả chính xác | Medium | Functional |

## Module 4: Quản trị (Administration) - 10 Cases

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại Test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_ADMIN_001 | Thêm sách mới | Đăng nhập với quyền admin | 1. Vào mục thêm sách <br> 2. Điền đủ thông tin <br> 3. Lưu | Thêm sách thành công vào hệ thống | High | Positive |
| TC_ADMIN_002 | Chỉnh sửa thông tin sách | Sách đã tồn tại | 1. Vào trang chỉnh sửa <br> 2. Cập nhật thông tin <br> 3. Lưu | Cập nhật thông tin thành công | High | Positive |
| TC_ADMIN_003 | Xóa sách | Sách không còn ai mượn | 1. Chọn xóa sách <br> 2. Xác nhận | Xóa sách khỏi hệ thống | High | Positive |
| TC_ADMIN_004 | Quản lý thành viên | Đăng nhập với quyền admin | 1. Vào mục quản lý thành viên | Hiển thị danh sách thành viên | High | Functional |
| TC_ADMIN_005 | Khóa/mở khóa tài khoản | Tài khoản thành viên đang hoạt động | 1. Chọn khóa tài khoản <br> 2. Xác nhận | Cập nhật trạng thái tài khoản | High | Functional |
| TC_ADMIN_006 | Thêm thể loại sách mới | Đăng nhập với quyền admin | 1. Vào mục quản lý thể loại <br> 2. Thêm mới | Thêm thành công thể loại mới | Medium | Positive |
| TC_ADMIN_007 | Xem nhật ký hoạt động | Đăng nhập với quyền admin | 1. Vào mục nhật ký | Hiển thị đầy đủ lịch sử hoạt động | Medium | Functional |
| TC_ADMIN_008 | Sao lưu dữ liệu | Đăng nhập với quyền admin | 1. Vào mục sao lưu <br> 2. Bấm "Sao lưu ngay" | Tạo bản sao lưu thành công | High | System |
| TC_ADMIN_009 | Phục hồi dữ liệu | Có bản sao lưu | 1. Chọn bản sao lưu <br> 2. Bấm "Phục hồi" | Khôi phục dữ liệu thành công | High | System |
| TC_ADMIN_010 | Phân quyền người dùng | Đăng nhập với quyền admin | 1. Vào mục phân quyền <br> 2. Cấp quyền cho user | Cập nhật quyền thành công | High | Functional |

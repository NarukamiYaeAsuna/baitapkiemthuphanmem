# CA KIỂM THỬ (TEST CASES)

## Tổng quan
- **Tổng số:** 36 Test Cases
- **Phân bổ:** Xác thực (12), Sản phẩm (6), Giỏ hàng (6), Thanh toán (6), Đơn hàng (6)

## Module 1: Xác thực (Authentication) - 12 Cases

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại Test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_AUTH_001 | Đăng ký tài khoản thành công với email hợp lệ | Chưa có tài khoản | 1. Vào trang Đăng ký <br> 2. Nhập email hợp lệ <br> 3. Nhập mật khẩu ≥ 8 ký tự <br> 4. Xác nhận mật khẩu <br> 5. Bấm Đăng ký | Tạo tài khoản thành công, gửi email xác nhận | High | Positive |
| TC_AUTH_002 | Đăng ký thất bại khi email đã tồn tại | Đã có tài khoản với email test@example.com | 1. Vào trang Đăng ký <br> 2. Nhập email test@example.com <br> 3. Nhập mật khẩu hợp lệ <br> 4. Bấm Đăng ký | Hiển thị thông báo "Email đã được sử dụng" | High | Negative |
| TC_AUTH_002 | Đăng ký thất bại khi thiếu thông tin bắt buộc | - | 1. Để trống các trường bắt buộc <br> 2. Bấm Đăng ký | Báo lỗi yêu cầu nhập đủ thông tin | High | Negative |
| TC_AUTH_003 | Đăng ký thất bại khi email đã tồn tại | Email đã đăng ký | 1. Nhập email đã có <br> 2. Bấm Đăng ký | Báo lỗi email đã được sử dụng | Medium | Negative |
| TC_AUTH_004 | Đăng nhập thành công với thông tin đúng | Đã có tài khoản | 1. Nhập email, mật khẩu đúng <br> 2. Bấm Đăng nhập | Đăng nhập thành công, vào trang chủ | High | Positive |
| TC_AUTH_005 | Đăng nhập thất bại sai mật khẩu | - | 1. Nhập mật khẩu sai <br> 2. Bấm Đăng nhập | Báo lỗi sai thông tin đăng nhập | High | Negative |
| TC_AUTH_006 | Đăng nhập thất bại tài khoản bị khóa | Tài khoản bị khóa | 1. Nhập thông tin tài khoản bị khóa <br> 2. Bấm Đăng nhập | Thông báo tài khoản đã bị khóa | Medium | Negative |
| TC_AUTH_007 | Đổi mật khẩu thành công | Đã đăng nhập | 1. Vào trang đổi mật khẩu <br> 2. Nhập mật khẩu cũ và mới <br> 3. Xác nhận | Đổi mật khẩu thành công | Medium | Positive |
| TC_AUTH_008 | Đổi mật khẩu thất bại khi nhập sai mật khẩu cũ | Đã đăng nhập | 1. Nhập sai mật khẩu cũ <br> 2. Bấm Xác nhận | Báo lỗi mật khẩu cũ không đúng | Medium | Negative |
| TC_AUTH_009 | Đăng xuất hệ thống | Đang đăng nhập | 1. Bấm Đăng xuất | Đăng xuất thành công, về trang đăng nhập | High | Positive |
| TC_AUTH_010 | Quên mật khẩu - Gửi email đặt lại | Tài khoản tồn tại | 1. Vào trang Quên mật khẩu <br> 2. Nhập email đã đăng ký <br> 3. Bấm Gửi yêu cầu | Nhận được email hướng dẫn đặt lại mật khẩu | High | Positive |
| TC_AUTH_011 | Quên mật khẩu - Email không tồn tại | - | 1. Vào trang Quên mật khẩu <br> 2. Nhập email chưa đăng ký <br> 3. Bấm Gửi yêu cầu | Hiển thị thông báo "Email chưa được đăng ký" | Medium | Negative |
| TC_AUTH_012 | Đổi mật khẩu thành công | Đã đăng nhập | 1. Vào trang Cài đặt tài khoản <br> 2. Chọn Đổi mật khẩu <br> 3. Nhập mật khẩu cũ và mật khẩu mới đủ mạnh | Thông báo đổi mật khẩu thành công | Medium | Positive |

## Module 2: Sản phẩm (Product) - 6 Cases

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại Test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_PRD_001 | Tìm kiếm sản phẩm theo tên | - | 1. Nhập tên sản phẩm vào ô tìm kiếm <br> 2. Nhấn Enter | Hiển thị danh sách sản phẩm phù hợp | High | Positive |
| TC_PRD_002 | Tìm kiếm không có kết quả | - | 1. Nhập từ khóa không tồn tại | Hiển thị thông báo "Không tìm thấy sản phẩm" | Medium | Negative |
| TC_PRD_003 | Lọc sản phẩm theo khoảng giá | - | 1. Chọn mức giá từ 500.000đ - 2.000.000đ <br> 2. Bấm Áp dụng | Chỉ hiển thị sản phẩm trong khoảng giá đã chọn | High | Positive |
| TC_PRD_004 | Lọc sản phẩm theo danh mục | - | 1. Chọn danh mục "Điện thoại" <br> 2. Bấm Áp dụng | Chỉ hiển thị sản phẩm thuộc danh mục đã chọn | High | Positive |
| TC_PRD_005 | Xem chi tiết sản phẩm | - | 1. Click vào tên sản phẩm bất kỳ | Hiển thị đầy đủ thông tin chi tiết sản phẩm | High | Positive |
| TC_PRD_006 | Xem đánh giá sản phẩm | - | 1. Vào trang chi tiết sản phẩm <br> 2. Kéo xuống phần đánh giá | Hiển thị danh sách đánh giá của khách hàng | Medium | Positive |

## Module 3: Giỏ hàng (Cart) - 6 Cases

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại Test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_CART_001 | Thêm sản phẩm vào giỏ hàng | Đã chọn sản phẩm | 1. Bấm "Thêm vào giỏ hàng" | Sản phẩm được thêm vào giỏ, số lượng trong giỏ tăng lên | High | Positive |
| TC_CART_002 | Xóa sản phẩm khỏi giỏ hàng | Có sản phẩm trong giỏ | 1. Vào giỏ hàng <br> 2. Bấm Xóa sản phẩm | Sản phẩm bị xóa khỏi giỏ, tổng tiền được cập nhật | High | Positive |
| TC_CART_003 | Cập nhật số lượng sản phẩm | Có sản phẩm trong giỏ | 1. Vào giỏ hàng <br> 2. Thay đổi số lượng sản phẩm <br> 3. Bấm Cập nhật | Số lượng và tổng tiền được cập nhật | High | Positive |
| TC_CART_004 | Nhập số lượng không hợp lệ | Có sản phẩm trong giỏ | 1. Vào giỏ hàng <br> 2. Nhập số lượng = 0 hoặc chữ | Hiển thị thông báo lỗi, không cho cập nhật | Medium | Negative |
| TC_CART_005 | Kiểm tra tổng tiền | Nhiều sản phẩm trong giỏ | 1. Vào giỏ hàng | Tổng tiền được tính đúng theo giá và số lượng từng sản phẩm | High | Positive |
| TC_CART_006 | Tiếp tục mua hàng | Giỏ hàng không rỗng | 1. Vào giỏ hàng <br> 2. Bấm "Tiếp tục mua hàng" | Chuyển về trang danh sách sản phẩm | Low | Positive |

## Module 4: Thanh toán (Checkout) - 6 Cases

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại Test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_CHK_001 | Nhập địa chỉ giao hàng | Đã đăng nhập, có sản phẩm trong giỏ | 1. Vào trang thanh toán <br> 2. Nhập đầy đủ thông tin địa chỉ <br> 3. Bấm Tiếp tục | Chuyển sang bước chọn phương thức thanh toán | High | Positive |
| TC_CHK_002 | Bỏ trống trường bắt buộc | Đã đăng nhập, có sản phẩm trong giỏ | 1. Để trống trường bắt buộc <br> 2. Bấm Tiếp tục | Hiển thị thông báo yêu cầu nhập đủ thông tin | High | Negative |
| TC_CHK_003 | Chọn phương thức thanh toán COD | Đã nhập địa chỉ | 1. Chọn "Thanh toán khi nhận hàng" <br> 2. Bấm Đặt hàng | Hiển thị trang xác nhận đơn hàng thành công | High | Positive |
| TC_CHK_004 | Chọn thanh toán bằng thẻ | Đã nhập địa chỉ | 1. Chọn "Thanh toán bằng thẻ" <br> 2. Nhập thông tin thẻ giả lập <br> 3. Bấm Thanh toán | Chuyển hướng đến cổng thanh toán giả lập | High | Positive |
| TC_CHK_005 | Hủy đơn hàng | Đã đặt hàng thành công | 1. Vào trang đơn hàng <br> 2. Chọn đơn hàng cần hủy <br> 3. Bấm Hủy đơn hàng | Trạng thái đơn hàng chuyển sang "Đã hủy" | Medium | Positive |
| TC_CHK_006 | Kiểm tra email xác nhận | Đã đặt hàng thành công | 1. Kiểm tra hộp thư email | Nhận được email xác nhận đơn hàng với đầy đủ thông tin | Medium | Positive |

## Module 5: Quản lý đơn hàng (Order) - 6 Cases

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại Test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_ORD_001 | Xem lịch sử đơn hàng | Đã đăng nhập, có đơn hàng | 1. Vào mục Đơn hàng của tôi | Hiển thị danh sách các đơn hàng đã đặt | High | Positive |
| TC_ORD_002 | Xem chi tiết đơn hàng | Có đơn hàng đã đặt | 1. Chọn một đơn hàng bất kỳ | Hiển thị đầy đủ thông tin đơn hàng | High | Positive |
| TC_ORD_003 | Theo dõi trạng thái đơn hàng | Có đơn hàng đang giao | 1. Vào chi tiết đơn hàng | Hiển thị trạng thái cập nhật mới nhất | Medium | Positive |
| TC_ORD_004 | In hóa đơn | Có đơn hàng đã đặt | 1. Vào chi tiết đơn hàng <br> 2. Bấm In hóa đơn | Mở cửa sổ in với đầy đủ thông tin hóa đơn | Low | Positive |
| TC_ORD_005 | Đánh giá sản phẩm sau khi mua | Đã nhận được hàng | 1. Vào chi tiết đơn hàng <br> 2. Chọn Đánh giá <br> 3. Nhập nội dung và chọn sao <br> 4. Bấm Gửi | Đánh giá được lưu và hiển thị dưới sản phẩm | Medium | Positive |
| TC_ORD_006 | Yêu cầu đổi trả hàng | Trong thời hạn đổi trả | 1. Vào chi tiết đơn hàng <br> 2. Chọn Yêu cầu đổi trả <br> 3. Điền lý do và gửi | Nhận được email xác nhận yêu cầu đổi trả | Medium | Positive |

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

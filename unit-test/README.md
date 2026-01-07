# Hướng dẫn tạo Issues trên GitHub

## Các bước tạo Issues:

### 1. Truy cập trang Issues
- Vào repo: https://github.com/NarukamiYaeAsuna/baitapkiemthuphanmem
- Click tab **"Issues"** ở menu trên cùng
- Click nút **"New issue"** (màu xanh lá)

### 2. Tạo 4 Issues theo thứ tự:

---

#### **Issue #1: Viết hàm countExcellentStudents()**

**Title (Tiêu đề):**
```
Viết hàm countExcellentStudents()
```

**Description (Mô tả):**
```
Cần xử lý kiểm tra điểm hợp lệ và đếm học sinh giỏi
```

**Labels (nếu có):** `enhancement` hoặc `feature`

---

#### **Issue #2: Viết hàm calculateValidAverage()**

**Title (Tiêu đề):**
```
Viết hàm calculateValidAverage()
```

**Description (Mô tả):**
```
Tính trung bình các điểm hợp lệ
```

**Labels (nếu có):** `enhancement` hoặc `feature`

---

#### **Issue #3: Viết test cho 2 hàm trên**

**Title (Tiêu đề):**
```
Viết test cho 2 hàm trên
```

**Description (Mô tả):**
```
Dùng JUnit để kiểm thử đầy đủ
```

**Labels (nếu có):** `testing` hoặc `test`

---

#### **Issue #4: Viết tài liệu README.md**

**Title (Tiêu đề):**
```
Viết tài liệu README.md
```

**Description (Mô tả):**
```
Mô tả bài toán, cách chạy chương trình, test
```

**Labels (nếu có):** `documentation` hoặc `docs`

---

## Lưu ý:

1. **Tạo issues theo thứ tự** để đảm bảo có số #1, #2, #3, #4 đúng
2. Sau khi tạo issue, bạn sẽ thấy số issue (ví dụ: #1, #2...)
3. Khi commit code, dùng format: `feat: implement countExcellentStudents() #1`
4. GitHub sẽ tự động liên kết commit với issue khi bạn dùng `#<số>`

## Sau khi tạo issues:

Bạn có thể:
- Xem tất cả issues ở tab "Issues"
- Click vào từng issue để xem chi tiết
- Issue sẽ tự động đóng khi bạn commit với message `fixes #1` hoặc `closes #1`


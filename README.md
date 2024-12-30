# ĐÔ ÁN TỐT NGHIỆP HAUI - NGUYỄN VĂN MẠNH
# Rook Book Store

## Giới thiệu
Rook Book Store là một ứng dụng web hiện đại giúp quản lý và bán sách trực tuyến. Dự án được xây dựng trên nền tảng Spring Boot, sử dụng Thymeleaf làm công cụ template engine và MySQL để quản lý cơ sở dữ liệu. Ứng dụng cung cấp giao diện thân thiện với người dùng, hỗ trợ quản lý danh mục sách, giỏ hàng, đặt hàng và quản lý người dùng.

---

## Tính năng chính
- **Danh mục sách**: Hiển thị danh sách sách theo thể loại, tác giả, và từ khóa.
- **Chi tiết sách**: Xem thông tin chi tiết từng cuốn sách, bao gồm mô tả, giá cả, và đánh giá.
- **Giỏ hàng**: Thêm, xóa, và cập nhật số lượng sách trong giỏ hàng.
- **Đặt hàng**: Hoàn tất đơn hàng và thanh toán trực tuyến.
- **Quản lý người dùng**: Đăng ký, đăng nhập, và quản lý thông tin tài khoản.
- **Quản lý admin**: Thêm/sửa/xóa sách, quản lý đơn hàng và người dùng (Dành cho quản trị viên).

---

## Công nghệ sử dụng
- **Backend**: Spring Boot
  - Spring MVC
  - Spring Data JPA
  - Spring Security
- **Frontend**: Thymeleaf, Bootstrap
- **Database**: MySQL
- **Build Tool**: Maven
- **Deployment**: Có thể chạy trên máy local hoặc deploy lên các dịch vụ cloud như Heroku, AWS, v.v.

---

## Yêu cầu hệ thống
- **Java**: JDK 11 hoặc mới hơn
- **MySQL**: Phiên bản 8.0 hoặc mới hơn
- **Maven**: Phiên bản 3.6.3 hoặc mới hơn

---

## Hướng dẫn cài đặt và chạy ứng dụng

### 1. Clone repository
```bash
git clone https://github.com/manhnguyen9822/Rook-Book-Store.git
cd rook-book-store
```

### 2. Cấu hình cơ sở dữ liệu
- Tạo một cơ sở dữ liệu MySQL với tên `rook_book_store`.
- Cập nhật thông tin kết nối cơ sở dữ liệu trong file `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/rook_book_store
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Chạy ứng dụng
- Sử dụng Maven để build và chạy ứng dụng:
```bash
mvn spring-boot:run
```
- Truy cập ứng dụng qua trình duyệt tại địa chỉ: [http://localhost:8080](http://localhost:8080)

---

## Cấu trúc dự án
```plaintext
rook-book-store/
|-- src/
|   |-- main/
|       |-- java/com/example/rookbookstore/  # Code Java chính
|       |-- resources/
|           |-- templates/                  # Thymeleaf templates
|           |-- static/                     # Tệp tĩnh (CSS, JS, hình ảnh)
|           |-- application.properties      # Cấu hình ứng dụng
|-- pom.xml                                 # File cấu hình Maven
|-- README.md                               # Hướng dẫn sử dụng dự án
```

---

## Hướng dẫn sử dụng
### 1. Người dùng
- **Đăng ký tài khoản**: Đăng ký tài khoản mới để bắt đầu mua sắm.
- **Tìm kiếm sách**: Sử dụng thanh tìm kiếm hoặc duyệt danh mục sách.
- **Thêm vào giỏ hàng**: Chọn sách muốn mua và thêm vào giỏ hàng.
- **Thanh toán**: Kiểm tra giỏ hàng và hoàn tất đơn hàng.

### 2. Quản trị viên
- Đăng nhập bằng tài khoản quản trị viên.
- Truy cập trang quản lý để thêm, sửa, hoặc xóa sách.
- Xem và quản lý đơn hàng từ khách hàng.

---

## Đóng góp
Mọi ý kiến đóng góp và sự tham gia phát triển dự án đều được chào đón! Vui lòng gửi pull request hoặc mở issue tại [GitHub Repository](https://github.com/manhnguyen9822/Rook-Book-Store.git).

---

## Tác giả
Dự án được phát triển bởi **Nguyễn Văn Mạnh**. Liên hệ qua email tại: your-email@example.com



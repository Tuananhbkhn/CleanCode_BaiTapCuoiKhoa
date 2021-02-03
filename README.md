# Lê Văn Tuấn Anh
## Khoá học Clean Code - Luvina 2020


## Phần 1: Clean Code căn bản
1. 5 mục tiêu chính của Clean Code là
   - Mục tiêu 1: Làm cho code sạch hơn, dễ đọc hơn, đơn giản, hiệu quả, không bị lặp và sáng sủa.
   - Mục tiêu 2: Làm dễ dàng phát hiện bug, tiết kiệm chi phí fix bug.
   - Mục tiêu 3: Làm cho code dễ mở rộng.
   - Mục tiêu 4: Làm cho code dễ bảo trì.
   - Mục tiêu 5: Làm tiết kiệm thời gian và gia tăng giá trị cho công việc.
   
2. Đáp án của tôi là team C bởi vì:
   - Lý do 1: Nên áp dụng Clean Code từ đầu dự án để đồng bộ.
   - Lý do 2: Với những người mới thì chưa chắc đã áp dụng được ngay những kỹ thuật khó để Clean Code, áp dụng những kĩ thuật dễ nhớ, đơn giản trước là hợp lý.
   - Lý do 3: Dành quá nhiều thời gian cho Clean Code sẽ làm ảnh hưởng đến tiến độ dự án, việc đào tạo về Clean Code nên được làm trước khi bắt đầu dự án thay vì trong thời gian thực hiện dự án.
   
3. Clean Code không làm phức tạp hóa vấn đề. Có thể thời gian đầu khi code còn đơn giản các bạn sẽ cảm thấy không cần thiết phải Clean Code nhưng khi sau này code mở rộng ra, các bạn sẽ thấy lợi ích của Clean Code. Nó giúp cho code dễ đọc, dễ hiểu, dễ tìm bug, từ đó tiết kiệm được rất nhiều thời gian fix bug và refactor code. Nếu từ đầu không áp dụng Clean Code, càng về sau code của các bạn sẽ càng ngày càng rối và khó hiểu, lúc đó sẽ rất mất thời gian để tìm bug, fix bug, mở rộng code,.. thậm chí là phải đập đi làm lại. Vì vậy, hãy Clean Code sớm nhất có thể.

4. Đề xuất của Vân là hợp lý nhất với quy ước về đặt tên phương thức và tham số của phương thức trong Clean Code.

5. 
```Java
public class User {
   private long id;
   private String fullName;
   private ArrayList<Post> posts;  //Một người có thể viết nhiều Post
   private ArrayList<Comment> comments; //Một người có thể bình luận nhiều Comment
   
   void writePost(Post post) {
       PostDao.add(post);
   }
   
   void deletePost(Post post) throws PostException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception
       PostDao.delete(post);
   }
   
   void writeComment(Post post, Comment comment) {
       post.addComment(comment);
   }
   
   void deleteComment(Comment comment) throws CommentException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception
       CommentDao.delete(comment);
   }
}

public class Post {
   private long id;
   private String title;
   private String content;
   private User author; //Tác giả của bài viết
   private ArrayList<Comment> comments; //Một post chứa nhiều Comment
   
   void addComment(Comment comment) {
       CommentDao.add(comment);
   }
}

private class Comment {
   private long id;
   private String title;
   private Post post; //Bài viết mà comment gắn vào
   private User author; //Tác giả của comment

}
```

## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
https://github.com/Tuananhbkhn/CleanCode_BaiTapCuoiKhoa/tree/master/phan2/graphiceditor/src/graphiceditor

### 2. Composition over Inheritance và DI
https://github.com/Tuananhbkhn/CleanCode_BaiTapCuoiKhoa/tree/master/phan2/vinfastdemo

## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả
![Thiết kế CSDL Course Management](https://github.com/Tuananhbkhn/CleanCode_BaiTapCuoiKhoa/blob/master/phan3/ThietKeCSDL.PNG)
## Phần 4: Thiết kế RESTful API

## Phần 5: Lập trình Restful API

## Trắc nghiệm
1.C

2.B

3.D

4.C

5.A

6.B

7.A

8.A

9.B

10.A

11.B

12.C

13.B

14.B

15.D

16.B

17.D

18.A

19.C

20.B

21.B

22.C

23.B

24.C

25.C

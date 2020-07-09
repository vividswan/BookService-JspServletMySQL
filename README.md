# BookServie-JspServletMySQL

JSP, Servlet, Apache Tomcat, MySQL을 활용한 CRUD 도서관 프로그램

### 실행

#### IDE에서 서버실행

### 프로젝트 설계 구조

#### mvc2 패턴

![](/images/200709-1.png)

#### Front Controller Servlet

##### web.xml 매핑

![](/images/200709-2.png)

##### \*.action의 url 패턴과 필요한 Controller 매핑

![](/images/200709-3.png)

#### Controller Servlet

##### 유지보수를 위한 Controller 인터페이스 구현

![](/images/200709-4.png)
![](/images/200709-5.png)
![](/images/200709-6.png)

#### Service & DAO Servlet

##### Service Servlet : Contoller와 DAO 연결

##### DAO Servlet : 데이터베이스 연결 및 조작

![](/images/200709-7.png)

---

#### 프로젝트 메뉴 구성

##### 목록, 대여량 기준 정렬, 대여된 책, 대여 가능한 책, 대여, 반납, 추가 ,ID 검색, 삭제

#### 실행화면

![](/images/200709-8.gif)

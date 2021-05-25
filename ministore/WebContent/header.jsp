<%@page import="util.Util"%>
<%@page import="bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

  <%@include file="font.jsp" %>
</head>
<body>
  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
  
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-expand-arrows-alt"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="" class="nav-link">Trang chủ</a>
      </li>

    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
    
      <div class="container">
        <nav class="navbar navbar-default" role="navigation">
          <% User user = (User) session.getAttribute("user"); 
                 if(user != null) {
          %>
          <span class="navbar-brand"><%= user.getEmail() %></span>
          <a class="btn navbar-btn btn-primary navbar-right" role="button" href=<%=Util.getFullPath("Logout") %>>Đăng xuất</a>
          <% } %>
        </nav>

      </div>
      <div class="dropdown" style="display: inline-block;">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink78" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Ngôn ngữ</a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink78"> 
            <a class="dropdown-item" href="#"><span class="flag-icon flag-icon-us"></span> English</a> 
            <a class="dropdown-item" href="#"><span class="flag-icon flag-icon-vn"></span> Tiếng Việt</a> 
            <a class="dropdown-item" href="#"><span class="flag-icon flag-icon-jp"></span> Japan</a> 
        </div>
    </div>
    </ul>
  </nav>
  <!-- /.navbar -->
 
  <%@ include file="navigation-left.jsp" %>

  <%@ include file="script.jsp" %>
</body>
</html>
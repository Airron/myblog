<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
  <nav id="nav">
    <ul>
      
   <s:iterator var="n" value="#session.nList">
      <li><a href="${pageContext.request.contextPath}/navigateBynavid.action?navid=<s:property value="#n.navid"/>&navname=<s:property value="#n.navname"/>"><s:property value="#n.navname"/> </a></li>
   </s:iterator>
    </ul>
    <script src="js/silder.js"></script><!--获取当前页导航 高亮显示标题--> 
  </nav>
</header>
<!-- 记录当前位置信息的action -->
<!--header end-->
</body>
</html>
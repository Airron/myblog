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
      <li><a href="index.action" >网站首页</a></li>
      <li><a href="/download/" target="_blank" title="个人博客模板">个人博客模板</a></li>
      <li><a href="/book/" target="_blank" title="图书推荐">图书推荐</a></li>
      <li><a href="/web/" target="_blank" title="网站建设">网站建设</a></li>
      <li><a href="/newshtml5/" target="_blank" title="HTML5 / CSS3">HTML5 / CSS3</a></li>
      <li><a href="/jstt/" target="_blank" title="技术探讨">技术探讨</a></li>
      <li><a href="/news/s/" target="_blank" title="慢生活">慢生活</a></li>
      <li><a href="/newstalk/" target="_blank" title="碎言碎语">碎言碎语</a></li>
      <li><a href="${pageContext.request.contextPath}/login_page.action" target="_blank" title="JS 实例代码演示">私人通道</a></li>
    </ul>
    <script src="js/silder.js"></script><!--获取当前页导航 高亮显示标题--> 
  </nav>
</header>
<!--header end-->
</body>
</html>
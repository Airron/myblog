<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="gb2312">
<title>写博客，记录心得，分享知识和更优秀的方式</title>
<meta name="keywords" content="黑色模板,个人网站模板,个人博客模板,博客模板,css3,html5,网站模板" />
<meta name="description" content="这是一个有关黑色时间轴的css3 html5 网站模板" />
<link href="css/styles.css" rel="stylesheet">
<link href="css/view.css" rel="stylesheet">
<!-- 返回顶部调用 begin -->
<link href="css/lrtk.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/js.js"></script>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<!-- 返回顶部调用 end-->
<!--[if lt IE 9]>
<script src="js/modernizr.js"></script>
<![endif]-->
</head>
<body>
<%@include file="menu.jsp" %>
<!--header end-->
<div id="mainbody">
  <div class="blogs">
    
      <h2 class="t_nav"><a href="/">网站首页</a><a href="/">慢生活</a></h2>
		<from >
		
      	<tr><textarea  name="blogtitle" value="请输入标题" style="margin-left:30px;height:50px;width:90%"></textarea>
      	<script type="text/javascript">CKEDITOR.replace('blogtitle')</script>
      	</tr>
      	<br/>
      	<tr><textarea  name="blogcontext" style="margin-top:100px;height:600px;width:100%"></textarea>
      	<script type="text/javascript">CKEDITOR.replace('blogcontext')</script>
      	</tr>
      	<br/>
      	<tr>	<td align="right"><input type="submit" value="提交" style="height:35px;width:60px;border:1px #fff111;background-color:#8A2BE2;margin-left:940px;"/></td>
      	</tr>
      	</from>
</div>
</div>
<!-- 代码结束 -->
</body>
</html>
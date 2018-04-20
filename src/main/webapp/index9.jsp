<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path=request.getContextPath();
	String projectName=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=projectName%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="static/jQuery/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#us").on("click",function(){
			$.ajax({
				type: 'post',
				url: "<%=projectName%>user/getuser.do",
				dataType: 'json',
				success:function(data){
					alert(data[0].id+" "+data[0].name+" "+data[0].username+" "+data[0].passwd);
				}
			});
		})
	})
</script>
<body>
	<button type="button" id="us">点击查询用户</button>
</body>

</html>
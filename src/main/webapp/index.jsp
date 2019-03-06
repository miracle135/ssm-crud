<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>首页</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.error{
	color:red;
}
</style>
<body>
	<div class="container">
	<h3 class="text-center">欢迎来到学生管理系统，请登录</h3>
		<form action="login/hi" method="get" id="reg">
			<div class="form-group">
				<label for="exampleInputUsername">账号</label> <input type="text"
					class="form-control" id="exampleInputUsername" placeholder="账号"
					name="username">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword">密码</label> <input type="password"
					class="form-control" id="exampleInputPassword"
					placeholder="密码" name="password">
			</div>
			<button type="submit" class="btn btn-default">确定</button>
			<button type="reset" class="btn btn-default">重置</button>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script src="https://cdn.bootcss.com/jquery-validate/1.19.0/jquery.validate.min.js"></script>
	<script type="text/javascript">
		$("#reg").validate({
			rules : {
				username : "required", 
				password : "required",
 
			},
			messages : {
				username : "请输入用户名",
				password : "请输入密码",
			}
 
		});

	</script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>添加学生</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.error{
	color: red;
}
</style>
</head>
<body>
	<div class="container" >
	<h3 class="text-center">${username}你好，请完善学生信息</h3>
		<form action="/ssm-crud/student/insertStudentTwo" method="post" id="reg">
			<div class="form-group">
				<label for="sid">学号</label> <input type="text" class="form-control"
					id="sid" placeholder="学号" name="sid">
			</div>
			<div class="form-group">
				<label for="name">姓名</label> <input type="text" class="form-control"
					id="name" placeholder="姓名" name="name">
			</div>
			<div class="form-group">
				<label for="telephone">电话</label> <input type="text"
					class="form-control" id="telephone" placeholder="电话"
					name="telephone">
			</div>
			<div class="form-group">
				<label for="description">描述</label> <input type="text"
					class="form-control" id="description" placeholder="描述"
					name="description">
					
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
				sid : "required", 
				name : "required",
				telephone: "required",
				description: "required"
				
 
			},
			messages : {
				sid : "请输入学号", 
				name : "请输入姓名",
				telephone: "请输入电话",
				description: "请输入描述"
			}
 
		});

	</script>
</body>
</html>
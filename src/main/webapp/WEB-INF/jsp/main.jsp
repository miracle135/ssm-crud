<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>首页</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<div class="container">
		<h3 class="text-center">${username}你好，所有学生信息已经加载完毕</h3>
		<p class="text-center">
			<a href="/ssm-crud/student/insertStudentOne"><button
					type='button' class='btn btn-primary'>添加学生</button></a>
		</p>
		<p class="text-right">
			<a href="/ssm-crud/login/logout"><button type='button'
					class='btn btn-primary'>退出</button></a>
		</p>
		<table id="tb" class="table table-hover">
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>电话</th>
				<th>联系方式</th>
			</tr>
			<c:forEach  var="item" items="${list}">
				<tr>
					<td>${item.sid}</td>
					<td>${item.name}</td>
					<td>${item.telephone}</td>
					<td>${item.description}</td>
				</tr>
			</c:forEach>

		</table>


		<nav aria-label="Page navigation" class="text-center">
			<ul class="pagination">
				<li><a href="#" aria-label="Previous"> <span
						aria-hidden="true">&laquo;</span>
				</a></li>

				<c:forEach begin="1" end="${pageNums}" var="page">
					<li><a href="/ssm-crud/student/findStudentByPage/${page}">${page}</a></li>
				</c:forEach>
				<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
		</nav>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(function() {

			var content = "<tr><th>学号</th><th>姓名</th><th>电话</th><th>描述</th><th>操作</th><th>操作</th></tr>";

			/* $.ajax({
						url : "/ssm-crud/student/findStudentByPage/"+${pageNow},
						dataType : 'json',//服务器返回json格式数据
						type : 'post',//HTTP请求类型
						timeout : 10000,//超时时间设置为10秒；
						success : function(data) {
							for (var i = 0; i < data.length; i++) {
								content += "<tr><td>"
										+ data[i].sid
										+ "</td>"
										+ "<td>"
										+ data[i].name
										+ "</td>"
										+ "<td>"
										+ data[i].telephone
										+ "</td>"
										+ "<td>"
										+ data[i].description
										+ "</td>"
										+ "<td><a href='/ssm-crud/student/updateStudentOne/"+data[i].sid+"'><button type='button' class='btn btn-primary'>更新</button></a></td>"
										+ "<td><a href='/ssm-crud/student/deleteStudentById/"+data[i].sid+"'><button type='button' class='btn btn-danger' onclick='return sure()'>删除</button></a></td></tr>"
							}
							$("#tb").html(content);

						},
						error : function(xhr, type, errorThrown) {
						}
					}); */

			function sure() {
				if (confirm("确定删除该学生?")) {
					return true;
				} else {
					return false;
				}
			}
			;
		});
	</script>
</body>

</html>
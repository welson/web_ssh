<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<link rel="stylesheet" href="css/vendors/bootstrap.min.css">
<script type="text/javascript" src="js/vendors/jquery.min.js"></script>
<script type="text/javascript" src="js/vendors/bootstrap.min.js"></script>
</head>
<body>
<div class="ibox">
	<div class="ibox-title">
		<div class="text-center">登陆界面</div>
	</div>
	<div class="ibox-content">
		<div class="row">
			<form class="form-horizontal" action="login" method="get">
				<div class="form-group">
					<label class="col-sm-1 control-label">Name</label>
					<div class="col-sm-11"><input type="text" name="user.username" id="username" class="form-control"></div>
				</div>
				<div class="form-group">
					<label class="col-sm-1 control-label">Password</label>
					<div class="col-sm-11"><input type="password" name="user.password" id="password" class="form-control"></div>
				</div>
				<div class="form-group text-center">
					<button type="submit" class="btn btn-info">登陆</button>
					<button type="reset" class="btn">取消</button>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="header.jsp"%>
	<title>登录</title>
	<style>
		.window {
			width: 400px;
			position: absolute;
			margin-left: -200px;
			margin-top: -80px;
			top: 50%;
			left: 50%;
			display: block;
			z-index: 2000;
			background: #fff;
		}
	</style>
</head>
<body style="background: #f1f1f1;">
<div class="window">
	<fieldset class="layui-elem-field" style="margin: 10px;">
		<legend>登录</legend>
		<div class="layui-field-box">
			<form  id="formId" class="layui-form layui-form-pane">
				<div class="layui-form-item">
					<label class="layui-form-label">账号：</label>
					<div class="layui-input-inline">
						<input type="text" name="name" class="layui-input" autocomplete="off"
						    lay-verify="required" placeholder="请输入账号"/>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">密码：</label>
					<div class="layui-input-inline">
						<input type="password" name="password" class="layui-input" autocomplete="off"
    						lay-verify="required" placeholder="请输入密码"/>
					</div>
				</div>
				<%--<div class="layui-form-item">
					<label class="layui-form-label">验证码：</label>
					<div class="layui-input-inline">
						<input type="text" name="code" class="layui-input" autocomplete="off"
							    placeholder="请输入验证码"/>
					</div>
					<div class="layui-input-inline">
						<img id="imgCode" src="${path}/auth/code" onclick="refreshCode()"/>
					</div>
				</div>--%>
				<div class="layui-form-item">
					<div class="layui-form-item">
						<!--<label class="layui-form-label"></label> -->
						<div class="layui-input-inline">
							<input type="button" class="layui-btn" value="登录"  onclick="submitForm()" lay-submit lay-filter="login" />
							<input type="reset" class="layui-btn layui-btn-primary" value="重置" />
						</div>
					</div>
				</div>

			</form>
		</div>
	</fieldset>
</div>
<script type="text/javascript">
	function refreshCode() {
		$('#imgCode').attr('src', '${path}/auth/code?' + Math.random());
	}
	function submitForm(){
		$.post(
				'${path}/user/login',
				$('#formId').serialize(),//{'name':'zhansgan','password':'123'}
				function (jsonResult){
					if(jsonResult.code == 0){
						mylayer.okUrl(jsonResult.msg, '${path}/');
					}else{
						mylayer.errorMsg(jsonResult.msg,'${path}/user/getLoginPage');
					}
				},
				'json'
		);
	}


</script>
</body>

</html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<title>User Login</title>
</head>
<body>
	<div class="body">
		<g:form url="login" action="authoriseUser"
			controller="LoginController" method="post">
			<div class="dialog">
				<p>Enter your login details below:</p>
				<table class="userForm">
					<tr >
						<td colspan="2"><g:if test="${flash.message}">
								<div class="message">
									${flash.message}
								</div>
							</g:if></td>
					</tr>
					<tr class='prop'>
						<td valign='top' style='text-align: left;' width='20%'><label
							for='empId'>Employee Code:</label></td>
						<td valign='top' style='text-align: left;' width='80%'><input
							id="empId" type='text' name='empId' value='${Login?.empId}' /></td>
					</tr>
					<tr class='prop'>
						<td valign='top' style='text-align: left;' width='20%'><label
							for='password'>Password:</label></td>
						<td valign='top' style='text-align: left;' width='80%'><input
							id="password" type='password' name='password'
							value='${Login?.password}' /></td>
					</tr>
				</table>
			</div>
			<div class="buttons">

				<span class="formButton"> <input type="submit" value="Login"></input>
				</span>
			</div>
		</g:form>
	</div>
</body>
</html>
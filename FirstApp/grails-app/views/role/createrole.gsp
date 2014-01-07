<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<title>User Login</title>
</head>
<body>
	<div class="body">

		<g:form url="/createrole_action" method="post">
			<div class="dialog">
				<table class="userForm" align="center" width=100%>
					<tr>
						<td colspan="2"><g:if test="${flash.message}">
								<div class="message">
									${flash.message}
								</div>
							</g:if></td>
					</tr>
					<tr>
						<td>Role Id</td>
						<td><input type="text" name="roleId" value="" id="roleId" /></td>
					</tr>
					<tr>
						<td colspan="1"></td>
					</tr>
					<tr>
						<td>Role Name</td>
						<td><input type="text" name="roleName" value="" id="roleName" /></td>
					</tr>
					<tr>
						<td>Module</td><
						<td>
						  <g:select
              name="moduleselect"
              from="${firstapp.Role.module.list()}"
              optionKey="key"
              optionValue="value"
              noSelection="['-1': '-Select State-']"

                  />
										</td>
					</tr>
					<tr>
						<td colspan="1"><fieldset class="buttons">
								<g:link mapping="createrole_action" id="create">Create</g:link>
								<%--								<input type="submit" name="create" value="Create"--%>
								<%--									id="create" />--%>
							</fieldset></td>
					</tr>
				</table>
			</div>
		</g:form>
	</div>
</body>
</html>
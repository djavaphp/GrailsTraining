<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<title>User Login</title>
</head>
<body>
	<div class="body">
	<table><tr><td>
	<g:actionSubmit value="Create Role" action="createRolePage"  url="createRolePage" name="btnCreateRole"/>
	<g:link url="createRolePage">Save File</g:link> 
	 </td></tr></table>
	
		<g:form action="" url="welcomePage" controller=""  method="post">
			<div class="dialog">
				
				<table class="userForm" align="center" width=100%>
					<tr><td>Welcome</td></tr>
					<tr><td>Name  : ${session.name}</td></tr>
					<tr><td></td></tr>
					<tr><td>ID :  ${session.empId}</td></tr>
					<tr><td></td></tr>
					<tr><td>Store :  ${session.store}</td></tr>
					<tr><td></td></tr>
					<tr><td>Role :  ${session.role}</td></tr>						
				</table>
			</div>		
		</g:form>
	</div>
</body>
</html>
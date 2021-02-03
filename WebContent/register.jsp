<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<title>Register</title>
		<style type="text/css"> 
			.button-register {background-color: green; color: white; margin-left: 70%}
			.button-report {background-color: #000000; color: white;}
		</style>
	</head>
	<body>
		<div align="center">
		<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using JDBC</h2>
		<a href="report"><button class="button-report" type="button">Report</button></a>
			<s:form action="registeruser" method="post">
				<s:textfield label="Full Name" name="uname"/>
				<s:textfield label="Email" name="uemail"/>
				<s:password label="Password" name="upass"/>
				<s:textfield label="Designation" name="udeg"/>
				<s:submit class="button-register" value="Register"/>
			</s:form>
			<s:if test="ctr>0">
				<span style="color: green"><s:property value="msg" /></span>
			</s:if>
			<s:else>
				<span style="color: red"><s:property value="msg" /></span>
			</s:else>
		</div>
	</body>
</html>
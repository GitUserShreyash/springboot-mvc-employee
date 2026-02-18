<%@ page language="java" 
         contentType="text/html; charset=UTF-8" 
         pageEncoding="UTF-8"
		 isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>report</title>
</head>
<body>
	<div style="display:flex; justify-content:center; flex-direction:column;">
	    <h1 style="color:red; text-align:center;">Employees Report</h1>
	    <c:choose>
			<c:when test="${!empty empData}">
				<table border="1" align="center">
					<tr>
						<th>EmpNo</th>
						<th>EmpName</th>
						<th>Position</th>
						<th>Salary</th>
						<th>Operations</th>
					</tr> 
					<c:forEach var="emp" items="${empData}">
						<tr>
							<td>${emp.empno}</td>
							<td>${emp.ename}</td>
							<td>${emp.position}</td>
							<td>${emp.sal}</td>
							<td>
								<a href="edit?no=${emp.empno}" style="padding:3px;">
									<img src="images/editicon.jpg" alt="image not found" height=30px/>
								</a>
								<a href="delete?no=${emp.empno}">
									<img src="images/deleteicon.png" alt="image not found"height=30px/>
								</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<h1 style="color:red; text-align:center;">Records not found</h1>
			</c:otherwise>
		</c:choose>
		<c:if test="${!empty resultMsg}">
			<h3 style="color:green; text-align:center">${resultMsg}</h3><br>
			<h3 style="color:green; text-align:center"><a href="${pageContext.request.contextPath}/">Home</a></h3>
		</c:if>
		<h2 style="color:red; text-align:center;"><a href="add"><img src="images/addicon.png" height=20px/> Add Employee</a></h2>
		</div>
</body>
</html>

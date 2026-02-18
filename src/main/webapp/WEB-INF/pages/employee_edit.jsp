<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
</head>

<body style="margin:0; height:100vh; display:flex; justify-content:center; align-items:center;">

    <div>
        <h1 style="color:red; text-align:center;">Edit Employee</h1>

        <form:form action="edit_emp" method="POST" modelAttribute="emp">
            <table>
                <tr>
                    <td>Employee ID</td>
                    <td><form:input path="empno" readonly="true"/></td>
                </tr>
                <tr>
                    <td>Employee Name</td>
                    <td><form:input path="ename"/></td>
                </tr>
                <tr>
                    <td>Employee Position</td>
                    <td><form:input path="position"/></td>
                </tr>
                <tr>
                    <td>Employee Salary</td>
                    <td><form:input path="sal"/></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align:center;">
                        <input type="submit" value="Edit">
                    </td>
                </tr>
            </table>
        </form:form>
    </div>

</body>
</html>

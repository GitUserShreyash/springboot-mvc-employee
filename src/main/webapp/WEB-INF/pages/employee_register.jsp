<!DOCTYPE html>
<html>
<head>
    <title>Employee Registration</title>
</head>

<body style="margin:0; height:100vh; display:flex; justify-content:center; align-items:center;">

    <div>
        <h1 style="color:red; text-align:center;">Employees Registration</h1>

        <form action="register" method="POST">
            <table>
                <tr>
                    <td>Employee Name</td>
                    <td><input type="text" name="ename"></td>
                </tr>
                <tr>
                    <td>Employee Position</td>
                    <td><input type="text" name="position"></td>
                </tr>
                <tr>
                    <td>Employee Salary</td>
                    <td><input type="number" name="sal"></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align:center;">
                        <input type="submit" value="Register">
                    </td>
                </tr>
            </table>
        </form>
    </div>

</body>
</html>

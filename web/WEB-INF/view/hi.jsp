<%--
  Created by IntelliJ IDEA.
  User: 794458
  Date: 2020-05-10
  Time: 1:21 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <script src="javascript/login.js"></script>

    <title>${title1}</title>
</head>
<body>
${message1} <br/>
<a href="hello">Hello</a>

<form action="login" method="post">
    <table>
        <tr>
            <td>
                Name: <input type="text" name="name" required/>
            </td>
        </tr>
        <tr>
            <td>
                Phone number: <input type="text" name="pnumber" required id="pnum"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Submit">
                <input type="hidden" name="action" value="login">
            </td>
        </tr>
    </table>
    ${info}
    <span id="error_message"></span>
</form>
</body>
</html>

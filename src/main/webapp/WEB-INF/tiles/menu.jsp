<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<table>
    <tr>
        <td>
            <a href="<s:url action="mainPageLink"/>">
                <s:text name="Main Page" />
            </a>
        </td>
        <td>
            <a href="<s:url action="userInformationPageLink"/>">
                <s:text name="User Information" />
            </a>
        </td>
        <td>
            <a href="<s:url action="aboutPageLink"/>"><s:text name="About Us" /></a>
        </td>
    </tr>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"  %>
    
    <%@ page import="java.util.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">

 <h1>hello world </h1>
 
 <%
    out.println("is this true ");
 
 
	  int n = 9/0; 
 

 
 
 %>
 
 <%!
    int coef = 3;
     

 %>
 
 <%=
   coef 
 %>

<%--     <% 


        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        // Perform addition
        int result = num1 + num2;
        
        out.println("the result is : " + result);
        
    %> --%>

</body>
</html>
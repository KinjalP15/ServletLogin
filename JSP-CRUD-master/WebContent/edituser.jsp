<%@page import="com.demo.dao.UserDao"%>  
<jsp:useBean id="u" class="com.demo.bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=UserDao.update(u);  
response.sendRedirect("viewusers.jsp");  
%> 
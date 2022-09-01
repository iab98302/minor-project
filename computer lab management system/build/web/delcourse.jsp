<%@page import="DB.DB"%>
<%
   
String nm=request.getParameter("n");

String sql="delete from tbl_course where ccode='"+nm+"'";
    if (DB.executeUpdate(sql))
{
    out.println("<script>alert('values deleted successfully');window.location='course.jsp';</script>");
}
else
{
      out.println("<script>alert('unsuccessful');window.location='course.jsp';</script>");
}
%>
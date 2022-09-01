<%@page import="DB.DB"%>
<%
   
String nm=request.getParameter("n");

String sql="delete from tbl_student where uregno='"+nm+"'";
    if (DB.executeUpdate(sql))
{
    out.println("<script>alert('values deleted successfully');window.location='student.jsp';</script>");
}
else
{
      out.println("<script>alert('unsuccessful');window.location='student.jsp';</script>");
}
%>
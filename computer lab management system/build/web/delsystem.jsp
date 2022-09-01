<%@page import="DB.DB"%>
<%
   
String nm=request.getParameter("n");

String sql="delete from tbl_system where sno='"+nm+"'";
    if (DB.executeUpdate(sql))
{
    out.println("<script>alert('values deleted successfully');window.location='system.jsp';</script>");
}
else
{
      out.println("<script>alert('unsuccessful');window.location='system.jsp';</script>");
}
%>
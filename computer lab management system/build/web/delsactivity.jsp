<%@page import="DB.DB"%>
<%
   
String nm=request.getParameter("n");

String sql="delete from tbl_activityc where acid='"+nm+"'";
    if (DB.executeUpdate(sql))
{
    out.println("<script>alert('values deleted successfully');window.location='labassistanthome.jsp';</script>");
}
else
{
      out.println("<script>alert('unsuccessful');window.location='labassistanthome.jsp';</script>");
}
%>
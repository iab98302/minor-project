<%@page import="DB.DB"%>
<%
   
String nm=request.getParameter("n");

String sql="delete from tbl_labassistant where laid='"+nm+"'";
    if (DB.executeUpdate(sql))
{
    DB.executeUpdate("delete from tbl_login where uid="+nm+" and utype='labassistant'");
    out.println("<script>alert('values deleted successfully');window.location='labassistant.jsp';</script>");
}
else
{
      out.println("<script>alert('unsuccessful');window.location='labassistant.jsp';</script>");
}
%>
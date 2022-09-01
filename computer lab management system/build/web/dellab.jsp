<%@page import="DB.DB"%>
<%
   
String nm=request.getParameter("n");

String sql="delete from tbl_lab where lno='"+nm+"'";
    if (DB.executeUpdate(sql))
{
    out.println("<script>alert('values deleted successfully');window.location='lab.jsp';</script>");
}
else
{
      out.println("<script>alert('unsuccessful');window.location='lab.jsp';</script>");
}
%>
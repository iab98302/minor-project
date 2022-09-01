<%@page import="DB.DB"%>
<% 
String mc=request.getParameter("ln");
String mn=request.getParameter("sn");
String b=request.getParameter("fn");
String c=request.getParameter("dtls");
String st=request.getParameter("st");



String sql="insert into tbl_lab values('"+mc+"','"+mn+"','"+b+"','"+c+"','"+st+"')";
if (DB.executeUpdate(sql))
{
    out.println("<script>alert('successfully');window.location='lab.jsp';</script>");
}
else
{
        out.println("<script>alert('unsuccessful');window.location='lab.jsp';</script>");
}

%>
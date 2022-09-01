<%@page import="DB.DB"%>
<% 
String mc=request.getParameter("name");
String mn=request.getParameter("n");
String b=request.getParameter("course");
String c=request.getParameter("sem");
String g=request.getParameter("gender");


if(g!="")
        {

String sql="insert into tbl_student values('"+mn+"','"+mc+"','"+b+"','"+c+"','"+g+"')";
if (DB.executeUpdate(sql))
{
    out.println("<script>alert('values inserted successfully');window.location='student.jsp';</script>");
}
else
{
        out.println("<script>alert('unsuccessful');window.location='student.jsp';</script>");
}
        }


%>
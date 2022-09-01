<%@page import="DB.DB"%>
<% 
String mc=request.getParameter("ln");
String mn=request.getParameter("sn");
String b=request.getParameter("fn");
String c=request.getParameter("dtls");
String st=request.getParameter("st");

if(st.equals("0")){
    out.println("<script>alert('please selectb a valid status');window.location='lab.jsp';</script>");
}
else{
String sql="update tbl_lab set nos='"+mn+"',fno='"+b+"',dtls='"+c+"',status='"+st+"' where lno='"+mc+"'";
if (DB.executeUpdate(sql))
{
    out.println("<script>alert('successfully');window.location='lab.jsp';</script>");
}
else
{
        out.println("<script>alert('unsuccessful');window.location='lab.jsp';</script>");
}
}

%>
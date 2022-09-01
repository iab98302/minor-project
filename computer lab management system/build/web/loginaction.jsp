<%@page import="DB.DB"%>
<%@page import="java.sql.ResultSet"%>
<%
    String un=request.getParameter("t1");
    String up=request.getParameter("t2");
    String sql="select *from tbl_login where uname='"+un+"' and upass='"+up+"'";
    ResultSet rs=DB.executeQuery(sql);
    if(rs.next())
    {
        String utype=rs.getString("utype");
        session.setAttribute("uid",rs.getString("uid"));
        if(utype.equals("admin"))
        {
             out.println ("<script>alert(' success welcome admin');window.location='adminhome.jsp';</script>");
        }
        else if(utype.equals("labassistant"))
        {
             out.println ("<script>alert('success welcome Staff');window.location='labassistanthome.jsp';</script>");
             
        }
        else
        {
             out.println ("<script>alert('login failed');window.location='login.jsp';</script>");
        }
    }
        else
        {
                 out.println ("<script>alert('login failed');window.location='login.jsp';</script>");
                }
        
        
    
  
%>
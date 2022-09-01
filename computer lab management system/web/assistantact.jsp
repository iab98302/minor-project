<%@page import="java.sql.ResultSet"%>
<%@page import="DB.DB"%>
<%
    String n = request.getParameter("name");
    String g = request.getParameter("gender");
    String a = request.getParameter("addr");
    String p = request.getParameter("phon");
    String e = request.getParameter("mail");

    String spass = request.getParameter("pass");
ResultSet rs1=DB.executeQuery("select * from tbl_labassistant where em='"+e+"'");
if(rs1.next()){
    out.println("<script>alert('EMail Already Exists');window.location='labassistant.jsp';</script>");
}
   
    

else{
     
    String s = "insert into tbl_labassistant values (null,'" + n + "','" + a + "','" + p + "','" + e + "','" + g + "')";

    if (DB.executeUpdate(s)) {
        String sql2 = "select max(laid) as uid from tbl_labassistant";

        ResultSet rs = DB.executeQuery(sql2);
        rs.next();
        String uid = rs.getString("uid");
        String sql3 = "insert into tbl_login values('" + uid + "','" + e + "','" + spass + "','labassistant')";
        if (DB.executeUpdate(sql3)) {
            out.println("<script>alert(' success');window.location='labassistant.jsp';</script>");
        } else {
            out.println("<script>alert('failed');window.location='labassistant.jsp';</script>");
        }
    } else {
        out.println("<script>alert('failed');window.location='labassistant.jsp';</script>");

    }    
}

%>
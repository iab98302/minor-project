<%@page import="java.sql.ResultSet"%>
<%@page import="DB.DB"%>
<%
    String mc = request.getParameter("lno");
    String mn = request.getParameter("sn");
    String b = request.getParameter("ins");
    String c = request.getParameter("dtls");
    String st = request.getParameter("st");
    int cnt = 0;
    ResultSet rs = DB.executeQuery("select nos from tbl_lab where lno='" + mc + "'");
    rs.next();
    int nos = Integer.parseInt(rs.getString("nos"));
    ResultSet rs1 = DB.executeQuery("select count(*) as cnt from tbl_system where lno='" + mc + "'");
    if (rs1.next()) {
        cnt = Integer.parseInt(rs1.getString("cnt"));
    }
    if (cnt < nos) {
        String sql = "insert into tbl_system values('" + mc + "','" + mn + "','" + b + "','" + c + "','" + st + "')";
        if (DB.executeUpdate(sql)) {
            out.println("<script>alert('values inserted successfully');window.location='system.jsp';</script>");
        } else {
            out.println("<script>alert('unsuccessful');window.location='system.jsp';</script>");
        }
    } else {
        out.println("<script>alert('unsuccessful');window.location='system.jsp';</script>");
    }
%>
<%@page import="DB.DB"%>
<%
    String mc = request.getParameter("ln");
    String mn = request.getParameter("sn");
    String b = request.getParameter("fn");

    String d = request.getParameter("dpt");

    String sql = "insert into tbl_course values('" + mc + "','" + mn + "','" + b + "','"+d+"')";
    if (DB.executeUpdate(sql)) {
        out.println("<script>alert('values inserted successfully');window.location='course.jsp';</script>");
    } else {
        out.println("<script>alert('unsuccessful');window.location='course.jsp';</script>");
    }

%>
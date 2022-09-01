<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="DB.DB"%>
<%
    String aid = request.getParameter("aid");
    String st = request.getParameter("st");
    String sno = request.getParameter("sno");

    String ln = request.getParameter("ln");

    String sql = "insert into tbl_activityc values(null,'" + aid + "','" + st + "','" + sno + "')";
    if (DB.executeUpdate(sql)) {
        out.println("<script>alert(' inserted successfully');window.location='activity.jsp?n=" + ln + "';</script>");
    } else {
        out.println("<script>alert('unsuccessful');window.location='activity.jsp?n=" + ln + "';</script>");
    }

%>
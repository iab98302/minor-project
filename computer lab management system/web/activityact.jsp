<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="DB.DB"%>
<%
    String course = request.getParameter("course");
    String ln = request.getParameter("ln");
    String dd = request.getParameter("d");
    String sem = request.getParameter("sem");

    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dte = sdf.format(d);

      SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss a");
    String tym = sdf1.format(d);
    String sql = "insert into tbl_activity values(null,'" + ln + "','" + course + "','" + sem + "','" + dd + "','" + dte + "','" + session.getAttribute("uid").toString() + "','"+tym+"')";
    if (DB.executeUpdate(sql)) {
        out.println("<script>alert(' inserted successfully');window.location='activity.jsp?n="+ln+"';</script>");
    } else {
        out.println("<script>alert('unsuccessful');window.location='activity.jsp?n="+ln+"';</script>");
    }

%>
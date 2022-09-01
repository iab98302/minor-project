package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DB;
import java.sql.ResultSet;

public final class allocate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Allocations</h1>\n");
      out.write("         <form action=\"allocateact.jsp\" onsubmit=\"return check();\">\n");
      out.write("            <table>\n");
      out.write("               \n");
      out.write("                <tr><td>student id</td><td><input type=\"text\" name=\"name\" id=\"name\" value=\"");
      out.print(request.getParameter("n"));
      out.write("\" required></td></tr>\n");
      out.write("                <tr><td></td></tr>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("               <tr><td>Lab no</td>\n");
      out.write("<td><select name=\"ln\">\n");

                            ResultSet rs1=DB.executeQuery("select *from tbl_lab");
                            while(rs1.next())
                            {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs1.getString("lno"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("lno"));
      out.write("</option>\n");
      out.write("                        ");

                        }
                        
      out.write("</select></td></tr>\n");
      out.write("    \n");
      out.write("               <tr><td>Details:</td><td><textarea name=\"n\" rows=\"5\" cols=\"5\" id=\"n\"  required></textarea></td></tr>\n");
      out.write("                \n");
      out.write("             \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                 \n");
      out.write("             \n");
      out.write("               <td><input type=\"submit\" name=\"submit\"></td><td><input type=\"reset\" name=\"reset\"></td>\n");
      out.write("            </table></form>\n");
      out.write("                        <center>\n");
      out.write("<table border=\"1\">\n");
      out.write("    <tr> \n");
      out.write("        <th>Id </th>\n");
      out.write("       <th>LAB NO </th>\n");
      out.write("       <th>Student </th>\n");
      out.write("       <th>Details</th>\n");
      out.write("       <th>Date</th>\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    ");

    ResultSet rs2=DB.executeQuery("select *from tbl_activity inner join tbl_student on tbl_activity.stid=tbl_student.stid");
    while(rs2.next()){
    
      out.write("\n");
      out.write("    <tr> <td>");
      out.print(rs2.getString("aid"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("name"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("lno"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("dtls"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("date"));
      out.write("</td>\n");
      out.write("      \n");
      out.write("    <td><a href =\"delallocation.jsp?n=");
      out.print(rs2.getString("aid"));
      out.write("\">Delete</a></td></tr>\n");
      out.write("\n");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

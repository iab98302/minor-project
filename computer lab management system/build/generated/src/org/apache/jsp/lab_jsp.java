package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import DB.DB;

public final class lab_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1 align=\"center\">lab</h1>\n");
      out.write("<form action=\"labact.jsp\">\n");
      out.write("<table align=\"center\">\n");
      out.write("<tr><td>Lab no</td>\n");
      out.write("<td><input type=\"text\" name=\"ln\" required /></td></tr>\n");
      out.write("<tr><td>No of system</td>\n");
      out.write("    <td><input type=\"text\" name=\"sn\" required />\n");
      out.write("</td></tr>\n");
      out.write("<tr><td>Floor no</td>\n");
      out.write("    <td><input type=\"text\" name=\"fn\" required />\n");
      out.write("</td></tr>\n");
      out.write("<tr><td>Details</td><td><textarea name=\"dtls\" cols=\"20\" rows=\"10\" id=\"addr\"></textarea>\n");
      out.write("               </td></tr>\n");
      out.write("<tr><td colspan=\"2\" align=\"center\"><input type=\"submit\" name=\"submit\" value=\"Add\" /></td></tr>\n");
      out.write("</table>\n");
      out.write("    </form>\n");
      out.write("<center>\n");
      out.write("<table border=\"1\">\n");
      out.write("    <tr> \n");
      out.write("        <th>Lab no </th>\n");
      out.write("       <th>No of system </th>\n");
      out.write("       <th>Floor no</th>\n");
      out.write("       <th>Details</th>\n");
      out.write("       <th>status</th>\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    ");

    ResultSet rs2=DB.executeQuery("select *from tbl_lab ");
    while(rs2.next()){
    
      out.write("\n");
      out.write("    <tr> <td>");
      out.print(rs2.getString("lno"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("nos"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("fno"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("dtls"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("status"));
      out.write("</td>\n");
      out.write("      \n");
      out.write("    <td><a href =\"dellab.jsp?n=");
      out.print(rs2.getString("lno"));
      out.write("\">Delete</a></td></tr>\n");
      out.write("\n");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
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

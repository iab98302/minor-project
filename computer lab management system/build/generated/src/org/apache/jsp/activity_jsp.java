package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DB;
import java.sql.ResultSet;

public final class activity_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Computer lab management system</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!--jQuery (necessary for Bootstrap's JavaScript plugins)-->\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!--Custom Theme files-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("    </script>\n");
      out.write("    <script src=\"js/jquery-1.8.3.min.js\"></script>\n");
      out.write("    <script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("\n");
      out.write("    <!--start-smoth-scrolling-->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        jQuery(document).ready(function ($) {\n");
      out.write("            $(\".scroll\").click(function (event) {\n");
      out.write("                event.preventDefault();\n");
      out.write("                $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <!--start-smoth-scrolling-->\n");
      out.write("    <!--webfonts-->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,700italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("    <!--webfonts-->\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!--header-->\n");
      out.write("    <div class=\"header-section2\">\n");
      out.write("        <div class=\"header-top bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!--logo-->\n");
      out.write("                <div class=\"logo two\">\n");
      out.write("                    <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\"></a>\n");
      out.write("                </div>\n");
      out.write("                <!--top-nav-->\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sub-header two\">\n");
      out.write("            <div class=\"top-nav\">\n");
      out.write("                <span class=\"menu two\"> </span>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"active\"><a href=\"labassistanthome.jsp\">Home</a></li>\n");
      out.write("                       \n");
      out.write("                        <li>  <a href=\"login.jsp\">Logout</a></li>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\"> </div>\n");
      out.write("        <!-- script-for-menu -->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"span.menu\").click(function () {\n");
      out.write("                    $(\".top-nav ul\").slideToggle(200);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <div class=\"clearfix\"> </div>\n");
      out.write("    </div>\n");
      out.write("    <!--/header-->\n");
      out.write("    <!--start-contact-->\n");
      out.write("    <div  class=\"contact\" id=\"contact\">\n");
      out.write("        <div class=\"contact-head\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3>Lab Activity</h3>\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"contact-content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 address\">\t\n");
      out.write("                    <div class=\"form\">\t\t\t\t\n");
      out.write("   <form action=\"activityact.jsp\" onsubmit=\"return check();\">\n");
      out.write("            <table>\n");
      out.write("\n");
      out.write("                <tr><td>Lab No</td><td><input type=\"text\" readonly name=\"ln\"  value=\"");
      out.print(request.getParameter("n"));
      out.write("\" required></td></tr>\n");
      out.write("                <tr><td></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr><td>Course</td>\n");
      out.write("                    <td><select name=\"course\">\n");
      out.write("                            ");

                                ResultSet rs = DB.executeQuery("select *from tbl_course");
                                while (rs.next()) {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString("ccode"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("cname"));
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("</select></td></tr>\n");
      out.write("                <tr><td>Semester</td>\n");
      out.write("                    <td><select name=\"sem\">\n");
      out.write("\n");
      out.write("                            <option value=\"1\">S1</option>\n");
      out.write("                            <option value=\"2\">S2</option>\n");
      out.write("                            <option value=\"3\">S3</option>\n");
      out.write("                            <option value=\"4\">S4</option>\n");
      out.write("                            <option value=\"5\">S5</option>\n");
      out.write("                            <option value=\"6\">S6</option>\n");
      out.write("                        </select></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr><td>Activity Done</td><td><textarea name=\"d\" id=\"d\"></textarea></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <td><input type=\"submit\" name=\"submit\"></td>\n");
      out.write("            </table></form>\n");
      out.write("  \n");
      out.write("           \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8 contact-part\">\n");
      out.write("                    <table border=\"1\" style=\"width:100%;text-align: center\">\n");
      out.write("                <tr> \n");
      out.write("\n");
      out.write("                <th>Lab no </th>\n");
      out.write("                <th>Course </th>\n");
      out.write("                <th>Sem </th>\n");
      out.write("                <th>Activity Done</th>\n");
      out.write("                <th>Date & Time</th>\n");
      out.write("                <th>Lab Assistant</th>\n");
      out.write("                <th colspan=\"2\">Action</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");

                ResultSet rs2 = DB.executeQuery("select *from tbl_activity where lno='" + request.getParameter("n") + "'");
                while (rs2.next()) {
            
      out.write("\n");
      out.write("            <tr> \n");
      out.write("                <td>");
      out.print(rs2.getString("lno"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs2.getString("ccode"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs2.getString("sem"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs2.getString("dtls"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs2.getString("dte"));
      out.write(' ');
      out.print(rs2.getString("tym"));
      out.write("</td>\n");
      out.write("                ");

                    ResultSet rs1 = DB.executeQuery("select *from tbl_labassistant where laid=" + rs2.getString("laid"));
                    if(rs1.next()){
                
      out.write("\n");
      out.write("                <td>");
      out.print(rs1.getString("name"));
      out.write("</td>\n");
      out.write("                ");
 }else{ 
      out.write("\n");
      out.write("                <td></td>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <td><a href =\"delactivity.jsp?n=");
      out.print(rs2.getString("aid"));
      out.write("\">Delete</a></td>\n");
      out.write("                <td><a href =\"stactivity.jsp?n=");
      out.print(rs2.getString("aid"));
      out.write("&l=");
      out.print(rs2.getString("lno"));
      out.write("&c=");
      out.print(rs2.getString("ccode"));
      out.write("\">Add Student</a></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </table>\n");
      out.write("                </div>\t\n");
      out.write("                <div class=\"clear\"> </div>\n");
      out.write("            </div>\t\n");
      out.write("        </div> \t\t\t\n");
      out.write("    </div>\t\n");
      out.write("    <!--/start-footer-->                                                             \n");
      out.write("   \n");
      out.write("    <!--//End-foote-->\n");
      out.write("    <div class=\"copy-right-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-6 copy-right\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var letters = /^[a-z A-Z]+$/;\n");
      out.write("    var numbers = /^[0-9]+$/;\n");
      out.write("    function check()\n");
      out.write("    {\n");
      out.write("        if (!document.getElementById(\"name\").value.match(letters))\n");
      out.write("        {\n");
      out.write("\n");
      out.write("            alert('Please input alphabet characters only,enter name');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    ");
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

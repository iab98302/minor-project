package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DB;
import java.sql.ResultSet;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>student</h1>\n");
      out.write("         <form action=\"studentact.jsp\" onsubmit=\"return check();\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td>Name</td><td><input type=\"text\" name=\"name\" id=\"name\" required></td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                <tr><td>User reg no:</td><td><input type=\"text\" name=\"n\" id=\"n\" required></td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("               <tr><td>Course</td>\n");
      out.write("<td><select name=\"course\">\n");

                            ResultSet rs=DB.executeQuery("select *from tbl_course");
                            while(rs.next())
                            {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString("ccode"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("cname"));
      out.write("</option>\n");
      out.write("                        ");

                        }
                        
      out.write("</select></td></tr>\n");
      out.write("                <tr><td>Semester</td>\n");
      out.write("<td><select name=\"sem\">\n");

                            ResultSet rs1=DB.executeQuery("select *from tbl_course");
                            while(rs1.next())
                            {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs1.getString("nos"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("nos"));
      out.write("</option>\n");
      out.write("                        ");

                        }
                        
      out.write("</select></td></tr>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                 <tr><td>Gender</td><td><input type=\"radio\" value=\"M\" name=\"gender\">Male<input type=\"radio\" value=\"F\" name=\"gender\">Female</td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("              \n");
      out.write("                <tr><td><input type=\"submit\" name=\"submit\"></td><td><input type=\"reset\" name=\"reset\"></td></tr>\n");
      out.write("            </table></form>\n");
      out.write("                        <table border=\"1\">\n");
      out.write("    <tr> \n");
      out.write("        <th>Student id</th>\n");
      out.write("        <th>Name</th>\n");
      out.write("       <th>Reg no</th>\n");
      out.write("       <th>Course</th>\n");
      out.write("       <th>Semester</th>\n");
      out.write("       <th>Gender</th>\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    ");

    ResultSet rs2=DB.executeQuery("select *from tbl_student inner join tbl_course on tbl_student.ccode=tbl_course.ccode");
   while(rs2.next())
           {
    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(rs2.getString("stid"));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs2.getString("name"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("uregno"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("cname"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("sem"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("gen"));
      out.write("</td>\n");
      out.write("      \n");
      out.write("   <td><a href =\"delstudent.jsp?n=");
      out.print(rs2.getString("stid"));
      out.write("\">Delete</a></td>\n");
      out.write("    <td><a href =\"allocate.jsp?n=");
      out.print(rs2.getString("stid"));
      out.write("\">allocate</a></td></tr>\n");
      out.write("\n");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var letters=/^[a-z A-Z]+$/;\n");
      out.write("    var numbers=/^[0-9]+$/;\n");
      out.write("    function check()\n");
      out.write("    {\n");
      out.write("        if(!document.getElementById(\"name\").value.match(letters))\n");
      out.write("        {\n");
      out.write("              \n");
      out.write("            alert('Please input alphabet characters only,enter name');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\t\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("   \n");
      out.write("</script>\n");
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

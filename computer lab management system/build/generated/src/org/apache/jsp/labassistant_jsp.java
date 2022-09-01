package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DB;
import java.sql.ResultSet;

public final class labassistant_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>lab assistant</h1>\n");
      out.write("         <form action=\"assistantact.jsp\" onsubmit=\"return check();\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td>Name</td><td><input type=\"text\" name=\"name\" id=\"name\" required></td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("               \n");
      out.write("                <tr><td>Address</td><td><textarea name=\"addr\" cols=\"20\" rows=\"10\" id=\"addr\"></textarea></td></tr>\n");
      out.write("               <tr><td><br/></td></tr>\n");
      out.write("                <tr><td>Contact NO:</td><td><input type=\"text\" name=\"phon\" id=\"phon\"></td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("                <tr><td>E-mail</td><td><input type=\"email\" name=\"mail\" required></td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("                 <tr><td>Gender</td><td><input type=\"radio\" value=\"M\" name=\"gender\">Male<input type=\"radio\" value=\"F\" name=\"gender\">Female</td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("                <tr><td>Password</td><td><input type=\"password\" name=\"pass\" id=\"pass\" required></td></tr>\n");
      out.write("                <tr><td><br/></td></tr>\n");
      out.write("                <tr><td><input type=\"submit\" name=\"submit\"></td><td><input type=\"reset\" name=\"reset\"></td></tr>\n");
      out.write("            </table></form>\n");
      out.write("        <center>\n");
      out.write("<table border=\"1\">\n");
      out.write("    <tr> \n");
      out.write("        <th>Name</th>\n");
      out.write("       <th>Address</th>\n");
      out.write("       <th>Phone no</th>\n");
      out.write("       <th>Email</th>\n");
      out.write("       <th>Gender</th>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    ");

    ResultSet rs2=DB.executeQuery("select *from tbl_labassistant");
    while(rs2.next()){
    
      out.write("\n");
      out.write("    <tr> <td>");
      out.print(rs2.getString("laid"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("name"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("adr"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs2.getString("phn"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("em"));
      out.write("</td>\n");
      out.write("       <td>");
      out.print(rs2.getString("gen"));
      out.write("</td>\n");
      out.write("      \n");
      out.write("    <td><a href =\"dellabassistant.jsp?n=");
      out.print(rs2.getString("laid"));
      out.write("\">Delete</a></td></tr>\n");
      out.write("\n");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("    var letters=/^[a-z A-Z]+$/;\n");
      out.write("    var numbers=/^[0-9]+$/;\n");
      out.write("    function check()\n");
      out.write("    {\n");
      out.write("        if(!document.getElementById(\"name\").value.match(letters))\n");
      out.write("        {\n");
      out.write("              \n");
      out.write("            alert('Please input alphabet characters only,enter  first name');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\t\n");
      out.write("\n");
      out.write("        else if(!document.getElementById(\"phon\").value.match(numbers))\n");
      out.write("        {\n");
      out.write("            alert('Please input numeric characters only,enter phone number');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("\t\t else if(document.getElementById(\"phon\").value.length<10)\n");
      out.write("        {\n");
      out.write("            alert('Enter phone number with minimum lebgth of 10 numbers');\n");
      out.write("             return false;\n");
      out.write("\t\t}\n");
      out.write("\t\t else if(document.getElementById(\"pc\").value.length<6)\n");
      out.write("        {\n");
      out.write("            alert('Enter pin with minimum lebgth of 6 numbrers');\n");
      out.write("             return false;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t else if(document.getElementById(\"pass\").value.length<8)\n");
      out.write("        {\n");
      out.write("            alert('Enter password with minimum lebgth of 8 characters');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("   \n");
      out.write("</script>\n");
      out.write("\n");
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

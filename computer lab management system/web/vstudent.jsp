<%@page import="DB.DB"%>
<%@page import="java.sql.ResultSet"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
    <head>
        <title>Computer lab management system</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!--jQuery (necessary for Bootstrap's JavaScript plugins)-->
        <!-- Custom Theme files -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <!--Custom Theme files-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    </script>
    <script src="js/jquery-1.8.3.min.js"></script>
    <script src="js/modernizr.custom.js"></script>

    <!--start-smoth-scrolling-->
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>

    <script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
            });
        });
    </script>
    <!--start-smoth-scrolling-->
    <!--webfonts-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,700italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <!--webfonts-->	
</head>
<body>
    <!--header-->
    <div class="header-section2">
        <div class="header-top bg">
            <div class="container">
                <!--logo-->
                <div class="logo two">
                    <a href="index.html"><img src="images/logo.png" alt=""></a>
                </div>
                <!--top-nav-->
                <div class="clearfix"> </div>
            </div>
        </div>
        <div class="sub-header two">
            <div class="top-nav">
                <span class="menu two"> </span>
                <ul>
                    <li class="active"><a href="labassistanthome.jsp">Home</a></li>
                       
                        <li>  <a href="login.jsp">Logout</a></li>
                    <div class="clearfix"> </div>
                </ul>
            </div>
        </div>
        <div class="clearfix"> </div>
        <!-- script-for-menu -->
        <script>
            $(document).ready(function () {
                $("span.menu").click(function () {
                    $(".top-nav ul").slideToggle(200);
                });
            });
        </script>
        <div class="clearfix"> </div>
    </div>
    <!--/header-->
    <!--start-contact-->
    <div  class="contact" id="contact">
        <div class="contact-head">
            <div class="container">
                <h3>SEARCH Student</h3>	
            </div>
        </div>
        <div class="contact-content">
            <div class="container">

                <div class="col-md-12 address">	
               
                  
            <form action="vstudent.jsp">
            <select name="c">
                <%
                    ResultSet rs = DB.executeQuery("select *from tbl_course");
                    while (rs.next()) {
                %>
                <option value="<%=rs.getString("ccode")%>"><%=rs.getString("cname")%></option>
                <%
                    }
                %>
            </select>
            <select name="sem">

                <option value="1">S1</option>
                <option value="2">S2</option>
                <option value="3">S3</option>
                <option value="4">S4</option>
                <option value="5">S5</option>
                <option value="6">S6</option></select>
            <input type="submit" value="SHOW"/>
        </form>
            <BR/>
       <table border="1" style="width:100%;text-align: center">
            <tr> 
                
                <th>Name</th>
                <th>Reg no</th>
                <th>Course</th>
                <th>Semester</th>
                <th>Gender</th>
    <th>Action</th>
            </tr>

            <%
                ResultSet rs2 = DB.executeQuery("select *from tbl_student inner join tbl_course on tbl_student.ccode=tbl_course.ccode where tbl_student.ccode='" + request.getParameter("c") + "' and sem='"+request.getParameter("sem")+"'");
                while (rs2.next()) {
            %>
            <tr>
                
                <td><%=rs2.getString("name")%></td>
                <td><%=rs2.getString("uregno")%></td>
                <td><%=rs2.getString("cname")%></td>
                <td><%=rs2.getString("sem")%></td>
                <td><%=rs2.getString("gen")%></td>
              <td><a href ="delstudent.jsp?n=<%=rs2.getString("uregno")%>">Delete</a></td>
            
            </tr>
                <% }%>
        </table>
                </div>	
                <div class="clear"> </div>
            </div>	
        </div> 			
    </div>	
    <!--/start-footer-->                                                             
   
    <!--//End-foote-->
    <div class="copy-right-section">
        <div class="container">
            <div class="col-md-6 copy-right">
             
            </div>
        
        </div>
    </div>
</body>
</html>

      
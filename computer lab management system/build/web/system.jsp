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
                <h3>Lab System</h3>	
            </div>
        </div>
        <div class="contact-content">
            <div class="container">

                <div class="col-md-4 address">	
                    <div class="form">				
   <form action="systemact.jsp">
            <table align="center">
                <tr><td>Lab no</td>
                    <td><select name="lno">
                            <%
                                ResultSet rs1 = DB.executeQuery("select *from tbl_lab ");
                                while (rs1.next()) {
                            %>
                            <option value="<%=rs1.getString("lno")%>"><%=rs1.getString("lno")%></option>
                            <%
                                }
                            %>

                        </select></td></tr>
                <tr><td>System no</td>
                    <td><input type="text" name="sn" required />
                    </td></tr>
                <tr><td>Software Installed</td><td><textarea name="ins" cols="20" rows="10" id="ins" required></textarea>
                    </td></tr>
                <tr><td>Other Details</td><td><textarea name="dtls" cols="20" rows="10" id="dtls" required></textarea>
                    </td></tr>
                <tr><td>System Status/Condition</td>
                    <td><select name="st">
                            <option value="working">Working</option>
                            <option value="maintanence">Under Maintenance</option>
                            <option value="notworking">Damages/Not Working</option>
                        </select>
                    </td></tr>
                <tr><td colspan="2" align="center"><input type="submit" name="submit" value="Add" /></td></tr>
            </table>
        </form>
  
           
                    </div>
                </div>
                <div class="col-md-8 contact-part">
                    <table border="1" style="width:100%;text-align: center">
       <tr> 
                
                <th>Lab no </th>
                <th>system no</th>
                <th>Installed</th>
                <th>Details</th>
                <th>status</th>
                <th>Action</th>
            </tr>

            <%
                ResultSet rs2 = DB.executeQuery("select *from tbl_system ");
                while (rs2.next()) {
            %>
            <tr>
                
                <td><%=rs2.getString("lno")%></td>
                <td><%=rs2.getString("sno")%></td>
                <td><%=rs2.getString("inst")%></td>
                <td><%=rs2.getString("dtls")%></td>
                <td><%=rs2.getString("status")%></td>

                <td><a href ="delsystem.jsp?n=<%=rs2.getString("sno")%>">Delete</a></td></tr>

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


<script type="text/javascript">
    var letters = /^[a-z A-Z]+$/;
    var numbers = /^[0-9]+$/;
    function check()
    {
        if (!document.getElementById("name").value.match(letters))
        {

            alert('Please input alphabet characters only,enter name');
            return false;
        }

        else
        {
            return true;
        }
    }


</script>

    
      
  
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
                    <li class="active"><a href="adminhome.jsp">Home</a></li>

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
                <h3>Lab Assistant</h3>	
            </div>
        </div>
        <div class="contact-content">
            <div class="container">

                <div class="col-md-4 address">	
                    <div class="form">				
                        <form action="assistantact.jsp" onsubmit="return check();">
                            <table>
                                <tr><td>Name</td><td><input type="text" name="name" id="name" required></td></tr>
                                <tr><td><br/></td></tr>

                                <tr><td>Address</td><td><textarea name="addr" cols="20" rows="10" id="addr" required></textarea></td></tr>
                                <tr><td><br/></td></tr>
                                <tr><td>Contact NO:</td><td><input type="text" name="phon" id="phon"required maxlength="10" ></td></tr>
                                <tr><td><br/></td></tr>
                                <tr><td>E-mail</td><td><input type="email" name="mail" required></td></tr>
                                <tr><td><br/></td></tr>
                                <tr><td>Gender</td><td><input type="radio" value="M" required name="gender">Male<input type="radio" required value="F" name="gender">Female</td></tr>
                                <tr><td><br/></td></tr>

                                <tr><td>Password</td><td><input type="password" name="pass" id="pass" required></td></tr>
                                <tr><td><br/></td></tr>
                                <tr><td colspan="2"><input type="submit" style="background: #ffcc00;height: 50px;width: 100%" name="submit"></td></tr>
                            </table></form>

                    </div>
                </div>
                <div class="col-md-8 contact-part">
                    <table border="1" style="width:100%;text-align: center">
                        <tr> 
                            <th>Name</th>
                            <th>Address</th>
                            <th>Phone no</th>
                            <th>Email</th>
                            <th>Gender</th>
                            <th>Action</th>

                        </tr>

                        <%
                            ResultSet rs2 = DB.executeQuery("select *from tbl_labassistant");
                            while (rs2.next()) {
                        %>
                        <tr> 
                            <td><%=rs2.getString("name")%></td>
                            <td><%=rs2.getString("adr")%></td>
                            <td><%=rs2.getString("phn")%></td>
                            <td><%=rs2.getString("em")%></td>
                            <td><%=rs2.getString("gen")%></td>

                            <td><a href ="dellabassistant.jsp?n=<%=rs2.getString("laid")%>">Delete</a></td></tr>

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

            alert('Please input alphabet characters only,enter  first name');
            return false;
        }


        else if (!document.getElementById("phon").value.match(numbers))
        {
            alert('Please input numeric characters only,enter phone number');
            return false;
        }
        else if (document.getElementById("phon").value.length < 10)
        {
            alert('Enter phone number with minimum lebgth of 10 numbers');
            return false;
        }
        else if (document.getElementById("pc").value.length < 6)
        {
            alert('Enter pin with minimum lebgth of 6 numbrers');
            return false;
        }

        else if (document.getElementById("pass").value.length < 8)
        {
            alert('Enter password with minimum lebgth of 8 characters');
            return false;
        }
        else
        {
            return true;
        }
    }


</script>


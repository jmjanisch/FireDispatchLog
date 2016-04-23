<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 // 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<c:set var="pageTitle" value="Department Profile" scope="request" />


<c:import url="../siteHeader.jsp" />

<body>

<c:import url="../siteNavBar.jsp" />


<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="/loadDepartmentInfo">DEPARTMENT PROFILE<span class="sr-only">(current)</span></a></li>
                <li><a href="../index.jsp">Dashboard</a></li>
                <li><a href="#">Personnel</a></li>
                <li id="btnReport"><a href="#">Reports</a></li>
                <li><a href="#">Export File</a></li>
            </ul>
        </div>


<c:import url="contentDepartmentProfile.jsp" />


</div>
</div>




<!-- Bootstrap core JavaScript-->
<!-- Placed at the end of the document so the pages load faster -->
<script src="assets/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="assets/js/ie10-viewport-bug-workaround.js"></script>

</body>
</html>


                


                        
                       


               
 

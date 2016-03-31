<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 // 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<c:set var="pageTitle" value="Staff Listing" scope="request" />


<c:import url="../siteHeader.jsp" />

<body>

<c:import url="../siteNavBar.jsp" />


<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="/loadStaffInfo">PERSONNEL<span class="sr-only">(current)</span></a></li>
                <li><a href="../index.jsp">Dashboard</a></li>
                <li id="btnReport"><a href="#">Reports</a></li>
                <li><a href="#">Export File</a></li>
            </ul>
        </div>


        <c:import url="contentStaffListing.jsp" />


    </div>
</div>




<!-- Bootstrap core JavaScript-->
<!-- Placed at the end of the document so the pages load faster -->
<script src="assets/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>

</body>
</html>

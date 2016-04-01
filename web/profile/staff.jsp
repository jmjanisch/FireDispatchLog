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


        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">Add/Edit Personnel Information</h1>
            <div class="row placeholders">
                <div class="col-xs-6 col-sm-3 placeholder">
                </div>
                <div class="col-xs-6 col-sm-3 placeholder">
                </div>
                <div class="col-xs-6 col-sm-3 placeholder">
                </div>

            </div>

            <h2 class="sub-header">Active Personnel</h2>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Fire #</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Rank</th>
                        <th>Hire Date</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="staff" items="${staffInfo}">

                        <li>${staff}</li>
                        <tr>
                            <td>${staff.fireNumber}</td>
                            <td>${staff.firstName}</td>
                            <td>${staff.lastName}</td>
                            <td>${staff.rank}</td>
                            <td>${staff.hireDate}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

                <p>Staff info - ${staffInfo[0].firstName}</p>
                <br>
                <p>All Staff - ${staffInfo}</p>
            </div>

        </div>
    </div>
</div>




<!-- Bootstrap core JavaScript-->
<!-- Placed at the end of the document so the pages load faster -->
<script src="assets/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>

</body>
</html>

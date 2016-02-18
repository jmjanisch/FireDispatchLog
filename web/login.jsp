<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 // 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<c:set var="pageTitle" value="Login" scope="request" />


<c:import url="siteHeader.jsp" />


<body>


<c:import url="siteNavBar.jsp" />
<c:import url="siteSideBar.jsp" />

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">Login to access this feature</h1>

<FORM ACTION="j_security_check" METHOD="POST">

    <div>
        <div class="form-group">
            <label class="control-label" for="j_username">User name:</label>
            <input type="text" class="form-control" id="j_username" placeholder="User Name" Name="j_username">
        </div>

        <div class="form-group">
            <label class="control-label" for="j_password">Password</label>
            <input type="password" class="form-control" id="j_password" name="j_password">
        </div>

        <div class="btn-group">
            <button type="submit" class="btn btn-success btn-lg" value="Log In">Log In</button>
        </div>
    </div>
</FORM>

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

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
            <c:forEach var="staff" items="${staffInfo[0]}">

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



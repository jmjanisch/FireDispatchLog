<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">Department Profile - ${departmentInfo.departmentName}</h1>
                    
        <form action="/updateDepartmentInfo" method="POST">
            <div>
                <div class="form-group">
                    <label class="control-label" for="deptName">Department Name</label>
                    <input type="text" class="form-control" id="deptName" name="deptName" value='${departmentInfo.departmentName}' placeholder="Department Name">
                </div>

                <div class="form-group"> 
                    <label class="control-label" for="deptAddress">Department Address</label>
                    <input type="text" class="form-control" id="deptAddress" name="deptAddress" value='${departmentInfo.departmentAddress}' placeholder="Department Address" >
                </div>

                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptCity">City</label>
                    <input type="text" class="form-control" id="deptCity" name="deptCity" value='${departmentInfo.city}' placeholder="City">
                </div>

                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptState">State
                    <br>
                    </label>                                 
                    <select id="deptState" class="form-control" name="deptState" value="${departmentInfo.state}" >
                        <option value=""></option>
                        <option value="IA">IA</option>
                        <option value="IL">IL</option>
                        <option value="IN">IN</option>
                        <option value="MI">MI</option>
                        <option value="MN">MN</option>
                        <option value="WI">WI</option>
                    </select>
                </div>

                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptZipCode">Zip Code</label>
                    <input type="text" class="form-control" id="deptZipCode" name="deptZipCode" value='${departmentInfo.zipcode}' placeholder="Zip Code">
                </div>

                <div class="form-group pull-right"> 
                    <label class="control-label" for="nfirsId">Department ID#</label>
                    <input type="text" class="form-control" id="nfirsId" name="nfirsId" value='${departmentInfo.nfirsId}' placeholder="Department ID#" readonly="readonly">
                </div>
            </div>

<br /><br /><br />
            <hr /> 
            <div>
                <h3>Department Contact Information</h3>
                <div class="form-group pull-left"> 
                    <label class="control-label" for="contactFirstName">First Name</label>
                    <input type="text" class="form-control" id="contactFirstName" name="contactFirstName" value='${departmentInfo.contactFirstName}' placeholder="Contact First Name">
                </div>

                <div class="form-group pull-left"> 
                    <label class="control-label" for="contactLastName">Last Name</label>
                    <input type="text" class="form-control" id="contactLastName" name="contactLastName" value='${departmentInfo.contactLastName}' placeholder="Contact Last Name">
                </div>

<br /><br /><br /><br />

                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptPhone">Phone Number</label>
                    <input type="text" class="form-control" id="deptPhone" name="phoneNumber" value='${departmentInfo.phoneNumber}' placeholder="Phone Number">
                </div>
            </div>
                        
<br /><br /><br /><br />
            <div class="form-group"> 
                <label class="control-label" for="contactEmail">Email Address</label>
                <input type="text" class="form-control" id="contactEmail" name="contactEmail" value='${departmentInfo.contactEmail}' placeholder="Enter Email Address">
            </div>

        <div class="btn-toolbar" role="toolbar"> 
            <div class="btn-group"> 
                <button type="submit" class="btn btn-success btn-lg">Save Changes</button>
            </div>      


            <div class="row placeholders">
                <div class="col-xs-6 col-sm-3 placeholder"></div>
                <div class="col-xs-6 col-sm-3 placeholder"></div>
                <div class="col-xs-6 col-sm-3 placeholder"></div>
            </div>

        </form>
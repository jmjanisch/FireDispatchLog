<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">Department Profile - Cottage Grove Fire Department</h1>
                    
        <form>
            <div>
                <div class="form-group">
                    <label class="control-label" for="deptName">Department Name</label>
                    <input type="text" class="form-control" id="deptName" value='${departmentInfo.departmentName}' placeholder="Department Name">
                </div>

                <div class="form-group"> 
                    <label class="control-label" for="deptAddress">Department Address</label>
                    <input type="text" class="form-control" id="deptAddress" value='${departmentInfo.departmentAddress}' placeholder="Department Address" >
                </div>

                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptCity">City</label>
                    <input type="text" class="form-control" id="deptCity" value='${departmentInfo.city}' placeholder="City">
                </div>

                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptState">State
                    <br>
                    </label>                                 
                    <select id="deptState" class="form-control" value="${departmentInfo.state}">
                        <option>WI</option>                                     
                        <option>IL</option>                                     
                        <option>MN</option>                                     
                    </select>
                </div>

                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptZipCode">Zip Code</label>
                    <input type="text" class="form-control" id="deptZipCode" value='${departmentInfo.zipcode}' placeholder="Zip Code">
                </div>

                <div class="form-group pull-right"> 
                    <label class="control-label" for="deptId">Department ID#</label>
                    <input type="text" class="form-control" id="deptId" value='${departmentInfo.nfirsId}' placeholder="Department ID#">
                </div>
            </div>

<br /><br /><br />
            <hr /> 
            <div>
                <h3>Department Contact Information</h3>
                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptContactFirstName">First Name</label>
                    <input type="text" class="form-control" id="deptContactFirstName" value='${departmentInfo.contactFirstName}' placeholder="Contact First Name">
                </div>

                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptContactLastName">Last Name</label>
                    <input type="text" class="form-control" id="deptContactLastName" value='${departmentInfo.contactLastName}' placeholder="Contact Last Name">
                </div>

<br /><br /><br /><br />

                <div class="form-group pull-left"> 
                    <label class="control-label" for="deptPhone">Phone Number</label>
                    <input type="text" class="form-control" id="deptPhone" value='${departmentInfo.phoneNumber}' placeholder="Phone Number">
                </div>
            </div>
                        
<br /><br /><br /><br />
            <div class="form-group"> 
                <label class="control-label" for="deptContactEmail">Email Address</label>
                <input type="text" class="form-control" id="deptContactEmail" value='${departmentInfo.contactEmail}' placeholder="Enter Email Address">
            </div>
        </form>


        <div class="btn-toolbar" role="toolbar"> 
            <div class="btn-group"> 
                <button type="button" class="btn btn-success btn-lg">Update</button>                             
            </div>      

            <div class="btn-group"> 
                <button type="button" class="btn btn-danger btn-lg">Cancel</button>                             
            </div>

            <div class="row placeholders">
                <div class="col-xs-6 col-sm-3 placeholder"></div>
                <div class="col-xs-6 col-sm-3 placeholder"></div>
                <div class="col-xs-6 col-sm-3 placeholder"></div>
            </div>
package emberServices;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.jjanisch.ember.entity.*;
import com.jjanisch.ember.persistence.*;

/**
 * Created by Justin Janisch on 3/3/2016.
 */
// The Java class will be hosted at the URI path "/Ember"
@Path("/Ember")
public class EmberServices {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/{departmentNumber}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces({MediaType.APPLICATION_JSON})
    public Department getDepartment(@PathParam("departmentNumber") String departmentNumber) {
        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();

        Department department = new Department();

        department = dao.getDepartmentBy(departmentNumber);
        String departmentName = department.getDepartmentName();

        return department;
    }


}

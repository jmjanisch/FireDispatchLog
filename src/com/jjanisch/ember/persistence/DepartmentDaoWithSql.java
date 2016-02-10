package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.Department;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Justin Janisch on 2/7/2016.
 */
public class DepartmentDaoWithSql implements DepartmentDao {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<Department>();

        Database database = Database.getInstance();

        Connection connection = null;


        String sql = "select * from department order by id";
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);

            // iterate over the resultset, adding each user to the list
            while (results.next()) {
                Department department = createDepartmentFromResults(results);
                departments.add(department);
            }
        } catch (SQLException e) {
            log.error("SQL Exception: ", e);
        } catch (Exception e) {
            log.error(e);
        }


        return departments;
    }

    @Override
    public void updateDepartment(Department department) {

    }

    @Override
    public Boolean deleteDepartment(Department department) {
        return true;
    }

    @Override
    public int addDepartment(Department department) {
        return 0;
    }

    private Department createDepartmentFromResults(ResultSet results) throws SQLException {
        Department department = new Department();
        department.setId(results.getInt("id"));
        department.setDepartmentNumber(results.getString("department_id"));
        department.setDepartmentName(results.getString("name"));
        department.setDepartmentAddress(results.getString("address"));
        department.setCity(results.getString("city"));
        department.setState(results.getString("state"));
        department.setZipcode(results.getString("zipcode"));
        department.setContactFirstName(results.getString("contact_first_name"));
        department.setContactLastName(results.getString("contact_last_name"));
        department.setPhoneNumber(results.getString("contact_phone"));
        department.setContactEmail(results.getString("contact_email"));
        return department;
    }
}

package com.jjanisch.ember.persistence;

import org.junit.Test;
import com.jjanisch.ember.entity.Department;
import java.util.*;
import static org.junit.Assert.*;

/**
 * Created by Justin Janisch on 2/8/2016.
 */
public class DepartmentDaoWithHibernateTest {


    @Test
    public void testGetAllDepartments() throws Exception {
        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();

        List<Department> departments = new ArrayList<Department>();

        departments = dao.getAllDepartments();

        assertTrue(departments.size() > 0);
    }

    @Test
    public void testGetDepartment() throws Exception {
        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();

        Department testDepartment = new Department();

        testDepartment = dao.getDepartment(102);

        assertNotNull(testDepartment);
    }

    @Test
    public void testGetDepartmentBy() throws Exception {
        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();

        Department testDepartment = new Department();

        testDepartment = dao.getDepartmentBy("13170");

        assertNotNull(testDepartment);
    }

    @Test
    public void testUpdateDepartment() throws Exception {
        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();

        // New Department Parameters
        Department department = new Department();

        department.setDepartmentId(102);
        department.setNfirsId(11111);
        department.setDepartmentName("Update Department");
        department.setDepartmentAddress("Update Address");
        department.setCity("UpdateCity");
        department.setState("AA");
        department.setZipcode("UpdateZip");
        department.setContactFirstName("UpdateFirstName");
        department.setContactLastName("UpdateLastName");
        department.setPhoneNumber("999 999-0000");
        department.setContactEmail("update@testdomain.com");

        dao.updateDepartment(department);
    }

    @Test
    public void testDeleteDepartment() throws Exception {
        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();
        int insertedDepartmentId = 0;

        //create department to add for test
        Department department = new Department();
        department.setNfirsId(55555);
        department.setDepartmentName("Test Department");
        department.setDepartmentAddress("Test Address");
        department.setCity("TestCity");
        department.setState("ZZ");
        department.setZipcode("TestZip");
        department.setContactFirstName("TestFirstName");
        department.setContactLastName("TestLastName");
        department.setPhoneNumber("608 555-1212");
        department.setContactEmail("test@testdomain.com");

        department.setDepartmentId(0);

        insertedDepartmentId = dao.addDepartment(department);

        // Check department is in DB
        dao.getDepartment(insertedDepartmentId);
        assertNotNull(insertedDepartmentId);

        // Delete the department
        Boolean wasDepartmentDeleted = dao.deleteDepartment(department);
        assertTrue(wasDepartmentDeleted);

    }



    @Test
    public void testAddDepartment() throws Exception {

        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();
        int insertedDepartmentId = 0;

        //create department to add
        Department department = new Department();
        department.setNfirsId(88888);
        department.setDepartmentName("Test Department");
        department.setDepartmentAddress("Test Address");
        department.setCity("TestCity");
        department.setState("ZZ");
        department.setZipcode("TestZip");
        department.setContactFirstName("TestFirstName");
        department.setContactLastName("TestLastName");
        department.setPhoneNumber("608 555-1212");
        department.setContactEmail("test@testdomain.com");

        insertedDepartmentId = dao.addDepartment(department);

        assertTrue(insertedDepartmentId > 0);

    }
}
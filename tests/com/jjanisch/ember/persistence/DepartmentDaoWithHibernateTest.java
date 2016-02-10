package com.jjanisch.ember.persistence;

import org.junit.Before;
import org.junit.Test;

import com.jjanisch.ember.entity.Department;
import org.junit.Test;

import javax.ejb.TransactionAttribute;
import java.util.*;
import java.util.List;

import static org.junit.Assert.*;






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
    public void testUpdateDepartment() throws Exception {
        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();

        // New Department Parameters
        Department department = new Department();

        department.setId(102);
        department.setDepartmentNumber("11111");
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

    }



    @Test
    public void testAddDepartment() throws Exception {

        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();
        int insertedDepartmentId = 0;

        //create user to add
        Department department = new Department();
        department.setDepartmentNumber("55555");
        department.setDepartmentName("Test Department");
        department.setDepartmentAddress("Test Address");
        department.setCity("TestCity");
        department.setState("ZZ");
        department.setZipcode("TestZip");
        department.setContactFirstName("TestFirstName");
        department.setContactLastName("TestLastName");
        department.setPhoneNumber("608 555-1212");
        department.setContactEmail("test@testdomain.com");

        department.setId(0);

        insertedDepartmentId = dao.addDepartment(department);

        assertTrue(insertedDepartmentId > 0);

    }
}
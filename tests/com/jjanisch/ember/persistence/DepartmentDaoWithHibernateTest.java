package com.jjanisch.ember.persistence;

import org.junit.Before;
import org.junit.Test;

import com.jjanisch.ember.entity.Department;
import org.junit.Test;

import javax.ejb.TransactionAttribute;
import java.util.List;

import static org.junit.Assert.*;






import static org.junit.Assert.*;

/**
 * Created by Justin Janisch on 2/8/2016.
 */
public class DepartmentDaoWithHibernateTest {

    @Before
    public void setUp() throws Exception {
        // Make connection to database

    }

    @Test
    public void testGetAllDepartments() throws Exception {

    }

    @Test
    public void testUpdateDepartment() throws Exception {

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
        department.setState("TestState");
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
package com.jjanisch.ember.persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jjanisch.ember.entity.Apparatus;
import java.sql.Date;

import javax.ejb.TransactionAttribute;
import java.util.*;
import java.util.List;

import static org.junit.Assert.*;


import static org.junit.Assert.*;

/**
 * Created by Justin Janisch on 3/9/2016.
 */
public class ApparatusDaoWithHibernateTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetApparatusByDepartment() throws Exception {
        ApparatusDaoWithHibernate dao = new ApparatusDaoWithHibernate();

        List<Apparatus> apparatuses = new ArrayList<Apparatus>();

        apparatuses = dao.getApparatusByDepartment();

        assertTrue(apparatuses.size() > 0);
    }

    @Test
    public void testUpdateApparatus() throws Exception {

    }

    @Test
    public void testDeleteApparatus() throws Exception {

    }

    @Test
    public void testAddApparatus() throws Exception {
        ApparatusDaoWithHibernate dao = new ApparatusDaoWithHibernate();
        int insertedApparatusId = 0;
        Date inServiceDate = Date.valueOf("2005-01-01");

        //create apparatus to add
        Apparatus apparatus = new Apparatus();
        apparatus.setDesignation("E3");
        apparatus.setType("Engine");
        apparatus.setMake("Custom");
        apparatus.setInServiceDate(inServiceDate);
        apparatus.setWaterCapacity(900);
        apparatus.setDepartmentId(101);

        //department.setDepartmentId(0);

        insertedApparatusId = dao.addApparatus(apparatus);

        assertTrue(insertedApparatusId > 0);
    }
}
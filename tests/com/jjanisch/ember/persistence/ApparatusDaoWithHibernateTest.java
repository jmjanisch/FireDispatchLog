package com.jjanisch.ember.persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jjanisch.ember.entity.ApparatusEntity;
import java.sql.Date;
import org.apache.log4j.Logger;
import java.util.*;


import static org.junit.Assert.*;


import static org.junit.Assert.*;

/**
 * Created by Justin Janisch on 3/9/2016.
 */
public class ApparatusDaoWithHibernateTest {
    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetApparatusByDepartment() throws Exception {
        ApparatusDaoWithHibernate dao = new ApparatusDaoWithHibernate();

        List<ApparatusEntity> apparatuses = new ArrayList<ApparatusEntity>();

        apparatuses = dao.getApparatusByDepartment();
        log.info("Apparatus: " + apparatuses);
        assertTrue(apparatuses.size() > 0);
    }

    @Test
    public void testUpdateApparatus() throws Exception {
        ApparatusDaoWithHibernate dao = new ApparatusDaoWithHibernate();
        Date inServiceDate = Date.valueOf("9999-12-31");

        ApparatusEntity apparatus = new ApparatusEntity();

        apparatus.setApparatusId(3);
        apparatus.setDesignation("E12");
        apparatus.setType("TestApparatus");
        apparatus.setMake("TestMake");
        apparatus.setInServiceDate(inServiceDate);
        apparatus.setWaterCapacity(9999);
        apparatus.setDepartmentId(102);

        dao.updateApparatus(apparatus);
    }

    @Test
    public void testDeleteApparatus() throws Exception {
        ApparatusDaoWithHibernate dao = new ApparatusDaoWithHibernate();
        int insertedApparatusId = 0;
        Date inServiceDate = Date.valueOf("9999-12-31");

        // Create new apparatus to add for test
        ApparatusEntity apparatus = new ApparatusEntity();

        apparatus.setDesignation("Test");
        apparatus.setType("TestApparatus");
        apparatus.setMake("TestMake");
        apparatus.setInServiceDate(inServiceDate);
        apparatus.setWaterCapacity(9999);
        apparatus.setDepartmentId(101);

        insertedApparatusId = dao.addApparatus(apparatus);

        // Check apparatus is in Database
        dao.getApparatus(insertedApparatusId);
        assertNotNull(insertedApparatusId);

        // Delete the apparatus
        Boolean wasApparatusDeleted = dao.deleteApparatus(apparatus);
        assertTrue(wasApparatusDeleted);
    }

    @Test
    public void testAddApparatus() throws Exception {
        ApparatusDaoWithHibernate dao = new ApparatusDaoWithHibernate();
        int insertedApparatusId = 0;
        Date inServiceDate = Date.valueOf("2004-12-01");

        //create apparatus to add
        ApparatusEntity apparatus = new ApparatusEntity();

        apparatus.setDesignation("B1");
        apparatus.setType("Brush");
        apparatus.setMake("Ford");
        apparatus.setInServiceDate(inServiceDate);
        apparatus.setWaterCapacity(1500);
        apparatus.setDepartmentId(101);

        insertedApparatusId = dao.addApparatus(apparatus);
        assertTrue(insertedApparatusId > 0);
    }
}
package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.IncidentEntity;
import com.jjanisch.ember.entity.Staff;
import com.jjanisch.ember.entity.StaffEntity;
import com.jjanisch.ember.entity.ApparatusEntity;

import org.junit.Test;

import java.sql.Date;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Created by Justin Janisch on 3/30/2016.
 */
public class IncidentDaoWithHibernateTest {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    @Test
    public void testAddIncident() throws Exception {
        IncidentDaoWithHibernate incidentDao = new IncidentDaoWithHibernate();
        ApparatusDaoWithHibernate apparatusDao = new ApparatusDaoWithHibernate();
        StaffDaoWithHibernate staffDao = new StaffDaoWithHibernate();
        int insertedIncidentId = 0;

        // Simulate Staff & Apparatus Id's collected from input form
        Set<Integer> staffIds = new HashSet<Integer>(Arrays.asList(1002, 1003, 1007));
        Set<Integer> apparatusIds = new HashSet<Integer>(Arrays.asList(5, 19));

        Set<ApparatusEntity> apparatus = new HashSet<ApparatusEntity>(0);
        Set<StaffEntity> staff = new HashSet<StaffEntity>(0);

        // http://www.mkyong.com/hibernate/hibernate-many-to-many-relationship-example/
        // Build a set of Apparatus
        for (int id : apparatusIds) {
            ApparatusEntity newApparatus = new ApparatusEntity();
            newApparatus = apparatusDao.getApparatus(id);
            apparatus.add(newApparatus);
        }


        // Build a set of Staff
        for (int id : staffIds) {
            StaffEntity newStaff = new StaffEntity();
            newStaff = staffDao.getStaffById(id);
            staff.add(newStaff);
        }

        for (StaffEntity entity : staff) {
            System.out.println("You added staff: " + entity.toString());
        }

        // Create Test Incident and set properties
        IncidentEntity testIncident = new IncidentEntity();
        Date incidentDate = Date.valueOf("9999-12-31");

        testIncident.setDate(incidentDate);
        testIncident.setAddress("101 N. Main Street");
        testIncident.setCity("Test City");
        testIncident.setState("AA");
        testIncident.setZipcode("99999");
        testIncident.setIncidentTypeCode(100);
        testIncident.setPropertyUseCode(419);
        testIncident.setNarritative("This is a test incident");
        testIncident.setApparatus(apparatus);
        testIncident.setStaff(staff);

        insertedIncidentId = incidentDao.addIncident(testIncident);

        System.out.println("You added an incident with an id of: " + insertedIncidentId);
    }
}
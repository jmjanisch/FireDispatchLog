package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.IncidentEntity;
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
        IncidentTypeDaoWithHibernate incidentDao = new IncidentTypeDaoWithHibernate();
        ApparatusDaoWithHibernate apparatusDao = new ApparatusDaoWithHibernate();
        StaffDaoWithHibernate staffDao = new StaffDaoWithHibernate();
        int insertedApparatusId = 0;

        Set<ApparatusEntity> apparatus = new HashSet<ApparatusEntity>(0);
        Set<StaffEntity> staff = new HashSet<StaffEntity>(0);

        // http://www.mkyong.com/hibernate/hibernate-many-to-many-relationship-example/
        // Build a set of Apparatus

        // Build a set of Staff

        IncidentEntity testIncident = new IncidentEntity();




    }
}
package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.IncidentTypeEntity;
import org.junit.Test;
import com.jjanisch.ember.persistence.IncidentTypeDaoWithHibernate;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by Justin Janisch on 3/28/2016.
 */
public class IncidentTypeDaoWithHibernateTest {

    @Test
    public void testGetIncidentType() throws Exception {
        IncidentTypeDaoWithHibernate dao = new IncidentTypeDaoWithHibernate();
        IncidentTypeEntity incidentType = new IncidentTypeEntity();

        incidentType = dao.getIncidentType(100);

        System.out.println("Single incident returned from test: " + incidentType.toString());

        assertTrue(incidentType.getCode() == 100);
    }

    @Test
    public void testGetAllIncidentTypes() throws Exception {
        IncidentTypeDaoWithHibernate dao = new IncidentTypeDaoWithHibernate();

        List<IncidentTypeEntity> incidentTypes = new ArrayList<IncidentTypeEntity>();

        incidentTypes = dao.getAllIncidentTypes();

        System.out.println("Incident types returned for test:" + incidentTypes);

        assertTrue(incidentTypes.size() > 0);

    }
}
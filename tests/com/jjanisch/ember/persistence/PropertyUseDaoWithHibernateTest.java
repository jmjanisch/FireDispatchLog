package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.PropertyUseEntity;
import org.junit.Test;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Created by Justin Janisch on 3/27/2016.
 */
public class PropertyUseDaoWithHibernateTest {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    @Test
    public void testGetPropertyUse() throws Exception {
        PropertyUseDaoWithHibernate dao = new PropertyUseDaoWithHibernate();

        PropertyUseEntity propertyUse = new PropertyUseEntity();

        propertyUse = dao.getPropertyUse(419);
        System.out.println("Property Use: " + propertyUse.toString());

        assertTrue(propertyUse.getCode() == 419);
    }

    @Test
    public void testGetPropertyUseCodes() throws Exception {
        PropertyUseDaoWithHibernate dao = new PropertyUseDaoWithHibernate();

        List<PropertyUseEntity> propertyUseCodes = new ArrayList<PropertyUseEntity>();

        propertyUseCodes = dao.getPropertyUseCodes();
        log.info("Property Use Codes: " + propertyUseCodes);

        assertTrue(propertyUseCodes.size() > 0);
    }
}
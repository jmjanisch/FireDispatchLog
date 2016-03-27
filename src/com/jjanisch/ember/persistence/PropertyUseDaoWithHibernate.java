package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.PropertyUseEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;

/**
 * Created by Justin Janisch on 3/27/2016.
 *
 * This class returns the property use description from the database using a property use code.  There are
 * no other CRUD operations needed for property use.  Property Use table should not be updated or changed by this
 * application.
 */
public class PropertyUseDaoWithHibernate {
    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    public PropertyUseEntity getPropertyUse(Integer propertyUseCode) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<PropertyUseEntity> propertyUses = new ArrayList<PropertyUseEntity>();
        Transaction dbTransaction = null;


        String query = ("FROM PropertyUseEntity A WHERE A.code = " + propertyUseCode);

        log.info("Property Use: " + query);

        try {
            dbTransaction = session.beginTransaction();
            propertyUses = session.createQuery(query).list();
            System.out.println("Property Uses Returned: " + propertyUses);

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        return propertyUses.get(0);
    }



    public List<PropertyUseEntity> getPropertyUseCodes() {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        List<PropertyUseEntity> propertyUseCodes = new ArrayList<PropertyUseEntity>();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            List apparatusInDB = session.createQuery("FROM PropertyUseEntity ").list();

            for (Iterator iterator = apparatusInDB.iterator(); iterator.hasNext();) {

                PropertyUseEntity propertyUse = (PropertyUseEntity) iterator.next();
                propertyUseCodes.add(propertyUse);
            }

            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        log.info("Number of property use codes retrieved from database: " + propertyUseCodes.size());

        return propertyUseCodes;
    }

}

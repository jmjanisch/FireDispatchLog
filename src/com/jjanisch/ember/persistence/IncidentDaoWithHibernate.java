package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.IncidentEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;


/**
 * Created by Justin Janisch on 3/29/2016.
 */
public class IncidentDaoWithHibernate {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    public int addIncident(IncidentEntity incident) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;
        Integer id = null;

        try {
            dbTransaction = session.beginTransaction();
            id = (Integer)session.save(incident);
            dbTransaction.commit();

            System.out.println("Added Incident with id of: " + id);

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            log.error(error);
        } finally {
            session.close();
        }
        return id;
    }
}

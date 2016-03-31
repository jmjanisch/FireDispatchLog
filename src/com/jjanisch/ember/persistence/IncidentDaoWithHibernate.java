package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.IncidentEntity;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;


/**
 * Created by Justin Janisch on 3/29/2016.
 */
public class IncidentDaoWithHibernate {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    public List<IncidentEntity> getAllIncidents() {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        List<IncidentEntity> allIncidents = new ArrayList<IncidentEntity>();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            // TO DO:  This query is dependent on eager loading in the DB.  Change this query to use a join to populate
            //         the apparatus & staff collections and switch the hibernate xml file to lazy load.
            List incidentsInDB = session.createQuery("FROM IncidentEntity ").list();
            log.info("Status of allIncidents list: " + allIncidents);

            for (Iterator iterator = incidentsInDB.iterator(); iterator.hasNext();) {

                IncidentEntity incident = (IncidentEntity) iterator.next();
                allIncidents.add(incident);
            }

            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        log.info("Number of incidents recalled: " + allIncidents.size());

        return allIncidents;
    }


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

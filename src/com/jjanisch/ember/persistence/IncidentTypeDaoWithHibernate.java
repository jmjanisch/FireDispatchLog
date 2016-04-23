package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.IncidentTypeEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;

/**
 * Created by Justin Janisch on 3/28/2016.
 */
public class IncidentTypeDaoWithHibernate {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    public IncidentTypeEntity getIncidentType(Integer incidentTypeCode) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<IncidentTypeEntity> incidentTypes = new ArrayList<IncidentTypeEntity>();
        Transaction dbTransaction = null;


        String query = ("FROM IncidentTypeEntity A WHERE A.code = " + incidentTypeCode);

        log.info("Incident Types query: " + query);

        try {
            dbTransaction = session.beginTransaction();
            incidentTypes = session.createQuery(query).list();
            System.out.println("Incident Types Returned: " + incidentTypes);

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        return incidentTypes.get(0);
    }



    public List<IncidentTypeEntity> getAllIncidentTypes() {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        List<IncidentTypeEntity> incidentTypes = new ArrayList<IncidentTypeEntity>();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            List apparatusInDB = session.createQuery("FROM IncidentTypeEntity ").list();

            for (Iterator iterator = apparatusInDB.iterator(); iterator.hasNext();) {

                IncidentTypeEntity incidentType = (IncidentTypeEntity) iterator.next();
                incidentTypes.add(incidentType);
            }

            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        log.info("Number of incident types retrieved from database: " + incidentTypes.size());

        return incidentTypes;
    }
}

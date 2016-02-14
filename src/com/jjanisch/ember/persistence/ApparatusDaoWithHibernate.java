package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.Apparatus;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;


/**
 * Created by Justin Janisch on 2/14/2016.
 */
public class ApparatusDaoWithHibernate {
    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());


    public List<Apparatus> getApparatusByDepartment() {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        List<Apparatus> departmentApparatus = new ArrayList<Apparatus>();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            List apparatusInDB = session.createQuery("FROM Apparatus").list();

            for (Iterator iterator = apparatusInDB.iterator(); iterator.hasNext();) {

                Apparatus apparatus = (Apparatus) iterator.next();
                departmentApparatus.add(apparatus);
            }

            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        log.info("Number of apparatus on the department: " + departmentApparatus.size());

        return departmentApparatus;
    }

    //public Apparatus getApparatus(Integer id) {

    //}


    public void updateApparatus(Apparatus apparatus) {

    }


    public Boolean deleteApparatus(Apparatus apparatus) {

        return true;

    }


    public int addApparatus(Apparatus apparatus) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;
        Integer id = null;

        try {
            dbTransaction = session.beginTransaction();
            id = (Integer) session.save(apparatus);
            dbTransaction.commit();

            log.info("Added Apparatus: " + apparatus + " with id of: " + id);

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            log.error(error);
        } finally {
            session.close();
        }
        return id;
    }


}

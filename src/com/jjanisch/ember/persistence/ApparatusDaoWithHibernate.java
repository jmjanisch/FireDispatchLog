package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.ApparatusEntity;
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


    public List<ApparatusEntity> getApparatusByDepartment() {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        List<ApparatusEntity> departmentApparatus = new ArrayList<ApparatusEntity>();
        Transaction dbTransaction = null;
        log.info("Status of departmentApparatus list: " + departmentApparatus);

        try {
            dbTransaction = session.beginTransaction();
            List apparatusInDB = session.createQuery("FROM ApparatusEntity ").list();
            log.info("Status of apparatusInDB list: " + departmentApparatus);

            for (Iterator iterator = apparatusInDB.iterator(); iterator.hasNext();) {

                ApparatusEntity apparatus = (ApparatusEntity) iterator.next();
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


    public void updateApparatus(ApparatusEntity apparatus) {

    }


    public Boolean deleteApparatus(ApparatusEntity apparatus) {

        return true;

    }


    public int addApparatus(ApparatusEntity apparatus) {

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

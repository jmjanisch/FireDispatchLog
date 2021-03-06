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

    public ApparatusEntity getApparatus(Integer id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<ApparatusEntity> apparatuses = new ArrayList<ApparatusEntity>();
        Transaction dbTransaction = null;


        String query = ("FROM ApparatusEntity A WHERE A.apparatusId = " + id);

        System.out.println("GetApparatusBy Query: " + query);

        try {
            dbTransaction = session.beginTransaction();
            apparatuses = session.createQuery(query).list();
            System.out.println("Apparatus Returned: " + apparatuses);

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        return apparatuses.get(0);
    }


    public void updateApparatus(ApparatusEntity apparatus) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction dbTransaction = null;
        try {
            dbTransaction = session.beginTransaction();

            ApparatusEntity apparatusUpdate = (ApparatusEntity) session.get(ApparatusEntity.class, apparatus.getApparatusId());

            log.info("Updating: " + apparatusUpdate.toString());

            apparatusUpdate.setDesignation(apparatus.getDesignation());
            apparatusUpdate.setType(apparatus.getType());
            apparatusUpdate.setMake(apparatus.getMake());
            apparatusUpdate.setInServiceDate(apparatus.getInServiceDate());
            apparatusUpdate.setWaterCapacity(apparatus.getWaterCapacity());
            apparatusUpdate.setDepartmentId(apparatus.getDepartmentId());

            session.update(apparatusUpdate);
            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction != null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }
    }


    public Boolean deleteApparatus(ApparatusEntity apparatus) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            ApparatusEntity apparatusToDelete = (ApparatusEntity) session.get(ApparatusEntity.class, apparatus.getApparatusId());
            session.delete(apparatusToDelete);
            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction != null) dbTransaction.rollback();
            error.printStackTrace();
            return false;
        } finally {
            session.close();
        }

        return true;
    }


    public int addApparatus(ApparatusEntity apparatus) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;
        Integer id = null;

        try {
            dbTransaction = session.beginTransaction();
            id = (Integer)session.save(apparatus);
            dbTransaction.commit();

            System.out.println("Added Apparatus with id of: " + id);

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            log.error(error);
        } finally {
            session.close();
        }
        return id;
    }
}

package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.Staff;
import com.jjanisch.ember.entity.StaffEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;

/**
 * Created by Justin Janisch on 3/28/2016.
 */
public class StaffDaoWithHibernate {
    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    public List<StaffEntity> getStaffByDepartment() {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        List<StaffEntity> departmentStaff = new ArrayList<StaffEntity>();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            List staffInDB = session.createQuery("FROM StaffEntity ").list();

            for (Iterator iterator = staffInDB.iterator(); iterator.hasNext();) {

                StaffEntity staff = (StaffEntity) iterator.next();
                departmentStaff.add(staff);
            }

            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        log.info("Number of staff on the department: " + departmentStaff.size());

        return departmentStaff;
    }

    public StaffEntity getStaffById(Integer staffId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<StaffEntity> allStaff = new ArrayList<StaffEntity>();
        Transaction dbTransaction = null;


        String query = ("FROM StaffEntity A WHERE A.staffId = " + staffId);

        System.out.println("GetApparatusBy Query: " + query);

        try {
            dbTransaction = session.beginTransaction();
            allStaff = session.createQuery(query).list();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        return allStaff.get(0);
    }


    public void updateStaff(StaffEntity staff) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction dbTransaction = null;
        try {
            dbTransaction = session.beginTransaction();

            StaffEntity staffUpdate = (StaffEntity) session.get(StaffEntity.class, staff.getStaffId());

            log.info("Updating: " + staffUpdate.toString());

            staffUpdate.setFireNumber(staff.getFireNumber());
            staffUpdate.setFirstName(staff.getFirstName());
            staffUpdate.setLastName(staff.getLastName());
            staffUpdate.setRank(staff.getRank());
            staffUpdate.setHireDate(staff.getHireDate());
            staffUpdate.setTermDate(staff.getTermDate());
            staffUpdate.setDepartmentId(staff.getDepartmentId());

            session.update(staffUpdate);
            dbTransaction.commit();

        } catch (HibernateException error) {
            if (dbTransaction != null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }
    }


    public Boolean deleteStaff(StaffEntity staff) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            StaffEntity staffToDelete = (StaffEntity) session.get(StaffEntity.class, staff.getStaffId());
            session.delete(staffToDelete);
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


    public int addStaff(StaffEntity staff) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;
        Integer staffId = null;

        try {
            dbTransaction = session.beginTransaction();
            staffId = (Integer)session.save(staff);
            dbTransaction.commit();

            System.out.println("Added Staff with id of: " + staffId);

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            log.error(error);
        } finally {
            session.close();
        }
        return staffId;
    }

}

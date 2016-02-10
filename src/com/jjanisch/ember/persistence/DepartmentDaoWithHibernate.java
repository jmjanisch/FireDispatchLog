package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.Department;
import com.sun.deploy.resources.Deployment_pt_BR;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;


/**
 * Created by Justin Janisch on 2/7/2016.
 */
public class DepartmentDaoWithHibernate implements DepartmentDao {

    //private final Logger log = Logger.getLogger(this.getClass());

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());


    @Override
    public List<Department> getAllDepartments() {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<Department> departments = new ArrayList<Department>();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            List departmentsInDB = session.createQuery("FROM Department").list();

            for (Iterator iterator = departmentsInDB.iterator(); iterator.hasNext();) {

                Department department = (Department) iterator.next();
                departments.add(department);
             }

            dbTransaction.commit();

        } catch (HibernateException error) {
             if (dbTransaction!=null) dbTransaction.rollback();
             error.printStackTrace();
        } finally {
            session.close();
        }

        log.info("Number of departments: " + departments.size());

        return departments;
    }

    public Department getDepartment(Integer id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<Department> departments = new ArrayList<Department>();
        Transaction dbTransaction = null;

        String query = ("FROM Department D WHERE D.id =" + id);

        try {
            dbTransaction = session.beginTransaction();
            departments = session.createQuery(query).list();

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            error.printStackTrace();
        } finally {
            session.close();
        }

        return departments.get(0);
    }

    @Override
    public void updateDepartment(Department department) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction dbTransaction = null;
        try {
            dbTransaction = session.beginTransaction();
            Department departmentUpdate = (Department)session.get(Department.class, department.getId());

            departmentUpdate.setDepartmentNumber(department.getDepartmentNumber());
            departmentUpdate.setDepartmentName(department.getDepartmentName());
            departmentUpdate.setDepartmentAddress(department.getDepartmentAddress());
            departmentUpdate.setCity(department.getDepartmentAddress());
            departmentUpdate.setState(department.getState());
            departmentUpdate.setZipcode(department.getZipcode());
            departmentUpdate.setContactFirstName(department.getContactFirstName());
            departmentUpdate.setContactLastName(department.getContactLastName());
            departmentUpdate.setPhoneNumber(department.getPhoneNumber());
            departmentUpdate.setContactEmail(department.getContactEmail());

            session.update(departmentUpdate);
            dbTransaction.commit();

        } catch (HibernateException error) {
             if (dbTransaction != null) dbTransaction.rollback();
             error.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteDepartment(Department department) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;

        try {
            dbTransaction = session.beginTransaction();
            Department departmentToDelete = (Department)session.get(Department.class, department.getId());
            session.delete(departmentToDelete);
            dbTransaction.commit();

        } catch (HibernateException error) {
             if (dbTransaction != null) dbTransaction.rollback();
             error.printStackTrace();
        } finally {
            session.close();
        }

    }

    @Override
    public int addDepartment(Department department) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction dbTransaction = null;
        Integer id = null;

        try {
            dbTransaction = session.beginTransaction();
            id = (Integer) session.save(department);
            dbTransaction.commit();

            log.info("Added Department: " + department + " with id of: " + id);

        } catch (HibernateException error) {
            if (dbTransaction!=null) dbTransaction.rollback();
            log.error(error);
        } finally {
            session.close();
        }
        return id;
    }

}

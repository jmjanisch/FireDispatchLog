package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.Department;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.SessionFactoryImplementor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Justin Janisch on 2/7/2016.
 */
public class DepartmentDaoWithHibernate implements DepartmentDao {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<Department>();
        return departments;
    }

    @Override
    public void updateDepartment(Department department) {

    }

    @Override
    public void deleteDepartment(Department department) {

    }

    @Override
    public int addDepartment(Department department) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer id = null;
        try {
            tx = session.beginTransaction();
            id = (Integer) session.save(department);
            tx.commit();
            log.info("Added department: " + department + " with id of: " + id);
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return id;
    }

}

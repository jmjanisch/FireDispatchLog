package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.Staff;
import com.jjanisch.ember.entity.StaffEntity;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.sql.Date;

/**
 * Created by Justin Janisch on 3/28/2016.
 */
public class StaffDaoWithHibernateTest {

    @Test
    public void testGetAllStaff() throws Exception {
        StaffDaoWithHibernate dao = new StaffDaoWithHibernate();
        List<StaffEntity> allStaff = new ArrayList<StaffEntity>();

        allStaff = dao.getAllStaff();

        assertTrue(allStaff.size() > 0);
    }

    @Test
    public void testGetStaffById() throws Exception {
        StaffDaoWithHibernate dao = new StaffDaoWithHibernate();
        StaffEntity staffMember = new StaffEntity();

        staffMember = dao.getStaffById(1003);

        assertTrue(staffMember.getStaffId() == 1003);
    }

    @Test
    public void testUpdateStaff() throws Exception {
        StaffDaoWithHibernate dao = new StaffDaoWithHibernate();
        StaffEntity staffMemberUpdate = new StaffEntity();
        Date hireDate = Date.valueOf("9999-01-01");
        Date termDate = Date.valueOf("9999-01-01");

        staffMemberUpdate.setStaffId(1008);
        staffMemberUpdate.setFireNumber("00");
        staffMemberUpdate.setFirstName("UpdatedFirstName");
        staffMemberUpdate.setLastName("UpdatedLastName");
        staffMemberUpdate.setRank("Rank");
        staffMemberUpdate.setHireDate(hireDate);
        staffMemberUpdate.setTermDate(termDate);
        staffMemberUpdate.setDepartmentId(101);

        dao.updateStaff(staffMemberUpdate);
    }

    @Test
    public void testDeleteStaff() throws Exception {

    }

    @Test
    public void testAddStaff() throws Exception {
        StaffDaoWithHibernate dao = new StaffDaoWithHibernate();
        StaffEntity newStaffMember = new StaffEntity();
        int insertedStaffId = 0;
        Date hireDate = Date.valueOf("9999-01-01");

        newStaffMember.setFireNumber("00");
        newStaffMember.setFirstName("FirstName");
        newStaffMember.setLastName("LastName");
        newStaffMember.setRank("Rank");
        newStaffMember.setHireDate(hireDate);
        newStaffMember.setDepartmentId(101);

        insertedStaffId = dao.addStaff(newStaffMember);

        assertTrue(insertedStaffId > 0);
    }
}
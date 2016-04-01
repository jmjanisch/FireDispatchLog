package com.jjanisch.ember.controller;

import com.jjanisch.ember.entity.StaffEntity;
import com.jjanisch.ember.persistence.StaffDaoWithHibernate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

/**
 * Created by Justin Janisch on 4/1/2016.
 */
@WebServlet(name = "AddPersonnelServlet", urlPatterns = {"/addPersonnel"})
public class AddPersonnelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StaffDaoWithHibernate dao = new StaffDaoWithHibernate();
        StaffEntity newStaffMember = new StaffEntity();
        int insertedStaffId = 0;

        Date hireDate = Date.valueOf("9999-01-01");

        newStaffMember.setFireNumber(request.getParameter("fireNumber"));
        newStaffMember.setFirstName(request.getParameter("firstName"));
        newStaffMember.setLastName(request.getParameter("lastName"));
        newStaffMember.setRank(request.getParameter("rank"));
        newStaffMember.setHireDate(hireDate);
        newStaffMember.setDepartmentId(102);

        insertedStaffId = dao.addStaff(newStaffMember);

        String url = "/loadStaffInfo";

        response.sendRedirect(url);
    }

}

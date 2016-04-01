package com.jjanisch.ember.controller;

import com.jjanisch.ember.entity.Department;
import com.jjanisch.ember.entity.StaffEntity;
import com.jjanisch.ember.persistence.DepartmentDaoWithHibernate;
import com.jjanisch.ember.persistence.StaffDaoWithHibernate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

/**
 * Created by Justin Janisch on 3/31/2016.
 */
@WebServlet(name = "LoadStaffServlet", urlPatterns = {"/loadStaffInfo"})
public class LoadStaffServlet extends HttpServlet {
    private Properties properties;
    private Department currentDepartment;

    public void init() throws ServletException {
        loadProperties("/ember.properties");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        ArrayList<StaffEntity> allStaff = new ArrayList<StaffEntity>();

        StaffDaoWithHibernate dao = new StaffDaoWithHibernate();
        String departmentNumber = properties.getProperty("departmentNumber");

        // TO DO: CHANGE to get all staff by department
        // TO DO: THEN to get all staff by department and "active status"
        allStaff = dao.getAllStaff();

        //for(StaffEntity staff :initialStaffList) {

        //}

        session.setAttribute("staffInfo", allStaff);


        // SET
        String url = "/profile/staff.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);

        dispatcher.forward(request, response);

    }

    public void loadProperties(String filePath) {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream(filePath));

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

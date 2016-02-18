package com.jjanisch.ember.controller;

import com.jjanisch.ember.entity.Department;
import com.jjanisch.ember.persistence.DepartmentDaoWithHibernate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Justin Janisch on 2/18/2016.
 */
@WebServlet(name = "UpdateDepartmentServlet" , urlPatterns = {"/updateDepartmentInfo"})
public class UpdateDepartmentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //HttpSession session = request.getSession();
        //ServletContext context = getServletContext();

        System.out.println("Department Name Entered: " + request.getParameter("deptName"));

        // TO DO: Error Handling on departmentUpdate

        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();

        // New Department Parameters
        Department department = new Department();

        department.setDepartmentId(102);
        department.setNfirsId(Integer.parseInt(request.getParameter("nfirsId")));
        department.setDepartmentName(request.getParameter("deptName"));
        department.setDepartmentAddress(request.getParameter("deptAddress"));
        department.setCity(request.getParameter("deptCity"));
        department.setState(request.getParameter("deptState"));
        department.setZipcode(request.getParameter("deptZipCode"));
        department.setContactFirstName(request.getParameter("contactFirstName"));
        department.setContactLastName(request.getParameter("contactLastName"));
        department.setPhoneNumber(request.getParameter("deptPhone"));
        department.setContactEmail(request.getParameter("contactEmail"));

        dao.updateDepartment(department);

        String url = "/loadDepartmentInfo";

        response.sendRedirect(url);
    }


}

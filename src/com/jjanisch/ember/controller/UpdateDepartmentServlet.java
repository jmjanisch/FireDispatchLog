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

        // TO DO: Error Handling / Input Validation on departmentUpdate

        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();
        //Department department = new Department();

        // Find Department id using nfirs Id
        Department department = dao.getDepartmentBy(request.getParameter("nfirsId"));
        int departmentId = department.getDepartmentId();
        System.out.println("Department ID: " + departmentId);

        // New Department Parameters
        department.setDepartmentId(departmentId);
        department.setNfirsId(Integer.parseInt(request.getParameter("nfirsId")));
        department.setDepartmentName(request.getParameter("deptName"));
        department.setDepartmentAddress(request.getParameter("deptAddress"));
        department.setCity(request.getParameter("deptCity"));
        department.setState(request.getParameter("deptState"));
        department.setZipcode(request.getParameter("deptZipCode"));
        department.setContactFirstName(request.getParameter("contactFirstName"));
        department.setContactLastName(request.getParameter("contactLastName"));
        department.setPhoneNumber(request.getParameter("phoneNumber"));
        department.setContactEmail(request.getParameter("contactEmail"));

        dao.updateDepartment(department);

        String url = "/loadDepartmentInfo";

        response.sendRedirect(url);
    }


}

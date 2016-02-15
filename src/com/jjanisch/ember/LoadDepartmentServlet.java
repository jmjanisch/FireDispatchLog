package com.jjanisch.ember;

import javax.servlet.*;
import com.jjanisch.ember.entity.Department;
import com.jjanisch.ember.persistence.DepartmentDaoWithHibernate;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.*;


/**
 * Created by Justin Janisch on 2/14/2016.
 */
@WebServlet(name = "LoadDepartmentServlet", urlPatterns = {"/loadDepartmentInfo"})
public class LoadDepartmentServlet extends HttpServlet {

    private Properties properties;
    private Department currentDepartment;

    public void init() throws ServletException {
        loadProperties("/ember.properties");

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        currentDepartment = new Department();
        DepartmentDaoWithHibernate dao = new DepartmentDaoWithHibernate();

        String departmentNumber = properties.getProperty("departmentNumber");
        System.out.println("Department Number Parse: " + departmentNumber);

        currentDepartment = dao.getDepartmentBy(departmentNumber);


        request.setAttribute("departmentInfo", currentDepartment);

        String url = "/departmentProfile.jsp";

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

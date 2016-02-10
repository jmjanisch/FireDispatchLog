package com.jjanisch.ember.persistence;

import com.jjanisch.ember.entity.Department;
import java.util.List;


/**
 * Created by Justin Janisch on 2/7/2016.
 */
public interface DepartmentDao {

    /**
     * Return a list of all Departments
     * @return all Departments
     */
    public List<Department> getAllDepartments();

    /**
     * Update a department
     * @param department to be updated
     */
    public void updateDepartment(Department department);

    /**
     * Delete a Department
     *
     *  @param department to be deleted
     */
    public Boolean deleteDepartment(Department department);

    /**
     * Add a department
     *
     * @param department to be added
     * @return id of the inserted user
     */
    public int addDepartment(Department department);
}

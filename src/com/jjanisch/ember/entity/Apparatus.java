package com.jjanisch.ember.entity;
import java.util.*;

/**
 * Created by Justin Janisch on 2/14/2016.
 */
public class Apparatus {

    private int apparatusId;
    private String designation;
    private String type;
    private String make;
    private Date inServiceDate;
    private int waterCapacity;
    private int departmentId;

    public Apparatus() {

    }

    public Apparatus(int apparatusId, String designation, String type, String make, Date inServiceDate, int waterCapacity, int departmentId) {
        this.apparatusId = apparatusId;
        this.designation = designation;
        this.type = type;
        this.make = make;
        this.inServiceDate = inServiceDate;
        this.waterCapacity = waterCapacity;
        this.departmentId = departmentId;
    }

    public int getId() {
        return apparatusId;
    }

    public void setId(int apparatusId) {
        this.apparatusId = apparatusId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Date getInServiceDate() {
        return inServiceDate;
    }

    public void setInServiceDate(Date inServiceDate) {
        this.inServiceDate = inServiceDate;
    }

    public int getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(int waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Apparatus{" +
                "apparatusId=" + apparatusId +
                ", designation='" + designation + '\'' +
                ", type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", inServiceDate=" + inServiceDate +
                ", waterCapacity=" + waterCapacity +
                ", departmentId=" + departmentId +
                '}';
    }
}

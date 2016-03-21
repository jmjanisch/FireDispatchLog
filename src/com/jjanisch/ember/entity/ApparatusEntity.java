package com.jjanisch.ember.entity;

import java.sql.Date;

/**
 * Created by Justin Janisch on 3/8/2016.
 */
public class ApparatusEntity {


    private int apparatusId;
    private String designation;
    private String type;
    private String make;
    private Date inServiceDate;
    private int waterCapacity;
    private Integer departmentId;

    public int getApparatusId() {
        return apparatusId;
    }

    public void setApparatusId(int apparatusId) {
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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "ApparatusEntity{" +
                "apparatusId=" + apparatusId +
                ", designation='" + designation + '\'' +
                ", type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", inServiceDate=" + inServiceDate +
                ", waterCapacity=" + waterCapacity +
                ", departmentId=" + departmentId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApparatusEntity that = (ApparatusEntity) o;

        if (apparatusId != that.apparatusId) return false;
        if (waterCapacity != that.waterCapacity) return false;
        if (designation != null ? !designation.equals(that.designation) : that.designation != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (make != null ? !make.equals(that.make) : that.make != null) return false;
        if (inServiceDate != null ? !inServiceDate.equals(that.inServiceDate) : that.inServiceDate != null)
            return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apparatusId;
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (make != null ? make.hashCode() : 0);
        result = 31 * result + (inServiceDate != null ? inServiceDate.hashCode() : 0);
        result = 31 * result + waterCapacity;
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        return result;
    }
}

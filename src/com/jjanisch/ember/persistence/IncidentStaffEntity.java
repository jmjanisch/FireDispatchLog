package com.jjanisch.ember.persistence;

/**
 * Created by Justin Janisch on 3/8/2016.
 */
public class IncidentStaffEntity {
    private int staffIncidentId;
    private Integer staffId;
    private Integer incidentId;

    public int getStaffIncidentId() {
        return staffIncidentId;
    }

    public void setStaffIncidentId(int staffIncidentId) {
        this.staffIncidentId = staffIncidentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Integer incidentId) {
        this.incidentId = incidentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IncidentStaffEntity that = (IncidentStaffEntity) o;

        if (staffIncidentId != that.staffIncidentId) return false;
        if (staffId != null ? !staffId.equals(that.staffId) : that.staffId != null) return false;
        if (incidentId != null ? !incidentId.equals(that.incidentId) : that.incidentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = staffIncidentId;
        result = 31 * result + (staffId != null ? staffId.hashCode() : 0);
        result = 31 * result + (incidentId != null ? incidentId.hashCode() : 0);
        return result;
    }
}

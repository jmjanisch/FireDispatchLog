package com.jjanisch.ember.persistence;

/**
 * Created by Justin Janisch on 3/8/2016.
 */
public class ApparatusIncidentEntity {
    private int apparatusIncidentId;
    private int incidentId;
    private int apparatusId;

    public int getApparatusIncidentId() {
        return apparatusIncidentId;
    }

    public void setApparatusIncidentId(int apparatusIncidentId) {
        this.apparatusIncidentId = apparatusIncidentId;
    }

    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public int getApparatusId() {
        return apparatusId;
    }

    public void setApparatusId(int apparatusId) {
        this.apparatusId = apparatusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApparatusIncidentEntity that = (ApparatusIncidentEntity) o;

        if (apparatusIncidentId != that.apparatusIncidentId) return false;
        if (incidentId != that.incidentId) return false;
        if (apparatusId != that.apparatusId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apparatusIncidentId;
        result = 31 * result + incidentId;
        result = 31 * result + apparatusId;
        return result;
    }
}

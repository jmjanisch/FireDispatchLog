package com.jjanisch.ember.entity;

import java.sql.Date;
import java.util.*;

/**
 * Created by Justin Janisch on 3/8/2016.
 */
public class IncidentEntity {
    private int incidentId;
    private Date date;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private Integer incidentTypeCode;
    private Integer propertyUseCode;
    private String narritative;

    private Set<ApparatusEntity> apparatus = new HashSet<ApparatusEntity>(0);
    private Set<StaffEntity> staff = new HashSet<StaffEntity>(0);
    //private Integer apparatusIncidentId;
    //private Integer staffIncidentId;

    public IncidentEntity() {

    }

    public IncidentEntity(int incidentId, Date date, String address, String city, String state, String zipcode, Integer incidentTypeCode, Integer propertyUseCode, String narritative, Set<ApparatusEntity> apparatus, Set<StaffEntity> staff) {
        this.incidentId = incidentId;
        this.date = date;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.incidentTypeCode = incidentTypeCode;
        this.propertyUseCode = propertyUseCode;
        this.narritative = narritative;
        this.apparatus = apparatus;
        this.staff = staff;
    }

    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getIncidentTypeCode() {
        return incidentTypeCode;
    }

    public void setIncidentTypeCode(Integer incidentTypeCode) {
        this.incidentTypeCode = incidentTypeCode;
    }

    public Integer getPropertyUseCode() {
        return propertyUseCode;
    }

    public void setPropertyUseCode(Integer propertyUseCode) {
        this.propertyUseCode = propertyUseCode;
    }

    public String getNarritative() {
        return narritative;
    }

    public void setNarritative(String narritative) {
        this.narritative = narritative;
    }

    public Set<ApparatusEntity> getApparatus() {
        return apparatus;
    }

    public void setApparatus(Set<ApparatusEntity> apparatus) {
        this.apparatus = apparatus;
    }

    public Set<StaffEntity> getStaff() {
        return staff;
    }

    public void setStaff(Set<StaffEntity> staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "IncidentEntity{" +
                "incidentId=" + incidentId +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", incidentTypeCode=" + incidentTypeCode +
                ", propertyUseCode=" + propertyUseCode +
                ", narritative='" + narritative + '\'' +
                ", apparatus=" + apparatus +
                ", staff=" + staff +
                '}';
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IncidentEntity that = (IncidentEntity) o;

        if (incidentId != that.incidentId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (incidentTypeCode != null ? !incidentTypeCode.equals(that.incidentTypeCode) : that.incidentTypeCode != null)
            return false;
        if (propertyUseCode != null ? !propertyUseCode.equals(that.propertyUseCode) : that.propertyUseCode != null)
            return false;
        if (narritative != null ? !narritative.equals(that.narritative) : that.narritative != null) return false;
        if (apparatusIncidentId != null ? !apparatusIncidentId.equals(that.apparatusIncidentId) : that.apparatusIncidentId != null)
            return false;
        if (staffIncidentId != null ? !staffIncidentId.equals(that.staffIncidentId) : that.staffIncidentId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = incidentId;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (incidentTypeCode != null ? incidentTypeCode.hashCode() : 0);
        result = 31 * result + (propertyUseCode != null ? propertyUseCode.hashCode() : 0);
        result = 31 * result + (narritative != null ? narritative.hashCode() : 0);
        result = 31 * result + (apparatusIncidentId != null ? apparatusIncidentId.hashCode() : 0);
        result = 31 * result + (staffIncidentId != null ? staffIncidentId.hashCode() : 0);
        return result;
    }
    */
}

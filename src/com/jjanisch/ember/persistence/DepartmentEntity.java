package com.jjanisch.ember.persistence;

/**
 * Created by Justin Janisch on 3/8/2016.
 */
public class DepartmentEntity {
    private int departmentId;
    private int nfirsId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String contactFirstName;
    private String contactLastName;
    private String contactPhone;
    private String contactEmail;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getNfirsId() {
        return nfirsId;
    }

    public void setNfirsId(int nfirsId) {
        this.nfirsId = nfirsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntity that = (DepartmentEntity) o;

        if (departmentId != that.departmentId) return false;
        if (nfirsId != that.nfirsId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (contactFirstName != null ? !contactFirstName.equals(that.contactFirstName) : that.contactFirstName != null)
            return false;
        if (contactLastName != null ? !contactLastName.equals(that.contactLastName) : that.contactLastName != null)
            return false;
        if (contactPhone != null ? !contactPhone.equals(that.contactPhone) : that.contactPhone != null) return false;
        if (contactEmail != null ? !contactEmail.equals(that.contactEmail) : that.contactEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departmentId;
        result = 31 * result + nfirsId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (contactFirstName != null ? contactFirstName.hashCode() : 0);
        result = 31 * result + (contactLastName != null ? contactLastName.hashCode() : 0);
        result = 31 * result + (contactPhone != null ? contactPhone.hashCode() : 0);
        result = 31 * result + (contactEmail != null ? contactEmail.hashCode() : 0);
        return result;
    }
}

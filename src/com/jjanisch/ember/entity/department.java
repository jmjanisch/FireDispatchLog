package com.jjanisch.ember.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Justin Janisch on 2/5/2016.
 */
@XmlRootElement
public class Department {

    private int departmentId;
    private int nfirsId;
    private String departmentName;
    private String departmentAddress;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String contactFirstName;
    private String contactLastName;
    private String contactEmail;

    public Department() {
    }

    public Department(int departmentId, int nfirsId, String departmentName, String departmentAddress, String city, String state, String zipcode, String phoneNumber, String contactFirstName, String contactLastName, String contactEmail) {
        this.departmentId = departmentId;
        this.nfirsId = nfirsId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.contactEmail = contactEmail;
    }

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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", nfirsId='" + nfirsId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contactFirstName='" + contactFirstName + '\'' +
                ", contactLastName='" + contactLastName + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }
}

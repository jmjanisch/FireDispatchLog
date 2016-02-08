package com.jjanisch.ember.entity;

/**
 * Created by Justin Janisch on 2/5/2016.
 */
public class Department {

    private int id;
    private String departmentNumber;
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

    public Department(int id, String departmentNumber, String departmentName, String departmentAddress, String city, String state, String zipcode, String phoneNumber, String contactFirstName, String contactLastName, String contactEmail) {
        this.id = id;
        this.departmentNumber = departmentNumber;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
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
                "id=" + id +
                ", departmentNumber='" + departmentNumber + '\'' +
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
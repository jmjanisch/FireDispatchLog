package com.jjanisch.ember.entity;

/**
 * Created by Justin Janisch on 3/8/2016.
 */
public class IncidentTypeEntity {
    private int code;
    private String description;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IncidentTypeEntity that = (IncidentTypeEntity) o;

        if (code != that.code) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}

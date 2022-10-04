package com.solvd.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Date;
@JsonRootName(value = "Equipment")
public class Equipment {
    @JsonProperty
    private int id;
    @JsonProperty
    private String type;
    @JsonProperty
    private Date usageDate;

    public Equipment(int id, String type, Date usageDate) {
        this.id = id;
        this.type = type;
        this.usageDate = usageDate;
    }
    public Equipment(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(Date usageDate) {
        this.usageDate = usageDate;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", usageDate=" + usageDate +
                '}';
    }
}

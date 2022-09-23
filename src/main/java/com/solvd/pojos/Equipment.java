package com.solvd.pojos;

import java.util.Date;

public class Equipment {
    private int id;
    private String type;
    private Date usageDate;

    public Equipment(int id, String type, Date usageDate) {
        this.id = id;
        this.type = type;
        this.usageDate = usageDate;
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
}

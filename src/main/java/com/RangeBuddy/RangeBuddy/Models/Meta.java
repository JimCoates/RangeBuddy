package com.RangeBuddy.RangeBuddy.Models;

import java.util.Date;

public class Meta {

    Firearm firearm;
    Double accuracy;
    Double consistency;
    Date date;

    public Meta (){}

    public Meta(Firearm firearm, Double accuracy, Double consistency, Date date) {
        this.firearm = firearm;
        this.accuracy = accuracy;
        this.consistency = consistency;
        this.date = date;
    }

    public Firearm getFirearm() {
        return firearm;
    }

    public void setFirearm(Firearm firearm) {
        this.firearm = firearm;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public Double getConsistency() {
        return consistency;
    }

    public void setConsistency(Double consistency) {
        this.consistency = consistency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

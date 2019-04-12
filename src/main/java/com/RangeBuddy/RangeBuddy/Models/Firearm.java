package com.RangeBuddy.RangeBuddy.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Firearm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    Enum firearmType;
    String caliber;


    public Firearm (Long id, String name, Enum firearmType, String caliber){
        this.id = id;
        this.name = name;
        this.firearmType = firearmType;
        this.caliber = caliber;
    }
    public Firearm (){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getFirearmType() {
        return firearmType;
    }

    public void setFirearmType(Enum firearmType) {
        this.firearmType = firearmType;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }
}

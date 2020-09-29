package com.mestal.socialapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name="Points")
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    private int Pointtype;
    private String Productid;
    private String Name;
    private String Description;
    private int Pointvalue;

    public Point() {

    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public int getPointtype() {
        return Pointtype;
    }

    public void setPointtype(int pointType) {
        Pointtype = pointType;
    }

    public String getProductid() {
        return Productid;
    }

    public void setProductid(String productId) {
        Productid = productId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPointvalue() {
        return Pointvalue;
    }

    public void setPointvalue(int pointValue) {
        Pointvalue = pointValue;
    }
}

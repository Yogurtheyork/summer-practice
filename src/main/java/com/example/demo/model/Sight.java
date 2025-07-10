package com.example.demo.model;

public class Sight implements java.io.Serializable{

    public Sight(){}

    ///  Attributes
    private String sightName;
    private String zone;
    private String category;
    private String photoURL;
    private String address;
    private String description;

    /// Get attributes
    public String getSightName() {
        return sightName;
    }
    public String getZone(){
        return zone;
    }
    public String getAddress() {
        return address;
    }
    public String getCategory() {
        return category;
    }
    public String getPhotoURL() {
        return photoURL;
    }
    public String getDescription(){return description;}

    /// Set attributes
    public void setAddress(String address) {
        this.address = address;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSightName(String sightName) {
        this.sightName = sightName;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "SightName: " + getSightName() + "\n" +
                "Zone: " + getZone() + "\n" +
                "Category: " + getCategory() + "\n" +
                "PhotoURL: " + getPhotoURL() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Address: " + getAddress() + "\n";
    }
}
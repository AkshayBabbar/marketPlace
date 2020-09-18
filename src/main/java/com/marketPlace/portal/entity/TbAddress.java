package com.marketPlace.portal.entity;

import java.io.Serializable;

public class TbAddress implements Serializable {
    Boolean isPermanent;
    private Long addressId;
    private String tel;
    private String streetName;
    private long Zip;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public long getZip() {
        return Zip;
    }

    public void setZip(long zip) {
        Zip = zip;
    }

    public Boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(Boolean permanent) {
        isPermanent = permanent;
    }
}

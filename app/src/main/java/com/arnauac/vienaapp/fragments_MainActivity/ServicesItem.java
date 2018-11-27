package com.arnauac.vienaapp.fragments_MainActivity;

public class ServicesItem {
    private Boolean wifi, terrace, autoViena, parking;

    public ServicesItem(Boolean wifi, Boolean terrace, Boolean autoViena, Boolean parking) {
        this.wifi = wifi;
        this.terrace = terrace;
        this.autoViena = autoViena;
        this.parking = parking;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getTerrace() {
        return terrace;
    }

    public void setTerrace(Boolean terrace) {
        this.terrace = terrace;
    }

    public Boolean getAutoViena() {
        return autoViena;
    }

    public void setAutoViena(Boolean autoViena) {
        this.autoViena = autoViena;
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }
}

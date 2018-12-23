package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

class ServicesItem {
    Boolean wifi, terrace, autoViena, parking, playground;

    public ServicesItem(){

    }

    public ServicesItem(Boolean wifi, Boolean terrace, Boolean autoViena, Boolean parking, Boolean playground) {
        this.wifi = wifi;
        this.terrace = terrace;
        this.autoViena = autoViena;
        this.parking = parking;
        this.playground = playground;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public Boolean getTerrace() {
        return terrace;
    }

    public Boolean getAutoViena() {
        return autoViena;
    }

    public Boolean getParking() {
        return parking;
    }

    public Boolean getPlayground() {
        return playground;
    }
}

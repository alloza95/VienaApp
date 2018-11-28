package com.arnauac.vienaapp.fragments_MainActivity;

class ServicesItem {
    private Boolean wifi, terrace, autoViena, parking, playground;

    ServicesItem(Boolean wifi, Boolean terrace, Boolean autoViena, Boolean parking, Boolean playground) {
        this.wifi = wifi;
        this.terrace = terrace;
        this.autoViena = autoViena;
        this.parking = parking;
        this.playground = playground;
    }

    Boolean getWifi() {
        return wifi;
    }

    Boolean getTerrace() {
        return terrace;
    }

    Boolean getAutoViena() {
        return autoViena;
    }

    Boolean getParking() {
        return parking;
    }

    Boolean getPlayground() {
        return playground;
    }
}

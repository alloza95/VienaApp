package com.arnauac.vienaapp.fragments_MainActivity;

class ServicesItem {
    private Boolean wifi, terrace, autoViena, parking;

    ServicesItem(Boolean wifi, Boolean terrace, Boolean autoViena, Boolean parking) {
        this.wifi = wifi;
        this.terrace = terrace;
        this.autoViena = autoViena;
        this.parking = parking;
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
}

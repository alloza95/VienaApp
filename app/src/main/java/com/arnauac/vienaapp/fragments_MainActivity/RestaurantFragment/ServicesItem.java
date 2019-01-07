package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

import java.io.Serializable;

class ServicesItem implements Serializable {
    private Boolean wifi, terrace, autoViena, parking, playground;

    public ServicesItem(){

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

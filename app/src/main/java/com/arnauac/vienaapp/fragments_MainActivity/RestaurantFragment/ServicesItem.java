package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

import java.io.Serializable;

class ServicesItem implements Serializable {
    Boolean wifi, terrace, autoViena, parking, playground;

    public ServicesItem(){

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

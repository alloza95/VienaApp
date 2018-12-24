package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

import java.io.Serializable;

class RestaurantItem implements Serializable {

     String nameRestaurant, streetRestaurant, numberRestaurant, codepostRestaurant, townRestaurant, telephonRestaurant;
     String horaryRestaurant, descriptionRestaurant;
     ServicesItem services;

     public RestaurantItem(){

     }

    public RestaurantItem(String nameRestaurant, String streetRestaurant, String numberRestaurant, String codepostRestaurant, String townRestaurant, String telephonRestaurant, String horaryRestaurant, String descriptionRestaurant, ServicesItem servicesItem) {
        this.nameRestaurant = nameRestaurant;
        this.streetRestaurant = streetRestaurant;
        this.numberRestaurant = numberRestaurant;
        this.codepostRestaurant = codepostRestaurant;
        this.townRestaurant = townRestaurant;
        this.telephonRestaurant = telephonRestaurant;
        this.horaryRestaurant = horaryRestaurant;
        this.descriptionRestaurant = descriptionRestaurant;
        this.services = servicesItem;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public String getStreetRestaurant() {
        return streetRestaurant;
    }

    public String getNumberRestaurant() {
        return numberRestaurant;
    }

    public String getCodepostRestaurant() {
        return codepostRestaurant;
    }

    public String getTownRestaurant() {
        return townRestaurant;
    }

    public ServicesItem getServices() {
        return services;
    }

    public String getTelephonRestaurant() {
        return telephonRestaurant;
    }

    public String getHoraryRestaurant() {
        return horaryRestaurant;
    }

    public String getDescriptionRestaurant() {
        return descriptionRestaurant;
    }
}

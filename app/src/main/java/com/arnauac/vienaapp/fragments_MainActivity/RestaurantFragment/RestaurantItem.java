package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

import java.io.Serializable;

class RestaurantItem implements Serializable {

     String nameRestaurant, streetRestaurant, numberRestaurant, codepostRestaurant, townRestaurant, telephonRestaurant;
     String horaryRestaurant, descriptionRestaurant, imageRestaurant;
     ServicesItem services;

     public RestaurantItem(){

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

    public String getImageRestaurant() {
        return imageRestaurant;
    }
}

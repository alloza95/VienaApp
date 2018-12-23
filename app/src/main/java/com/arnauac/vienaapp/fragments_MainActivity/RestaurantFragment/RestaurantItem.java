package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

class RestaurantItem {

     String nameRestaurant, streetRestaurant, numberRestaurant, codepostRestaurant, townRestaurant;
     ServicesItem services;

     public RestaurantItem(){

     }

    public RestaurantItem(String nameRestaurant, String streetRestaurant, String numberRestaurant, String codepostRestaurant, String townRestaurant, ServicesItem servicesItem) {
        this.nameRestaurant = nameRestaurant;
        this.streetRestaurant = streetRestaurant;
        this.numberRestaurant = numberRestaurant;
        this.codepostRestaurant = codepostRestaurant;
        this.townRestaurant = townRestaurant;
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
}

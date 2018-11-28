package com.arnauac.vienaapp.fragments_MainActivity;

class RestaurantItem {

    private String nameRestaurant, streetRestaurant, numberRestaurant, codepostRestaurant, townRestaurant;
    private ServicesItem services;

    RestaurantItem(String nameRestaurant, String streetRestaurant, String numberRestaurant, String codepostRestaurant, String townRestaurant, ServicesItem servicesItem) {
        this.nameRestaurant = nameRestaurant;
        this.streetRestaurant = streetRestaurant;
        this.numberRestaurant = numberRestaurant;
        this.codepostRestaurant = codepostRestaurant;
        this.townRestaurant = townRestaurant;
        this.services = servicesItem;
    }

    String getNameRestaurant() {
        return nameRestaurant;
    }

    String getStreetRestaurant() {
        return streetRestaurant;
    }

    String getNumberRestaurant() {
        return numberRestaurant;
    }

    String getCodepostRestaurant() {
        return codepostRestaurant;
    }

    String getTownRestaurant() {
        return townRestaurant;
    }

    ServicesItem getServices() {
        return services;
    }
}

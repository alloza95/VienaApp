package com.arnauac.vienaapp.fragments_MainActivity;

public class RestaurantItem {

    private String nameRestaurant, streetRestaurant, numberRestaurant, codepostRestaurant, townRestaurant;

    public RestaurantItem(String nameRestaurant, String streetRestaurant, String numberRestaurant, String codepostRestaurant, String townRestaurant) {
        this.nameRestaurant = nameRestaurant;
        this.streetRestaurant = streetRestaurant;
        this.numberRestaurant = numberRestaurant;
        this.codepostRestaurant = codepostRestaurant;
        this.townRestaurant = townRestaurant;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public String getStreetRestaurant() {
        return streetRestaurant;
    }

    public void setStreetRestaurant(String streetRestaurant) {
        this.streetRestaurant = streetRestaurant;
    }

    public String getNumberRestaurant() {
        return numberRestaurant;
    }

    public void setNumberRestaurant(String numberRestaurant) {
        this.numberRestaurant = numberRestaurant;
    }

    public String getCodepostRestaurant() {
        return codepostRestaurant;
    }

    public void setCodepostRestaurant(String codepostRestaurant) {
        this.codepostRestaurant = codepostRestaurant;
    }

    public String getTownRestaurant() {
        return townRestaurant;
    }

    public void setTownRestaurant(String townRestaurant) {
        this.townRestaurant = townRestaurant;
    }
}

public class Car {
    String brand;
    float engineVolume;
    String model;
    String color;
    int year;
    String country;

    Car(String brand, String model, float engineVolume, String color, String country, int year) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

        if (brand == null || brand.trim().isEmpty()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.trim().isEmpty()) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.trim().isEmpty()) {
            this.country = "Default";
        } else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.7f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.trim().isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

    }

    void go(){
        System.out.println(" Марка машины " + this.brand + " модель " + this.model + "объём двигателя " + this.engineVolume + " литров " + "цвет " + this.color + "год выпуска "+ this.year + " страна " +this.country);
    }}



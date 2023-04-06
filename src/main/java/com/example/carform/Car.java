package com.example.carform;

import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Car {
        private String path;
        private String carMake;
        private String carModel;
        private int carYear;




    // Constructor to initialize the instance variables
        public Car(String path, String carMake, String carModel, int carYear) {
            this.path = path;
            this.carMake = carMake;
            this.carModel = carModel;
            this.carYear = carYear;
        }


    // Getter methods for instance variables
        public String getCarMake() {
            return carMake;
        }

        public String getCarModel() {
            return carModel;
        }

        public int getCarYear() {
            return carYear;
        }


        // Setter methods for instance variables

        public void setPath(String path) {
            this.path = path;
        }
        public void setCarMake(String carMake) {
            this.carMake = carMake;
        }

        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }

        public void setCarYear(int carYear) {
            this.carYear = carYear;
        }

        public Image getImage()
        {
            return new Image(Car.class.getResourceAsStream(path));
        }

}



package com.example.carform;

import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Car {
        private String path;
        private String carMake;
        private String carModel;
        private int carYear;

    public String getPath() {
        return path;
    }

    // Constructor to initialize the instance variables
        public Car(String carMake, String carModel, int carYear) {
            setCarMake(carMake);
            setCarModel(carModel);
            setCarYear(carYear);
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
            for (char character : carMake.toCharArray()) {
                if(Character.isDigit(character)) {
                    throw new IllegalArgumentException("Make does not have a number");
                }
            }
            this.carMake = carMake;
        }

        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }

        public void setCarYear(int carYear) {
            if (carYear < 1900 || carYear > 2023) {
                throw new IllegalArgumentException("Invalid year: must be between 1900 and 2023");
            }
            this.carYear = carYear;
        }

    @Override
    public String toString() {
        return getCarModel();
    }

    public Image getImage()
        {
            path = "Images/" + carMake + ".png";
            return new Image(Car.class.getResourceAsStream(path));
        }

        public Image defaultImage(){
        return new Image(Car.class.getResourceAsStream("Images/Default.png"));
        }

}



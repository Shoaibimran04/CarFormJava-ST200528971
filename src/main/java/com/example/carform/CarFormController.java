package com.example.carform;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class CarFormController implements Initializable {

    @FXML
    Label carYear, carMake, carModel;

    @FXML
    Car Car1, Car2, Car3;

    @FXML
    private ImageView carImageView;

    @FXML
    private TextField modelField;

    @FXML
    private TextField makeField;

    @FXML
    private TextField yearField;

    @FXML
    private Button addToListButton;

    @FXML
    private ListView<String> carListView;

    @FXML
    private Label errorLabel;

    private ListView<ImageView> imageList;
    private ShowRoom showRoom;

    @FXML
    Button myButton;
    int i = 0;

    @FXML
    public void DisplayImage() {
        System.out.println(i);
        i++;
        if (i == 4) {
            i = 1;
        }
        if (i == 1) {
            carImageView.setImage(Car1.getImage());
            carYear.setText(Integer.toString(Car1.getCarYear()));
            carModel.setText(Car1.getCarModel());
            carMake.setText(Car1.getCarMake());
        }
        if (i == 2) {
            carImageView.setImage(Car2.getImage());
            carYear.setText(Integer.toString(Car2.getCarYear()));
            carModel.setText(Car2.getCarModel());
            carMake.setText(Car2.getCarMake());

        }
        if (i == 3) {
            carImageView.setImage(Car3.getImage());
            carYear.setText(Integer.toString(Car3.getCarYear()));
            carModel.setText(Car3.getCarModel());
            carMake.setText(Car3.getCarMake());


        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Car Car1 = new Car("Images/Bmw1.jpg", "Bmw", "328i", 2013);
        Car Car2 = new Car("Images/Mercedes.jpg", "Mercedes", "Benz", 2020);
        Car Car3 = new Car("Images/Toyota.jpeg", "Toyota", "Highlander", 2021);
        showRoom = new ShowRoom();

        carListView.getItems().add(Car1.getCarModel());
        carListView.getItems().add(Car2.getCarModel());
        carListView.getItems().add(Car3.getCarModel());
        showRoom.addCar(Car1);
        showRoom.addCar(Car2);
        showRoom.addCar(Car3);

    }

    @FXML
    void addToList() {
        String model = modelField.getText();
        String make = makeField.getText();
        String yearStr = yearField.getText();


        // This Constructs the car information string and add it to the list view
        String carInfo = model + " " + make + " " + yearStr;
//        showRoom.addCar();
        carListView.getItems().add(carInfo);
        modelField.clear();
        makeField.clear();
        yearField.clear();

        // This section is about errors

        int year = 0;
        try {
            year = Integer.parseInt(yearStr);
        } catch (NumberFormatException e) {
            errorLabel.setText("Invalid year: must be a number");
            return;
        }

        if (make.isEmpty()) {
            errorLabel.setText("Make is required");
            return;
        }

        if (model.isEmpty()) {
            errorLabel.setText("Model is required");
            return;
        }

        if (year < 1900 || year > 2023) {
            errorLabel.setText("Invalid year: must be between 1900 and 2023");
            return;
        }

        // Prints out data with the car info
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

        // This Clears the form and error label
        makeField.setText("");
        modelField.setText("");
        yearField.setText("");
        errorLabel.setText("");

    }
    @FXML
    void DisplayShowRoom(MouseEvent event) {

        if(!(carListView.getSelectionModel().getSelectedIndex() == -1)) {
            carImageView.setImage(showRoom.getCarsInShowRoom().get(carListView.getSelectionModel().getSelectedIndex()).getImage());
            carModel.setText(showRoom.getCarsInShowRoom().get(carListView.getSelectionModel().getSelectedIndex()).getCarModel());
            carMake.setText(showRoom.getCarsInShowRoom().get(carListView.getSelectionModel().getSelectedIndex()).getCarMake());
            carYear.setText(Integer.toString(showRoom.getCarsInShowRoom().get(carListView.getSelectionModel().getSelectedIndex()).getCarYear()));
        }
    }
}












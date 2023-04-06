package com.example.carform;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ShowRoom  {
    private ArrayList<Car> carListView;

    public ShowRoom() {
        this.carListView = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        this.carListView.add(car);
    }

    public ArrayList<Car> getCarsInShowRoom() {
        return this.carListView;
    }

//    come back to this!

}

package com.example.carform;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CarTest {
    private Car car;


    @org.junit.Before
    public void setUp() throws Exception {
        car  = new Car("Bmw", "328i",2020);
    }

    @org.junit.Test
    public void setPath() {
        car.setPath("Images/Toyota.jpeg");
        assertEquals("Images/Toyota.jpeg", car.getPath());
    }

    @org.junit.Test
    public void setCarMake() {
        car.setCarMake("Toyota");
        assertEquals("Toyota", car.getCarMake());
    }

    @org.junit.Test
    public void setCarMakeInvalid() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            car.setCarMake("highlander1");
        });

    }

    @org.junit.Test
    public void setCarModel() {
        car.setCarModel("Toyota");
        assertEquals("Toyota", car.getCarModel());
    }

    @org.junit.Test
    public void setCarYear() {
        car.setCarYear(2020);
        assertEquals(2020, car.getCarYear());
    }

    @org.junit.Test
    public void setCarYearInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            car.setCarYear(2030);
        });
    }
}
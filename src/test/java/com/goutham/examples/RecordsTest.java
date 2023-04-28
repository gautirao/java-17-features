package com.goutham.examples;

import com.goutham.records.CarClass;
import com.goutham.records.CarRecord;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class RecordsTest {

    @Test
    void givenDtoClass_whenInstantiatingIt_propertiesCanBeRetrieved() {
        CarClass car = new CarClass("Hyundai", "Tuscon");
        assertAll(
                        () -> assertThat(car.getMake()).isEqualTo("Hyundai"),
                        () -> assertThat(car.getModel()).isEqualTo("Tuscon"));
    }
    
    @Test
    void givenRecord_whenInstantiatingIt_propertiesCanBeRetrieved() {
        CarRecord car = new CarRecord("Hyundai", "Tuscon");
        assertAll(
                        () -> assertThat(car.make()).isEqualTo("Hyundai"),
                        () -> assertThat(car.model()).isEqualTo("Tuscon"));
    }
    
}

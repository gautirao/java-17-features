package com.goutham.sealed;

public sealed interface Vehicle permits Car, Truck {

    String registrationNumber();

}
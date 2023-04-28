package com.goutham;

import com.goutham.records.CarClass;

public class NullPointerDemo {
    public static void makeNullPointer() {
        CarClass car = null;
        car.getMake();
    }
}

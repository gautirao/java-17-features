package com.goutham;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomNumberGenerator {
    public static int randomGeneratorOldSchool(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static int randomGeneratorNewFactory(int bound) {
        RandomGenerator generator = RandomGeneratorFactory.getDefault().create();
        return generator.nextInt(bound);
    }

    public static int randomGeneratorNewInterface(int bound) {
        RandomGenerator generator = RandomGenerator.getDefault();
        return generator.nextInt(bound);
    }

}

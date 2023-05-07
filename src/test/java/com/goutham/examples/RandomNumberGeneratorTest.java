package com.goutham.examples;

import com.goutham.RandomNumberGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RandomNumberGeneratorTest {
    @Test
    void givenBound_whenUsingOldRngApi_thenNumberIsExpectedRangeIsGenerated() {
        int actual = RandomNumberGenerator.randomGeneratorOldSchool(10);
        assertThat(actual).isNotNegative().isLessThan(10);
    }

    @Test
    void givenBound_whenUsingNewFactoryApi_thenNumberIsExpectedRangeIsGenerated() {
        int actual = RandomNumberGenerator.randomGeneratorNewFactory(10);
        assertThat(actual).isNotNegative().isLessThan(10);
    }

    @Test
    void givenBound_whenUsingNewInterfaceApi_thenNumberIsExpectedRangeIsGenerated() {
        int actual = RandomNumberGenerator.randomGeneratorNewInterface(10);
        assertThat(actual).isNotNegative().isLessThan(10);
    }

}

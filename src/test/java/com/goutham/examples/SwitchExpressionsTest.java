package com.goutham.examples;
import com.goutham.SwitchExpressions;
import com.goutham.enums.Day;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class SwitchExpressionsTest{


    @Test
    void givenOldImpl_whenGettingNumberOfLettersForSunday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersOldSchool(Day.SUNDAY);
        assertThat(actual).isEqualTo(6);
    }



    @Test
    void givenEnhancedSwitch_whenGettingNumberOfLettersForSaturday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersEnhancedSwitch(Day.SATURDAY);
        assertThat(actual).isEqualTo(8);
    }
}



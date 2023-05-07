package com.goutham.examples;
import com.goutham.NullPointerDemo;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class NullPointerDemoTest {
    @Test
    void givenMethodThatThrowsNullPointer_whenInvokingIt_thenMessageContainersVariableName() {

        assertThatThrownBy(NullPointerDemo::makeNullPointer).hasMessageContaining("because \"car\" is null");
    }
}

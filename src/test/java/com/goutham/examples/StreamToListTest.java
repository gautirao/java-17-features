package com.goutham.examples;

import com.goutham.StreamToList;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
public class StreamToListTest {
    @Test
    void givenStream_whenUsingCollectors_thenExpectedListIsReturned() {
        List<String> actual = StreamToList.toListOldSchool(Stream.of("Marko", "Pero", "Maja"));
        assertThat(actual).containsExactly("MARKO", "PERO", "MAJA");
    }

    @Test
    void givenStream_whenUsingToList_thenExpectedListIsReturned() {
        List<String> actual = StreamToList.toListNew(Stream.of("Marko", "Pero", "Maja"));
        assertThat(actual).containsExactly("MARKO", "PERO", "MAJA");
    }

}

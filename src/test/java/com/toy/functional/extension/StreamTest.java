package com.toy.functional.extension;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    private List<String> userNames;

    @Before
    public void setup() {
        userNames = Stream.of("mzheng", "tChang", "aWang").collect(Collectors.toList());
    }

    @Test
    public void search() {
        Predicate<String> startWithA = name -> name.startsWith("a");
        List<String> startWithANames = userNames.stream().filter(startWithA).collect(Collectors.toList());
        assertEquals("aWang", startWithANames.get(0));
    }

    @Test
    public void IntStream_sum() {
        int sum = IntStream.of(1, 3, 5, 7, 9).sum();
        assertEquals(25, sum);
    }

    @Test
    public void transform() {
        List<String> uppercaseNames = userNames.stream().map(String::toUpperCase).collect(Collectors.toList());
        assertTrue(uppercaseNames.contains("MZHENG"));
        assertTrue(uppercaseNames.contains("AWANG"));
        assertTrue(uppercaseNames.contains("TCHANG"));
    }

    @Test
    public void min() {
        Comparator<String> comparator = Comparator.comparing(String::length);
        Optional<String> shortestName = userNames.stream().min(comparator);
        assertTrue(shortestName.isPresent());
        assertEquals("aWang", shortestName.get());

        Optional<String> longestName = userNames.stream().max(comparator);
        assertTrue(longestName.isPresent());
        assertEquals("mzheng", longestName.get());
    }

    @Test
    public void print_elements_via_loop() {
        for (String name : userNames) {
            System.out.println(name);
        }
    }

    @Test
    public void print_elements_via_Iterator() {
        Iterator<String> i = userNames.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    @Test
    public void print_elements_via_stream() {
        // Internal iterator
        userNames.stream().forEach(System.out::println);
    }

    @Test
    public void sort() {
        List<String> sortedNames = userNames.stream().sorted().collect(Collectors.toList());
        assertEquals("aWang", sortedNames.get(0));
        assertEquals("mzheng", sortedNames.get(1));
        assertEquals("tChang", sortedNames.get(2));
    }
}

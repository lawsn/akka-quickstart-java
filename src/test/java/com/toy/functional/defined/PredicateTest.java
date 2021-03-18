package com.toy.functional.defined;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {

    @Test
    public void BiPredicate_whichIsBigger() {
        BiPredicate<Integer, Integer> isBigger = (x, y) -> x > y;
        assertTrue(isBigger.test(5, 4));
        assertTrue(isBigger.negate().test(4, 5));
    }

    @Test
    public void DoublePredicate_test_isPositive() {
        DoublePredicate isPositive = x -> x > 0;
        assertTrue(isPositive.test(1.5));
        assertFalse(isPositive.test(-1.7));
    }

    @Test
    public void IntPredicate_test_isNagative() {
        IntPredicate isNagative = x -> x < 0;
        assertTrue(isNagative.test(-1));
        assertFalse(isNagative.test(1));
    }

    @Test
    public void LongPredicate_test_isDivisibleByThree() {
        LongPredicate isDivisibleBy3 = x -> x % 3 == 0;
        assertTrue(isDivisibleBy3.test(12));
        assertTrue(isDivisibleBy3.negate().test(11));
    }

    @Test
    public void Predicate_combine_two_predicates() {
        // takes one argument and return a boolean
        Predicate<String> stringIsLongerThanTen = s -> s.length() > 10;
        assertTrue(stringIsLongerThanTen.test("This string is longer than 10"));
        assertFalse(stringIsLongerThanTen.test("short"));

        Predicate<String> stringStartWithA = s -> s.startsWith("A");
        assertTrue(stringStartWithA.test("Apple is a fruit"));

        Predicate<String> startWithAandLongerThan10 = stringIsLongerThanTen.and(stringStartWithA);
        assertTrue(startWithAandLongerThan10.test("Apple is a fruit which grows everywhere."));
    }

    @Test
    public void Predicate_test_integer_isEven() {
        Predicate<Integer> isEven = s -> s % 2 == 0;
        assertTrue(isEven.test(4));
        assertFalse(isEven.test(5));
    }

    @Test
    public void stream_filter_via_lambda() {
        Stream.of("Apple", "Pear", "Banana", "Cherry", "Apricot").filter(fruit -> {
            System.out.println("filter:" + fruit);
            return fruit.startsWith("A");
        }).forEach(fruit -> System.out.println("Started with A:" + fruit));
    }
}

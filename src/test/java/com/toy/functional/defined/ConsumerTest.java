package com.toy.functional.defined;

import org.junit.Test;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjLongConsumer;

public class ConsumerTest {

    @Test
    public void BiConsumer_printout() {
        BiConsumer<String, String> echo = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        echo.accept("This is first line.", "Here is another line");
    }

    @Test
    public void Consumer_convertToLowercase_via_lambda() {
        Consumer<String> convertToLowercase = s -> System.out.println((s.toLowerCase()));
        convertToLowercase.accept("This Will convert to all lowercase");
    }

    @Test
    public void Consumer_print_prefix() {
        Consumer<String> sayHello = name -> System.out.println("Hello, " + name);
        for (String name : Arrays.asList("Mary", "Terry", "John")) {
            sayHello.accept(name);
        }
    }

    @Test
    public void Consumer_print_via_methodRef() {
        Consumer<String> output = System.out::println;
        output.accept("This will be printed out.");
    }

    @Test
    public void DoubleConsumer_printout() {
        DoubleConsumer echo = System.out::println;
        echo.accept(3.3);
    }

    @Test
    public void IntConsumer_printout() {
        IntConsumer echo = System.out::println;
        echo.accept(3);
    }

    @Test
    public void LongConsumer_printout() {
        LongConsumer echo = System.out::println;
        echo.accept(3L);
    }

    @Test
    public void ObjDoubleConsumer_calculate_circle_circumference() {
        ObjDoubleConsumer<Double> circleCircumference = (r, p) -> System.out.println("Circumference: " + 2 * r * p);
        circleCircumference.accept(new Double(4.0), Math.PI);
    }

//    @Test
//    public void ObjIntConsumer_alterContactAge() {
//        ObjIntConsumer<Contact> addThreeYear = (c, a) -> {
//            c.setAge(c.getAge() + a);
//            System.out.println("Updated contact" + c);
//        };
//        addThreeYear.accept(DataUtil.buildContact("mxheng", "pwd", 40), 3);
//    }

    @Test
    public void ObjLongConsumer() {
        ObjLongConsumer<String> appendex = (m, l) -> {
            System.out.println("Append " + m + l);
        };
        appendex.accept("test message", 10L);
    }
}

package com.toy.functional.defined;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierTest {

    @Test
    public void BooleanSupplier_getAsBoolean() {
        BooleanSupplier booleanSupplier = () -> true;
        assertTrue(booleanSupplier.getAsBoolean());
    }

    @Test
    public void DoubleSupplier_getAsDouble() {
        DoubleSupplier pi = () -> Math.PI;
        assertEquals(3.14, pi.getAsDouble(), 0.01);
    }

    @Test
    public void LongSupplier_getAsLong() {
        LongSupplier maxLongValue = () -> Long.MAX_VALUE;
        assertEquals(9223372036854775807L, maxLongValue.getAsLong());
    }

    @Test
    public void Supplier_AString() {
        Supplier<String> message = () -> "Mary is fun";
        assertEquals("Mary is fun", message.get());
    }
}

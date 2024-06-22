package h.morales.artmonocle

import org.junit.Test
import h.morales.artmonocle.utils.Calculator

import org.junit.Assert.*

class CalculatorUnitTest {

    @Test
    fun getA_is_correct() {
        val ab = 9.0f
        val a = Calculator.getA(ab)
        assertEquals(a, 5.5624228f)
    }

    @Test
    fun getB_is_correct() {
        val ab = 9.0f
        val b = Calculator.getB(ab)
        assertEquals(b, 3.4375772f)
    }

    // return an array of Lines that make up
    // Golden Nautilus
}
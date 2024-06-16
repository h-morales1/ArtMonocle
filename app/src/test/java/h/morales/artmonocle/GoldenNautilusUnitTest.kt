package h.morales.artmonocle

import org.junit.Test
import h.morales.artmonocle.utils.Calculator
import h.morales.artmonocle.utils.GoldenNautilus
import h.morales.artmonocle.utils.Line

import org.junit.Assert.*
class GoldenNautilusUnitTest {
    // Get the first horizontal line for Golden
    // Nautilus
    @Test
    fun getFirstLine() {
        val ab = 25f
        val expected_a = Calculator.getA(ab)
        val expected_b = Calculator.getB(ab)
        var gnaut = GoldenNautilus(ab)
        var firstL = gnaut.lineOne
        assertEquals(gnaut.a, expected_a)
        assertEquals(0f, firstL.ax)
        assertEquals(expected_a, firstL.ay)
        assertEquals(expected_a, firstL.bx)
        assertEquals(expected_a, firstL.by)

        // given entire length of frame, produce first horizontal line

    }
}
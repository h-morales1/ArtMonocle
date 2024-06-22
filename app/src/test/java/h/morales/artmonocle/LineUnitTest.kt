package h.morales.artmonocle

import org.junit.Test
import h.morales.artmonocle.utils.Line
import org.junit.Assert.*

class LineUnitTest {

    @Test
    fun getAX() {
        val obj = Line(0f,0f,0f,0f)
        val s = obj.ax
        assertEquals(s, 0f)
    }

    @Test
    fun setAX() {
        val obj = Line(2f, 0f, 0f, 0f)
        obj.ax = 2f
        assertEquals(obj.ax, 2f)
    }
}
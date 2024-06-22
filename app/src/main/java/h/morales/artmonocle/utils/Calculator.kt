package h.morales.artmonocle.utils

object Calculator {
    val fi = 1.618f

    fun getA(ab: Float): Float {
        return (ab / fi)
    }

    fun getB(ab: Float): Float {
        return (ab - getA(ab))
    }
}
package h.morales.artmonocle.utils

class GoldenNautilus(val ab: Float) {
    var a: Float = 0f
    var b: Float = 0f
    val lineOne: Line
    init {
        a = Calculator.getA(ab)
        b = Calculator.getB(ab)
        lineOne = Line(0f, a, a, a)

    }
}
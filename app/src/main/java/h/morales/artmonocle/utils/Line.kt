package h.morales.artmonocle.utils

class Line(ax: Float = 0f, ay: Float = 0f, bx: Float = 0f, by: Float = 0f) {
    // basically ax,ay => x,y for START
    var ax: Float
    var ay: Float

    var bx: Float
    var by: Float
    init {
        this.ax = ax
        this.ay = ay
        this.bx = bx
        this.by = by
    }

}
package h.morales.artmonocle.composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import h.morales.artmonocle.utils.GoldenNautilus

@Composable
fun GoldenRuleOverlay() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight= size.height
        val ab = size.height
        val gnaut = GoldenNautilus(size.height)
        val la = gnaut.lineOne
        val fi = 1.618f
        val a = (ab / fi) // this is your Y
        val b = (ab - a)

        // verticals
        val hab = size.width
        val ha = (hab / fi)
        val hb = (hab - ha)

        drawLine(
            start = Offset( x = canvasWidth / 2, y = 0f),
            end = Offset( x = canvasWidth / 2, y = canvasHeight),
            color = Color.Red,
        )

        // verticals

        drawLine(
            start =  Offset( x = ha, y = 0f),
            end = Offset ( x = ha, y = canvasHeight),
            color = Color.Red,
            strokeWidth = 10f,
        )

        drawLine(
            start = Offset( x = hb, y = 0f),
            end = Offset( x = hb, y = canvasHeight),
            color = Color.Red,
            strokeWidth = 10f,
        )


        // horizontals


/*        drawLine(
            start = Offset(x = 0f, y = a),
            end = Offset(x = canvasWidth, y =  a),
            color = Color.Magenta,
            strokeWidth = 10f,
        )*/
        drawLine(
            start = Offset(x = la.ax, y = la.ay),
            end = Offset(x = la.bx, y =  la.by),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f,10f), 10f),
            color = Color.Magenta,
            strokeWidth = 10f,
        )
        drawLine(
            start = Offset(x = 0f, y = b),
            end = Offset(x = canvasWidth, y = b),
            color = Color.Green,
            strokeWidth = 10f,
        )

    }
}
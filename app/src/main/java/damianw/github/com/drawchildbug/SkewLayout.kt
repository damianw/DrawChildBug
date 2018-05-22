package damianw.github.com.drawchildbug

import android.content.Context
import android.graphics.Canvas
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.View

/**
 * Skews children by (0.5, 0).
 */
class SkewLayout @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    override fun drawChild(canvas: Canvas, child: View, drawingTime: Long): Boolean {
        canvas.save()
        canvas.skew(0.5f, 0f)
        val result = super.drawChild(canvas, child, drawingTime)
        canvas.restore()
        return result
    }

}

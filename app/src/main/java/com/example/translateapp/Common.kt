package com.example.translateapp

import android.content.Context
import android.graphics.Rect
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import com.google.android.material.card.MaterialCardView

class Common {
companion object {
    fun changeCardViewHeight(context: Context, cardView: MaterialCardView, newHeightInDp: Int) {
        // Convert dp to pixels
        val newHeightInPx = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            newHeightInDp.toFloat(),
            context.resources.displayMetrics
        ).toInt()

        // Get current LayoutParams
        val layoutParams = cardView.layoutParams as ViewGroup.MarginLayoutParams

        // Set new height
        layoutParams.height = newHeightInPx

        // Apply the new LayoutParams to the MaterialCardView
        cardView.layoutParams = layoutParams
    }

}
}
package org.sopt.bindingexample

import android.view.View
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["app:progressScaled", "android:max"], requireAll = true)
fun setProgress(progressBar: ProgressBar, likes: Int, max: Int) {
    progressBar.progress = (likes * max / 100).coerceAtMost(max)
    /**coerceAtMost
     * Ensures that this value is not greater than the specified maximumValue.
     * Returns:
     * this value if it's less than or equal to the maximumValue or the maximumValue otherwise.
     * */
}

@BindingAdapter("app:hideIfZero")
fun hideIfZero(view: View, number: Int) {
    view.visibility = if (number == 0) View.GONE else View.VISIBLE
}

/*
@BindingAdapter("app:hideIfZero2")
fun View.hideIfZero2(number: Int) {
    this.visibility = if (number == 0) View.GONE else View.VISIBLE
}
 */

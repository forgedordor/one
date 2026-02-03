package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvkw implements View.OnLayoutChangeListener {
    final /* synthetic */ ImageView a;

    public cvkw(ImageView imageView) {
        this.a = imageView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != 0) {
            ImageView imageView = this.a;
            RippleDrawable rippleDrawable = (RippleDrawable) imageView.getForeground();
            if (rippleDrawable != null) {
                rippleDrawable.setHotspotBounds(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getWidth() - imageView.getPaddingRight(), imageView.getHeight() - imageView.getPaddingBottom());
            }
            imageView.removeOnLayoutChangeListener(this);
        }
    }
}

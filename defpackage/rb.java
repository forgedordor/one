package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rb {
    private final ImageView a;
    private int b = 0;

    public rb(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        ImageView imageView = this.a;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.b);
        }
    }

    public final void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            th.c(drawable);
        }
    }

    public final void c(AttributeSet attributeSet, int i) {
        int iF;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = kt.g;
        yx yxVarL = yx.l(context, attributeSet, iArr, i, 0);
        ley.o(imageView, imageView.getContext(), iArr, attributeSet, yxVarL.b, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (iF = yxVarL.f(1, -1)) != -1 && (drawable = ku.a(imageView.getContext(), iF)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                th.c(drawable);
            }
            if (yxVarL.q(2)) {
                imageView.setImageTintList(yxVarL.g(2));
            }
            if (yxVarL.q(3)) {
                imageView.setImageTintMode(th.a(yxVarL.c(3, -1), null));
            }
        } finally {
            yxVarL.o();
        }
    }

    public final void d(Drawable drawable) {
        this.b = drawable.getLevel();
    }

    public final void e(int i) {
        if (i != 0) {
            ImageView imageView = this.a;
            Drawable drawableA = ku.a(imageView.getContext(), i);
            if (drawableA != null) {
                th.c(drawableA);
            }
            imageView.setImageDrawable(drawableA);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }

    public final boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }
}

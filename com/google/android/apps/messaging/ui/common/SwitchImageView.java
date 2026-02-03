package com.google.android.apps.messaging.ui.common;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.cqaz;
import defpackage.cvjp;
import defpackage.cvjq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SwitchImageView extends AppCompatImageView {
    private int a;
    private final SparseArray b;
    private ValueAnimator c;
    private ValueAnimator d;

    public SwitchImageView(Context context) {
        super(context);
        this.a = -1;
        this.b = new SparseArray();
        h(-1);
    }

    private final void f(int i, cvjq cvjqVar) {
        LayerDrawable layerDrawable;
        SparseArray sparseArray = this.b;
        if (sparseArray.get(i) != null) {
            return;
        }
        sparseArray.put(i, cvjqVar);
        Drawable drawableMutate = getContext().getResources().getDrawable(i, getContext().getTheme()).mutate();
        drawableMutate.setAlpha(0);
        if (getDrawable() instanceof LayerDrawable) {
            LayerDrawable layerDrawable2 = (LayerDrawable) getDrawable();
            int numberOfLayers = layerDrawable2.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers + 1];
            int[] iArr = new int[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                drawableArr[i2] = layerDrawable2.getDrawable(i2);
                iArr[i2] = layerDrawable2.getId(i2);
            }
            drawableArr[numberOfLayers] = drawableMutate;
            layerDrawable = new LayerDrawable(drawableArr);
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                layerDrawable.setId(i3, iArr[i3]);
            }
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{drawableMutate});
        }
        layerDrawable.setId(layerDrawable.getNumberOfLayers() - 1, i);
        setImageDrawable(layerDrawable);
        if (sparseArray.size() == 1) {
            c(i);
        }
    }

    private static void g(ValueAnimator valueAnimator, Drawable drawable) {
        valueAnimator.addUpdateListener(new cvjp(drawable));
    }

    private final void h(int i) {
        if (i != -1) {
            a(i, null, getContentDescription());
        }
    }

    private static void i(ValueAnimator valueAnimator) {
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
    }

    private final void j(int i) {
        cvjq cvjqVar = (cvjq) this.b.get(i);
        if (cvjqVar != null) {
            setOnClickListener(cvjqVar.a);
            setContentDescription(cvjqVar.b);
            setVisibility(cvjqVar.c);
        }
        this.a = i;
    }

    public final void a(int i, View.OnClickListener onClickListener, CharSequence charSequence) {
        f(i, new cvjq(onClickListener, charSequence));
        c(i);
    }

    public final void b(int i, View.OnClickListener onClickListener, CharSequence charSequence) {
        f(i, new cvjq(onClickListener, charSequence));
    }

    public final void c(int i) {
        if (this.b.get(i) != null) {
            for (int i2 = 0; i2 < ((LayerDrawable) getDrawable()).getNumberOfLayers(); i2++) {
                ((LayerDrawable) getDrawable()).getDrawable(i2).setAlpha(((LayerDrawable) getDrawable()).getId(i2) == i ? 255 : 0);
            }
            j(i);
        }
    }

    public final void d(int i, int i2) {
        cvjq cvjqVar = (cvjq) this.b.get(i);
        if (cvjqVar != null) {
            cvjqVar.c = i2;
        }
        if (i == this.a) {
            setVisibility(i2);
        }
    }

    public final void e(int i) {
        SparseArray sparseArray = this.b;
        if (sparseArray.get(i) != null) {
            cqaz.k(getDrawable() instanceof LayerDrawable);
            Drawable drawableFindDrawableByLayerId = ((LayerDrawable) getDrawable()).findDrawableByLayerId(this.a);
            Drawable drawableFindDrawableByLayerId2 = ((LayerDrawable) getDrawable()).findDrawableByLayerId(i);
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator == null) {
                this.c = (ValueAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.layer_fade_in);
            } else {
                i(valueAnimator);
            }
            g(this.c, drawableFindDrawableByLayerId2);
            this.c.start();
            if (sparseArray.get(this.a) == null || ((cvjq) sparseArray.get(this.a)).c != 0) {
                drawableFindDrawableByLayerId.setAlpha(0);
            } else {
                ValueAnimator valueAnimator2 = this.d;
                if (valueAnimator2 == null) {
                    this.d = (ValueAnimator) AnimatorInflater.loadAnimator(getContext(), R.animator.layer_fade_out);
                } else {
                    i(valueAnimator2);
                }
                g(this.d, drawableFindDrawableByLayerId);
                this.d.start();
            }
            j(i);
        }
    }

    public SwitchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = new SparseArray();
        h(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", -1));
    }
}

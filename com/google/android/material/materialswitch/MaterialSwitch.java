package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.eejo;
import defpackage.eemh;
import defpackage.eemo;
import defpackage.eemq;
import defpackage.eexh;
import defpackage.kzb;
import defpackage.yx;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialSwitch extends SwitchCompat {
    private static final int[] m = {R.attr.state_with_icon};
    private Drawable n;
    private Drawable o;
    private int p;
    private Drawable q;
    private Drawable r;
    private ColorStateList s;
    private ColorStateList t;
    private PorterDuff.Mode u;
    private ColorStateList v;
    private ColorStateList w;
    private PorterDuff.Mode x;
    private int[] y;
    private int[] z;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    private final void k() {
        this.n = eejo.h(this.n, this.s, this.c);
        this.o = eejo.h(this.o, this.t, this.u);
        m();
        Drawable drawable = this.n;
        Drawable drawable2 = this.o;
        int i = this.p;
        Drawable drawableC = eejo.c(drawable, drawable2, i, i);
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.setCallback(null);
        }
        this.a = drawableC;
        if (drawableC != null) {
            drawableC.setCallback(this);
        }
        requestLayout();
        refreshDrawableState();
    }

    private static void l(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null) {
            drawable.setTint(kzb.e(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
        }
    }

    private final void m() {
        ColorStateList colorStateList = this.s;
        if (colorStateList == null && this.t == null && this.v == null && this.w == null) {
            return;
        }
        float f = this.j;
        if (colorStateList != null) {
            l(this.n, colorStateList, this.y, this.z, f);
        }
        ColorStateList colorStateList2 = this.t;
        if (colorStateList2 != null) {
            l(this.o, colorStateList2, this.y, this.z, f);
        }
        ColorStateList colorStateList3 = this.v;
        if (colorStateList3 != null) {
            l(this.q, colorStateList3, this.y, this.z, f);
        }
        ColorStateList colorStateList4 = this.w;
        if (colorStateList4 != null) {
            l(this.r, colorStateList4, this.y, this.z, f);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        m();
        super.invalidate();
    }

    public final void j(Drawable drawable) {
        this.o = drawable;
        k();
    }

    @Override // android.support.v7.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.o != null) {
            mergeDrawableStates(iArrOnCreateDrawableState, m);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.y = iArr;
        this.z = eejo.g(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        super(eexh.a(context, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        this.p = -1;
        Context context2 = getContext();
        this.n = this.a;
        this.s = this.b;
        this.b = null;
        this.d = true;
        super.a();
        this.q = this.e;
        this.v = this.f;
        this.f = null;
        this.h = true;
        super.b();
        yx yxVarB = eemh.b(context2, attributeSet, eemq.a, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.o = yxVarB.h(0);
        this.p = yxVarB.b(1, -1);
        this.t = yxVarB.g(2);
        this.u = eemo.c(yxVarB.c(3, -1), PorterDuff.Mode.SRC_IN);
        this.r = yxVarB.h(4);
        this.w = yxVarB.g(5);
        this.x = eemo.c(yxVarB.c(6, -1), PorterDuff.Mode.SRC_IN);
        yxVarB.o();
        this.k = false;
        invalidate();
        k();
        this.q = eejo.h(this.q, this.v, this.g);
        this.r = eejo.h(this.r, this.w, this.x);
        m();
        Drawable layerDrawable = this.q;
        if (layerDrawable != null && (drawable = this.r) != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{layerDrawable, drawable});
        } else if (layerDrawable == null) {
            layerDrawable = this.r;
        }
        if (layerDrawable != null) {
            this.i = layerDrawable.getIntrinsicWidth();
            requestLayout();
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = layerDrawable;
        if (layerDrawable != null) {
            layerDrawable.setCallback(this);
        }
        requestLayout();
    }
}

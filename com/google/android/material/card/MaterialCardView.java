package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import defpackage.csi;
import defpackage.eefp;
import defpackage.eefq;
import defpackage.eehg;
import defpackage.eemh;
import defpackage.eepy;
import defpackage.eesd;
import defpackage.eesj;
import defpackage.eesu;
import defpackage.eexh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialCardView extends CardView implements Checkable, eesu {
    private static final int[] g = {R.attr.state_checkable};
    private static final int[] h = {R.attr.state_checked};
    private boolean i;
    public final eefp l;
    public boolean m;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @Override // androidx.cardview.widget.CardView
    public final void d(float f) {
        super.d(f);
        this.l.j();
    }

    @Override // androidx.cardview.widget.CardView
    public final void e(float f) {
        super.e(f);
        eefp eefpVar = this.l;
        eefpVar.g(eefpVar.n.d(f));
        eefpVar.j.invalidateSelf();
        if (eefpVar.n() || eefpVar.m()) {
            eefpVar.i();
        }
        if (eefpVar.n()) {
            if (!eefpVar.r) {
                super.setBackgroundDrawable(eefpVar.d(eefpVar.d));
            }
            eefpVar.b.setForeground(eefpVar.d(eefpVar.j));
        }
    }

    @Override // defpackage.eesu
    public final void fx(eesj eesjVar) {
        RectF rectF = new RectF();
        eefp eefpVar = this.l;
        rectF.set(eefpVar.d.getBounds());
        setClipToOutline(eesjVar.g(rectF));
        eefpVar.g(eesjVar);
    }

    @Override // androidx.cardview.widget.CardView
    public final void gQ(int i) {
        this.l.e(ColorStateList.valueOf(i));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.m;
    }

    public final boolean j() {
        eefp eefpVar = this.l;
        return eefpVar != null && eefpVar.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        eefp eefpVar = this.l;
        eefpVar.h();
        eesd.d(this, eefpVar.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (j()) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        if (this.m) {
            mergeDrawableStates(iArrOnCreateDrawableState, h);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.m);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.m);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int iCeil;
        int iCeil2;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        eefp eefpVar = this.l;
        if (eefpVar.q != null) {
            MaterialCardView materialCardView = eefpVar.b;
            if (materialCardView.a) {
                float fB = eefpVar.b();
                iCeil = (int) Math.ceil(fB + fB);
                float fA = eefpVar.a();
                iCeil2 = (int) Math.ceil(fA + fA);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i3 = eefpVar.l() ? ((measuredWidth - eefpVar.f) - eefpVar.g) - iCeil2 : eefpVar.f;
            int i4 = eefpVar.k() ? eefpVar.f : ((measuredHeight - eefpVar.f) - eefpVar.g) - iCeil;
            int i5 = eefpVar.l() ? eefpVar.f : ((measuredWidth - eefpVar.f) - eefpVar.g) - iCeil2;
            int i6 = eefpVar.k() ? ((measuredHeight - eefpVar.f) - eefpVar.g) - iCeil : eefpVar.f;
            int layoutDirection = materialCardView.getLayoutDirection();
            eefpVar.q.setLayerInset(2, layoutDirection != 1 ? i3 : i5, i6, layoutDirection == 1 ? i3 : i5, i4);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.i) {
            eefp eefpVar = this.l;
            if (!eefpVar.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                eefpVar.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.m != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        eefp eefpVar = this.l;
        if (eefpVar != null) {
            eefpVar.h();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        eefp eefpVar;
        Drawable drawable;
        if (j() && isEnabled()) {
            this.m = !this.m;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26 && (drawable = (eefpVar = this.l).p) != null) {
                Rect bounds = drawable.getBounds();
                int i = bounds.bottom;
                eefpVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
                eefpVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
            }
            this.l.f(this.m, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(eexh.a(context, attributeSet, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.m = false;
        this.i = true;
        TypedArray typedArrayA = eemh.a(getContext(), attributeSet, eefq.a, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CardView, new int[0]);
        eefp eefpVar = new eefp(this, attributeSet, i);
        this.l = eefpVar;
        eefpVar.e(((csi) this.f.a).e);
        eefpVar.c.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        eefpVar.i();
        eefpVar.o = eepy.c(eefpVar.b.getContext(), typedArrayA, 11);
        if (eefpVar.o == null) {
            eefpVar.o = ColorStateList.valueOf(-1);
        }
        eefpVar.i = typedArrayA.getDimensionPixelSize(12, 0);
        boolean z = typedArrayA.getBoolean(0, false);
        eefpVar.s = z;
        eefpVar.b.setLongClickable(z);
        eefpVar.m = eepy.c(eefpVar.b.getContext(), typedArrayA, 6);
        Drawable drawableE = eepy.e(eefpVar.b.getContext(), typedArrayA, 2);
        if (drawableE != null) {
            eefpVar.k = drawableE.mutate();
            eefpVar.k.setTintList(eefpVar.m);
            eefpVar.f(eefpVar.b.m, false);
        } else {
            eefpVar.k = eefp.a;
        }
        LayerDrawable layerDrawable = eefpVar.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.apps.messaging.R.id.mtrl_card_checked_layer_id, eefpVar.k);
        }
        eefpVar.g = typedArrayA.getDimensionPixelSize(5, 0);
        eefpVar.f = typedArrayA.getDimensionPixelSize(4, 0);
        eefpVar.h = typedArrayA.getInteger(3, 8388661);
        eefpVar.l = eepy.c(eefpVar.b.getContext(), typedArrayA, 7);
        if (eefpVar.l == null) {
            eefpVar.l = ColorStateList.valueOf(eehg.b(eefpVar.b, com.google.android.apps.messaging.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListC = eepy.c(eefpVar.b.getContext(), typedArrayA, 1);
        eefpVar.e.P(colorStateListC == null ? ColorStateList.valueOf(0) : colorStateListC);
        Drawable drawable = eefpVar.p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(eefpVar.l);
        }
        eefpVar.j();
        eefpVar.e.V(eefpVar.i, eefpVar.o);
        super.setBackgroundDrawable(eefpVar.d(eefpVar.d));
        eefpVar.j = eefpVar.o() ? eefpVar.c() : eefpVar.e;
        eefpVar.b.setForeground(eefpVar.d(eefpVar.j));
        typedArrayA.recycle();
    }
}

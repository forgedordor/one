package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.eefg;
import defpackage.eefi;
import defpackage.eefj;
import defpackage.eefk;
import defpackage.eefl;
import defpackage.eeqf;
import defpackage.eesc;
import defpackage.eesd;
import defpackage.eesj;
import defpackage.eesu;
import defpackage.ku;
import defpackage.qn;
import defpackage.qp;
import defpackage.yv;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialButton extends qp implements Checkable, eesu {
    private static final int[] k = {R.attr.state_checkable};
    private static final int[] l = {R.attr.state_checked};
    public final eefk b;
    public ColorStateList c;
    public Drawable d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    int j;
    private final LinkedHashSet m;
    private PorterDuff.Mode n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private float u;
    private int v;
    private int w;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final int p() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private final void q() {
        if (t()) {
            setCompoundDrawablesRelative(this.d, null, null, null);
        } else if (s()) {
            setCompoundDrawablesRelative(null, null, this.d, null);
        } else if (u()) {
            setCompoundDrawablesRelative(null, this.d, null, null);
        }
    }

    private final void r(boolean z) {
        if (!n() || this.r == z) {
            return;
        }
        this.r = z;
        refreshDrawableState();
        if (getParent() instanceof eefl) {
            throw null;
        }
        if (this.s) {
            return;
        }
        this.s = true;
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((eefg) it.next()).a();
        }
        this.s = false;
    }

    private final boolean s() {
        int i = this.f;
        return i == 3 || i == 4;
    }

    private final boolean t() {
        int i = this.f;
        return i == 1 || i == 2;
    }

    private final boolean u() {
        int i = this.f;
        return i == 16 || i == 32;
    }

    final String c() {
        if (TextUtils.isEmpty(null)) {
            return (true != n() ? Button.class : CompoundButton.class).getName();
        }
        return null;
    }

    public final void d(Drawable drawable) {
        if (this.d != drawable) {
            this.d = drawable;
            k(true);
            l(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void e(int i) {
        d(i != 0 ? ku.a(getContext(), i) : null);
    }

    public final void f(ColorStateList colorStateList) {
        if (o()) {
            eefk eefkVar = this.b;
            if (eefkVar.n != colorStateList) {
                eefkVar.n = colorStateList;
                MaterialButton materialButton = eefkVar.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(eeqf.b(colorStateList));
                }
            }
        }
    }

    @Override // defpackage.eesu
    public final void fx(eesj eesjVar) {
        if (!o()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.b.d(eesjVar);
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        yv yvVar;
        if (o()) {
            return this.b.l;
        }
        qn qnVar = this.a;
        if (qnVar == null || (yvVar = qnVar.a) == null) {
            return null;
        }
        return yvVar.a;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        yv yvVar;
        if (o()) {
            return this.b.k;
        }
        qn qnVar = this.a;
        if (qnVar == null || (yvVar = qnVar.a) == null) {
            return null;
        }
        return yvVar.b;
    }

    public final void h(ColorStateList colorStateList) {
        if (o()) {
            eefk eefkVar = this.b;
            if (eefkVar.m != colorStateList) {
                eefkVar.m = colorStateList;
                eesc eescVarA = eefkVar.a();
                eesc eescVarB = eefkVar.b();
                if (eescVarA != null) {
                    eescVarA.V(eefkVar.j, eefkVar.m);
                    if (eescVarB != null) {
                        eescVarB.U(eefkVar.j, 0);
                    }
                }
            }
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (o()) {
            eefk eefkVar = this.b;
            if (eefkVar.l != colorStateList) {
                eefkVar.l = colorStateList;
                if (eefkVar.a() != null) {
                    eefkVar.a().setTintList(eefkVar.l);
                    return;
                }
                return;
            }
            return;
        }
        qn qnVar = this.a;
        if (qnVar != null) {
            if (qnVar.a == null) {
                qnVar.a = new yv();
            }
            yv yvVar = qnVar.a;
            yvVar.a = colorStateList;
            yvVar.d = true;
            qnVar.a();
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.r;
    }

    public final void j(PorterDuff.Mode mode) {
        if (o()) {
            eefk eefkVar = this.b;
            if (eefkVar.k != mode) {
                eefkVar.k = mode;
                if (eefkVar.a() == null || eefkVar.k == null) {
                    return;
                }
                eefkVar.a().setTintMode(eefkVar.k);
                return;
            }
            return;
        }
        qn qnVar = this.a;
        if (qnVar != null) {
            if (qnVar.a == null) {
                qnVar.a = new yv();
            }
            yv yvVar = qnVar.a;
            yvVar.b = mode;
            yvVar.c = true;
            qnVar.a();
        }
    }

    public final void k(boolean z) {
        Drawable drawable = this.d;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.d = drawableMutate;
            drawableMutate.setTintList(this.c);
            PorterDuff.Mode mode = this.n;
            if (mode != null) {
                this.d.setTintMode(mode);
            }
            int intrinsicWidth = this.e;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.d.getIntrinsicWidth();
            }
            int intrinsicHeight = this.e;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.d.getIntrinsicHeight();
            }
            Drawable drawable2 = this.d;
            int i = this.o;
            int i2 = this.p;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.d.setVisible(true, z);
        }
        if (z) {
            q();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!t() || drawable3 == this.d) && ((!s() || drawable5 == this.d) && (!u() || drawable4 == this.d))) {
            return;
        }
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.l(int, int):void");
    }

    public final void m() {
        int i = this.h;
        getLayoutParams().width = (int) (this.u + 0.0f);
        setPaddingRelative(this.v + i, getPaddingTop(), this.w - i, getPaddingBottom());
    }

    public final boolean n() {
        eefk eefkVar = this.b;
        return eefkVar != null && eefkVar.r;
    }

    public final boolean o() {
        eefk eefkVar = this.b;
        return (eefkVar == null || eefkVar.p) ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (o()) {
            eesd.d(this, this.b.a());
        }
        boolean z = false;
        if ((getParent() instanceof eefj) && ((eefj) getParent()).getOrientation() == 0) {
            z = true;
        }
        this.i = z;
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (n()) {
            mergeDrawableStates(iArrOnCreateDrawableState, k);
        }
        if (this.r) {
            mergeDrawableStates(iArrOnCreateDrawableState, l);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.qp, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(c());
        accessibilityEvent.setChecked(this.r);
    }

    @Override // defpackage.qp, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(c());
        accessibilityNodeInfo.setCheckable(n());
        accessibilityNodeInfo.setChecked(this.r);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.qp, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        l(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.t != i6) {
            this.t = i6;
            this.u = -1.0f;
        }
        if (this.u == -1.0f) {
            this.u = getMeasuredWidth();
            if (getParent() instanceof eefj) {
                throw null;
            }
        }
        if (this.j == -1) {
            Drawable drawable = this.d;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.q;
                int intrinsicWidth = this.e;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                i5 = i7 + intrinsicWidth;
            }
            this.j = (getMeasuredWidth() - p()) - i5;
        }
        if (this.v == -1) {
            this.v = getPaddingStart();
        }
        if (this.w == -1) {
            this.w = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof eefi)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eefi eefiVar = (eefi) parcelable;
        super.onRestoreInstanceState(eefiVar.d);
        r(eefiVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        eefi eefiVar = new eefi(super.onSaveInstanceState());
        eefiVar.a = this.r;
        return eefiVar;
    }

    @Override // defpackage.qp, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        l(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.b.s) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.d != null) {
            if (this.d.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!o()) {
            super.setBackgroundColor(i);
            return;
        }
        eefk eefkVar = this.b;
        if (eefkVar.a() != null) {
            eefkVar.a().setTint(i);
        }
    }

    @Override // defpackage.qp, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!o()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.b.c();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.qp, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ku.a(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        i(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        j(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        r(z);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (o()) {
            this.b.a().O(f);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        l(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView
    public final void setWidth(int i) {
        this.u = -1.0f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        r(!this.r);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r25, android.util.AttributeSet r26, int r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

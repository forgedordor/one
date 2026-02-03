package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.eegt;
import defpackage.eegu;
import defpackage.eegv;
import defpackage.eegw;
import defpackage.eegx;
import defpackage.eehb;
import defpackage.eekv;
import defpackage.eelm;
import defpackage.eemh;
import defpackage.eemo;
import defpackage.eeqc;
import defpackage.eeqd;
import defpackage.eeqf;
import defpackage.eesd;
import defpackage.eesj;
import defpackage.eesu;
import defpackage.eexh;
import defpackage.ley;
import defpackage.lhf;
import defpackage.lhg;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class Chip extends AppCompatCheckBox implements eegw, eesu, eelm {
    private static final int a = 2132151627;
    public eegx e;
    public CompoundButton.OnCheckedChangeListener f;
    public boolean g;
    public boolean h;
    public int i;
    public final Rect j;
    public eekv k;
    private InsetDrawable l;
    private RippleDrawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private final RectF r;
    private final eeqd s;
    public static final Rect d = new Rect();
    private static final int[] b = {R.attr.state_selected};
    private static final int[] c = {R.attr.state_checkable};

    public Chip(Context context) {
        this(context, null);
    }

    private final void e() {
        if (this.l != null) {
            this.l = null;
            setMinWidth(0);
            eegx eegxVar = this.e;
            setMinHeight((int) (eegxVar != null ? eegxVar.b : 0.0f));
            n();
        }
    }

    private final void l(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    private final void m(boolean z) {
        if (this.o != z) {
            this.o = z;
            refreshDrawableState();
        }
    }

    private final void n() {
        RippleDrawable rippleDrawable = new RippleDrawable(eeqf.b(this.e.c), d(), null);
        this.m = rippleDrawable;
        setBackground(rippleDrawable);
        o();
    }

    private final void o() {
        eegx eegxVar;
        if (TextUtils.isEmpty(getText()) || (eegxVar = this.e) == null) {
            return;
        }
        float fB = eegxVar.l + eegxVar.k + eegxVar.b();
        int iA = (int) (eegxVar.i + eegxVar.j + eegxVar.a());
        int i = (int) fB;
        if (this.l != null) {
            Rect rect = new Rect();
            this.l.getPadding(rect);
            iA += rect.left;
            i += rect.right;
        }
        setPaddingRelative(iA, getPaddingTop(), i, getPaddingBottom());
    }

    private final void p() {
        TextPaint paint = getPaint();
        eegx eegxVar = this.e;
        if (eegxVar != null) {
            paint.drawableState = eegxVar.getState();
        }
        eegx eegxVar2 = this.e;
        eeqc eeqcVarI = eegxVar2 != null ? eegxVar2.i() : null;
        if (eeqcVarI != null) {
            eeqcVarI.c(getContext(), paint, this.s);
        }
    }

    @Override // defpackage.eegw
    public final void a() {
        i(this.i);
        requestLayout();
        invalidateOutline();
    }

    public final RectF c() {
        RectF rectF = this.r;
        rectF.setEmpty();
        j();
        return rectF;
    }

    public final Drawable d() {
        InsetDrawable insetDrawable = this.l;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        eegx eegxVar = this.e;
        if (eegxVar == null || !eegx.s(eegxVar.g)) {
            return;
        }
        eegx eegxVar2 = this.e;
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.g) {
            i = IsEnabled + 1;
        }
        int i2 = i;
        if (this.p) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.o) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.g) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.p) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.o) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        if (eegxVar2.t(iArr)) {
            invalidate();
        }
    }

    public final boolean f() {
        eegx eegxVar = this.e;
        return eegxVar != null && eegxVar.h;
    }

    @Override // defpackage.eesu
    public final void fx(eesj eesjVar) {
        this.e.fx(eesjVar);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (!f()) {
            return !isClickable() ? "android.view.View" : "android.widget.Button";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).b()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        eegx eegxVar = this.e;
        if (eegxVar != null) {
            return eegxVar.n;
        }
        return null;
    }

    @Override // defpackage.eelm
    public final void h(eekv eekvVar) {
        this.k = eekvVar;
    }

    public final void i(int i) {
        this.i = i;
        if (!this.h) {
            if (this.l != null) {
                e();
                return;
            } else {
                n();
                return;
            }
        }
        int iMax = Math.max(0, i - this.e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.l != null) {
                e();
                return;
            } else {
                n();
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 >> 1 : 0;
        int i3 = iMax > 0 ? iMax >> 1 : 0;
        if (this.l != null) {
            Rect rect = new Rect();
            this.l.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                n();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.l = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        n();
    }

    public final void j() {
        eegx eegxVar = this.e;
        if (eegxVar != null) {
            eegxVar.d();
        }
    }

    public final void k() {
        playSoundEffect(0);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eesd.d(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, b);
        }
        if (f()) {
            mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            l(c().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            l(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            lhg lhgVar = new lhg(accessibilityNodeInfo);
            if (chipGroup.d) {
                i = 0;
                for (int i2 = 0; i2 < chipGroup.getChildCount(); i2++) {
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.a(i2)) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            Object tag = getTag(com.google.android.apps.messaging.R.id.row_index_key);
            lhgVar.v(lhf.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (c().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.q != i) {
            this.q = i;
            o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.c()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L2d
            r4 = 2
            if (r0 == r4) goto L23
            r1 = 3
            if (r0 == r1) goto L21
            goto L41
        L21:
            r0 = r2
            goto L35
        L23:
            boolean r0 = r5.o
            if (r0 == 0) goto L41
            if (r1 != 0) goto L47
            r5.m(r2)
            return r3
        L2d:
            boolean r0 = r5.o
            if (r0 == 0) goto L21
            r5.k()
            r0 = r3
        L35:
            r5.m(r2)
            if (r0 != 0) goto L47
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.m(r3)
            goto L47
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
        L47:
            return r3
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable == d() || drawable == this.m) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == d() || drawable == this.m) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        eegx eegxVar = this.e;
        if (eegxVar == null) {
            this.n = z;
        } else if (eegxVar.h) {
            super.setChecked(z);
        }
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(null, drawable2, null, drawable4);
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(null, drawable2, null, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i2, 0, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, i4);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        eegx eegxVar = this.e;
        if (eegxVar != null) {
            eegxVar.O(f);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        eegx eegxVar = this.e;
        if (eegxVar != null) {
            eegxVar.n = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public final void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public final void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i) {
        super.setMaxWidth(i);
        eegx eegxVar = this.e;
        if (eegxVar != null) {
            eegxVar.p = i;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        eegx eegxVar = this.e;
        if (eegxVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(true != eegxVar.o ? charSequence : null, bufferType);
        eegx eegxVar2 = this.e;
        if (eegxVar2 != null) {
            eegxVar2.p(charSequence);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        eegx eegxVar = this.e;
        if (eegxVar != null) {
            eegxVar.r(i);
        }
        p();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        eegx eegxVar = this.e;
        if (eegxVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            eeqc eeqcVarI = eegxVar.i();
            if (eeqcVarI != null) {
                eeqcVarI.l = fApplyDimension;
                eegxVar.m.a.setTextSize(fApplyDimension);
                eegxVar.e();
            }
        }
        p();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = a;
        super(eexh.a(context, attributeSet, i, i2), attributeSet, i);
        this.j = new Rect();
        this.r = new RectF();
        this.s = new eegt(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        eegx eegxVarF = eegx.f(context2, attributeSet, i, i2);
        int[] iArr = eehb.a;
        TypedArray typedArrayA = eemh.a(context2, attributeSet, iArr, i, i2, new int[0]);
        this.h = typedArrayA.getBoolean(32, false);
        this.i = (int) Math.ceil(typedArrayA.getDimension(20, (float) Math.ceil(eemo.a(getContext(), 48))));
        typedArrayA.recycle();
        eegx eegxVar = this.e;
        if (eegxVar != eegxVarF) {
            if (eegxVar != null) {
                eegxVar.o(null);
            }
            this.e = eegxVarF;
            eegxVarF.o = false;
            eegxVarF.o(this);
            i(this.i);
        }
        eegxVarF.O(getElevation());
        TypedArray typedArrayA2 = eemh.a(context2, attributeSet, iArr, i, i2, new int[0]);
        boolean zHasValue = typedArrayA2.hasValue(37);
        typedArrayA2.recycle();
        new eegv(this, this);
        j();
        ley.p(this, null);
        if (!zHasValue) {
            setOutlineProvider(new eegu(this));
        }
        setChecked(this.n);
        setText(eegxVarF.d);
        setEllipsize(eegxVarF.n);
        p();
        if (!this.e.o) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        o();
        if (this.h) {
            setMinHeight(this.i);
        }
        this.q = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: eegs
            /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onCheckedChanged(android.widget.CompoundButton r5, boolean r6) {
                /*
                    r4 = this;
                    com.google.android.material.chip.Chip r0 = r4.a
                    eekv r1 = r0.k
                    if (r1 == 0) goto L20
                    if (r6 == 0) goto L11
                    eekw r2 = r1.a
                    boolean r2 = r2.b(r0)
                    if (r2 == 0) goto L20
                    goto L1b
                L11:
                    eekw r2 = r1.a
                    boolean r3 = r2.d
                    boolean r2 = r2.c(r0, r3)
                    if (r2 == 0) goto L20
                L1b:
                    eekw r1 = r1.a
                    r1.a()
                L20:
                    android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.f
                    if (r0 == 0) goto L27
                    r0.onCheckedChanged(r5, r6)
                L27:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eegs.onCheckedChanged(android.widget.CompoundButton, boolean):void");
            }
        });
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        eegx eegxVar = this.e;
        if (eegxVar != null) {
            eegxVar.r(i);
        }
        p();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }
}

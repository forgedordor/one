package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.kt;
import defpackage.ley;
import defpackage.lip;
import defpackage.lpz;
import defpackage.lrh;
import defpackage.lri;
import defpackage.mk;
import defpackage.qz;
import defpackage.sb;
import defpackage.th;
import defpackage.yq;
import defpackage.yr;
import defpackage.ys;
import defpackage.yx;
import defpackage.zy;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property m = new yq(Float.class);
    private static final int[] n = {R.attr.state_checked};
    private float A;
    private float B;
    private VelocityTracker C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final sb Q;
    private qz R;
    private yr S;
    private final Rect T;
    public Drawable a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public int i;
    public float j;
    public boolean k;
    ObjectAnimator l;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private CharSequence w;
    private boolean x;
    private int y;
    private int z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private final int j() {
        return (int) (((zy.a(this) ? 1.0f - this.j : this.j) * k()) + 0.5f);
    }

    private final int k() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.T;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect rectB = drawable2 != null ? th.b(drawable2) : th.a;
        return ((((this.E - this.G) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private final qz l() {
        if (this.R == null) {
            this.R = new qz(this);
        }
        return this.R;
    }

    private final Layout m(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.L, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.L)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final CharSequence n(CharSequence charSequence) {
        lrh lrhVar = l().a.a;
        TransformationMethod transformationMethodA = this.P;
        if (!lri.a()) {
            transformationMethodA = ((lri) lrhVar).a.a(transformationMethodA);
        }
        return transformationMethodA != null ? transformationMethodA.getTransformation(charSequence, this) : charSequence;
    }

    private final void o() {
        if (this.S == null && ((lri) this.R.a.a).a.b && lpz.h()) {
            lpz lpzVarC = lpz.c();
            int iB = lpzVarC.b();
            if (iB == 3 || iB == 0) {
                yr yrVar = new yr(this);
                this.S = yrVar;
                lpzVarC.f(yrVar);
            }
        }
    }

    private final boolean p() {
        return this.j > 0.5f;
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.o) {
                Drawable drawableMutate = drawable.mutate();
                this.a = drawableMutate;
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.o) {
                    this.a.setTintMode(this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.p) {
                Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.p) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        h(this.t);
        g(this.v);
        requestLayout();
    }

    public final void d() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.v;
            if (string == null) {
                string = getResources().getString(com.google.android.apps.messaging.R.string.abc_capital_off);
            }
            ley.u(this, string);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.H;
        int i4 = this.I;
        int i5 = this.J;
        int i6 = this.K;
        int iJ = j() + i3;
        Drawable drawable = this.a;
        Rect rectB = drawable != null ? th.b(drawable) : th.a;
        Rect rect = this.T;
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            iJ += rect.left;
            if (rectB != null) {
                if (rectB.left > rect.left) {
                    i3 += rectB.left - rect.left;
                }
                i = rectB.top > rect.top ? (rectB.top - rect.top) + i4 : i4;
                if (rectB.right > rect.right) {
                    i5 -= rectB.right - rect.right;
                }
                if (rectB.bottom > rect.bottom) {
                    i2 = i6 - (rectB.bottom - rect.bottom);
                }
                this.e.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.e.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i7 = iJ - rect.left;
            int i8 = iJ + this.G + rect.right;
            this.a.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.t;
            if (string == null) {
                string = getResources().getString(com.google.android.apps.messaging.R.string.abc_capital_on);
            }
            ley.u(this, string);
        }
    }

    public final void f(Typeface typeface) {
        TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void g(CharSequence charSequence) {
        this.v = charSequence;
        this.w = n(charSequence);
        this.O = null;
        if (this.x) {
            o();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!zy.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (zy.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lip.a(super.getCustomSelectionActionModeCallback());
    }

    public final void h(CharSequence charSequence) {
        this.t = charSequence;
        this.u = n(charSequence);
        this.N = null;
        if (this.x) {
            o();
        }
    }

    public final void i(float f) {
        this.j = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.l.end();
        this.l = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.e;
        Rect rect = this.T;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.I;
        int i2 = this.K;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = th.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = p() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.t : this.v;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.a != null) {
            Rect rect = this.T;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = th.b(this.a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (zy.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.E + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.E) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = (getPaddingTop() + getHeight()) - getPaddingBottom();
            i5 = this.F;
            paddingTop = (paddingTop2 / 2) - (i5 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.F;
                this.H = paddingLeft;
                this.I = paddingTop;
                this.K = height;
                this.J = width;
            }
            paddingTop = getPaddingTop();
            i5 = this.F;
        }
        height = i5 + paddingTop;
        this.H = paddingLeft;
        this.I = paddingTop;
        this.K = height;
        this.J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int i3;
        int iMax;
        if (this.x) {
            if (this.N == null) {
                this.N = m(this.u);
            }
            if (this.O == null) {
                this.O = m(this.w);
            }
        }
        Rect rect = this.T;
        Drawable drawable = this.a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.x) {
            int iMax2 = Math.max(this.N.getWidth(), this.O.getWidth());
            int i4 = this.q;
            i3 = iMax2 + i4 + i4;
        } else {
            i3 = 0;
        }
        this.G = Math.max(i3, intrinsicWidth);
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.e.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax3 = rect.left;
        int iMax4 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect rectB = th.b(drawable3);
            iMax3 = Math.max(iMax3, rectB.left);
            iMax4 = Math.max(iMax4, rectB.right);
        }
        if (this.k) {
            int i5 = this.i;
            int i6 = this.G;
            iMax = Math.max(i5, i6 + i6 + iMax3 + iMax4);
        } else {
            iMax = this.i;
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.E = iMax;
        this.F = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.t : this.v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        l().b(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            e();
        } else {
            d();
        }
        float f = true != zIsChecked ? 0.0f : 1.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.l;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            i(f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) m, f);
        this.l = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.l.setAutoCancel(true);
        this.l.start();
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lip.b(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(l().c(inputFilterArr));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.e;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        Typeface typeface;
        Typeface typefaceCreate;
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.o = false;
        this.f = null;
        this.g = null;
        this.h = false;
        this.p = false;
        this.C = VelocityTracker.obtain();
        this.k = true;
        this.T = new Rect();
        ys.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = kt.y;
        yx yxVarL = yx.l(context, attributeSet, iArr, i, 0);
        ley.o(this, context, iArr, attributeSet, yxVarL.b, i, 0);
        Drawable drawableH = yxVarL.h(2);
        this.a = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(this);
        }
        Drawable drawableH2 = yxVarL.h(11);
        this.e = drawableH2;
        if (drawableH2 != null) {
            drawableH2.setCallback(this);
        }
        h(yxVarL.m(0));
        g(yxVarL.m(1));
        this.x = yxVarL.p(3, true);
        this.q = yxVarL.b(8, 0);
        this.i = yxVarL.b(5, 0);
        this.r = yxVarL.b(6, 0);
        this.s = yxVarL.p(4, false);
        ColorStateList colorStateListG = yxVarL.g(9);
        if (colorStateListG != null) {
            this.b = colorStateListG;
            this.d = true;
        }
        PorterDuff.Mode modeA = th.a(yxVarL.c(10, -1), null);
        if (this.c != modeA) {
            this.c = modeA;
            this.o = true;
        }
        if (this.d || this.o) {
            a();
        }
        ColorStateList colorStateListG2 = yxVarL.g(12);
        if (colorStateListG2 != null) {
            this.f = colorStateListG2;
            this.h = true;
        }
        PorterDuff.Mode modeA2 = th.a(yxVarL.c(13, -1), null);
        if (this.g != modeA2) {
            this.g = modeA2;
            this.p = true;
        }
        if (this.h || this.p) {
            b();
        }
        int iF = yxVarL.f(7, 0);
        if (iF != 0) {
            yx yxVarJ = yx.j(context, iF, kt.z);
            ColorStateList colorStateListG3 = yxVarJ.g(3);
            if (colorStateListG3 != null) {
                this.M = colorStateListG3;
            } else {
                this.M = getTextColors();
            }
            int iB = yxVarJ.b(0, 0);
            if (iB != 0) {
                float f = iB;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int iC = yxVarJ.c(1, -1);
            int iC2 = yxVarJ.c(2, -1);
            if (iC == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (iC != 2) {
                typeface = iC != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (iC2 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(iC2);
                } else {
                    typefaceCreate = Typeface.create(typeface, iC2);
                }
                f(typefaceCreate);
                int i2 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & iC2;
                textPaint.setFakeBoldText(1 == (i2 & 1));
                textPaint.setTextSkewX((2 & i2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                f(typeface);
            }
            if (yxVarJ.p(14, false)) {
                this.P = new mk(getContext());
            } else {
                this.P = null;
            }
            h(this.t);
            g(this.v);
            yxVarJ.o();
        }
        sb sbVar = new sb(this);
        this.Q = sbVar;
        sbVar.h(attributeSet, i);
        yxVarL.o();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        l().a(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}

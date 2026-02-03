package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.ku;
import defpackage.kzi;
import defpackage.kzq;
import defpackage.lbz;
import defpackage.lip;
import defpackage.qn;
import defpackage.qz;
import defpackage.ra;
import defpackage.rv;
import defpackage.sa;
import defpackage.sb;
import defpackage.sd;
import defpackage.se;
import defpackage.sf;
import defpackage.ys;
import defpackage.yu;
import defpackage.zy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final qn a;
    private final sb b;
    private final rv c;
    private qz d;
    private boolean e;
    private sa f;
    private sd g;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private final qz a() {
        if (this.d == null) {
            this.d = new qz(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        qn qnVar = this.a;
        if (qnVar != null) {
            qnVar.a();
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    final sa g() {
        if (this.f == null) {
            this.f = new sa(this, new lbz() { // from class: sc
                @Override // defpackage.lbz
                public final void accept(Object obj) {
                    super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                }
            });
        }
        return this.f;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (zy.c) {
            return super.getAutoSizeMaxTextSize();
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            return sbVar.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (zy.c) {
            return super.getAutoSizeMinTextSize();
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            return sbVar.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (zy.c) {
            return super.getAutoSizeStepGranularity();
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            return sbVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (zy.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        sb sbVar = this.b;
        return sbVar != null ? sbVar.p() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (zy.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            return sbVar.d();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lip.a(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return g().b;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        rv rvVar;
        return (Build.VERSION.SDK_INT >= 28 || (rvVar = this.c) == null) ? super.getTextClassifier() : rvVar.a();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return g().a;
    }

    final sd l() {
        if (this.g == null) {
            this.g = Build.VERSION.SDK_INT >= 34 ? new sf(this) : Build.VERSION.SDK_INT >= 28 ? new se(this) : new sd(this);
        }
        return this.g;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        sb.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        ra.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.q();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        sb sbVar = this.b;
        if (sbVar == null || zy.c || !sbVar.o()) {
            return;
        }
        sbVar.g();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (zy.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.k(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (zy.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.l(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (zy.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.m(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qn qnVar = this.a;
        if (qnVar != null) {
            qnVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qn qnVar = this.a;
        if (qnVar != null) {
            qnVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ku.a(context, i) : null, i2 != 0 ? ku.a(context, i2) : null, i3 != 0 ? ku.a(context, i3) : null, i4 != 0 ? ku.a(context, i4) : null);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ku.a(context, i) : null, i2 != 0 ? ku.a(context, i2) : null, i3 != 0 ? ku.a(context, i3) : null, i4 != 0 ? ku.a(context, i4) : null);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lip.b(this, callback));
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().c(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            l().a(i);
        } else {
            lip.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return g().b(str);
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            l().b(i);
        } else {
            lip.d(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        lip.e(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        rv rvVar;
        if (Build.VERSION.SDK_INT >= 28 || (rvVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            rvVar.a = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (zy.c) {
            super.setTextSize(i, f);
            return;
        }
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.n(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        g().a(typeface);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            l().c(i, f);
        } else {
            lip.f(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            kzq kzqVar = kzi.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface = Typeface.create(typeface, i);
        }
        this.e = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yu.a(context);
        this.e = false;
        this.g = null;
        ys.d(this, getContext());
        qn qnVar = new qn(this);
        this.a = qnVar;
        qnVar.b(attributeSet, i);
        sb sbVar = new sb(this);
        this.b = sbVar;
        sbVar.h(attributeSet, i);
        sbVar.e();
        this.c = new rv(this);
        a().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.e();
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qp extends Button {
    public final qn a;
    private final sb b;
    private qz c;
    private sa d;

    public qp(Context context) {
        this(context, null);
    }

    private final qz c() {
        if (this.c == null) {
            this.c = new qz(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
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
    public final String getFontVariationSettings() {
        return hk().b;
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return hk().a;
    }

    final sa hk() {
        if (this.d == null) {
            this.d = new sa(this, new lbz() { // from class: qo
                @Override // defpackage.lbz
                public final void accept(Object obj) {
                    super/*android.widget.Button*/.setTypeface((Typeface) obj);
                }
            });
        }
        return this.d;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.q();
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        sb sbVar = this.b;
        if (sbVar == null || zy.c || !sbVar.o()) {
            return;
        }
        sbVar.g();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c().b(z);
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
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qn qnVar = this.a;
        if (qnVar != null) {
            qnVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qn qnVar = this.a;
        if (qnVar != null) {
            qnVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lip.b(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(c().c(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return hk().b(str);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        sb sbVar = this.b;
        if (sbVar != null) {
            sbVar.i(context, i);
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
        hk().a(typeface);
    }

    public qp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yu.a(context);
        ys.d(this, getContext());
        qn qnVar = new qn(this);
        this.a = qnVar;
        qnVar.b(attributeSet, i);
        sb sbVar = new sb(this);
        this.b = sbVar;
        sbVar.h(attributeSet, i);
        sbVar.e();
        c().a(attributeSet, i);
    }
}

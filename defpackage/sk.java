package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sk extends ToggleButton {
    private final qn a;
    private final sb b;
    private qz c;

    public sk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        ys.d(this, getContext());
        qn qnVar = new qn(this);
        this.a = qnVar;
        qnVar.b(attributeSet, R.attr.buttonStyleToggle);
        sb sbVar = new sb(this);
        this.b = sbVar;
        sbVar.h(attributeSet, R.attr.buttonStyleToggle);
        a().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private final qz a() {
        if (this.c == null) {
            this.c = new qz(this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().c(inputFilterArr));
    }
}

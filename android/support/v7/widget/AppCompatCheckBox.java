package android.support.v7.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.apps.messaging.R;
import defpackage.ku;
import defpackage.lir;
import defpackage.qn;
import defpackage.qs;
import defpackage.qz;
import defpackage.sb;
import defpackage.ys;
import defpackage.yu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements lir {
    private final qs a;
    private final qn b;
    private final sb c;
    private qz d;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    private final qz c() {
        if (this.d == null) {
            this.d = new qz(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        qn qnVar = this.b;
        if (qnVar != null) {
            qnVar.a();
        }
        sb sbVar = this.c;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // defpackage.lir
    public final void gT(PorterDuff.Mode mode) {
        qs qsVar = this.a;
        if (qsVar != null) {
            qsVar.a = mode;
            qsVar.c = true;
            qsVar.a();
        }
    }

    @Override // defpackage.lir
    public final void gU() {
        qs qsVar = this.a;
        if (qsVar != null) {
            qsVar.b = true;
            qsVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        qn qnVar = this.b;
        if (qnVar != null) {
            qnVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        qn qnVar = this.b;
        if (qnVar != null) {
            qnVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ku.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.c;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        sb sbVar = this.c;
        if (sbVar != null) {
            sbVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(c().c(inputFilterArr));
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        qs qsVar = this.a;
        if (qsVar != null) {
            qsVar.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yu.a(context);
        ys.d(this, getContext());
        qs qsVar = new qs(this);
        this.a = qsVar;
        qsVar.b(attributeSet, i);
        qn qnVar = new qn(this);
        this.b = qnVar;
        qnVar.b(attributeSet, i);
        sb sbVar = new sb(this);
        this.c = sbVar;
        sbVar.h(attributeSet, i);
        c().a(attributeSet, i);
    }
}

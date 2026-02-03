package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.eeoj;
import defpackage.eeok;
import defpackage.eepa;
import defpackage.eepi;
import defpackage.eepj;
import defpackage.eepk;
import defpackage.eepn;
import defpackage.eepr;
import defpackage.eeps;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class LinearProgressIndicator extends eeoj<eeps> {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.eeoj
    public final /* synthetic */ eeok a(Context context, AttributeSet attributeSet) {
        return new eeps(context, attributeSet);
    }

    @Override // defpackage.eeoj
    public final void f(int i, boolean z) {
        eeok eeokVar = this.a;
        if (eeokVar != null && ((eeps) eeokVar).o == 0 && isIndeterminate()) {
            return;
        }
        super.f(i, false);
    }

    @Override // defpackage.eeoj, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        eeps eepsVar = (eeps) this.a;
        int i5 = eepsVar.p;
        boolean z2 = true;
        if (i5 != 1 && ((getLayoutDirection() != 1 || i5 != 2) && (getLayoutDirection() != 0 || i5 != 3))) {
            z2 = false;
        }
        eepsVar.q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        eepj indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        eepa progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        eepi eeprVar;
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        eepk eepkVar = new eepk((eeps) this.a);
        Context context2 = getContext();
        eeps eepsVar = (eeps) this.a;
        if (eepsVar.o == 0) {
            eeprVar = new eepn(eepsVar);
        } else {
            eeprVar = new eepr(context2, eepsVar);
        }
        setIndeterminateDrawable(new eepj(context2, eepsVar, eepkVar, eeprVar));
        setProgressDrawable(new eepa(getContext(), (eeps) this.a, eepkVar));
    }
}

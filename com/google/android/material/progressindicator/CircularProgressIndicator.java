package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.eeoj;
import defpackage.eeok;
import defpackage.eeol;
import defpackage.eeoq;
import defpackage.eeov;
import defpackage.eeow;
import defpackage.eepa;
import defpackage.eepi;
import defpackage.eepj;
import defpackage.pop;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class CircularProgressIndicator extends eeoj<eeow> {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.eeoj
    public final /* synthetic */ eeok a(Context context, AttributeSet attributeSet) {
        return new eeow(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        eepi eeoqVar;
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        eeol eeolVar = new eeol((eeow) this.a);
        Context context2 = getContext();
        eeow eeowVar = (eeow) this.a;
        if (eeowVar.o == 1) {
            eeoqVar = new eeov(context2, eeowVar);
        } else {
            eeoqVar = new eeoq(eeowVar);
        }
        eepj eepjVar = new eepj(context2, eeowVar, eeolVar, eeoqVar);
        eepjVar.c = pop.b(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(eepjVar);
        setProgressDrawable(new eepa(getContext(), (eeow) this.a, eeolVar));
    }
}

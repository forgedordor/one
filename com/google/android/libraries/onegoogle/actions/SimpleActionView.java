package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.dyyb;
import defpackage.dyyh;
import defpackage.ejud;
import defpackage.ejwi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SimpleActionView extends LinearLayout implements dyyh {
    public ejwi a;

    public SimpleActionView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        if (this.a.g()) {
            dyybVar.c(this, ((Integer) this.a.c()).intValue());
        }
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        if (this.a.g()) {
            dyybVar.e(this);
        }
    }

    public SimpleActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = ejud.a;
    }
}

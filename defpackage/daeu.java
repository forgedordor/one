package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daeu extends wv {
    public final daer s;
    public dacs t;

    public daeu(Context context, View view, lvc lvcVar) {
        super(view);
        daer daerVar = new daer(context, lvcVar, new daet());
        this.s = daerVar;
        daerVar.a(view);
    }

    final void C() {
        this.s.c();
        dacs dacsVar = this.t;
        if (dacsVar != null) {
            dacsVar.m();
            this.t = null;
        }
    }
}

package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agfr implements afyw {
    private final Activity a;
    private final fcsu b;
    private final fcsu c;

    public agfr(Activity activity, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = activity;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        if (((Boolean) ackx.a.e()).booleanValue()) {
            acif acifVar = (acif) this.b.b();
            Activity activity = this.a;
            acik acikVar = new acik();
            acikVar.b(elie.BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU);
            acifVar.b(activity, acikVar.a());
        } else {
            ((achu) this.c.b()).f(this.a);
        }
        return fctx.a;
    }
}

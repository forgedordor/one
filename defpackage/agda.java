package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agda implements afyw {
    private final Context a;
    private final efwo b;
    private final fcsu c;

    public agda(Context context, efwo efwoVar, fcsu fcsuVar) {
        efwoVar.getClass();
        this.a = context;
        this.b = efwoVar;
        this.c = fcsuVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        agcz agczVar = (agcz) afzvVar;
        achu achuVar = (achu) this.c.b();
        Activity activityA = daiy.a(this.a);
        if (activityA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object objC = fdxs.c(achuVar.c(activityA, agczVar.a, this.b, agczVar.b), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }
}

package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbc implements afyw {
    private final Context a;
    private final fcsu b;

    public agbc(Context context, fcsu fcsuVar) {
        this.a = context;
        this.b = fcsuVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        agbb agbbVar = (agbb) afzvVar;
        achu achuVar = (achu) this.b.b();
        String str = agbbVar.a;
        String str2 = agbbVar.b;
        eiju eijuVarG = eiju.g(drgi.a(achuVar.h(this.a, true)));
        eijuVarG.getClass();
        Object objC = fdxs.c(eijuVarG, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }
}

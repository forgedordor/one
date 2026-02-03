package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctqd implements ctpr {
    public final fcsu a;
    public final cucf b;
    public final cudy c;
    public final fdjx d;
    public final Context e;
    public final ctxf f;
    public final cuec g;
    public final asgz h;
    public final fdat i;
    private final fdpl j;
    private final fdpl k;
    private final fdvc l;

    public ctqd(fcsu fcsuVar, cucf cucfVar, cudy cudyVar, fdjx fdjxVar, Context context, ctxf ctxfVar, cuec cuecVar, fcsu fcsuVar2, asgz asgzVar) {
        fcsuVar.getClass();
        cucfVar.getClass();
        cudyVar.getClass();
        fdjxVar.getClass();
        context.getClass();
        ctxfVar.getClass();
        cuecVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = cucfVar;
        this.c = cudyVar;
        this.d = fdjxVar;
        this.e = context;
        this.f = ctxfVar;
        this.g = cuecVar;
        this.h = asgzVar;
        fdpl fdplVarA = cudyVar.a();
        ctpz ctpzVar = new ctpz(null, this);
        int i = fdsn.a;
        fdwg fdwgVar = new fdwg(ctpzVar, fdplVarA);
        this.j = fdwgVar;
        fdpl ctqcVar = new ctqc(fdwgVar, this);
        this.k = ctqcVar;
        this.l = fdtg.b(((aquo) fcsuVar2.b()).a() ? ctqcVar : new fdpu(null), fdjxVar, fdur.b, null);
        this.i = auxh.d(new ctps(this), fdjxVar);
    }

    @Override // defpackage.ctpr
    public final fdvc a() {
        return this.l;
    }
}

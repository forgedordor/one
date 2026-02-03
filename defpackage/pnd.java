package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pnd extends pmy {
    final /* synthetic */ pnf a;

    public pnd(pnf pnfVar) {
        this.a = pnfVar;
    }

    @Override // defpackage.pmy, defpackage.pmq
    public final void a(pmx pmxVar) {
        pnf pnfVar = this.a;
        pnfVar.v.remove(pmxVar);
        if (pnfVar.C()) {
            return;
        }
        pnfVar.t(pnfVar, pmw.c, false);
        pnfVar.n = true;
        pnfVar.t(pnfVar, pmw.b, false);
    }
}

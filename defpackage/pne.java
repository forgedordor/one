package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pne extends pmy {
    final pnf a;

    public pne(pnf pnfVar) {
        this.a = pnfVar;
    }

    @Override // defpackage.pmy, defpackage.pmq
    public final void b(pmx pmxVar) {
        pnf pnfVar = this.a;
        int i = pnfVar.w - 1;
        pnfVar.w = i;
        if (i == 0) {
            pnfVar.x = false;
            pnfVar.s();
        }
        pmxVar.I(this);
    }

    @Override // defpackage.pmy, defpackage.pmq
    public final void e(pmx pmxVar) {
        pnf pnfVar = this.a;
        if (pnfVar.x) {
            return;
        }
        pnfVar.B();
        pnfVar.x = true;
    }
}

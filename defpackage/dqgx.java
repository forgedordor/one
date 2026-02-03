package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqgx implements fdat {
    final /* synthetic */ dqhd a;
    final /* synthetic */ fdpl b;

    public dqgx(dqhd dqhdVar, fdpl fdplVar) {
        this.a = dqhdVar;
        this.b = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dqhd dqhdVar = this.a;
            dqir dqirVarR = dqhdVar.r();
            dqgm dqgmVarF = dqhd.f(dqhdVar);
            dqgmVarF.getClass();
            dqid.e(dqirVarR.a(dqgmVarF), this.b, dqhd.f(dqhdVar).c, dqhd.f(dqhdVar).h, hmlVar, 0);
        }
        return fctx.a;
    }
}

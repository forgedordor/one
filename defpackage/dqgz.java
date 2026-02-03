package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqgz implements fdat {
    final /* synthetic */ dqhd a;
    final /* synthetic */ fdpl b;

    public dqgz(dqhd dqhdVar, fdpl fdplVar) {
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
            hnj.a(djrx.a.c(dqhd.f(dqhdVar).m), hxe.d(584288459, new dqgy(dqhdVar, this.b), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}

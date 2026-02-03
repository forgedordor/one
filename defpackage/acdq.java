package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdq implements fdat {
    final /* synthetic */ acec a;
    final /* synthetic */ dayp b;

    public acdq(acec acecVar, dayp daypVar) {
        this.a = acecVar;
        this.b = daypVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            acec acecVar = this.a;
            hpt hptVar = djrx.a;
            Object objB = acecVar.e.b();
            objB.getClass();
            hnj.b(new hpu[]{auwg.a.c(((auwh) acecVar.f.b()).a), hptVar.c(objB)}, hxe.d(-1100839125, new acdp(acecVar, this.b), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}

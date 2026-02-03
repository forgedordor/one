package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwpz implements fdat {
    final /* synthetic */ fcsu a;
    final /* synthetic */ dlfg b;
    final /* synthetic */ fdae c;

    public cwpz(fcsu fcsuVar, dlfg dlfgVar, fdae fdaeVar) {
        this.a = fcsuVar;
        this.b = dlfgVar;
        this.c = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fcsu fcsuVar = this.a;
            hpt hptVar = djrx.a;
            Object objB = fcsuVar.b();
            objB.getClass();
            hnj.a(hptVar.c(objB), hxe.d(-1597253567, new cwpy(this.b, this.c), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}

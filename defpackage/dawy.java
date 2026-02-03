package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dawy implements fdat {
    final /* synthetic */ fcsu a;
    final /* synthetic */ daxa b;

    public dawy(fcsu fcsuVar, daxa daxaVar) {
        this.a = fcsuVar;
        this.b = daxaVar;
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
            hnj.a(hptVar.c(objB), hxe.d(-541049330, new dawx(this.b), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}

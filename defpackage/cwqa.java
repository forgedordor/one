package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwqa implements fdat {
    final /* synthetic */ fcsu a;
    final /* synthetic */ dlfg b;
    final /* synthetic */ fdae c;

    public cwqa(fcsu fcsuVar, dlfg dlfgVar, fdae fdaeVar) {
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
            cuit.a(null, null, false, null, false, hxe.d(-341052543, new cwpz(this.a, this.b, this.c), hmlVar), hmlVar, 196608, 31);
        }
        return fctx.a;
    }
}

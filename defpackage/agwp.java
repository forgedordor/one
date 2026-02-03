package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agwp implements fdat {
    final /* synthetic */ fcsu a;
    final /* synthetic */ agwq b;

    public agwp(fcsu fcsuVar, agwq agwqVar) {
        this.a = fcsuVar;
        this.b = agwqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cuit.a(null, null, false, null, false, hxe.d(289604561, new agwo(this.a, this.b), hmlVar), hmlVar, 196608, 31);
        }
        return fctx.a;
    }
}

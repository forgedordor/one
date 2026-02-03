package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agwo implements fdat {
    final /* synthetic */ fcsu a;
    final /* synthetic */ agwq b;

    public agwo(fcsu fcsuVar, agwq agwqVar) {
        this.a = fcsuVar;
        this.b = agwqVar;
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
            hnj.a(hptVar.c(objB), hxe.d(-208271599, new agwn(this.b), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}

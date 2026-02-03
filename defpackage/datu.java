package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class datu implements fdat {
    final /* synthetic */ daua a;
    final /* synthetic */ dayp b;

    public datu(daua dauaVar, dayp daypVar) {
        this.a = dauaVar;
        this.b = daypVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            daua dauaVar = this.a;
            hpt hptVar = djrx.a;
            Object objB = dauaVar.c.b();
            objB.getClass();
            hnj.a(hptVar.c(objB), hxe.d(1659287450, new datt(this.b), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yku implements fdat {
    final /* synthetic */ dkgq a;
    final /* synthetic */ eve b;

    public yku(dkgq dkgqVar, eve eveVar) {
        this.a = dkgqVar;
        this.b = eveVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ykv.b(((dlhm) this.a).c, this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}

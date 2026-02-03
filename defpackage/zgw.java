package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgw implements fdat {
    final /* synthetic */ zij a;
    final /* synthetic */ eve b;
    final /* synthetic */ Object c;

    public zgw(zij zijVar, eve eveVar, Object obj) {
        this.a = zijVar;
        this.b = eveVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            new hxd(-710761612, true, new zil((zim) hmlVar.e(zgx.a))).a(this.a, this.b, this.c, hmlVar, 0);
        }
        return fctx.a;
    }
}

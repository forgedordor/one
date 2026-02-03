package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djba implements fdat {
    final /* synthetic */ djdy a;
    final /* synthetic */ fdat b;
    final /* synthetic */ hox c;

    public djba(djdy djdyVar, fdat fdatVar, hox hoxVar) {
        this.a = djdyVar;
        this.b = fdatVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djdy djdyVar = this.a;
            hmlVar.v(-1393530424);
            if (djdyVar != null) {
                djdx.b(djdyVar, (Integer) this.c.a(), hmlVar, 0);
            }
            hmlVar.o();
            this.b.a(hmlVar, 0);
        }
        return fctx.a;
    }
}

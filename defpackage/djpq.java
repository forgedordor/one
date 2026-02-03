package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpq implements fdat {
    final /* synthetic */ djpx a;

    public djpq(djpx djpxVar) {
        this.a = djpxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djpu.a((djpw) this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}

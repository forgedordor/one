package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxc implements fdat {
    final /* synthetic */ djyj a;

    public djxc(djyj djyjVar) {
        this.a = djyjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djyj djyjVar = this.a;
            djyg.m(djyjVar.b, djyjVar.e, null, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}

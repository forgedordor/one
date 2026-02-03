package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkqp implements fdat {
    final /* synthetic */ dkri a;

    public dkqp(dkri dkriVar) {
        this.a = dkriVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkqr.a((dkpi) this.a.c().get(1), null, hmlVar, 48);
        }
        return fctx.a;
    }
}

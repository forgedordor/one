package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djyb implements fdat {
    final /* synthetic */ djys a;

    public djyb(djys djysVar) {
        this.a = djysVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djys djysVar = this.a;
            djyg.m(djysVar.b, djysVar.e, null, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}

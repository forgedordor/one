package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djhr implements fdat {
    final /* synthetic */ djcy a;
    final /* synthetic */ djdm b;
    final /* synthetic */ hox c;

    public djhr(djcy djcyVar, djdm djdmVar, hox hoxVar) {
        this.a = djcyVar;
        this.b = djdmVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djes.d(this.a, this.b, this.c, hmlVar, 0);
        }
        return fctx.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djio implements fdat {
    final /* synthetic */ djcy a;

    public djio(djcy djcyVar) {
        this.a = djcyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djcy djcyVar = this.a;
            ics icsVarK = egq.k(ics.e, djbc.a(hmlVar));
            djew djewVar = djcyVar.d;
            djes.c(djewVar, true, djewVar.g.b, icsVarK, hmlVar, 48, 0);
        }
        return fctx.a;
    }
}

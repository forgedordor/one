package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dizp implements fdat {
    final /* synthetic */ dkpi a;
    final /* synthetic */ dizu b;

    public dizp(dkpi dkpiVar, dizu dizuVar) {
        this.a = dkpiVar;
        this.b = dizuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dizs.c(this.a, this.b.e.a, hmlVar, 0);
        }
        return fctx.a;
    }
}

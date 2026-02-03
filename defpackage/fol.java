package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fol implements fdau {
    public static final fol a = new fol();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ftl ftlVar = (ftl) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != ((iIntValue & 8) == 0 ? hmlVar.D(ftlVar) : hmlVar.F(ftlVar)) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ftx.b(ftlVar, null, null, 0L, 0L, 0L, 0.0f, hmlVar, iIntValue & 14);
        }
        return fctx.a;
    }
}

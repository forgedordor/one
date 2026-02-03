package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class foj implements fdau {
    public static final foj a = new foj();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ftn ftnVar = (ftn) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(ftnVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ftk.b(ftnVar, null, null, hmlVar, iIntValue & 14);
        }
        return fctx.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecyd implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ dsvh b;

    public ecyd(fdau fdauVar, dsvh dsvhVar) {
        this.a = fdauVar;
        this.b = dsvhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            Object objE = hmlVar.e(dsww.a);
            if (objE == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.a.a(new ecyg((dsvd) objE, this.b), hmlVar, 0);
        }
        return fctx.a;
    }
}

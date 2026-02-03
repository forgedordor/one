package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gel implements fdat {
    final /* synthetic */ hox a;

    public gel(hox hoxVar) {
        this.a = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hox hoxVar = this.a;
            if (fdgn.H((CharSequence) hoxVar.a())) {
                hmlVar.v(-1548950640);
            } else {
                hmlVar.v(-327061465);
                gyj.c((String) hoxVar.a(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 262142);
                hmlVar = hmlVar;
            }
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

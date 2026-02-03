package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpv implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ gxi c;
    final /* synthetic */ ikp d;
    final /* synthetic */ ebk e;

    public gpv(boolean z, boolean z2, ebk ebkVar, gxi gxiVar, ikp ikpVar) {
        this.a = z;
        this.b = z2;
        this.e = ebkVar;
        this.c = gxiVar;
        this.d = ikpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            gpl.a.c(this.a, this.b, this.e, null, this.c, this.d, 0.0f, 0.0f, hmlVar, 100663296);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

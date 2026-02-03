package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxm implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ gxi c;
    final /* synthetic */ ikp d;
    final /* synthetic */ ebk e;

    public gxm(boolean z, boolean z2, ebk ebkVar, gxi gxiVar, ikp ikpVar) {
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
            gxo.a.b(this.a, this.b, this.e, ics.e, this.c, this.d, hmlVar, 114822144);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

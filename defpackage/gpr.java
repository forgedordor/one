package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpr implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ gxi b;
    final /* synthetic */ ikp c;
    final /* synthetic */ ebk d;

    public gpr(boolean z, ebk ebkVar, gxi gxiVar, ikp ikpVar) {
        this.a = z;
        this.d = ebkVar;
        this.b = gxiVar;
        this.c = ikpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            gpl.a.c(this.a, false, this.d, null, this.b, this.c, 0.0f, 0.0f, hmlVar, 100663296);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzs implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ gak b;

    public fzs(fdau fdauVar, gak gakVar) {
        this.a = fdauVar;
        this.b = gakVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            this.a.a(this.b.b, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

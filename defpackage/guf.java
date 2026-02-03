package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class guf implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ guk b;

    public guf(fdau fdauVar, guk gukVar) {
        this.a = fdauVar;
        this.b = gukVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            fdau fdauVar = this.a;
            guk gukVar = this.b;
            gukVar.getClass();
            fdauVar.a(gukVar, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbb implements fdat {
    final /* synthetic */ gxi a;
    final /* synthetic */ ebk b;

    public hbb(ebk ebkVar, gxi gxiVar) {
        this.b = ebkVar;
        this.a = gxiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            gpl.a.c(true, false, this.b, null, this.a, gsc.e(15, hmlVar), 0.0f, 0.0f, hmlVar, 100663734);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

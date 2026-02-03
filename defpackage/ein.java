package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ein implements fdav {
    final /* synthetic */ fdau a;

    public ein(fdau fdauVar) {
        this.a = fdauVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        eih eihVar = (eih) obj;
        ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(eihVar) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 131) != 130, iIntValue & 1)) {
            this.a.a(eihVar, hmlVar, Integer.valueOf(iIntValue & 14));
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

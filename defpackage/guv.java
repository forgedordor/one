package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class guv implements fdat {
    final /* synthetic */ guk a;

    public guv(guk gukVar) {
        this.a = gukVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            gyj.c(this.a.b.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 262142);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

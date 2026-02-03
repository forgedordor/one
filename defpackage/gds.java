package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gds implements fdau {
    public static final gds a = new gds();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        guk gukVar = (guk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(gukVar) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 19) != 18, iIntValue & 1)) {
            gvb.c(gukVar, null, null, 0L, 0L, 0L, 0L, 0L, hmlVar, iIntValue & 14);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

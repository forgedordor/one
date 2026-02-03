package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class khz implements fdat {
    public static final khz a = new khz();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            fvx.c(null, 0L, 0L, 0L, 0L, 0, false, 0, null, null, hmlVar, 6, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}

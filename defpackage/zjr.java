package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjr {
    public static final void a(final zjp zjpVar, hml hmlVar, final int i) {
        int i2 = i & 1;
        hml hmlVarC = hmlVar.c(1604746169);
        if (i2 == 0 && hmlVarC.I()) {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zjq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    zjr.a(zjpVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

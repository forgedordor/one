package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ziw {
    public static final void a(final ziu ziuVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1615947374);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ziuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dizb dizbVar = ziuVar.a;
            hmlVarC.v(-1852732246);
            if (dizbVar != null) {
                diyy.c(dizbVar, null, hmlVarC, 0);
            }
            ((hmw) hmlVarC).ab();
            diyr diyrVar = ziuVar.b;
            if (diyrVar != null) {
                diyq.c(diyrVar, efy.d(ics.e, 8.0f), hmlVarC, 48);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ziv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ziw.a(ziuVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

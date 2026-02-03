package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktx {
    public static final void a(final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        hml hmlVarC = hmlVar.c(-1780171373);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i2 != 0) {
                icsVar = ics.e;
            }
            ics icsVar2 = icsVar;
            gvk.c(icsVar2, glz.c(hmlVarC).d, ije.g, 0L, 0.0f, 0.0f, dkz.a(1.0f, glz.a(hmlVarC).A), dktv.a, hmlVarC, 56);
            icsVar = icsVar2;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dktw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dktx.a(icsVar, (hml) obj, hpy.a(i4 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}

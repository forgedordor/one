package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwb {
    public static final void a(final cvvy cvvyVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(743434759);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cvvyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (!cvvyVar.a.isEmpty()) {
            dtdn.a(null, null, dtdj.b(glz.a(hmlVarC).D, 0L, hmlVarC, 14), null, null, hxe.d(230392026, new cvwa(cvvyVar), hmlVarC), hmlVarC, 196608, 27);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvvz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvwb.a(cvvyVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctuy {
    public static final void a(final fdvc fdvcVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1175084648);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hsf hsfVarA = hro.a(fdvcVar, hmlVarC);
            if (b(hsfVarA) != null) {
                djpx djpxVarB = b(hsfVarA);
                djpxVarB.getClass();
                djpu.e(djpxVarB, icsVar, hmlVarC, i2 & 112);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctux
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdvc fdvcVar2 = fdvcVar;
                    int i4 = i;
                    ctuy.a(fdvcVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final djpx b(hsf hsfVar) {
        return (djpx) hsfVar.a();
    }
}

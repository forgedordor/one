package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctov {
    public static final void a(fdae fdaeVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1470871299);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(icoVar, 16.0f, 18.0f, 16.0f, 0.0f, 8);
            if (z) {
                icsVarJ = icsVarJ.a(egq.d(icoVar, 1.0f));
            }
            fdaeVar2 = fdaeVar;
            dtdi.e(fdaeVar2, icsVarJ, false, null, null, null, ctox.a, hmlVarC, (i2 & 14) | 805306368, 508);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctou
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar2;
                    int i4 = i;
                    ctov.a(fdaeVar3, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

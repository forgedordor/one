package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizs {
    public static final void a(final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-572434123);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarK = egq.k(ics.e, 16.0f);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtfn.a(djrs.b(djrr.ak, hmlVarC), jqu.b(R.string.chip_close_icon, hmlVarC), dli.c(icsVarK, (ebk) objS, null, false, null, null, fdaeVar, 28), 0L, hmlVarC, 0, 8);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dizm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dizs.a(fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1907046261);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVar2, i2 & 14, 0, 65534);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dizo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dizs.b(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(dkpi dkpiVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        final dkpi dkpiVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-357114687);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkpiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            dkpiVar2 = dkpiVar;
        } else {
            dkpiVar2 = dkpiVar;
            dkqr.o(dkpiVar2, null, dihi.c(z ? egq.k(efy.j(ics.e, 4.0f, 0.0f, 0.0f, 0.0f, 14), 18.0f) : egq.k(ics.e, 24.0f)), 0, null, hmlVarC, i2 & 14, 24);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dizn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkpi dkpiVar3 = dkpiVar2;
                    int i4 = i;
                    dizs.c(dkpiVar3, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean d(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.dizu r30, defpackage.ics r31, defpackage.hml r32, final int r33) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dizs.e(dizu, ics, hml, int):void");
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkeo {
    public static final void a(fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-219655286);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtfk.b(fdaeVar2, null, false, null, null, dkei.a, hmlVarC, (i2 & 14) | 1572864, 62);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkej
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkeo.a(fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dkep dkepVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1399546767);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkepVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            fdae fdaeVar = dkepVar.c;
            ics icsVarI = efy.i(egq.d(icsVar, 1.0f), 16.0f, 0.0f, 2);
            hmlVarC.v(5004770);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: dkek
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        igx igxVar = (igx) obj2;
                        igxVar.getClass();
                        hoxVar.b(Boolean.valueOf(igxVar.b()));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            ics icsVarA = ifs.a(icsVarI, (fdap) objS2);
            String str = dkepVar.b;
            fdap fdapVar = dkepVar.d;
            hmlVarC.v(639695137);
            hwv hwvVarD = null;
            if (fdaeVar != null && (((Boolean) hoxVar.a()).booleanValue() || str.length() > 0)) {
                hwvVarD = hxe.d(855340276, new dkem(fdaeVar), hmlVarC);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dtgi.a(str, fdapVar, icsVarA, false, null, hxe.d(1321871350, new dken(dkepVar), hmlVarC), hwvVarD, null, new fae(3, null, dkepVar.e + (-1) != 0 ? 1 : 4, 0, 122), null, 0, 0, null, null, hmlVar2, 12582912, 0, 0);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkel
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dkep dkepVar2 = dkepVar;
                    int i4 = i;
                    dkeo.b(dkepVar2, icsVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

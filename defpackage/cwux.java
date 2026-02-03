package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwux {
    public static final void a(final fdae fdaeVar, final ics icsVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2024626801);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarK = egq.k(icsVar, 48.0f);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarJ = efy.j(dli.c(icsVarK, (ebk) objS, fsd.a(false, 18.0f, 4), false, null, new jrw(0), fdaeVar, 12), 8.0f, 19.5f, 0.0f, 0.0f, 12);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = cwuk.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVar.a(hmlVarC, Integer.valueOf((i4 >> 6) & 14));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwun
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    ics icsVar2 = icsVar;
                    int i5 = i;
                    cwux.a(fdaeVar3, icsVar2, fdatVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.cwui r55, final defpackage.fdae r56, defpackage.ics r57, defpackage.hml r58, final int r59) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwux.b(cwui, fdae, ics, hml, int):void");
    }

    public static final void c(final cwui cwuiVar, final fdae fdaeVar, final fdae fdaeVar2, ics icsVar, hml hmlVar, final int i) {
        cwui cwuiVar2;
        int i2;
        final ics icsVar2;
        hml hmlVar2;
        hml hmlVarC = hmlVar.c(-792385139);
        if ((i & 6) == 0) {
            cwuiVar2 = cwuiVar;
            i2 = (true != hmlVarC.F(cwuiVar2) ? 2 : 4) | i;
        } else {
            cwuiVar2 = cwuiVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 128 : 256;
        }
        if (((i2 | 3072) & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            hmlVar2 = hmlVarC;
        } else {
            icsVar2 = ics.e;
            iby ibyVar = ibw.b;
            ics icsVarA = efm.a(icsVar2, 1);
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = cwuk.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar3);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            gvk.c(idb.a(egq.b(egq.d(egq.u(efy.f(icsVar2, 8.0f, 8.0f, 8.0f, 8.0f), 36.0f, 0.0f, 2), 1.0f), 1.0f), -1.0f), evn.b(12.0f), glz.a(hmlVarC).I, 0L, 0.0f, 0.0f, null, cwue.a, hmlVarC, 120);
            hmlVar2 = hmlVarC;
            ics icsVarD = egq.d(efy.j(icsVar2, 8.0f, 0.0f, 0.0f, 8.0f, 6), 1.0f);
            hmlVar2.v(-1066585843);
            hmlVar2.v(-487940011);
            hmwVar.ab();
            kio kioVar = (kio) hmlVar2.e(jmh.e);
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new kpv(kioVar);
                hmwVar.af(objS);
            }
            kpv kpvVar = (kpv) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new kph();
                hmwVar.af(objS2);
            }
            kph kphVar = (kph) objS2;
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS3 = hplVar;
            }
            hox hoxVar = (hox) objS3;
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                objS4 = new kpo(kphVar);
                hmwVar.af(objS4);
            }
            kpo kpoVar = (kpo) objS4;
            Object objS5 = hmwVar.S();
            if (objS5 == obj) {
                hpl hplVar2 = new hpl(fctx.a, hpb.a);
                hmwVar.af(hplVar2);
                objS5 = hplVar2;
            }
            hox hoxVar2 = (hox) objS5;
            boolean zF = hmlVar2.F(kpvVar) | hmlVar2.B(257);
            Object objS6 = hmwVar.S();
            if (zF || objS6 == obj) {
                objS6 = new cwut(hoxVar2, kpvVar, kpoVar, hoxVar);
                hmwVar.af(objS6);
            }
            ixm ixmVar = (ixm) objS6;
            Object objS7 = hmwVar.S();
            if (objS7 == obj) {
                objS7 = new cwuu(hoxVar, kpoVar);
                hmwVar.af(objS7);
            }
            boolean zF2 = hmlVar2.F(kpvVar);
            Object objS8 = hmwVar.S();
            if (zF2 || objS8 == obj) {
                objS8 = new cwuv(kpvVar);
                hmwVar.af(objS8);
            }
            iwh.b(jsh.c(icsVarD, false, (fdap) objS8), hxe.d(-1759682870, new cwuw(hoxVar2, kphVar, cwuiVar2, fdaeVar, fdaeVar2), hmlVar2), ixmVar, hmlVar2, 48);
            hmwVar.ab();
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwuo
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cwui cwuiVar3 = cwuiVar;
                    fdae fdaeVar4 = fdaeVar;
                    fdae fdaeVar5 = fdaeVar2;
                    cwux.c(cwuiVar3, fdaeVar4, fdaeVar5, icsVar2, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrg {
    public static final void a(final dkri dkriVar, ics icsVar, int i, boolean z, hml hmlVar, final int i2, final int i3) {
        int i4;
        ics icsVarA;
        final boolean z2;
        int i5 = i3 & 1;
        hml hmlVarC = hmlVar.c(92906746);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != hmlVarC.D(dkriVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != hmlVarC.B(i) ? 128 : 256;
        }
        int i8 = i3 & 8;
        boolean z3 = i8 == 0;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            z2 = z;
        } else {
            if (i6 != 0) {
                icsVar = ics.e;
            }
            if (i7 != 0) {
                i = 4;
            }
            boolean z4 = z3 & z;
            hmlVarC.v(-910923272);
            if (z4) {
                ico icoVar = ics.e;
                hmlVarC.v(1849434622);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = new fdap() { // from class: dkqt
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            ikl iklVar = (ikl) obj;
                            iklVar.getClass();
                            iklVar.s(1);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                icsVarA = icsVar.a(ijn.a(icoVar, (fdap) objS));
            } else {
                icsVarA = icsVar;
            }
            ((hmw) hmlVarC).ab();
            djus.a(icsVarA, hxe.d(534478007, new dkrf(dkriVar, i, z4), hmlVarC), hmlVarC, 432);
            z2 = z4;
        }
        final int i9 = i;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final ics icsVar2 = icsVar;
            hpxVarL.d = new fdat() { // from class: dkqu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkri dkriVar2 = dkriVar;
                    ics icsVar3 = icsVar2;
                    int i10 = i9;
                    dkrg.a(dkriVar2, icsVar3, i10, z2, (hml) obj, hpy.a(i2 | 1), i3);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1801762240);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            edj.a(null, null, hxe.d(-1207309014, new dkrc(z, fdauVar), hmlVarC), hmlVarC, 3072, 7);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkqv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i4 = i;
                    dkrg.b(z2, fdauVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(ics icsVar, int i, final fdau fdauVar, hml hmlVar, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        final int i7;
        fdauVar.getClass();
        int i8 = i3 & 1;
        hml hmlVarC = hmlVar.c(523461458);
        if (i8 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (i == 0) {
                i6 = -1;
                i5 = 0;
            } else {
                i5 = i;
                i6 = i - 1;
            }
            i4 |= true != hmlVarC.B(i6) ? 16 : 32;
            i = i5;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != hmlVarC.F(fdauVar) ? 128 : 256;
        }
        if ((i4 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            i7 = i;
        } else {
            if (i8 != 0) {
                icsVar = ics.e;
            }
            i7 = i9 == 0 ? i : 1;
            hmlVarC.v(-1518019052);
            ics icsVarA = iex.a(ecs.a(egq.z(icsVar, null, 3), 1.0f, false), i(i7));
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dkqs.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
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
            fdauVar.a(edf.a, hmlVarC, Integer.valueOf((((((i4 & 1022) << 3) & 7168) >> 6) & 112) | 6));
            hmlVarC.n();
            hmwVar.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final ics icsVar2 = icsVar;
            hpxVarL.d = new fdat() { // from class: dkqx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar2;
                    int i10 = i7;
                    dkrg.d(icsVar3, i10, fdauVar, (hml) obj, hpy.a(i2 | 1), i3);
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final fdat fdatVar, fdat fdatVar2, final float f, final ics icsVar, final int i, hml hmlVar, final int i2) {
        int i3;
        final fdat fdatVar3;
        fdat fdatVar4 = fdatVar2;
        fdatVar.getClass();
        fdatVar4.getClass();
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1238085463);
        if (i4 == 0) {
            i3 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.F(fdatVar4) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.A(f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            fdatVar3 = fdatVar4;
        } else {
            float fH = h(f);
            hmlVarC.v(-1518019052);
            ics icsVarA = iex.a(ecs.a(egq.z(icsVar, null, 3), 1.0f, false), i(i));
            iby ibyVar = ibw.a;
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = dkqs.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar5 = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar5);
            fdat fdatVar6 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar6);
            fdat fdatVar7 = jbb.f;
            int i5 = i3;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar7);
            }
            fdat fdatVar8 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar8);
            ico icoVar = ics.e;
            ics icsVarC = egq.c(icoVar, 1.0f);
            ixm ixmVarA2 = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA2 = dkqs.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarC);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar5);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar6);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar7);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar8);
            egp egpVar = egp.a;
            ics icsVarA2 = egpVar.a(icoVar, fH, true);
            ixm ixmVarA3 = ecz.a(ibyVar, false);
            int iA3 = dkqs.a(hmg.b(hmlVarC));
            hxi hxiVarAk3 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVarC, icsVarA2);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA3, fdatVar5);
            hsk.b(hmlVarC, hxiVarAk3, fdatVar6);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar.af(numValueOf3);
                hmlVarC.h(numValueOf3, fdatVar7);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar8);
            fdatVar.a(hmlVarC, Integer.valueOf(i5 & 14));
            hmlVarC.n();
            egt.a(egpVar.a(icoVar, f, true), hmlVarC);
            ics icsVarA3 = egpVar.a(icoVar, fH, true);
            ixm ixmVarA4 = ecz.a(ibyVar, false);
            int iA4 = dkqs.a(hmg.b(hmlVarC));
            hxi hxiVarAk4 = hmwVar.ak();
            ics icsVarB4 = icj.b(hmlVarC, icsVarA3);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA4, fdatVar5);
            hsk.b(hmlVarC, hxiVarAk4, fdatVar6);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA4))) {
                Integer numValueOf4 = Integer.valueOf(iA4);
                hmwVar.af(numValueOf4);
                hmlVarC.h(numValueOf4, fdatVar7);
            }
            hsk.b(hmlVarC, icsVarB4, fdatVar8);
            fdat fdatVar9 = fdatVar2;
            fdatVar9.a(hmlVarC, Integer.valueOf((i5 >> 3) & 14));
            hmlVarC.n();
            hmlVarC.n();
            hmlVarC.n();
            hmwVar.ab();
            fdatVar3 = fdatVar9;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkqz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdat fdatVar10 = fdatVar;
                    fdat fdatVar11 = fdatVar3;
                    float f2 = f;
                    ics icsVar2 = icsVar;
                    dkrg.e(fdatVar10, fdatVar11, f2, icsVar2, i, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.fdat r22, final defpackage.fdat r23, defpackage.fdat r24, defpackage.fdat r25, float r26, final defpackage.ics r27, final int r28, defpackage.hml r29, final int r30) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkrg.f(fdat, fdat, fdat, fdat, float, ics, int, hml, int):void");
    }

    public static final void g(final fdat fdatVar, fdat fdatVar2, fdat fdatVar3, final float f, final ics icsVar, final int i, hml hmlVar, final int i2) {
        int i3;
        final fdat fdatVar4;
        final fdat fdatVar5;
        fdat fdatVar6 = fdatVar2;
        fdat fdatVar7 = fdatVar3;
        fdatVar.getClass();
        fdatVar6.getClass();
        fdatVar7.getClass();
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(165983605);
        if (i4 == 0) {
            i3 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.F(fdatVar6) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar7) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            fdatVar5 = fdatVar6;
            fdatVar4 = fdatVar7;
        } else {
            float fH = h(f);
            hmlVarC.v(-1518019052);
            ics icsVarA = iex.a(ecs.a(egq.z(icsVar, null, 3), 1.0f, false), i(i));
            iby ibyVar = ibw.a;
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = dkqs.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            int i5 = i3;
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar8 = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar8);
            fdat fdatVar9 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar9);
            fdat fdatVar10 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar10);
            }
            fdat fdatVar11 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar11);
            ico icoVar = ics.e;
            ics icsVarC = egq.c(icoVar, 1.0f);
            ixm ixmVarA2 = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA2 = dkqs.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarC);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar8);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar9);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar10);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar11);
            egp egpVar = egp.a;
            ics icsVarA2 = egpVar.a(icoVar, fH, true);
            ixm ixmVarA3 = ecz.a(ibyVar, false);
            int iA3 = dkqs.a(hmg.b(hmlVarC));
            hxi hxiVarAk3 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVarC, icsVarA2);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA3, fdatVar8);
            hsk.b(hmlVarC, hxiVarAk3, fdatVar9);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar.af(numValueOf3);
                hmlVarC.h(numValueOf3, fdatVar10);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar11);
            fdatVar.a(hmlVarC, Integer.valueOf(i5 & 14));
            hmlVarC.n();
            egt.a(egpVar.a(icoVar, f, true), hmlVarC);
            ics icsVarA3 = egpVar.a(icoVar, fH, true);
            ixm ixmVarA4 = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA4 = dkqs.a(hmg.b(hmlVarC));
            hxi hxiVarAk4 = hmwVar.ak();
            ics icsVarB4 = icj.b(hmlVarC, icsVarA3);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA4, fdatVar8);
            hsk.b(hmlVarC, hxiVarAk4, fdatVar9);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA4))) {
                Integer numValueOf4 = Integer.valueOf(iA4);
                hmwVar.af(numValueOf4);
                hmlVarC.h(numValueOf4, fdatVar10);
            }
            hsk.b(hmlVarC, icsVarB4, fdatVar11);
            ics icsVarB5 = edp.b(icoVar, fH, true);
            ixm ixmVarA5 = ecz.a(ibyVar, false);
            int iA5 = dkqs.a(hmg.b(hmlVarC));
            hxi hxiVarAk5 = hmwVar.ak();
            ics icsVarB6 = icj.b(hmlVarC, icsVarB5);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA5, fdatVar8);
            hsk.b(hmlVarC, hxiVarAk5, fdatVar9);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA5))) {
                Integer numValueOf5 = Integer.valueOf(iA5);
                hmwVar.af(numValueOf5);
                hmlVarC.h(numValueOf5, fdatVar10);
            }
            hsk.b(hmlVarC, icsVarB6, fdatVar11);
            fdat fdatVar12 = fdatVar2;
            fdatVar12.a(hmlVarC, Integer.valueOf((i5 >> 3) & 14));
            hmlVarC.n();
            egt.a(edp.b(icoVar, f, true), hmlVarC);
            ics icsVarB7 = edp.b(icoVar, fH, true);
            ixm ixmVarA6 = ecz.a(ibyVar, false);
            int iA6 = dkqs.a(hmg.b(hmlVarC));
            hxi hxiVarAk6 = hmwVar.ak();
            ics icsVarB8 = icj.b(hmlVarC, icsVarB7);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA6, fdatVar8);
            hsk.b(hmlVarC, hxiVarAk6, fdatVar9);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA6))) {
                Integer numValueOf6 = Integer.valueOf(iA6);
                hmwVar.af(numValueOf6);
                hmlVarC.h(numValueOf6, fdatVar10);
            }
            hsk.b(hmlVarC, icsVarB8, fdatVar11);
            fdat fdatVar13 = fdatVar3;
            fdatVar13.a(hmlVarC, Integer.valueOf((i5 >> 6) & 14));
            hmlVarC.n();
            hmlVarC.n();
            hmlVarC.n();
            hmlVarC.n();
            hmwVar.ab();
            fdatVar5 = fdatVar12;
            fdatVar4 = fdatVar13;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkqw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdat fdatVar14 = fdatVar;
                    fdat fdatVar15 = fdatVar5;
                    fdat fdatVar16 = fdatVar4;
                    float f2 = f;
                    ics icsVar2 = icsVar;
                    dkrg.g(fdatVar14, fdatVar15, fdatVar16, f2, icsVar2, i, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final float h(float f) {
        return (1.0f - f) / 2.0f;
    }

    private static final ikp i(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? evn.b(24.0f) : ikj.a : evn.a;
    }
}

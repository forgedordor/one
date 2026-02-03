package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkke {
    public static final float a(float f) {
        return Math.min(Math.abs(f) / 250.0f, 1.0f);
    }

    public static final ics b(ics icsVar, dkkr dkkrVar, fdae fdaeVar, iqa iqaVar) {
        return icsVar.a(new ick("com.google.android.libraries.communications.ux.components.message.bubble.addBubbleTouchGestures", dkkrVar, new dkjn(dkkrVar, iqaVar, fdaeVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.dkkr r18, defpackage.ics r19, boolean r20, defpackage.ddp r21, defpackage.dklt r22, final defpackage.fdau r23, defpackage.hml r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkke.c(dkkr, ics, boolean, ddp, dklt, fdau, hml, int, int):void");
    }

    public static final void d(final ego egoVar, final dkkr dkkrVar, final boolean z, final fdae fdaeVar, final hox hoxVar, final float f, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        iby ibyVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1993637418);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(egoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dkkrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.A(f) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 524288 : 1048576;
        }
        if ((i2 & 599187) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            iqa iqaVar = (iqa) hmlVarC.e(jmh.h);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new hpf(1.0f);
                hmwVar.af(objS);
            }
            hrg hrgVar = (hrg) objS;
            hmwVar.ab();
            dkgu dkguVar = dkkrVar.y;
            icc iccVar = dkguVar.j.c ? ibw.n : ibw.o;
            dkgv dkgvVar = dkguVar.b;
            ico icoVar = ics.e;
            dkgv dkgvVar2 = dkgv.c;
            ics icsVarA = ien.a(egoVar.a(icoVar, 1.0f, dkgvVar == dkgvVar2 || dkgvVar == dkgv.b), true != dkkrVar.h ? 1.0f : 0.6f);
            int iOrdinal = dkgvVar.ordinal();
            if (iOrdinal == 0) {
                ibyVar = ibw.a;
            } else if (iOrdinal == 1) {
                ibyVar = ibw.b;
            } else {
                if (iOrdinal != 2) {
                    throw new fctg();
                }
                ibyVar = ibw.c;
            }
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = dkgw.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            ixm ixmVarA2 = egk.a(ecr.a, iccVar, hmlVarC, 0);
            int iA2 = dkgw.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icoVar);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            hmlVarC.v(-289688142);
            if (dkgvVar == dkgvVar2) {
                m(dkguVar.a, dkkrVar.v.d, hmlVarC, 0);
            }
            hmwVar.ab();
            n(((jou) hmlVarC.e(jmh.n)).d() * dkkrVar.v.a, hxe.d(-1204088498, new dkja(dkkrVar, fdaeVar, iqaVar, hoxVar, z, hrgVar, f, fdauVar), hmlVarC), hmlVarC, 48);
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkic
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ego egoVar2 = egoVar;
                    dkkr dkkrVar2 = dkkrVar;
                    boolean z2 = z;
                    fdae fdaeVar3 = fdaeVar;
                    hox hoxVar2 = hoxVar;
                    float f2 = f;
                    dkke.d(egoVar2, dkkrVar2, z2, fdaeVar3, hoxVar2, f2, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final ics icsVar, final dkkr dkkrVar, final boolean z, final dkgn dkgnVar, final ddp ddpVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1610783045);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dkkrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(dkgnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? hmlVarC.D(ddpVar) : hmlVarC.F(ddpVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 65536 : 131072;
        }
        int i4 = i2;
        if ((74899 & i4) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            hmlVarC.v(-1774268244);
            boolean z2 = (((Boolean) dljt.b(hmlVarC).d.invoke()).booleanValue() && z) || (!((Boolean) dljt.b(hmlVarC).d.invoke()).booleanValue() && diho.b(hmlVarC));
            hmwVar.ab();
            ics icsVarF = efy.f(egq.d(icsVar, 1.0f), dkks.b(dkkrVar), dkks.c(dkkrVar), 8.0f, dkks.a(dkkrVar, z2 && dkkrVar.y.g != null));
            if (dkkrVar.q != null) {
                icsVarF = icsVarF.a(idb.a(ics.e, 1.0f));
            }
            ics icsVar2 = icsVarF;
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new ebk();
                hmwVar.af(objS2);
            }
            ebk ebkVar = (ebk) objS2;
            hmwVar.ab();
            hmlVarC.v(-1224400529);
            boolean zE = ((i4 & 112) == 32) | hmlVarC.E(z2) | hmlVarC.F(fdjxVar) | ((57344 & i4) == 16384 || ((i4 & 32768) != 0 && hmlVarC.F(ddpVar)));
            boolean z3 = (i4 & 7168) == 2048;
            Object objS3 = hmwVar.S();
            if ((zE | z3) || objS3 == obj) {
                final boolean z4 = z2;
                fdae fdaeVar = new fdae() { // from class: dkhg
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dkly dklyVar;
                        dkkr dkkrVar2 = dkkrVar;
                        if (!dkke.o(dkkrVar2) || ((dkkrVar2.v.c && z4) || !((dklyVar = dkkrVar2.f) == null || dklyVar.b().isEmpty()))) {
                            dkgnVar.a();
                        } else if (dkkrVar2.s) {
                            fdil.d(fdjxVar, null, null, new dkjb(ddpVar, null), 3);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(fdaeVar);
                objS3 = fdaeVar;
            }
            hmwVar.ab();
            ics icsVarC = dli.c(icsVar2, ebkVar, null, false, null, null, (fdae) objS3, 28);
            int i5 = (i4 >> 6) & 7168;
            ixm ixmVarA = edl.a(ecr.c, dkks.d(dkkrVar), hmlVarC, 0);
            int iA = dkgw.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
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
            fdauVar.a(edp.a, hmlVarC, Integer.valueOf(((i5 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkhr
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar3 = icsVar;
                    dkkr dkkrVar2 = dkkrVar;
                    boolean z5 = z;
                    dkgn dkgnVar2 = dkgnVar;
                    ddp ddpVar2 = ddpVar;
                    dkke.e(icsVar3, dkkrVar2, z5, dkgnVar2, ddpVar2, fdauVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0297 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0158  */
    /* JADX WARN: Type inference failed for: r14v1, types: [dew, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.dkkr r25, final boolean r26, final defpackage.dkgn r27, final defpackage.ddp r28, defpackage.ics r29, defpackage.fdau r30, defpackage.hml r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkke.f(dkkr, boolean, dkgn, ddp, ics, fdau, hml, int, int):void");
    }

    public static final void g(final ics icsVar, final dkkr dkkrVar, final dkly dklyVar, final dklt dkltVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1548232062);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dkkrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dklyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(dkltVar) ? 1024 : 2048;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            if (dklyVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dkhx
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ics icsVar2 = icsVar;
                            dkkr dkkrVar2 = dkkrVar;
                            dkke.g(icsVar2, dkkrVar2, null, dkltVar, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVar2 = hmlVarC;
            q(dkkrVar, dklyVar, dkltVar, efy.j(icsVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), hmlVar2, (i4 >> 3) & 1022);
        }
        hpx hpxVarL2 = hmlVar2.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkhy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    dkkr dkkrVar2 = dkkrVar;
                    dkly dklyVar2 = dklyVar;
                    dkke.g(icsVar2, dkkrVar2, dklyVar2, dkltVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final ede edeVar, evya evyaVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final ede edeVar2;
        final evya evyaVar2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-721244070);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(evyaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            edeVar2 = edeVar;
            evyaVar2 = evyaVar;
            fdaeVar2 = fdaeVar;
        } else {
            if (evyaVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dkig
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ede edeVar3 = edeVar;
                            int i4 = i;
                            dkke.h(edeVar3, null, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            edeVar2 = edeVar;
            evyaVar2 = evyaVar;
            fdaeVar2 = fdaeVar;
            djoj.a(edeVar2, evyaVar2, true, fdaeVar2, hmlVarC, (i2 & 14) | 384 | (i2 & 112) | ((i2 << 3) & 7168), 0);
            Object objE = hmlVarC.e(lyj.a);
            hmlVarC.v(5004770);
            int i4 = i2 & 896;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 256 || objS == hmk.a) {
                objS = new fdap() { // from class: dkih
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((hny) obj).getClass();
                        return new dkje(fdaeVar2);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.c(objE, (fdap) objS, hmlVarC);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkii
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar3 = edeVar2;
                    evya evyaVar3 = evyaVar2;
                    int i5 = i;
                    dkke.h(edeVar3, evyaVar3, fdaeVar2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final ede edeVar, final dkkr dkkrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(513315059);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dkkrVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            dkny dknyVar = dkkrVar.e;
            if (dknyVar != null) {
                j(hoxVar, dknyVar);
            }
            dkny dknyVar2 = (dkny) hoxVar.a();
            if (dknyVar2 == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dkgy
                        @Override // defpackage.fdat
                        public final Object a(Object obj2, Object obj3) {
                            ((Integer) obj3).intValue();
                            ede edeVar2 = edeVar;
                            int i4 = i;
                            dkke.i(edeVar2, dkkrVar, (hml) obj2, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            ics icsVarA = edeVar.a(egq.k(ics.e, 0.0f), dkkrVar.y.b == dkgv.a ? ibw.a : ibw.c);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dkgw.a(hmg.b(hmlVarC));
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
            boolean z = dknyVar == null;
            hmlVarC.v(5004770);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdae() { // from class: dkgz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dkke.j(hoxVar, null);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            dknv.a(dknyVar2, (fdae) objS2, z, hmlVarC, 48);
            hmlVarC.n();
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkha
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ede edeVar2 = edeVar;
                    int i4 = i;
                    dkke.i(edeVar2, dkkrVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(hox hoxVar, dkny dknyVar) {
        hoxVar.b(dknyVar);
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [dew, java.lang.Object] */
    public static final void k(final ede edeVar, final dkkr dkkrVar, final hox hoxVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3;
        Object objE;
        int i4;
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(319961404);
        if (i5 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dkkrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (dkkrVar.n == null || !z) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dkhp
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ede edeVar2 = edeVar;
                            dkkr dkkrVar2 = dkkrVar;
                            hox hoxVar2 = hoxVar;
                            dkke.k(edeVar2, dkkrVar2, hoxVar2, z, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVarC.v(-1314083096);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            Object obj2 = objS;
            if (objS == obj) {
                dfw dfwVar = new dfw(hoxVar.a());
                dfwVar.d(Float.valueOf(0.0f));
                hmwVar.af(dfwVar);
                obj2 = dfwVar;
            }
            hmwVar.ab();
            dhk dhkVarD = dhy.d((dfw) obj2, null, hmlVarC, 0, 2);
            dkjq dkjqVar = dkjq.a;
            dib dibVar = diu.a;
            if (dhkVarD.t()) {
                i3 = 0;
                hmlVarC.v(1666852333);
                hmwVar.ab();
                objE = dhkVarD.e();
            } else {
                i3 = 0;
                hmlVarC.v(1666598288);
                boolean zD = hmlVarC.D(dhkVarD);
                objE = hmwVar.S();
                if (zD || objE == obj) {
                    hzg hzgVarA = hzf.a();
                    fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                    hzg hzgVarB = hzf.b(hzgVarA);
                    try {
                        Object objE2 = dhkVarD.e();
                        hzf.e(hzgVarA, hzgVarB, fdapVarK);
                        hmwVar.af(objE2);
                        objE = objE2;
                    } catch (Throwable th) {
                        hzf.e(hzgVarA, hzgVarB, fdapVarK);
                        throw th;
                    }
                }
                hmwVar.ab();
            }
            hmlVarC.v(343572223);
            ((Number) ((dfw) objE).b()).floatValue();
            float fFloatValue = ((Number) hoxVar.a()).floatValue();
            hmwVar.ab();
            Float fValueOf = Float.valueOf(fFloatValue);
            boolean zD2 = hmlVarC.D(dhkVarD);
            Object objS2 = hmwVar.S();
            if (zD2 || objS2 == hmk.a) {
                dkjo dkjoVar = new dkjo(dhkVarD);
                hxn hxnVar = hrp.a;
                objS2 = new hnt(dkjoVar, null);
                hmwVar.af(objS2);
            }
            dfw dfwVar2 = (dfw) ((hsf) objS2).a();
            hmlVarC.v(343572223);
            ((Number) dfwVar2.b()).floatValue();
            float fFloatValue2 = ((Number) hoxVar.a()).floatValue();
            hmwVar.ab();
            Float fValueOf2 = Float.valueOf(fFloatValue2);
            boolean zD3 = hmlVarC.D(dhkVarD);
            Object objS3 = hmwVar.S();
            if (zD3 || objS3 == hmk.a) {
                dkjp dkjpVar = new dkjp(dhkVarD);
                hxn hxnVar2 = hrp.a;
                objS3 = new hnt(dkjpVar, null);
                hmwVar.af(objS3);
            }
            int i6 = i3;
            float fFloatValue3 = ((Number) dhy.f(dhkVarD, fValueOf, fValueOf2, dkjqVar.a(((hsf) objS3).a(), hmlVarC, Integer.valueOf(i3)), dibVar, hmlVarC, 196608).a()).floatValue();
            hmwVar.ab();
            hmlVarC.v(-1754725085);
            int i7 = (!o(dkkrVar) || v(dkkrVar, hmlVarC)) ? i6 : 1;
            hmwVar.ab();
            if (i7 != 0) {
                i4 = -60;
            } else {
                i4 = (dkkrVar.y.b == dkgv.a ? -1 : 1) * 60;
            }
            hmlVarC.v(-1754717085);
            int i8 = (!o(dkkrVar) || v(dkkrVar, hmlVarC)) ? i6 : 1;
            hmwVar.ab();
            iby ibyVar = (i8 == 0 && dkkrVar.y.b != dkgv.a) ? ibw.f : ibw.d;
            dtfn.a(djrs.b(djrr.f10do, hmlVarC), null, efy.d(edeVar.a(egq.k(dkl.a(ien.a(efs.c(ics.e, i4, 0.0f, 2), fFloatValue3), glz.a(hmlVarC).a, evn.a), 40.0f), ibyVar), 8.0f), glz.a(hmlVarC).b, hmlVarC, 48, 0);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkhq
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    ede edeVar2 = edeVar;
                    dkkr dkkrVar2 = dkkrVar;
                    hox hoxVar2 = hoxVar;
                    dkke.k(edeVar2, dkkrVar2, hoxVar2, z, (hml) obj3, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final dkgu dkguVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(341341535);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dkguVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dkzl dkzlVar = dkguVar.h;
            if (dkzlVar != null) {
                dkzk.a(dkzlVar, true != dkguVar.e ? 0.0f : 162.0f, dkkg.c(0.0f, dkguVar.j.b && dkguVar.b != dkgv.b, dkguVar.a != null, hmlVarC, 1), dkgo.a(dkks.g(dkguVar)), hmlVarC, 0);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkib
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    dkke.l(dkguVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(defpackage.dkkt r23, final boolean r24, defpackage.hml r25, final int r26) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkke.m(dkkt, boolean, hml, int):void");
    }

    public static final void n(final float f, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        fdatVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1255066995);
        if (i3 == 0) {
            i2 = (true != hmlVarC.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hnj.a(jmh.n.c(new dkjf(hmlVarC, f)), fdatVar, hmlVarC, (i2 & 112) | 8);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkid
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    int i4 = i;
                    dkke.n(f2, fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean o(dkkr dkkrVar) {
        dkgu dkguVar = dkkrVar.y;
        return dkguVar.j.b && dkguVar.b != dkgv.b;
    }

    public static final void p(final edp edpVar, final dirx dirxVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2127771273);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dirxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (dirxVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dkik
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            edp edpVar2 = edpVar;
                            int i4 = i;
                            dkke.p(edpVar2, null, z, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVarC.v(383771512);
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(edp.a(icoVar, ibw.l), 0.0f, 0.0f, 0.0f, 2.0f, 7);
            if (diho.b(hmlVarC)) {
                icsVarJ = icsVarJ.a(efs.c(icoVar, 0.0f, -9.0f, 1));
            }
            if (z) {
                hmlVarC.v(1849434622);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = new fdap() { // from class: dkil
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            jto jtoVar = (jto) obj;
                            jtoVar.getClass();
                            jtk.z(jtoVar, 2.0f);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                icsVarJ = icsVarJ.a(jsh.c(icoVar, false, (fdap) objS));
            }
            ((hmw) hmlVarC).ab();
            dirw.p(dirxVar, icsVarJ, hmlVarC, 0);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkgx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    dirx dirxVar2 = dirxVar;
                    int i4 = i;
                    dkke.p(edpVar2, dirxVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void q(final dkkr dkkrVar, final dkly dklyVar, final dklt dkltVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        final dkkr dkkrVar2;
        final dkly dklyVar2;
        final dklt dkltVar2;
        final ics icsVar2;
        final int i3;
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(-26539395);
        if (i4 == 0) {
            i2 = (true != hmlVarC.D(dkkrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dklyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dkltVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            dkkrVar2 = dkkrVar;
            dklyVar2 = dklyVar;
            dkltVar2 = dkltVar;
            icsVar2 = icsVar;
            i3 = i;
        } else {
            if (dklyVar.b().isEmpty()) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dkie
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dkkr dkkrVar3 = dkkrVar;
                            dkly dklyVar3 = dklyVar;
                            dklt dkltVar3 = dkltVar;
                            dkke.q(dkkrVar3, dklyVar3, dkltVar3, icsVar, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            dkkrVar2 = dkkrVar;
            dklyVar2 = dklyVar;
            dkltVar2 = dkltVar;
            icsVar2 = icsVar;
            i3 = i;
            int i5 = i2 >> 3;
            boolean z = dkkrVar2.o;
            ics icsVarC = ics.e;
            if (!z) {
                icsVarC = dihi.c(icsVarC);
            }
            ics icsVarA = icsVarC.a(icsVar2);
            ixm ixmVarA = egk.a(ecr.a, ibw.o, hmlVarC, 48);
            int iA = dkgw.a(hmg.b(hmlVarC));
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
            int i6 = i5 & 14;
            hsk.b(hmlVarC, icsVarB, jbb.c);
            if (dkltVar2 != null) {
                hmlVarC.v(365948122);
                dklo.b(dklyVar2, dkltVar2, hmlVarC, i5 & 126, 0);
                hmwVar.ab();
            } else {
                hmlVarC.v(366000109);
                dklo.b(dklyVar2, null, hmlVarC, i6, 2);
                hmwVar.ab();
            }
            hmlVarC.n();
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkif
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkkr dkkrVar3 = dkkrVar2;
                    dkly dklyVar3 = dklyVar2;
                    dklt dkltVar3 = dkltVar2;
                    dkke.q(dkkrVar3, dklyVar3, dkltVar3, icsVar2, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void r(dkkr dkkrVar, dklt dkltVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        ics icsVarA;
        final dkkr dkkrVar2 = dkkrVar;
        final dklt dkltVar2 = dkltVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1575306430);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkkrVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dkltVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final dkly dklyVar = dkkrVar2.y.f;
            if (dklyVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dkhb
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dkkr dkkrVar3 = dkkrVar2;
                            dklt dkltVar3 = dkltVar2;
                            int i4 = i;
                            dkke.r(dkkrVar3, dkltVar3, icsVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            dkku dkkuVar = (dkku) dklyVar;
            boolean z = dkkuVar.c != null;
            final fdci fdciVar = new fdci();
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hmlVar2 = hmlVarC;
                objS = fdvf.a(new kjb(0L));
                hmwVar.af(objS);
            } else {
                hmlVar2 = hmlVarC;
            }
            hmwVar.ab();
            fdciVar.a = (fduf) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                hmlVarC = hmlVar2;
                objS2 = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS2);
            } else {
                hmlVarC = hmlVar2;
            }
            final fdjx fdjxVar = (fdjx) objS2;
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS3 = hplVar;
            }
            final hox hoxVar = (hox) objS3;
            hmwVar.ab();
            hmlVarC.v(-2040973308);
            if (z) {
                ics icsVarC = ijn.c(egq.e(ics.e, 40.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 520191);
                hmlVarC.v(1849434622);
                Object objS4 = hmwVar.S();
                if (objS4 == obj) {
                    objS4 = new fdau() { // from class: dkhc
                        @Override // defpackage.fdau
                        public final Object a(Object obj2, Object obj3, Object obj4) {
                            ixp ixpVar = (ixp) obj2;
                            ixk ixkVar = (ixk) obj3;
                            ixpVar.getClass();
                            ixkVar.getClass();
                            long j = ((kil) obj4).a;
                            int iEp = ixpVar.ep(48.0f);
                            final iyl iylVarE = ixkVar.e(kil.m(j, 0, 0, iEp, iEp, 3));
                            return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: dkij
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj5) {
                                    iyk iykVar = (iyk) obj5;
                                    iykVar.getClass();
                                    iykVar.s(iylVarE, 0, kin.f(iykVar, -4.0f), 0.0f);
                                    return fctx.a;
                                }
                            });
                        }
                    };
                    hmwVar.af(objS4);
                }
                hmwVar.ab();
                icsVarA = icsVar.a(iwl.a(icsVarC, (fdau) objS4));
            } else {
                icsVarA = icsVar;
            }
            hmwVar.ab();
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dkgw.a(hmg.b(hmlVarC));
            int i4 = i2;
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
            hmlVarC.v(-1568087892);
            hmlVarC.v(-1568113412);
            float f = true != z ? 12.0f : 0.0f;
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(icoVar, 0.0f, f, 0.0f, 0.0f, 13);
            if (z && dkkuVar.b.b) {
                ics icsVarA2 = ixy.a(egq.e(icoVar, 48.0f), new fdap() { // from class: dkhd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ivy ivyVar = (ivy) obj2;
                        ivyVar.getClass();
                        ((fduf) fdciVar.a).f(new kjb(kjc.c(ivz.b(ivyVar))));
                        return fctx.a;
                    }
                });
                hmlVarC.v(1849434622);
                Object objS5 = hmwVar.S();
                if (objS5 == obj) {
                    objS5 = new ebk();
                    hmwVar.af(objS5);
                }
                hmwVar.ab();
                icsVarJ = icsVarJ.a(dli.c(icsVarA2, (ebk) objS5, null, false, null, null, new fdae() { // from class: dkhe
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dkly dklyVar2 = dklyVar;
                        dkku dkkuVar2 = (dkku) dklyVar2;
                        fdap fdapVar = dkkuVar2.c;
                        fdci fdciVar2 = fdciVar;
                        if (fdapVar != null) {
                            fdapVar.invoke(((fduf) fdciVar2.a).c());
                        }
                        if (dkkuVar2.d != null) {
                            hox hoxVar2 = hoxVar;
                            fdlr fdlrVar = (fdlr) hoxVar2.a();
                            if (fdlrVar != null) {
                                fdlrVar.t(null);
                            }
                            hoxVar2.b(fdil.d(fdjxVar, null, null, new dkkd(dklyVar2, (fduf) fdciVar2.a, null), 3));
                        }
                        return fctx.a;
                    }
                }, 28));
            }
            hmwVar.ab();
            if (z && !dkkuVar.b.b) {
                ics icsVarE = egq.e(icoVar, 48.0f);
                hmlVarC.v(1849434622);
                Object objS6 = hmwVar.S();
                if (objS6 == obj) {
                    objS6 = new ebk();
                    hmwVar.af(objS6);
                }
                ebk ebkVar = (ebk) objS6;
                hmwVar.ab();
                hmlVarC.v(5004770);
                boolean zD = hmlVarC.D(dklyVar);
                Object objS7 = hmwVar.S();
                if (zD || objS7 == obj) {
                    objS7 = new fdae() { // from class: dkhf
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdap fdapVar = ((dkku) dklyVar).c;
                            if (fdapVar != null) {
                                fdapVar.invoke(null);
                            }
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS7);
                }
                hmwVar.ab();
                icsVarJ = icsVarJ.a(dli.c(icsVarE, ebkVar, null, false, null, null, (fdae) objS7, 28));
            }
            hmwVar.ab();
            dkltVar2 = dkltVar;
            dkkrVar2 = dkkrVar;
            q(dkkrVar2, dklyVar, dkltVar2, efy.j(icsVarJ, 0.0f, 0.0f, 0.0f, 4.0f, 7), hmlVarC, (i4 & 14) | ((i4 << 3) & 896));
            hmlVarC.n();
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dkhh
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dkkr dkkrVar3 = dkkrVar2;
                    dklt dkltVar3 = dkltVar2;
                    int i5 = i;
                    dkke.r(dkkrVar3, dkltVar3, icsVar, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean v(dkkr dkkrVar, hml hmlVar) {
        hmlVar.v(655456768);
        boolean z = false;
        if (dkkrVar.v.c && diho.b(hmlVar)) {
            z = true;
        }
        hmlVar.o();
        return z;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbp {
    public static final float a(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    public static final void b(final dlbr dlbrVar, ics icsVar, boolean z, hml hmlVar, final int i, final int i2) {
        int i3;
        final ics icsVar2;
        dlbrVar.getClass();
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-1856435517);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(dlbrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        boolean z2 = i6 == 0;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            z |= !z2;
            ics icsVar3 = icsVar;
            e(icsVar3, dlbrVar.a && z, dlbrVar.d, dlbrVar.b, dlbrVar.e, hxe.d(-1863457363, new dlbo(dlbrVar), hmlVarC), hmlVarC, ((i3 >> 3) & 14) | 196608);
            icsVar2 = icsVar3;
        }
        final boolean z3 = z;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlbk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlbr dlbrVar2 = dlbrVar;
                    ics icsVar4 = icsVar2;
                    dlbp.b(dlbrVar2, icsVar4, z3, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[PHI: r10
      0x0015: PHI (r10v1 int) = (r10v0 int), (r10v3 int) binds: [B:3:0x0007, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hml r9, final int r10) {
        /*
            r0 = -1869127044(0xffffffff9097627c, float:-5.971074E-29)
            hml r6 = r9.c(r0)
            if (r10 != 0) goto L15
            boolean r9 = r6.I()
            r10 = 0
            if (r9 != 0) goto L11
            goto L15
        L11:
            r6.s()
            goto L29
        L15:
            djrr r9 = defpackage.djrr.r
            inz r1 = defpackage.djrs.b(r9, r6)
            gda r9 = defpackage.glz.a(r6)
            long r4 = r9.q
            r7 = 48
            r8 = 4
            r2 = 0
            r3 = 0
            defpackage.dtfn.a(r1, r2, r3, r4, r6, r7, r8)
        L29:
            hpx r9 = r6.L()
            if (r9 == 0) goto L36
            dlbh r0 = new dlbh
            r0.<init>()
            r9.d = r0
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlbp.c(hml, int):void");
    }

    public static final void d(final boolean z, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(112078769);
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
            ico icoVar = ics.e;
            ics icsVarE = z ? egq.e(icoVar, 36.0f) : icoVar;
            if (!z) {
                icsVarE = icsVarE.a(egq.k(icoVar, 44.0f));
            }
            if (z) {
                icsVarE = icsVarE.a(efy.i(icoVar, 16.0f, 0.0f, 2));
            }
            int i4 = ((i2 << 6) & 7168) | 432;
            ixm ixmVarA = egk.a(ecr.e, ibw.n, hmlVarC, 54);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i5 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdauVar.a(egp.a, hmlVarC, Integer.valueOf(((i4 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlbl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i6 = i;
                    dlbp.d(z2, fdauVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final ics icsVar, final boolean z, final boolean z2, final String str, final fdae fdaeVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        float f;
        long j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-992314483);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(str) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 65536 : 131072;
        }
        if ((i2 & 74899) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            float f2 = 1.0f;
            if (true != z) {
                f = 1.0f;
                f2 = 0.0f;
            } else {
                f = 1.0f;
            }
            final hsf hsfVarC = ddu.c(f2, null, null, hmlVarC, 0, 30);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(hsfVarC);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: dlbi
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ikl iklVar = (ikl) obj;
                        iklVar.getClass();
                        hsf hsfVar = hsfVarC;
                        iklVar.x(dlbp.a(hsfVar));
                        iklVar.y(dlbp.a(hsfVar));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarI = efy.i(dihi.a(cyi.b(ijn.a(icsVar, (fdap) objS)), str, true), f, 0.0f, 2);
            if (z2) {
                hmlVarC.v(219740313);
                j = glz.a(hmlVarC).F;
                hmwVar.ab();
            } else {
                hmlVarC.v(219806374);
                boolean zG = dljt.g(hmlVarC);
                hmlVarC.v(-628805689);
                if (zG) {
                    hmlVarC.v(1897158147);
                    j = glz.a(hmlVarC).G;
                    hmwVar.ab();
                } else {
                    hmlVarC.v(1897219248);
                    j = glz.a(hmlVarC).p;
                    hmwVar.ab();
                }
                hmwVar.ab();
                hmwVar.ab();
            }
            gvk.e(fdaeVar, icsVarI, false, evn.a, j, 0L, 1.0f, null, null, fdatVar, hmlVarC, 868);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlbj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    String str2 = str;
                    fdae fdaeVar2 = fdaeVar;
                    dlbp.e(icsVar2, z3, z4, str2, fdaeVar2, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(982574239);
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
            dthx.b(str, null, glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVar2, i2 & 14, 0, 65530);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlbm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlbp.f(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

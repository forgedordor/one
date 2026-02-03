package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djpu {
    public static final void a(final djpw djpwVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(625241160);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djpwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarB = !((Boolean) dljt.b(hmlVarC).o.invoke()).booleanValue() ? cyi.b(icoVar) : icoVar;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarB);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB2, jbb.c);
            djrr djrrVar = djpwVar.c;
            dthx.b(djpwVar.a, efy.j(icoVar, 20.0f, 0.0f, djrrVar != null ? 12.0f : 20.0f, 0.0f, 10), i(djpwVar, hmlVarC), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVarC, 0, 0, 65528);
            hmlVarC = hmlVarC;
            hmlVarC.v(-1713062900);
            if (djrrVar != null) {
                if (((Boolean) dljt.b(hmlVarC).o.invoke()).booleanValue()) {
                    hmlVarC.v(-632056784);
                    dtfn.b(djrs.a(djrrVar, hmlVarC), null, efy.j(icoVar, 0.0f, 0.0f, 16.0f, 0.0f, 11), i(djpwVar, hmlVarC), hmlVarC, 384, 0);
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-631838792);
                    dtfn.a(djrs.b(djrrVar, hmlVarC), null, efy.j(icoVar, 0.0f, 0.0f, 16.0f, 0.0f, 11), i(djpwVar, hmlVarC), hmlVarC, 384, 0);
                    hmwVar.ab();
                }
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djpk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    djpu.a(djpwVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final djpw djpwVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1057596290);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djpwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarE = egq.e(icsVar, 56.0f);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: djpi
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.q(jtoVar, 0);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarC = jsh.c(icsVarE, false, (fdap) objS);
            boolean z = djpwVar.b;
            gvk.e(djpwVar.d, icsVarC, z, glz.c(hmlVarC).d, h(djpwVar, hmlVarC), 0L, true != z ? 0.0f : 6.0f, null, null, fdatVar, hmlVarC, 864);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djpj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    djpw djpwVar2 = djpwVar;
                    int i4 = i;
                    djpu.b(icsVar2, djpwVar2, fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final djpx djpxVar, final ics icsVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1767624123);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djpxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djpw djpwVar = djpxVar instanceof djpw ? (djpw) djpxVar : null;
            ics icsVarE = egq.e(icsVar, 56.0f);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: djpl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        jto jtoVar = (jto) obj2;
                        jtoVar.getClass();
                        jtk.q(jtoVar, 0);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarC = jsh.c(icsVarE, false, (fdap) objS);
            if (djpwVar != null && !djpwVar.b) {
                z = false;
            }
            eve eveVar = glz.c(hmlVarC).d;
            hmlVarC.v(-2120253937);
            ije ijeVar = djpwVar == null ? null : new ije(h(djpwVar, hmlVarC));
            hmwVar.ab();
            hmlVarC.v(-2120254489);
            long j = ijeVar == null ? glz.a(hmlVarC).a : ijeVar.i;
            hmwVar.ab();
            float f = 6.0f;
            if (djpwVar != null && !djpwVar.b) {
                f = 0.0f;
            }
            fdae fdaeVar = djpwVar != null ? djpwVar.d : null;
            hmlVarC.v(-2120249061);
            if (fdaeVar == null) {
                hmlVarC.v(1849434622);
                Object objS2 = hmwVar.S();
                if (objS2 == obj) {
                    objS2 = new fdae() { // from class: djpm
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                fdaeVar = (fdae) objS2;
                hmwVar.ab();
            }
            hmwVar.ab();
            gvk.e(fdaeVar, icsVarC, z, eveVar, j, 0L, f, null, null, fdatVar, hmlVarC, 864);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djpn
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    djpx djpxVar2 = djpxVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    djpu.c(djpxVar2, icsVar2, fdatVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[PHI: r13
      0x0015: PHI (r13v1 int) = (r13v0 int), (r13v3 int) binds: [B:3:0x0007, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.hml r12, final int r13) {
        /*
            r0 = 1490137431(0x58d1b157, float:1.84447679E15)
            hml r9 = r12.c(r0)
            if (r13 != 0) goto L15
            boolean r12 = r9.I()
            r13 = 0
            if (r12 != 0) goto L11
            goto L15
        L11:
            r9.s()
            goto L36
        L15:
            ico r12 = defpackage.ics.e
            r0 = 0
            r1 = 2
            r2 = 1103101952(0x41c00000, float:24.0)
            ics r12 = defpackage.efy.i(r12, r2, r0, r1)
            r0 = 1107296256(0x42000000, float:32.0)
            ics r1 = defpackage.egq.h(r12, r0)
            gda r12 = defpackage.glz.a(r9)
            long r2 = r12.b
            r10 = 6
            r11 = 60
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            defpackage.dtgm.a(r1, r2, r4, r5, r7, r8, r9, r10, r11)
        L36:
            hpx r12 = r9.L()
            if (r12 == 0) goto L43
            djph r0 = new djph
            r0.<init>()
            r12.d = r0
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djpu.d(hml, int):void");
    }

    public static final void e(final djpx djpxVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1760125035);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djpxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(736960610);
            boolean z = (djpxVar instanceof djpw) && !((Boolean) dljt.b(hmlVarC).o.invoke()).booleanValue();
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            if (z) {
                hmlVarC.v(1371021234);
                b(icsVar, (djpw) djpxVar, hxe.d(2079203646, new djpq(djpxVar), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 384);
                hmwVar.ab();
            } else {
                hmlVarC.v(1371115815);
                f(djpxVar, icsVar, hmlVarC, i2 & 126);
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djpp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djpx djpxVar2 = djpxVar;
                    int i4 = i;
                    djpu.e(djpxVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final djpx djpxVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1737173255);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djpxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            c(djpxVar, icsVar, hxe.d(-1482017567, new djpt(djpxVar), hmlVarC), hmlVarC, (i2 & 112) | (i2 & 14) | 384);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djpo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djpx djpxVar2 = djpxVar;
                    int i4 = i;
                    djpu.f(djpxVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final long h(djpw djpwVar, hml hmlVar) {
        long jF;
        hmlVar.v(1413925447);
        if (djpwVar.b) {
            hmlVar.v(1508816272);
            jF = glz.a(hmlVar).a;
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(1508865562);
            long j = glz.a(hmlVar).q;
            jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.12f, ije.f(j));
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return jF;
    }

    private static final long i(djpw djpwVar, hml hmlVar) {
        long jF;
        hmlVar.v(461556764);
        if (djpwVar.b) {
            hmlVar.v(2047338457);
            jF = glz.a(hmlVar).b;
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(2047389669);
            long j = glz.a(hmlVar).q;
            jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.38f, ije.f(j));
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return jF;
    }
}

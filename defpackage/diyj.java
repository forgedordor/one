package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyj {
    @fcsv
    public static final void a(final ics icsVar, final ejy ejyVar, final int i, final int i2, final String str, final fdap fdapVar, hml hmlVar, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = i3 & 6;
        hml hmlVarC = hmlVar.c(1484628074);
        if (i7 == 0) {
            i4 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != hmlVarC.D(ejyVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 = i;
            i4 |= true != hmlVarC.B(i5) ? 128 : 256;
        } else {
            i5 = i;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != hmlVarC.B(i2) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != hmlVarC.D(str) ? 8192 : 16384;
        }
        if ((i3 & 196608) == 0) {
            i4 |= true != hmlVarC.F(fdapVar) ? 65536 : 131072;
        }
        int i8 = i4;
        if ((74899 & i8) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                fdae fdaeVar = new fdae() { // from class: dixx
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
                    @Override // defpackage.fdae
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke() {
                        /*
                            r7 = this;
                            ejy r0 = r1
                            eja r1 = r0.d()
                            java.util.List r1 = r1.i()
                            boolean r2 = r1.isEmpty()
                            int r3 = r2
                            r4 = 1
                            r5 = 0
                            if (r2 == 0) goto L19
                            if (r3 != 0) goto L17
                            goto L4b
                        L17:
                            r4 = r5
                            goto L4b
                        L19:
                            java.util.Iterator r1 = r1.iterator()
                        L1d:
                            boolean r2 = r1.hasNext()
                            if (r2 == 0) goto L2f
                            java.lang.Object r2 = r1.next()
                            r6 = r2
                            eji r6 = (defpackage.eji) r6
                            int r6 = r6.a
                            if (r6 != r3) goto L1d
                            goto L30
                        L2f:
                            r2 = 0
                        L30:
                            eji r2 = (defpackage.eji) r2
                            if (r2 == 0) goto L17
                            int r1 = r2.h
                            eja r0 = r0.d()
                            int r0 = r0.e()
                            int r0 = r0 / 2
                            int r2 = r2.g
                            int r1 = r1 / 2
                            int r2 = r2 + r1
                            int r3 = -r1
                            int r2 = r2 - r0
                            if (r3 > r2) goto L17
                            if (r2 > r1) goto L17
                        L4b:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dixx.invoke():java.lang.Object");
                    }
                };
                hxn hxnVar = hrp.a;
                i6 = 196608;
                hnt hntVar = new hnt(fdaeVar, null);
                hmwVar.af(hntVar);
                objS = hntVar;
            } else {
                i6 = 196608;
            }
            hsf hsfVar = (hsf) objS;
            hmwVar.ab();
            int i9 = i8 << 3;
            b(icsVar, d(hsfVar), ejyVar, i5, i2, hxe.d(-1368488053, new dixz(str, hsfVar), hmlVarC), hmlVarC, (i9 & 896) | (i8 & 14) | i6 | (i9 & 7168) | (57344 & i9));
            iqa iqaVar = (iqa) hmlVarC.e(jmh.h);
            Boolean boolValueOf = Boolean.valueOf(d(hsfVar));
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(iqaVar) | ((458752 & i8) == 131072);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new diya(iqaVar, fdapVar, hsfVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hob.g(boolValueOf, (fdat) objS2, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixy
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar2 = icsVar;
                    ejy ejyVar2 = ejyVar;
                    int i10 = i;
                    int i11 = i2;
                    String str2 = str;
                    diyj.a(icsVar2, ejyVar2, i10, i11, str2, fdapVar, (hml) obj2, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final boolean z, final ejy ejyVar, final int i, final int i2, final fdau fdauVar, hml hmlVar, final int i3) {
        int i4;
        int i5 = i3 & 6;
        hml hmlVarC = hmlVar.c(400288007);
        if (i5 == 0) {
            i4 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != hmlVarC.D(ejyVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != hmlVarC.B(i) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != hmlVarC.B(i2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != hmlVarC.F(fdauVar) ? 65536 : 131072;
        }
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
            hmlVarC.v(-1870271674);
            ics icsVarA = iex.a(icsVar, evn.a);
            if (z) {
                ics icsVarA2 = dkl.a(ics.e, glz.a(hmlVarC).f, ikj.a);
                hmlVarC.v(1849434622);
                Object objS2 = hmwVar.S();
                if (objS2 == obj) {
                    objS2 = new fdap() { // from class: dixq
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            jto jtoVar = (jto) obj2;
                            jtoVar.getClass();
                            jtk.r(jtoVar, true);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                hmwVar.ab();
                icsVarA = icsVarA.a(jsh.c(icsVarA2, false, (fdap) objS2));
            }
            hmwVar.ab();
            ics icsVarE = efy.e(icsVarA, 16.0f, 6.0f);
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = new ebk();
                hmwVar.af(objS3);
            }
            ebk ebkVar = (ebk) objS3;
            hmwVar.ab();
            hmlVarC.v(-1224400529);
            boolean zF = hmlVarC.F(fdjxVar) | ((i4 & 896) == 256);
            boolean z2 = (57344 & i4) == 16384;
            boolean z3 = (i4 & 7168) == 2048;
            Object objS4 = hmwVar.S();
            if ((zF | z2 | z3) || objS4 == obj) {
                objS4 = new fdae() { // from class: dixr
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdil.d(fdjxVar, null, null, new diyb(ejyVar, i2, i, null), 3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            ics icsVarC = dli.c(icsVarE, ebkVar, null, false, null, null, (fdae) objS4, 28);
            int i6 = (i4 >> 6) & 7168;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i7 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i7))) {
                Integer numValueOf = Integer.valueOf(i7);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdauVar.a(edf.a, hmlVarC, Integer.valueOf(((i6 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixs
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar2 = icsVar;
                    boolean z4 = z;
                    ejy ejyVar2 = ejyVar;
                    int i8 = i;
                    int i9 = i2;
                    diyj.b(icsVar2, z4, ejyVar2, i8, i9, fdauVar, (hml) obj2, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ede edeVar, final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        long j;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-483883653);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarC = dihi.c(edeVar.a(ics.e, ibw.e));
            if (z) {
                hmlVarC.v(-1467456080);
                j = glz.a(hmlVarC).g;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-1467395630);
                j = glz.a(hmlVarC).q;
                ((hmw) hmlVarC).ab();
            }
            hmlVar2 = hmlVarC;
            dthx.b(str, icsVarC, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVar2, (i2 >> 3) & 14, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    String str2 = str;
                    int i4 = i;
                    diyj.c(edeVar2, str2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean d(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }

    public static final void e(final diyl diylVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(281813848);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diylVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = icsVar;
            edj.a(icsVar2, null, hxe.d(-990166718, new diyi(diylVar), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 3072, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diyl diylVar2 = diylVar;
                    int i4 = i;
                    diyj.e(diylVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final int i, final ejy ejyVar, final List list, final int i2, hml hmlVar, final int i3) {
        int i4;
        ejy ejyVar2;
        int i5 = i3 & 6;
        hml hmlVarC = hmlVar.c(-1387755476);
        if (i5 == 0) {
            i4 = (true != hmlVarC.B(i) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            ejyVar2 = ejyVar;
            i4 |= true != hmlVarC.D(ejyVar2) ? 16 : 32;
        } else {
            ejyVar2 = ejyVar;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != hmlVarC.F(list) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != hmlVarC.B(i2) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != hmlVarC.E(false) ? 8192 : 16384;
        }
        if ((i4 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i6 = i4 & 7168;
            int i7 = i4 << 6;
            int i8 = i4 & 112;
            int i9 = i4 & 14;
            hmlVarC.v(732879033);
            ico icoVar = ics.e;
            hmlVarC.v(-1746271574);
            boolean zF = (i9 == 4) | (i6 == 2048) | hmlVarC.F(list);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdau() { // from class: dixu
                    @Override // defpackage.fdau
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        ixp ixpVar = (ixp) obj;
                        ixk ixkVar = (ixk) obj2;
                        ixpVar.getClass();
                        ixkVar.getClass();
                        final iyl iylVarE = ixkVar.e(((kil) obj3).a);
                        int i10 = i - iylVarE.a;
                        int iE = fcva.e(list);
                        int i11 = iylVarE.a;
                        int i12 = i10 / 2;
                        final int i13 = i2;
                        final int i14 = i13 == 0 ? i12 : 0;
                        int i15 = i11 + i14;
                        int i16 = iylVarE.b;
                        fdap fdapVar = new fdap() { // from class: dixw
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj4) {
                                iyk iykVar = (iyk) obj4;
                                iykVar.getClass();
                                iyk.A(iykVar, iylVarE, i13 == 0 ? i14 : 0, 0);
                                return fctx.a;
                            }
                        };
                        if (i13 != iE) {
                            i12 = 0;
                        }
                        return ixpVar.ej(i15 + i12, i16, fcvp.a, fdapVar);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            a(dihi.a(iwl.a(icoVar, (fdau) objS), ((dixo) list.get(i2)).b, true), ejyVar2, i, i2, ((dixo) list.get(i2)).a, ((dixo) list.get(i2)).c, hmlVarC, i6 | (i7 & 896) | i8);
            hmwVar.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i10 = i;
                    ejy ejyVar3 = ejyVar;
                    List list2 = list;
                    diyj.f(i10, ejyVar3, list2, i2, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

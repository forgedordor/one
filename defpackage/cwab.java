package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwab {
    public static final void a(final dihq dihqVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(785894427);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dihqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: cvzx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dihq dihqVar2 = dihqVar;
                        if (dihqVar2 != null) {
                            dihqVar2.k.invoke();
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtfk.b((fdae) objS, efs.c(efy.j(idb.a(ics.e, 100.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), -4.0f, 0.0f, 2), false, null, null, cvzh.b, hmlVarC, 1572912, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvzy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cwab.a(dihqVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdae fdaeVar, ics icsVar, final boolean z, final cvzr cvzrVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        boolean z2;
        long j;
        long j2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-253482367);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            icsVar2 = icsVar;
            i2 |= true != hmlVarC.D(icsVar2) ? 16 : 32;
        } else {
            icsVar2 = icsVar;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? hmlVarC.D(cvzrVar) : hmlVarC.F(cvzrVar)) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z3 = cvzrVar.b;
            ics icsVarK = egq.k(gks.a(icsVar2), 36.0f);
            if (z3) {
                hmlVarC.v(-940113443);
                j = glz.a(hmlVarC).c;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-940040128);
                j = glz.a(hmlVarC).D;
                ((hmw) hmlVarC).ab();
            }
            if (z3) {
                hmlVarC.v(-939913989);
                j2 = glz.a(hmlVarC).d;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-939838876);
                j2 = glz.a(hmlVarC).q;
                ((hmw) hmlVarC).ab();
            }
            dtfk.a(fdaeVar, icsVarK, z2, null, dtfh.a(j, j2, hmlVarC, 12), cvzh.c, hmlVarC, (i2 & 14) | 1572864 | (i2 & 896), 40);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvzw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar2 = fdaeVar;
                    ics icsVar3 = icsVar2;
                    boolean z4 = z;
                    cwab.b(fdaeVar2, icsVar3, z4, cvzrVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dbs dbsVar, final cvzs cvzsVar, final cyg cygVar, final float f, final ics icsVar, final boolean z, final float f2, hml hmlVar, final int i) {
        int i2;
        cyg cygVar2;
        ics icsVarA;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1415973921);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dbsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(cvzsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cygVar2 = cygVar;
            i2 |= true != hmlVarC.F(cygVar2) ? 128 : 256;
        } else {
            cygVar2 = cygVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.A(f2) ? 524288 : 1048576;
        }
        int i4 = i2;
        if ((599187 & i4) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-753681710);
            if (cvzsVar.g.a) {
                icsVarA = icsVar;
            } else {
                ico icoVar = ics.e;
                dbr dbrVarB = dbsVar.b(z ? "photoSelector_0" : new String(), hmlVarC);
                dba dbaVarA = dbq.a();
                den denVar = cvzd.a;
                den denVar2 = cvzd.a;
                icsVarA = icsVar.a(dbsVar.c(icoVar, dbrVarB, cygVar2, dae.l(dea.c(500, 0, denVar2, 2), 2), dae.m(dea.c(150, 0, denVar2, 2), 2), dcr.d, dbaVarA, dbp.a, dcr.c));
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = cvzt.a(hmg.b(hmlVarC));
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
            cwbe.a(cvzsVar.a, f2, f, hmlVarC, ((i4 >> 15) & 112) | ((i4 >> 3) & 896));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvzz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbs dbsVar2 = dbsVar;
                    cvzs cvzsVar2 = cvzsVar;
                    cyg cygVar3 = cygVar;
                    float f3 = f;
                    ics icsVar2 = icsVar;
                    boolean z2 = z;
                    cwab.c(dbsVar2, cvzsVar2, cygVar3, f3, icsVar2, z2, f2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final dbs dbsVar, cvzs cvzsVar, final cyg cygVar, float f, hml hmlVar, final int i) {
        int i2;
        int i3;
        ico icoVar;
        iby ibyVar;
        fdat fdatVar;
        boolean z;
        hmw hmwVar;
        fdat fdatVar2;
        fdat fdatVar3;
        fdat fdatVar4;
        cvzr cvzrVar;
        boolean z2;
        fdae fdaeVar;
        fdat fdatVar5;
        float f2;
        float f3;
        cvzs cvzsVar2 = cvzsVar;
        float f4 = f;
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(1149302044);
        if (i4 == 0) {
            i2 = (true != hmlVarC.D(dbsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(cvzsVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(cygVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f4) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ibx ibxVar = ibw.k;
            ico icoVar2 = ics.e;
            ics icsVarD = egq.d(icoVar2, 1.0f);
            ixm ixmVarA = edl.a(ecr.d, ibxVar, hmlVarC, 54);
            int iA = cvzt.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar6 = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar6);
            fdat fdatVar7 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar7);
            fdat fdatVar8 = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar8);
            }
            fdat fdatVar9 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar9);
            cvzr cvzrVar2 = cvzsVar2.g;
            if (cvzrVar2.c) {
                hmlVarC.v(1353957260);
                ics icsVarD2 = egq.d(icoVar2, 1.0f);
                ixm ixmVarA2 = egk.a(ecr.a, ibw.n, hmlVarC, 48);
                int iA2 = cvzt.a(hmg.b(hmlVarC));
                hxi hxiVarAk2 = hmwVar2.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVarD2);
                hmlVarC.x();
                if (hmwVar2.z) {
                    hmlVarC.j(fdaeVar2);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA2, fdatVar6);
                hsk.b(hmlVarC, hxiVarAk2, fdatVar7);
                if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA2))) {
                    Integer numValueOf2 = Integer.valueOf(iA2);
                    hmwVar2.af(numValueOf2);
                    hmlVarC.h(numValueOf2, fdatVar8);
                }
                hsk.b(hmlVarC, icsVarB2, fdatVar9);
                egp egpVar = egp.a;
                ics icsVarA = egpVar.a(icoVar2, 0.1f, true);
                iby ibyVar2 = ibw.a;
                ixm ixmVarA3 = ecz.a(ibyVar2, false);
                int iA3 = cvzt.a(hmg.b(hmlVarC));
                hxi hxiVarAk3 = hmwVar2.ak();
                ics icsVarB3 = icj.b(hmlVarC, icsVarA);
                hmlVarC.x();
                if (hmwVar2.z) {
                    hmlVarC.j(fdaeVar2);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA3, fdatVar6);
                hsk.b(hmlVarC, hxiVarAk3, fdatVar7);
                if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA3))) {
                    Integer numValueOf3 = Integer.valueOf(iA3);
                    hmwVar2.af(numValueOf3);
                    hmlVarC.h(numValueOf3, fdatVar8);
                }
                hsk.b(hmlVarC, icsVarB3, fdatVar9);
                hmlVarC.n();
                boolean z3 = cvzrVar2.d;
                if (z3 && cvzsVar2.f) {
                    hmlVarC.v(-221771529);
                    iby ibyVar3 = ibw.e;
                    ics icsVarK = egq.k(icoVar2, 96.0f);
                    ixm ixmVarA4 = ecz.a(ibyVar3, false);
                    int iA4 = cvzt.a(hmg.b(hmlVarC));
                    hxi hxiVarAk4 = hmwVar2.ak();
                    ics icsVarB4 = icj.b(hmlVarC, icsVarK);
                    hmlVarC.x();
                    if (hmwVar2.z) {
                        hmlVarC.j(fdaeVar2);
                    } else {
                        hmlVarC.z();
                    }
                    hsk.b(hmlVarC, ixmVarA4, fdatVar6);
                    hsk.b(hmlVarC, hxiVarAk4, fdatVar7);
                    if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA4))) {
                        Integer numValueOf4 = Integer.valueOf(iA4);
                        hmwVar2.af(numValueOf4);
                        hmlVarC.h(numValueOf4, fdatVar8);
                    }
                    hsk.b(hmlVarC, icsVarB4, fdatVar9);
                    dtgm.a(null, 0L, 0.0f, 0L, 0, 0.0f, hmlVarC, 0, 63);
                    hmlVarC.n();
                    hmwVar2.ab();
                    fdatVar3 = fdatVar9;
                    fdatVar4 = fdatVar8;
                    cvzrVar = cvzrVar2;
                    ibyVar = ibyVar2;
                    f3 = f4;
                    hmwVar = hmwVar2;
                    icoVar = icoVar2;
                    z2 = z3;
                    hmlVarC = hmlVarC;
                    fdaeVar = fdaeVar2;
                    fdatVar5 = fdatVar6;
                    f2 = 0.1f;
                    cvzsVar2 = cvzsVar;
                    fdatVar2 = fdatVar7;
                } else {
                    ibyVar = ibyVar2;
                    int i5 = (i2 << 9) & 3670016;
                    if (f4 > 0.0f) {
                        fdatVar = fdatVar7;
                        z = true;
                    } else {
                        fdatVar = fdatVar7;
                        z = false;
                    }
                    hmlVarC.v(-221607291);
                    int i6 = (i2 & 1022) | i5;
                    icoVar = icoVar2;
                    fdat fdatVar10 = fdatVar;
                    hmwVar = hmwVar2;
                    hmlVarC = hmlVarC;
                    fdatVar2 = fdatVar10;
                    fdatVar3 = fdatVar9;
                    fdatVar4 = fdatVar8;
                    cvzrVar = cvzrVar2;
                    z2 = z3;
                    fdaeVar = fdaeVar2;
                    fdatVar5 = fdatVar6;
                    f2 = 0.1f;
                    cvzsVar2 = cvzsVar;
                    c(dbsVar, cvzsVar2, cygVar, 96.0f, ien.a(icoVar2, f4), z, f4, hmlVarC, i6);
                    f3 = f4;
                    hmwVar.ab();
                }
                ics icsVarA2 = egpVar.a(icoVar, f2, true);
                i3 = 0;
                ixm ixmVarA5 = ecz.a(ibyVar, false);
                int iA5 = cvzt.a(hmg.b(hmlVarC));
                hxi hxiVarAk5 = hmwVar.ak();
                ics icsVarB5 = icj.b(hmlVarC, icsVarA2);
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA5, fdatVar5);
                hsk.b(hmlVarC, hxiVarAk5, fdatVar2);
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA5))) {
                    Integer numValueOf5 = Integer.valueOf(iA5);
                    hmwVar.af(numValueOf5);
                    hmlVarC.h(numValueOf5, fdatVar4);
                }
                hsk.b(hmlVarC, icsVarB5, fdatVar3);
                hmlVarC.v(-915774259);
                fdae fdaeVar3 = cvzsVar2.e;
                if (fdaeVar3 != null) {
                    float f5 = ((-0.8f) + f3) * 5.0f;
                    b(fdaeVar3, ien.a(icoVar, f5), !z2 ? f5 <= 0.0f : cvzsVar2.f || f5 <= 0.0f, cvzrVar, hmlVarC, 0);
                }
                hmwVar.ab();
                hmlVarC.n();
                hmlVarC.n();
                hmwVar.ab();
                f4 = f3;
            } else {
                i3 = 0;
                icoVar = icoVar2;
                int i7 = (i2 << 9) & 3670016;
                hmlVarC.v(1355550350);
                float f6 = true != cvzrVar2.b ? 64.0f : 96.0f;
                ics icsVarA3 = ien.a(icoVar, f4);
                boolean z4 = f4 > 0.0f;
                f4 = f4;
                c(dbsVar, cvzsVar2, cygVar, f6, icsVarA3, z4, f4, hmlVarC, (i2 & 1022) | i7);
                hmwVar2.ab();
            }
            cwbq.a(cvzsVar2.b, ien.a(icoVar, f4), hmlVarC, i3);
            cwas.b(cvzsVar2.c, hmlVarC, i3);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final cvzs cvzsVar3 = cvzsVar2;
            final float f7 = f4;
            hpxVarL.d = new fdat() { // from class: cvzu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbs dbsVar2 = dbsVar;
                    cvzs cvzsVar4 = cvzsVar3;
                    cyg cygVar2 = cygVar;
                    cwab.d(dbsVar2, cvzsVar4, cygVar2, f7, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dbs dbsVar, final cvzs cvzsVar, final cyg cygVar, final float f, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1737964265);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dbsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(cvzsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(cygVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hcq hcqVarC = dtct.c(0.0f, hmlVarC, 384);
            hmlVarC.v(-1395727882);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdae() { // from class: dtij
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return true;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dew dewVarA = glz.b(hmlVarC).a();
            dep depVarA = ddi.a(hmlVarC);
            boolean zD = hmlVarC.D((fdae) objS) | hmlVarC.D(hcqVarC) | hmlVarC.D(dewVarA) | hmlVarC.D(depVarA);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj) {
                objS2 = new gjf(hcqVarC, dewVarA, depVarA);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hck hckVarB = dtil.b(ije.g, 0L, 0L, 0L, 0L, hmlVarC, 62);
            hmlVarC = hmlVarC;
            dtct.a(cvzh.a, null, hxe.d(142016529, new cwaa(cvzsVar, dbsVar, cygVar, f), hmlVarC), null, 0.0f, null, hckVarB, (gjf) objS2, hmlVarC, 390, 58);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvzv
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dbs dbsVar2 = dbsVar;
                    cvzs cvzsVar2 = cvzsVar;
                    cyg cygVar2 = cygVar;
                    cwab.e(dbsVar2, cvzsVar2, cygVar2, f, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

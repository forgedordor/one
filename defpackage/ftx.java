package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftx {
    public static final void a(final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(343813818);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = ftw.a;
                hmwVar.af(objS);
            }
            ixm ixmVar = (ixm) objS;
            ico icoVar = ics.e;
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar2 = jbb.e;
            hsk.b(hmlVarC, ixmVar, fdatVar2);
            fdat fdatVar3 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar3);
            fdat fdatVar4 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar4);
            }
            fdat fdatVar5 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar5);
            ics icsVarE = efy.e(icoVar, 16.0f, 6.0f);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA2 = hmg.a(hmlVarC);
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarE);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, fdatVar2);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar3);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar4);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar5);
            fdatVar.a(hmlVarC, Integer.valueOf(i2 & 14));
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ftp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ftx.a(fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ftl ftlVar, ics icsVar, ikp ikpVar, long j, long j2, long j3, float f, hml hmlVar, final int i) {
        int i2;
        ics icsVar2;
        ikp ikpVar2;
        long jH;
        long jL;
        int i3;
        int i4;
        long jI;
        float f2;
        final ics icsVar3;
        final ikp ikpVar3;
        final long j4;
        final long j5;
        final float f3;
        final long j6;
        hml hmlVarC = hmlVar.c(258660814);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(ftlVar) : hmlVarC.F(ftlVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 432;
        if ((i & 3072) == 0) {
            i5 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i5 |= 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= 524288;
        }
        int i6 = i5 | 12582912;
        if ((4793491 & i6) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            ikpVar3 = ikpVar;
            j4 = j;
            j5 = j2;
            j6 = j3;
            f3 = f;
        } else {
            int i7 = (-4193281) & i6;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar2 = ics.e;
                ikpVar2 = fqq.b(hmlVarC).a;
                long jG = fqq.a(hmlVarC).g();
                jH = ijg.h(ijg.f(ije.d(jG), ije.c(jG), ije.b(jG), 0.8f, ije.f(jG)), fqq.a(hmlVarC).l());
                jL = fqq.a(hmlVarC).l();
                fod fodVarA = fqq.a(hmlVarC);
                if (fodVarA.m()) {
                    long jH2 = fodVarA.h();
                    i3 = 12582912;
                    i4 = i6;
                    long jL2 = fodVarA.l();
                    jI = ijg.h(ijg.f(ije.d(jL2), ije.c(jL2), ije.b(jL2), 0.6f, ije.f(jL2)), jH2);
                } else {
                    i3 = 12582912;
                    i4 = i6;
                    jI = fodVarA.i();
                }
                f2 = 6.0f;
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
                ikpVar2 = ikpVar;
                jH = j;
                jL = j2;
                f2 = f;
                i3 = 12582912;
                i4 = i6;
                jI = j3;
            }
            hmlVarC.l();
            hmlVarC.v(593806072);
            ((hmw) hmlVarC).ab();
            c(efy.d(icsVar2, 12.0f), ikpVar2, jH, jL, f2, hxe.d(-261845785, new ftu(ftlVar), hmlVarC), hmlVarC, ((i7 >> 3) & 3670016) | (i4 & 896) | i3);
            long j7 = jI;
            icsVar3 = icsVar2;
            ikpVar3 = ikpVar2;
            j4 = jH;
            j5 = jL;
            f3 = f2;
            j6 = j7;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fto
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ftl ftlVar2 = ftlVar;
                    ics icsVar4 = icsVar3;
                    ikp ikpVar4 = ikpVar3;
                    long j8 = j4;
                    long j9 = j5;
                    long j10 = j6;
                    ftx.b(ftlVar2, icsVar4, ikpVar4, j8, j9, j10, f3, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ics icsVar, final ikp ikpVar, final long j, final long j2, final float f, final fdat fdatVar, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-662779944);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(false) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(ikpVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != hmlVarC.A(f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793491 & i2) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            int i4 = i2 >> 6;
            hmlVar2 = hmlVarC;
            fuh.a(icsVar2, ikpVar, j, j2, f, hxe.d(-1429068516, new ftt(fdatVar), hmlVarC), hmlVar2, (i2 & 14) | 1572864 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | ((i2 >> 3) & 458752), 16);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ftq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    ikp ikpVar2 = ikpVar;
                    long j3 = j;
                    long j4 = j2;
                    float f2 = f;
                    ftx.c(icsVar3, ikpVar2, j3, j4, f2, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

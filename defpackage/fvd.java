package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvd {
    public static final int a(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, egc egcVar) {
        float f2;
        egd egdVar = (egd) egcVar;
        float f3 = egdVar.a * f;
        float f4 = egdVar.b * f;
        float fMax = Math.max(i, i5);
        if (z) {
            f2 = i2 + f + f + fMax + f4;
        } else {
            f2 = f3 + fMax + f4;
        }
        return kim.b(j, Math.max(fdcu.b(f2), Math.max(i3, i4)));
    }

    public static final int b(int i, int i2, int i3, int i4, int i5, long j) {
        return kim.c(j, i + Math.max(i3, Math.max(i4, i5)) + i2);
    }

    public static final void c(final String str, final fdap fdapVar, final ics icsVar, boolean z, jyq jyqVar, final fdat fdatVar, kfp kfpVar, fae faeVar, fad fadVar, int i, int i2, ikp ikpVar, final foz fozVar, hml hmlVar, final int i3, final int i4) {
        String str2;
        int i5;
        int i6;
        fae faeVar2;
        fad fadVar2;
        int i7;
        boolean z2;
        jyq jyqVar2;
        final kfp kfpVar2;
        ikp ikpVarD;
        int i8;
        long j;
        hml hmlVar2;
        final jyq jyqVar3;
        final boolean z3;
        final ikp ikpVar2;
        final fae faeVar3;
        final fad fadVar3;
        final int i9;
        final int i10;
        hml hmlVarC = hmlVar.c(179130848);
        if ((i3 & 6) == 0) {
            str2 = str;
            i5 = (true != hmlVarC.D(str2) ? 2 : 4) | i3;
        } else {
            str2 = str;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        int i11 = i5 | 27648;
        if ((i3 & 196608) == 0) {
            i11 = i5 | 93184;
        }
        if ((1572864 & i3) == 0) {
            i11 |= true != hmlVarC.F(fdatVar) ? 524288 : 1048576;
        }
        int i12 = i4 | 438;
        if ((i4 & 3072) == 0) {
            i12 = i4 | 1462;
        }
        int i13 = i12 | 24576;
        if ((i4 & 196608) == 0) {
            i13 = i12 | 90112;
        }
        int i14 = 14155776 | i13;
        if ((100663296 & i4) == 0) {
            i14 = i13 | 47710208;
        }
        if ((805306368 & i4) == 0) {
            i14 |= true != hmlVarC.D(fozVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i15 = i14;
        int i16 = i11 | 918552576;
        if ((i16 & 306783379) == 306783378 && (i15 & 306783379) == 306783378 && hmlVarC.I()) {
            hmlVarC.s();
            z3 = z;
            jyqVar3 = jyqVar;
            kfpVar2 = kfpVar;
            faeVar3 = faeVar;
            fadVar3 = fadVar;
            i9 = i;
            i10 = i2;
            ikpVar2 = ikpVar;
            hmlVar2 = hmlVarC;
        } else {
            int i17 = i15 >> 18;
            int i18 = i15 & (-235346945);
            hmlVarC.t();
            if ((i3 & 1) == 0 || hmlVarC.G()) {
                jyq jyqVar4 = (jyq) hmlVarC.e(fvx.a);
                kfp kfpVar3 = kfo.a;
                fae faeVar4 = fae.a;
                fad fadVar4 = new fad(null, null, null, null, 63);
                eve eveVar = fqq.b(hmlVarC).a;
                evf evfVar = evh.a;
                i6 = 1;
                faeVar2 = faeVar4;
                fadVar2 = fadVar4;
                i7 = Integer.MAX_VALUE;
                z2 = true;
                jyqVar2 = jyqVar4;
                kfpVar2 = kfpVar3;
                ikpVarD = eve.d(eveVar, null, null, evfVar, evfVar, 3);
            } else {
                hmlVarC.s();
                z2 = z;
                jyqVar2 = jyqVar;
                kfpVar2 = kfpVar;
                faeVar2 = faeVar;
                fadVar2 = fadVar;
                i7 = i;
                i6 = i2;
                ikpVarD = ikpVar;
            }
            hmlVarC.l();
            hmlVarC.v(2138735099);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar = (ebk) objS;
            hmwVar.ab();
            hmlVarC.v(346091214);
            long jF = jyqVar2.f();
            if (jF != 16) {
                i8 = 196608;
                j = jF;
            } else {
                i8 = 196608;
                j = ((ije) fozVar.b(z2, hmlVarC).a()).i;
            }
            hmwVar.ab();
            jyq jyqVarM = jyqVar2.m(new jyq(j, 0L, null, null, 0L, 0, 0L, 16777214));
            ics icsVarG = icj.g(icsVar, new ful(z2, ebkVar, fozVar));
            fua.a(3, hmlVarC);
            ics icsVarA = egq.a(icsVarG, 280.0f, 56.0f);
            ikt iktVar = new ikt(((ije) fozVar.a(hmlVarC).a()).i);
            hwv hwvVarD = hxe.d(-83351293, new fvc(str2, z2, kfpVar2, ebkVar, fdatVar, ikpVarD, fozVar), hmlVarC);
            int i19 = i18 << 12;
            hmlVar2 = hmlVarC;
            ewj.c(str, fdapVar, icsVarA, z2, jyqVarM, faeVar2, fadVar2, false, i7, i6, kfpVar2, null, ebkVar, iktVar, hwvVarD, hmlVar2, (i16 & 64638) | (3670016 & i19) | (i19 & 234881024), (i17 & 14) | i8 | (i15 & 112), 4096);
            jyqVar3 = jyqVar2;
            z3 = z2;
            ikpVar2 = ikpVarD;
            faeVar3 = faeVar2;
            fadVar3 = fadVar2;
            i9 = i7;
            i10 = i6;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fva
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str3 = str;
                    fdap fdapVar2 = fdapVar;
                    ics icsVar2 = icsVar;
                    boolean z4 = z3;
                    jyq jyqVar5 = jyqVar3;
                    fdat fdatVar2 = fdatVar;
                    kfp kfpVar4 = kfpVar2;
                    fae faeVar5 = faeVar3;
                    fad fadVar5 = fadVar3;
                    int i20 = i9;
                    int i21 = i10;
                    ikp ikpVar3 = ikpVar2;
                    int i22 = i3;
                    fvd.c(str3, fdapVar2, icsVar2, z4, jyqVar5, fdatVar2, kfpVar4, faeVar5, fadVar5, i20, i21, ikpVar3, fozVar, (hml) obj, hpy.a(i22 | 1), hpy.a(i4));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ics icsVar, final fdat fdatVar, final fdat fdatVar2, final fdat fdatVar3, final float f, final egc egcVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1595074580);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.E(false) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.A(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.D(egcVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : 67108864;
        }
        if ((38347923 & i2) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = (3670016 & i2) == 1048576;
            boolean z2 = (29360128 & i2) == 8388608;
            boolean z3 = (234881024 & i2) == 67108864;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | z2 | z3) || objS == hmk.a) {
                objS = new fvj(f, egcVar);
                hmwVar.af(objS);
            }
            fvj fvjVar = (fvj) objS;
            kji kjiVar = (kji) hmlVarC.e(jmh.j);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            int i4 = i2;
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar4 = jbb.e;
            hsk.b(hmlVarC, fvjVar, fdatVar4);
            fdat fdatVar5 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar5);
            fdat fdatVar6 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar6);
            }
            fdat fdatVar7 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar7);
            hmlVarC.v(-1444366593);
            hmwVar.ab();
            if (fdatVar3 != null) {
                hmlVarC.v(-1444323906);
                ics icsVarA = fqo.a(iwa.a(ics.e, "Trailing"));
                ixm ixmVarA = ecz.a(ibw.e, false);
                int iA2 = hmg.a(hmlVarC);
                hxi hxiVarAk2 = hmwVar.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVarA);
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA, fdatVar4);
                hsk.b(hmlVarC, hxiVarAk2, fdatVar5);
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                    Integer numValueOf2 = Integer.valueOf(iA2);
                    hmwVar.af(numValueOf2);
                    hmlVarC.h(numValueOf2, fdatVar6);
                }
                hsk.b(hmlVarC, icsVarB2, fdatVar7);
                fdatVar3.a(hmlVarC, Integer.valueOf((i4 >> 15) & 14));
                hmlVarC.n();
                hmwVar.ab();
            } else {
                hmlVarC.v(-1444076929);
                hmwVar.ab();
            }
            float fB = efy.b(egcVar, kjiVar);
            float fA = efy.a(egcVar, kjiVar);
            ico icoVar = ics.e;
            if (fdatVar3 != null) {
                fA = fddu.c(fA - 12.0f, 0.0f);
            }
            ics icsVarJ = efy.j(icoVar, fB, 0.0f, fA, 0.0f, 10);
            hmlVarC.v(-1443138497);
            hmwVar.ab();
            if (fdatVar2 != null) {
                int i5 = i4 >> 6;
                hmlVarC.v(-1443103994);
                ics icsVarA2 = iwa.a(icoVar, "Label").a(icsVarJ);
                ixm ixmVarA2 = ecz.a(ibw.a, false);
                int iA3 = hmg.a(hmlVarC);
                hxi hxiVarAk3 = hmwVar.ak();
                ics icsVarB3 = icj.b(hmlVarC, icsVarA2);
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA2, fdatVar4);
                hsk.b(hmlVarC, hxiVarAk3, fdatVar5);
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                    Integer numValueOf3 = Integer.valueOf(iA3);
                    hmwVar.af(numValueOf3);
                    hmlVarC.h(numValueOf3, fdatVar6);
                }
                hsk.b(hmlVarC, icsVarB3, fdatVar7);
                fdatVar2.a(hmlVarC, Integer.valueOf(i5 & 14));
                hmlVarC.n();
                hmwVar.ab();
            } else {
                hmlVarC.v(-1443018465);
                hmwVar.ab();
            }
            ics icsVarA3 = iwa.a(icoVar, "TextField").a(icsVarJ);
            ixm ixmVarA3 = ecz.a(ibw.a, true);
            int iA4 = hmg.a(hmlVarC);
            hxi hxiVarAk4 = hmwVar.ak();
            ics icsVarB4 = icj.b(hmlVarC, icsVarA3);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA3, fdatVar4);
            hsk.b(hmlVarC, hxiVarAk4, fdatVar5);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA4))) {
                Integer numValueOf4 = Integer.valueOf(iA4);
                hmwVar.af(numValueOf4);
                hmlVarC.h(numValueOf4, fdatVar6);
            }
            hsk.b(hmlVarC, icsVarB4, fdatVar7);
            fdatVar.a(hmlVarC, Integer.valueOf((i4 >> 3) & 14));
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fvb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    fdat fdatVar8 = fdatVar;
                    fdat fdatVar9 = fdatVar2;
                    fdat fdatVar10 = fdatVar3;
                    float f2 = f;
                    fvd.d(icsVar2, fdatVar8, fdatVar9, fdatVar10, f2, egcVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

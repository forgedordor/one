package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyb {
    public static final egc a = new egd(24.0f, 24.0f, 24.0f, 24.0f);
    public static final egc b = efy.h(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final egc c = efy.h(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final egc d = efy.h(0.0f, 0.0f, 0.0f, 24.0f, 7);
    private static final hpt e = new hnz(hsi.a, new fdae() { // from class: fxr
        @Override // defpackage.fdae
        public final Object invoke() {
            egc egcVar = fyb.a;
            return gih.a;
        }
    });

    public static final void a(final float f, final float f2, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-917637668);
        if (i3 == 0) {
            i2 = (true != hmlVarC.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(f2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | z2) || objS == hmk.a) {
                objS = new fxx(f, f2);
                hmwVar.af(objS);
            }
            ixm ixmVar = (ixm) objS;
            ico icoVar = ics.e;
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            int i4 = ((((i2 >> 6) & 14) << 6) & 896) | 6;
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVar, jbb.e);
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
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fxq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f3 = f;
                    int i5 = i;
                    float f4 = f2;
                    int iA2 = hpy.a(i5 | 1);
                    fyb.a(f3, f4, fdatVar, (hml) obj, iA2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdae fdaeVar, final fdat fdatVar, final ics icsVar, final fdat fdatVar2, final fdat fdatVar3, final fdat fdatVar4, final fdat fdatVar5, final ikp ikpVar, final long j, final long j2, final long j3, final long j4, final float f, final knl knlVar, hml hmlVar, final int i, final int i2) {
        int i3;
        fdat fdatVar6;
        fdat fdatVar7;
        fdat fdatVar8;
        ikp ikpVar2;
        int i4;
        float f2;
        knl knlVar2;
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(-867616355);
        if (i5 == 0) {
            i3 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            fdatVar6 = fdatVar;
            i3 |= true != hmlVarC.F(fdatVar6) ? 16 : 32;
        } else {
            fdatVar6 = fdatVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(fdatVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.F(fdatVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            fdatVar7 = fdatVar4;
            i3 |= true != hmlVarC.F(fdatVar7) ? 65536 : 131072;
        } else {
            fdatVar7 = fdatVar4;
        }
        if ((1572864 & i) == 0) {
            fdatVar8 = fdatVar5;
            i3 |= true != hmlVarC.F(fdatVar8) ? 524288 : 1048576;
        } else {
            fdatVar8 = fdatVar5;
        }
        if ((12582912 & i) == 0) {
            ikpVar2 = ikpVar;
            i3 |= true != hmlVarC.D(ikpVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.C(j) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != hmlVarC.C(j2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != hmlVarC.C(j3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.C(j4) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= true != hmlVarC.A(f2) ? 128 : 256;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            knlVar2 = knlVar;
            i4 |= true != hmlVarC.D(knlVar2) ? 1024 : 2048;
        } else {
            knlVar2 = knlVar;
        }
        int i6 = i4;
        if (hmlVarC.J(((306783379 & i3) == 306783378 && (i6 & 1171) == 1170) ? false : true, i3 & 1)) {
            int i7 = (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i6 >> 3) & 896);
            c(fdaeVar, icsVar, knlVar2, hxe.d(527420759, new fya(fdatVar3, fdatVar7, fdatVar8, ikpVar2, j, f2, j2, j3, j4, fdatVar2, fdatVar6), hmlVarC), hmlVarC, i7);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fxo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar2 = fdaeVar;
                    fdat fdatVar9 = fdatVar;
                    ics icsVar2 = icsVar;
                    fdat fdatVar10 = fdatVar2;
                    fdat fdatVar11 = fdatVar3;
                    fdat fdatVar12 = fdatVar4;
                    fdat fdatVar13 = fdatVar5;
                    ikp ikpVar3 = ikpVar;
                    long j5 = j;
                    long j6 = j2;
                    long j7 = j3;
                    long j8 = j4;
                    int i8 = i;
                    float f3 = f;
                    int iA = hpy.a(i8 | 1);
                    int iA2 = hpy.a(i2);
                    fyb.b(fdaeVar2, fdatVar9, icsVar2, fdatVar10, fdatVar11, fdatVar12, fdatVar13, ikpVar3, j5, j6, j7, j8, f3, knlVar, (hml) obj, iA, iA2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fdae fdaeVar, final ics icsVar, final knl knlVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(24925658);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(knlVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i2 & 1171) != 1170, i2 & 1)) {
            ((gih) hmlVarC.e(e)).a(new fze(fdaeVar, icsVar, knlVar, fdatVar), hmlVarC, 0);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fxp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fdae fdaeVar2 = fdaeVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    fyb.c(fdaeVar2, icsVar2, knlVar, fdatVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final fdat fdatVar, ics icsVar, final fdat fdatVar2, final fdat fdatVar3, final fdat fdatVar4, final ikp ikpVar, final long j, final float f, final long j2, final long j3, final long j4, final long j5, hml hmlVar, final int i, final int i2) {
        int i3;
        fdat fdatVar5;
        fdat fdatVar6;
        int i4;
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(1378716401);
        if ((i & 6) == 0) {
            i3 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            fdatVar5 = fdatVar2;
            i5 |= true != hmlVarC.F(fdatVar5) ? 128 : 256;
        } else {
            fdatVar5 = fdatVar2;
        }
        if ((i & 3072) == 0) {
            i5 |= true != hmlVarC.F(fdatVar3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            fdatVar6 = fdatVar4;
            i5 |= true != hmlVarC.F(fdatVar6) ? 8192 : 16384;
        } else {
            fdatVar6 = fdatVar4;
        }
        if ((196608 & i) == 0) {
            i5 |= true != hmlVarC.D(ikpVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i5 |= true != hmlVarC.C(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i5 |= true != hmlVarC.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i5 |= true != hmlVarC.C(j2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i5 |= true != hmlVarC.C(j3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != hmlVarC.C(j4) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.C(j5) ? 16 : 32;
        }
        if (hmlVarC.J(((306783379 & i5) == 306783378 && (i4 & 19) == 18) ? false : true, i5 & 1)) {
            icsVar2 = ics.e;
            gvk.c(icsVar2, ikpVar, j, 0L, f, 0.0f, null, hxe.d(-652798794, new fxv(fdatVar5, fdatVar3, fdatVar6, j3, j4, j5, j2, fdatVar), hmlVarC), hmlVarC, 104);
        } else {
            hmlVarC.s();
            icsVar2 = icsVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fxn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdat fdatVar7 = fdatVar;
                    ics icsVar3 = icsVar2;
                    fdat fdatVar8 = fdatVar2;
                    fdat fdatVar9 = fdatVar3;
                    fdat fdatVar10 = fdatVar4;
                    ikp ikpVar2 = ikpVar;
                    long j6 = j;
                    float f2 = f;
                    long j7 = j2;
                    long j8 = j3;
                    int i6 = i;
                    long j9 = j4;
                    int iA = hpy.a(i6 | 1);
                    int iA2 = hpy.a(i2);
                    fyb.d(fdatVar7, icsVar3, fdatVar8, fdatVar9, fdatVar10, ikpVar2, j6, f2, j7, j8, j9, j5, (hml) obj, iA, iA2);
                    return fctx.a;
                }
            };
        }
    }
}

package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcj {
    public static final /* synthetic */ int a = 0;
    private static final egc b;

    static {
        efy.g(8.0f, 0.0f, 2);
        b = efy.g(8.0f, 0.0f, 2);
        efy.g(8.0f, 0.0f, 2);
    }

    public static final void a(final boolean z, final fdae fdaeVar, final fdat fdatVar, final ics icsVar, final boolean z2, final fdat fdatVar2, final ikp ikpVar, final gru gruVar, final gry gryVar, final dky dkyVar, hml hmlVar, final int i, final int i2) {
        int i3;
        fdat fdatVar3;
        fdat fdatVar4;
        gru gruVar2;
        gry gryVar2;
        dky dkyVar2;
        int i4;
        int i5;
        hml hmlVar2;
        int i6 = i & 6;
        hml hmlVarC = hmlVar.c(-1385473344);
        if (i6 == 0) {
            i3 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            fdatVar3 = fdatVar;
            i3 |= true != hmlVarC.F(fdatVar3) ? 128 : 256;
        } else {
            fdatVar3 = fdatVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            fdatVar4 = fdatVar2;
            i3 |= true != hmlVarC.F(fdatVar4) ? 65536 : 131072;
        } else {
            fdatVar4 = fdatVar2;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != hmlVarC.F(null) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != hmlVarC.D(ikpVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            gruVar2 = gruVar;
            i3 |= true != hmlVarC.D(gruVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            gruVar2 = gruVar;
        }
        if ((805306368 & i) == 0) {
            gryVar2 = gryVar;
            i3 |= true != hmlVarC.D(gryVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            gryVar2 = gryVar;
        }
        if ((i2 & 6) == 0) {
            dkyVar2 = dkyVar;
            i4 = 12582912;
            i5 = i2 | (true != hmlVarC.D(dkyVar2) ? 2 : 4);
        } else {
            dkyVar2 = dkyVar;
            i4 = 12582912;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != hmlVarC.D(null) ? 16 : 32;
        }
        if (hmlVarC.J(((306783379 & i3) == 306783378 && (i5 & 19) == 18) ? false : true, i3 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            jyq jyqVarA = hct.a(10, hmlVarC);
            int i7 = (i3 & 14) | i4;
            int i8 = i3 >> 6;
            int i9 = i3;
            int i10 = i9 << 3;
            hmlVar2 = hmlVarC;
            int i11 = i9 << 6;
            int i12 = i9 >> 24;
            int i13 = (i10 & 3670016) | ((i9 >> 3) & 7168) | i7 | (i8 & 112) | (i10 & 896) | (i11 & 57344);
            int i14 = (i12 & 14) | 27648 | (i12 & 112);
            fdat fdatVar5 = fdatVar3;
            fdat fdatVar6 = fdatVar4;
            e(z, icsVar, fdaeVar, z2, fdatVar5, jyqVarA, fdatVar6, null, null, ikpVar, gruVar2, gryVar2, dkyVar2, b, hmlVar2, i13 | (i11 & 234881024) | (i11 & 1879048192), i14 | ((i5 << 6) & 896) | (458752 & (i5 << 12)));
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gbw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    boolean z3 = z;
                    fdae fdaeVar2 = fdaeVar;
                    fdat fdatVar7 = fdatVar;
                    ics icsVar2 = icsVar;
                    boolean z4 = z2;
                    fdat fdatVar8 = fdatVar2;
                    ikp ikpVar2 = ikpVar;
                    gru gruVar3 = gruVar;
                    int i15 = i;
                    gcj.a(z3, fdaeVar2, fdatVar7, icsVar2, z4, fdatVar8, ikpVar2, gruVar3, gryVar, dkyVar, hmlVar3, hpy.a(i15 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }

    public static final /* synthetic */ hsf b(Object obj, hml hmlVar) {
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            hpl hplVar = new hpl(obj, hsi.a);
            hmlVar.y(hplVar);
            objF = hplVar;
        }
        hox hoxVar = (hox) objF;
        if (obj != null) {
            hoxVar.b(obj);
        }
        return hoxVar;
    }

    public static final void c(final fdae fdaeVar, final fdat fdatVar, final ics icsVar, final boolean z, final fdat fdatVar2, final fdat fdatVar3, final ikp ikpVar, final gru gruVar, final gry gryVar, final dky dkyVar, hml hmlVar, final int i, final int i2) {
        int i3;
        fdae fdaeVar2;
        ikp ikpVar2;
        gru gruVar2;
        gry gryVar2;
        int i4;
        hwv hwvVarD;
        int i5;
        float f;
        hml hmlVarC = hmlVar.c(-1975409271);
        boolean z2 = true;
        if ((i & 6) == 0) {
            i3 = (true != hmlVarC.E(false) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            fdaeVar2 = fdaeVar;
            i3 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.E(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.F(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != hmlVarC.F(fdatVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != hmlVarC.F(fdatVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            ikpVar2 = ikpVar;
            i3 |= true != hmlVarC.D(ikpVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((805306368 & i) == 0) {
            gruVar2 = gruVar;
            i3 |= true != hmlVarC.D(gruVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            gruVar2 = gruVar;
        }
        if ((i2 & 6) == 0) {
            gryVar2 = gryVar;
            i4 = i2 | (true != hmlVarC.D(gryVar2) ? 2 : 4);
        } else {
            gryVar2 = gryVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.D(dkyVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != hmlVarC.D(null) ? 128 : 256;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 147) == 146) {
            z2 = false;
        }
        if (hmlVarC.J(z2, i3 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            if (fdatVar2 != null) {
                hmlVarC.v(225175756);
                hwvVarD = hxe.d(-570452295, new gcf(z ? 1.0f : 0.38f, gsc.e(7, hmlVarC), fdatVar2), hmlVarC);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(225772537);
                ((hmw) hmlVarC).ab();
                hwvVarD = null;
            }
            jyq jyqVarA = hct.a(10, hmlVarC);
            int i6 = i3 & 14;
            int i7 = i3 >> 6;
            int i8 = i3 << 3;
            int i9 = i3 >> 3;
            int i10 = i3 << 6;
            int i11 = ((i3 >> 27) & 14) | 3072;
            hwv hwvVar = hwvVarD;
            int i12 = i4 << 3;
            int i13 = i4 << 9;
            if (fdatVar3 != null) {
                i5 = i11;
                f = 8.0f;
            } else {
                i5 = i11;
                f = 4.0f;
            }
            int i14 = i8 & 1879048192;
            int i15 = i8 & 234881024;
            int i16 = i8 & 3670016;
            int i17 = i8 & 896;
            int i18 = i5 | (i12 & 112) | (i12 & 896);
            int i19 = i6 | (i7 & 112) | i17 | (i9 & 7168);
            e(false, icsVar, fdaeVar2, z, fdatVar, jyqVarA, null, hwvVar, fdatVar3, ikpVar2, gruVar2, gryVar2, dkyVar, efy.h(4.0f, 0.0f, f, 0.0f, 10), hmlVarC, i19 | (i10 & 57344) | i16 | i15 | i14, i18 | (i13 & 458752));
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gbz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    fdat fdatVar4 = fdatVar;
                    ics icsVar2 = icsVar;
                    boolean z3 = z;
                    fdat fdatVar5 = fdatVar2;
                    fdat fdatVar6 = fdatVar3;
                    ikp ikpVar3 = ikpVar;
                    gru gruVar3 = gruVar;
                    int i20 = i;
                    gcj.c(fdaeVar3, fdatVar4, icsVar2, z3, fdatVar5, fdatVar6, ikpVar3, gruVar3, gryVar, dkyVar, hmlVar2, hpy.a(i20 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final fdat fdatVar, final jyq jyqVar, final long j, final fdat fdatVar2, final fdat fdatVar3, final fdat fdatVar4, final long j2, final long j3, final egc egcVar, hml hmlVar, final int i) {
        int i2;
        fdat fdatVar5;
        fdat fdatVar6;
        fdat fdatVar7;
        long j4;
        egc egcVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2070754602);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(jyqVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            fdatVar5 = fdatVar2;
            i2 |= true != hmlVarC.F(fdatVar5) ? 1024 : 2048;
        } else {
            fdatVar5 = fdatVar2;
        }
        if ((i & 24576) == 0) {
            fdatVar6 = fdatVar3;
            i2 |= true != hmlVarC.F(fdatVar6) ? 8192 : 16384;
        } else {
            fdatVar6 = fdatVar3;
        }
        if ((196608 & i) == 0) {
            fdatVar7 = fdatVar4;
            i2 |= true != hmlVarC.F(fdatVar7) ? 65536 : 131072;
        } else {
            fdatVar7 = fdatVar4;
        }
        if ((1572864 & i) == 0) {
            j4 = j2;
            i2 |= true != hmlVarC.C(j4) ? 524288 : 1048576;
        } else {
            j4 = j2;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.C(j3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.A(32.0f) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            egcVar2 = egcVar;
            i2 |= true != hmlVarC.D(egcVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            egcVar2 = egcVar;
        }
        if (hmlVarC.J((306783379 & i2) != 306783378, i2 & 1)) {
            hnj.b(new hpu[]{gea.a.c(new ije(j)), gyj.a.c(jyqVar)}, hxe.d(-668234218, new gcd(egcVar2, fdatVar6, fdatVar5, fdatVar7, j4, fdatVar, j3), hmlVarC), hmlVarC, 56);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gca
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fdat fdatVar8 = fdatVar;
                    jyq jyqVar2 = jyqVar;
                    long j5 = j;
                    fdat fdatVar9 = fdatVar2;
                    fdat fdatVar10 = fdatVar3;
                    fdat fdatVar11 = fdatVar4;
                    long j6 = j2;
                    int i4 = i;
                    gcj.d(fdatVar8, jyqVar2, j5, fdatVar9, fdatVar10, fdatVar11, j6, j3, egcVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final boolean r33, final defpackage.ics r34, final defpackage.fdae r35, final boolean r36, final defpackage.fdat r37, final defpackage.jyq r38, final defpackage.fdat r39, final defpackage.fdat r40, final defpackage.fdat r41, final defpackage.ikp r42, final defpackage.gru r43, final defpackage.gry r44, final defpackage.dky r45, final defpackage.egc r46, defpackage.hml r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcj.e(boolean, ics, fdae, boolean, fdat, jyq, fdat, fdat, fdat, ikp, gru, gry, dky, egc, hml, int, int):void");
    }
}

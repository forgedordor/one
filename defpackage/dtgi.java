package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtgi {
    public static final void a(final String str, final fdap fdapVar, final ics icsVar, boolean z, jyq jyqVar, final fdat fdatVar, final fdat fdatVar2, kfp kfpVar, final fae faeVar, fad fadVar, int i, int i2, ikp ikpVar, gxi gxiVar, hml hmlVar, final int i3, final int i4, final int i5) {
        String str2;
        int i6;
        fdap fdapVar2;
        ics icsVar2;
        fdat fdatVar3;
        fdat fdatVar4;
        fae faeVar2;
        jyq jyqVar2;
        kfp kfpVar2;
        fad fadVar2;
        ikp ikpVarB;
        gxi gxiVarA;
        int i7;
        boolean z2;
        int i8;
        hml hmlVar2;
        final boolean z3;
        final jyq jyqVar3;
        final kfp kfpVar3;
        final fad fadVar3;
        final int i9;
        final int i10;
        final ikp ikpVar2;
        final gxi gxiVar2;
        hml hmlVarC = hmlVar.c(-544387420);
        if ((i3 & 6) == 0) {
            str2 = str;
            i6 = (true != hmlVarC.D(str2) ? 2 : 4) | i3;
        } else {
            str2 = str;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            fdapVar2 = fdapVar;
            i6 |= true != hmlVarC.F(fdapVar2) ? 16 : 32;
        } else {
            fdapVar2 = fdapVar;
        }
        if ((i3 & 384) == 0) {
            icsVar2 = icsVar;
            i6 |= true != hmlVarC.D(icsVar2) ? 128 : 256;
        } else {
            icsVar2 = icsVar;
        }
        int i11 = i6 | 27648;
        if ((196608 & i3) == 0) {
            i11 = i6 | 93184;
        }
        int i12 = 1572864 | i11;
        if ((12582912 & i3) == 0) {
            fdatVar3 = fdatVar;
            i12 |= true != hmlVarC.F(fdatVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fdatVar3 = fdatVar;
        }
        int i13 = i12 | 100663296;
        if ((i3 & 805306368) == 0) {
            fdatVar4 = fdatVar2;
            i13 |= true != hmlVarC.F(fdatVar4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            fdatVar4 = fdatVar2;
        }
        int i14 = i4 | 438;
        if ((i4 & 3072) == 0) {
            faeVar2 = faeVar;
            i14 |= true != hmlVarC.D(faeVar2) ? 1024 : 2048;
        } else {
            faeVar2 = faeVar;
        }
        int i15 = 115040256 | i14;
        if ((805306368 & i4) == 0) {
            i15 = i14 | 383475712;
        }
        int i16 = (i5 & 6) == 0 ? i5 | 2 : i5;
        if ((i13 & 306783379) == 306783378 && (306783379 & i15) == 306783378 && (i16 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            z3 = z;
            jyqVar3 = jyqVar;
            kfpVar3 = kfpVar;
            fadVar3 = fadVar;
            i9 = i;
            i10 = i2;
            ikpVar2 = ikpVar;
            gxiVar2 = gxiVar;
            hmlVar2 = hmlVarC;
        } else {
            int i17 = i15 >> 24;
            int i18 = (-1879048193) & i15;
            hmlVarC.t();
            if ((i3 & 1) == 0 || hmlVarC.G()) {
                jyq jyqVar4 = (jyq) hmlVarC.e(gyj.a);
                jyqVar2 = jyqVar4;
                kfpVar2 = kfo.a;
                fadVar2 = fad.a;
                ikpVarB = dtgf.b(hmlVarC);
                gxiVarA = dtgf.a(hmlVarC);
                i7 = Integer.MAX_VALUE;
                z2 = true;
                i8 = 1;
            } else {
                hmlVarC.s();
                z2 = z;
                jyqVar2 = jyqVar;
                kfpVar2 = kfpVar;
                fadVar2 = fadVar;
                i7 = i;
                i8 = i2;
                ikpVarB = ikpVar;
                gxiVarA = gxiVar;
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            gpy.b(str2, fdapVar2, icsVar2, z2, jyqVar2, fdatVar3, fdatVar4, kfpVar2, faeVar2, fadVar2, i7, i8, ikpVarB, gxiVarA, hmlVar2, i13 & 2147024894, (i18 << 6) & 2147483520, i17 & 14);
            z3 = z2;
            jyqVar3 = jyqVar2;
            kfpVar3 = kfpVar2;
            fadVar3 = fadVar2;
            i9 = i7;
            i10 = i8;
            ikpVar2 = ikpVarB;
            gxiVar2 = gxiVarA;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtgh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str3 = str;
                    fdap fdapVar3 = fdapVar;
                    ics icsVar3 = icsVar;
                    boolean z4 = z3;
                    jyq jyqVar5 = jyqVar3;
                    fdat fdatVar5 = fdatVar;
                    fdat fdatVar6 = fdatVar2;
                    kfp kfpVar4 = kfpVar3;
                    fae faeVar3 = faeVar;
                    fad fadVar4 = fadVar3;
                    int i19 = i9;
                    int i20 = i10;
                    int i21 = i3;
                    ikp ikpVar3 = ikpVar2;
                    int i22 = i4;
                    int iA = hpy.a(i21 | 1);
                    int iA2 = hpy.a(i22);
                    dtgi.a(str3, fdapVar3, icsVar3, z4, jyqVar5, fdatVar5, fdatVar6, kfpVar4, faeVar3, fadVar4, i19, i20, ikpVar3, gxiVar2, (hml) obj, iA, iA2, hpy.a(i5));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final kew kewVar, final fdap fdapVar, final ics icsVar, boolean z, jyq jyqVar, final fdat fdatVar, final fdat fdatVar2, final fdat fdatVar3, final fdat fdatVar4, final boolean z2, kfp kfpVar, final fae faeVar, fad fadVar, int i, int i2, ikp ikpVar, gxi gxiVar, hml hmlVar, final int i3, final int i4, final int i5) {
        kew kewVar2;
        int i6;
        fdap fdapVar2;
        ics icsVar2;
        fdat fdatVar5;
        fdat fdatVar6;
        int i7;
        int i8;
        boolean z3;
        jyq jyqVar2;
        kfp kfpVar2;
        fad fadVar2;
        int i9;
        boolean z4;
        gxi gxiVarA;
        ikp ikpVar2;
        int i10;
        hml hmlVar2;
        final boolean z5;
        final jyq jyqVar3;
        final kfp kfpVar3;
        final fad fadVar3;
        final int i11;
        final int i12;
        final ikp ikpVar3;
        final gxi gxiVar2;
        kewVar.getClass();
        fdapVar.getClass();
        hml hmlVarC = hmlVar.c(1370984951);
        if ((i3 & 6) == 0) {
            kewVar2 = kewVar;
            i6 = (true != hmlVarC.D(kewVar2) ? 2 : 4) | i3;
        } else {
            kewVar2 = kewVar;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            fdapVar2 = fdapVar;
            i6 |= true != hmlVarC.F(fdapVar2) ? 16 : 32;
        } else {
            fdapVar2 = fdapVar;
        }
        if ((i3 & 384) == 0) {
            icsVar2 = icsVar;
            i6 |= true != hmlVarC.D(icsVar2) ? 128 : 256;
        } else {
            icsVar2 = icsVar;
        }
        int i13 = i6 | 27648;
        if ((i3 & 196608) == 0) {
            i13 = i6 | 93184;
        }
        if ((1572864 & i3) == 0) {
            i13 |= true != hmlVarC.F(fdatVar) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i13 |= true != hmlVarC.F(fdatVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i14 = i13 | 100663296;
        if ((i3 & 805306368) == 0) {
            fdatVar5 = fdatVar3;
            i14 |= true != hmlVarC.F(fdatVar5) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            fdatVar5 = fdatVar3;
        }
        if ((i4 & 6) == 0) {
            fdatVar6 = fdatVar4;
            i7 = (true != hmlVarC.F(fdatVar6) ? 2 : 4) | i4;
        } else {
            fdatVar6 = fdatVar4;
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i8 = 805306368;
            z3 = z2;
            i7 |= true != hmlVarC.E(z3) ? 16 : 32;
        } else {
            i8 = 805306368;
            z3 = z2;
        }
        int i15 = i7 | 384;
        if ((i4 & 3072) == 0) {
            i15 |= true != hmlVarC.D(faeVar) ? 1024 : 2048;
        }
        int i16 = i15 | 24576;
        if ((i4 & 196608) == 0) {
            i16 |= true != hmlVarC.E(true) ? 65536 : 131072;
        }
        int i17 = i16 | 114819072;
        if ((i4 & i8) == 0) {
            i17 = i16 | 383254528;
        }
        int i18 = (i5 & 6) == 0 ? i5 | 2 : i5;
        if ((i14 & 306783379) == 306783378 && (i17 & 306783379) == 306783378 && (i18 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            z5 = z;
            jyqVar3 = jyqVar;
            kfpVar3 = kfpVar;
            fadVar3 = fadVar;
            i11 = i;
            i12 = i2;
            ikpVar3 = ikpVar;
            gxiVar2 = gxiVar;
            hmlVar2 = hmlVarC;
        } else {
            int i19 = i17 >> 24;
            int i20 = i17 & (-1879048193);
            hmlVarC.t();
            if ((i3 & 1) == 0 || hmlVarC.G()) {
                jyq jyqVar4 = (jyq) hmlVarC.e(gyj.a);
                kfp kfpVar4 = kfo.a;
                fad fadVar4 = fad.a;
                ikp ikpVarB = dtgf.b(hmlVarC);
                jyqVar2 = jyqVar4;
                kfpVar2 = kfpVar4;
                fadVar2 = fadVar4;
                i9 = Integer.MAX_VALUE;
                z4 = true;
                gxiVarA = dtgf.a(hmlVarC);
                ikpVar2 = ikpVarB;
                i10 = 1;
            } else {
                hmlVarC.s();
                z4 = z;
                jyqVar2 = jyqVar;
                kfpVar2 = kfpVar;
                fadVar2 = fadVar;
                i9 = i;
                i10 = i2;
                ikpVar2 = ikpVar;
                gxiVarA = gxiVar;
            }
            hmlVarC.l();
            int i21 = (i20 << 6) & 2147483520;
            hmlVar2 = hmlVarC;
            boolean z6 = z4;
            fdat fdatVar7 = fdatVar5;
            gpy.a(kewVar2, fdapVar2, icsVar2, z6, jyqVar2, fdatVar, fdatVar2, fdatVar7, fdatVar6, z3, kfpVar2, faeVar, fadVar2, true, i9, i10, ikpVar2, gxiVarA, hmlVar2, i14 & 2147024894, i21, i19 & 14, 3072);
            z5 = z6;
            jyqVar3 = jyqVar2;
            kfpVar3 = kfpVar2;
            fadVar3 = fadVar2;
            i11 = i9;
            i12 = i10;
            ikpVar3 = ikpVar2;
            gxiVar2 = gxiVarA;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtgg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kew kewVar3 = kewVar;
                    fdap fdapVar3 = fdapVar;
                    ics icsVar3 = icsVar;
                    boolean z7 = z5;
                    jyq jyqVar5 = jyqVar3;
                    fdat fdatVar8 = fdatVar;
                    fdat fdatVar9 = fdatVar2;
                    fdat fdatVar10 = fdatVar3;
                    fdat fdatVar11 = fdatVar4;
                    boolean z8 = z2;
                    kfp kfpVar5 = kfpVar3;
                    fae faeVar2 = faeVar;
                    fad fadVar5 = fadVar3;
                    int i22 = i11;
                    int i23 = i12;
                    int i24 = i3;
                    ikp ikpVar4 = ikpVar3;
                    int i25 = i4;
                    int iA = hpy.a(i24 | 1);
                    int iA2 = hpy.a(i25);
                    dtgi.b(kewVar3, fdapVar3, icsVar3, z7, jyqVar5, fdatVar8, fdatVar9, fdatVar10, fdatVar11, z8, kfpVar5, faeVar2, fadVar5, i22, i23, ikpVar4, gxiVar2, (hml) obj, iA, iA2, hpy.a(i5));
                    return fctx.a;
                }
            };
        }
    }
}

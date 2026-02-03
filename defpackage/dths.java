package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dths {
    public static final void a(final kew kewVar, final fdap fdapVar, final ics icsVar, boolean z, final jyq jyqVar, final fdat fdatVar, final fdat fdatVar2, final fdat fdatVar3, final boolean z2, kfp kfpVar, final fae faeVar, fad fadVar, int i, int i2, final ikp ikpVar, final gxi gxiVar, hml hmlVar, final int i3, final int i4, final int i5) {
        kew kewVar2;
        int i6;
        fdap fdapVar2;
        ics icsVar2;
        fdat fdatVar4;
        fdat fdatVar5;
        fdat fdatVar6;
        int i7;
        int i8;
        int i9;
        ikp ikpVar2;
        int i10;
        kfp kfpVar2;
        fad fadVar2;
        int i11;
        boolean z3;
        int i12;
        hml hmlVar2;
        final boolean z4;
        final kfp kfpVar3;
        final fad fadVar3;
        final int i13;
        final int i14;
        kewVar.getClass();
        fdapVar.getClass();
        hml hmlVarC = hmlVar.c(-1689721997);
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
        int i15 = i6 | 27648;
        if ((196608 & i3) == 0) {
            i15 |= true != hmlVarC.D(jyqVar) ? 65536 : 131072;
        }
        int i16 = i15 | 1572864;
        if ((12582912 & i3) == 0) {
            fdatVar4 = fdatVar;
            i16 |= true != hmlVarC.F(fdatVar4) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fdatVar4 = fdatVar;
        }
        int i17 = i3 & 805306368;
        int i18 = i16 | 100663296;
        int i19 = VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        if (i17 == 0) {
            fdatVar5 = fdatVar2;
            i18 |= true != hmlVarC.F(fdatVar5) ? 268435456 : 536870912;
        } else {
            fdatVar5 = fdatVar2;
        }
        if ((i4 & 6) == 0) {
            fdatVar6 = fdatVar3;
            i7 = (true != hmlVarC.F(fdatVar6) ? 2 : 4) | i4;
        } else {
            fdatVar6 = fdatVar3;
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i8 = 1572864;
            i9 = 805306368;
            i7 |= true != hmlVarC.E(z2) ? 16 : 32;
        } else {
            i8 = 1572864;
            i9 = 805306368;
        }
        int i20 = i7 | 384;
        if ((i4 & 3072) == 0) {
            i20 |= true != hmlVarC.D(faeVar) ? 1024 : 2048;
        }
        int i21 = i20 | 221184;
        if ((i4 & i8) == 0) {
            i21 |= true != hmlVarC.E(true) ? 524288 : 1048576;
        }
        int i22 = i21 | 113246208;
        if ((i4 & i9) == 0) {
            ikpVar2 = ikpVar;
            if (true == hmlVarC.D(ikpVar2)) {
                i19 = 536870912;
            }
            i22 |= i19;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((i5 & 6) == 0) {
            i10 = i5 | (true != hmlVarC.D(gxiVar) ? 2 : 4);
        } else {
            i10 = i5;
        }
        if ((i18 & 306783379) == 306783378 && (i22 & 306783379) == 306783378 && (i10 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            z4 = z;
            kfpVar3 = kfpVar;
            fadVar3 = fadVar;
            i14 = i;
            i13 = i2;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i3 & 1) == 0 || hmlVarC.G()) {
                kfpVar2 = kfo.a;
                fadVar2 = fad.a;
                i11 = Integer.MAX_VALUE;
                z3 = true;
                i12 = 1;
            } else {
                hmlVarC.s();
                z3 = z;
                kfpVar2 = kfpVar;
                fadVar2 = fadVar;
                i12 = i;
                i11 = i2;
            }
            hmlVarC.l();
            int i23 = i22 << 3;
            int i24 = ((i22 << 6) & 4194176) | (i23 & 29360128) | (i23 & 234881024) | ((i22 << 12) & 1879048192);
            int i25 = ((i22 >> 24) & 126) | ((i10 << 6) & 896);
            hmlVar2 = hmlVarC;
            fdat fdatVar7 = fdatVar6;
            fdat fdatVar8 = fdatVar5;
            gxu.a(kewVar2, fdapVar2, icsVar2, z3, jyqVar, fdatVar4, fdatVar8, fdatVar7, z2, kfpVar2, faeVar, fadVar2, i11, i12, ikpVar2, gxiVar, hmlVar2, i18 & 2147483646, i24, i25);
            z4 = z3;
            kfpVar3 = kfpVar2;
            fadVar3 = fadVar2;
            i13 = i11;
            i14 = i12;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dthr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kew kewVar3 = kewVar;
                    fdap fdapVar3 = fdapVar;
                    ics icsVar3 = icsVar;
                    boolean z5 = z4;
                    jyq jyqVar2 = jyqVar;
                    fdat fdatVar9 = fdatVar;
                    fdat fdatVar10 = fdatVar2;
                    fdat fdatVar11 = fdatVar3;
                    boolean z6 = z2;
                    kfp kfpVar4 = kfpVar3;
                    fae faeVar2 = faeVar;
                    fad fadVar4 = fadVar3;
                    int i26 = i14;
                    int i27 = i13;
                    int i28 = i3;
                    ikp ikpVar3 = ikpVar;
                    int i29 = i4;
                    int iA = hpy.a(i28 | 1);
                    int iA2 = hpy.a(i29);
                    dths.a(kewVar3, fdapVar3, icsVar3, z5, jyqVar2, fdatVar9, fdatVar10, fdatVar11, z6, kfpVar4, faeVar2, fadVar4, i26, i27, ikpVar3, gxiVar, (hml) obj, iA, iA2, hpy.a(i5));
                    return fctx.a;
                }
            };
        }
    }
}

package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxu {
    public static final void a(final kew kewVar, final fdap fdapVar, final ics icsVar, final boolean z, final jyq jyqVar, final fdat fdatVar, final fdat fdatVar2, final fdat fdatVar3, final boolean z2, final kfp kfpVar, final fae faeVar, final fad fadVar, final int i, final int i2, final ikp ikpVar, final gxi gxiVar, hml hmlVar, final int i3, final int i4, final int i5) {
        int i6;
        fdap fdapVar2;
        ics icsVar2;
        int i7;
        int i8;
        fdat fdatVar4;
        fdat fdatVar5;
        fdat fdatVar6;
        boolean z3;
        boolean z4;
        int i9;
        int i10;
        hml hmlVar2;
        hml hmlVarC = hmlVar.c(-1126989771);
        if ((i3 & 6) == 0) {
            i6 = (true != hmlVarC.D(kewVar) ? 2 : 4) | i3;
        } else {
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
        if ((i3 & 3072) == 0) {
            i6 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i6 |= true != hmlVarC.E(false) ? 8192 : 16384;
        }
        if ((i3 & 196608) == 0) {
            i7 = 196608;
            i6 |= true != hmlVarC.D(jyqVar) ? 65536 : 131072;
        } else {
            i7 = 196608;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= true != hmlVarC.F(null) ? 524288 : 1048576;
        }
        if ((i3 & 12582912) == 0) {
            i8 = 12582912;
            fdatVar4 = fdatVar;
            i6 |= true != hmlVarC.F(fdatVar4) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            i8 = 12582912;
            fdatVar4 = fdatVar;
        }
        if ((100663296 & i3) == 0) {
            i6 |= true != hmlVarC.F(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i3) == 0) {
            fdatVar5 = fdatVar2;
            i6 |= true != hmlVarC.F(fdatVar5) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            fdatVar5 = fdatVar2;
        }
        int i11 = i4 | 54;
        if ((i4 & 384) == 0) {
            fdatVar6 = fdatVar3;
            z3 = true;
            i11 |= true != hmlVarC.F(fdatVar6) ? 128 : 256;
        } else {
            fdatVar6 = fdatVar3;
            z3 = true;
        }
        if ((i4 & 3072) == 0) {
            i11 |= z3 == hmlVarC.E(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i11 |= z3 == hmlVarC.D(kfpVar) ? 16384 : 8192;
        }
        if ((i4 & i7) == 0) {
            i11 |= z3 != hmlVarC.D(faeVar) ? 65536 : 131072;
        }
        if ((i4 & 1572864) == 0) {
            i11 |= z3 != hmlVarC.D(fadVar) ? 524288 : 1048576;
        }
        if ((i4 & i8) == 0) {
            i11 |= z3 != hmlVarC.E(z3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i4 & 100663296) == 0) {
            i11 |= true != hmlVarC.B(i) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((i4 & 805306368) == 0) {
            i11 |= true != hmlVarC.B(i2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i5 & 6) == 0) {
            z4 = true;
            i9 = i5 | (true != hmlVarC.D(null) ? 2 : 4);
        } else {
            z4 = true;
            i9 = i5;
        }
        int i12 = i9;
        if ((i5 & 48) == 0) {
            i10 = i12 | (z4 != hmlVarC.D(ikpVar) ? 16 : 32);
        } else {
            i10 = i12;
        }
        if ((i5 & 384) == 0) {
            i10 |= true == hmlVarC.D(gxiVar) ? 256 : 128;
        }
        if (hmlVarC.J(((306783379 & i6) == 306783378 && (306783379 & i11) == 306783378 && (i10 & 147) == 146) ? false : true, i6 & 1)) {
            hmlVarC.t();
            if ((i3 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(-391702586);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar = (ebk) objS;
            hmwVar.ab();
            hmlVarC.v(-705366769);
            long jF = jyqVar.f();
            if (jF == 16) {
                jF = gxiVar.d(z, z2, ((Boolean) ebg.a(ebkVar, hmlVarC, 0).a()).booleanValue());
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            hnj.a(fnr.a.c(gxiVar.a), hxe.d(-306109195, new gxt(icsVar2, z2, gxiVar, kewVar, fdapVar2, z, jyqVar.m(new jyq(jF, 0L, null, null, 0L, 0, 0L, 16777214)), faeVar, fadVar, i, i2, kfpVar, ebkVar, fdatVar4, fdatVar5, fdatVar6, ikpVar), hmlVar2), hmlVar2, 56);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gxp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kew kewVar2 = kewVar;
                    fdap fdapVar3 = fdapVar;
                    ics icsVar3 = icsVar;
                    boolean z5 = z;
                    jyq jyqVar2 = jyqVar;
                    fdat fdatVar7 = fdatVar;
                    fdat fdatVar8 = fdatVar2;
                    fdat fdatVar9 = fdatVar3;
                    boolean z6 = z2;
                    kfp kfpVar2 = kfpVar;
                    fae faeVar2 = faeVar;
                    fad fadVar2 = fadVar;
                    int i13 = i;
                    int i14 = i2;
                    int i15 = i3;
                    ikp ikpVar2 = ikpVar;
                    int i16 = i4;
                    int iA = hpy.a(i15 | 1);
                    int iA2 = hpy.a(i16);
                    gxu.a(kewVar2, fdapVar3, icsVar3, z5, jyqVar2, fdatVar7, fdatVar8, fdatVar9, z6, kfpVar2, faeVar2, fadVar2, i13, i14, ikpVar2, gxiVar, (hml) obj, iA, iA2, hpy.a(i5));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.ics r29, defpackage.fdat r30, final defpackage.fdat r31, defpackage.fdau r32, final defpackage.fdat r33, final boolean r34, final defpackage.gxw r35, final defpackage.hil r36, final defpackage.fdat r37, defpackage.fdat r38, final defpackage.egc r39, defpackage.hml r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxu.b(ics, fdat, fdat, fdau, fdat, boolean, gxw, hil, fdat, fdat, egc, hml, int, int):void");
    }
}

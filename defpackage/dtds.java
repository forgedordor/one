package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtds {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r27, final defpackage.fdae r28, final defpackage.fdat r29, defpackage.ics r30, boolean r31, defpackage.fdat r32, defpackage.ikp r33, defpackage.gru r34, defpackage.gry r35, defpackage.dky r36, defpackage.hml r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtds.a(boolean, fdae, fdat, ics, boolean, fdat, ikp, gru, gry, dky, hml, int, int, int):void");
    }

    public static final void b(final fdae fdaeVar, final fdat fdatVar, final ics icsVar, final boolean z, final fdat fdatVar2, final fdat fdatVar3, final ikp ikpVar, final gru gruVar, gry gryVar, final dky dkyVar, hml hmlVar, final int i, final int i2) {
        int i3;
        ics icsVar2;
        fdat fdatVar4;
        fdat fdatVar5;
        ikp ikpVar2;
        gru gruVar2;
        dky dkyVar2;
        gry gryVar2;
        hml hmlVar2;
        final gry gryVar3;
        fdaeVar.getClass();
        fdatVar.getClass();
        hml hmlVarC = hmlVar.c(242855447);
        if ((i & 6) == 0) {
            i3 = (true != hmlVarC.E(false) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            icsVar2 = icsVar;
            i3 |= true != hmlVarC.D(icsVar2) ? 1024 : 2048;
        } else {
            icsVar2 = icsVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.E(z) ? 8192 : 16384;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            fdatVar4 = fdatVar2;
            i4 |= true != hmlVarC.F(fdatVar4) ? 524288 : 1048576;
        } else {
            fdatVar4 = fdatVar2;
        }
        if ((12582912 & i) == 0) {
            fdatVar5 = fdatVar3;
            i4 |= true != hmlVarC.F(fdatVar5) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fdatVar5 = fdatVar3;
        }
        if ((100663296 & i) == 0) {
            ikpVar2 = ikpVar;
            i4 |= true != hmlVarC.D(ikpVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((805306368 & i) == 0) {
            gruVar2 = gruVar;
            i4 |= true != hmlVarC.D(gruVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            gruVar2 = gruVar;
        }
        int i5 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            dkyVar2 = dkyVar;
            i5 |= true != hmlVarC.D(dkyVar2) ? 16 : 32;
        } else {
            dkyVar2 = dkyVar;
        }
        int i6 = i5 | 384;
        if ((306783379 & i4) == 306783378 && (i6 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            gryVar3 = gryVar;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                hmlVarC.v(1445578179);
                gry gryVar4 = new gry(0.0f);
                ((hmw) hmlVarC).ab();
                gryVar2 = gryVar4;
            } else {
                hmlVarC.s();
                gryVar2 = gryVar;
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            dky dkyVar3 = dkyVar2;
            gcj.c(fdaeVar, fdatVar, icsVar2, z, fdatVar4, fdatVar5, ikpVar2, gruVar2, gryVar2, dkyVar3, hmlVar2, i4 & 2147483646, i6 & 1008);
            gryVar3 = gryVar2;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtdr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fdae fdaeVar2 = fdaeVar;
                    fdat fdatVar6 = fdatVar;
                    ics icsVar3 = icsVar;
                    boolean z2 = z;
                    fdat fdatVar7 = fdatVar2;
                    fdat fdatVar8 = fdatVar3;
                    ikp ikpVar3 = ikpVar;
                    gru gruVar3 = gruVar;
                    gry gryVar5 = gryVar3;
                    int i7 = i;
                    dtds.b(fdaeVar2, fdatVar6, icsVar3, z2, fdatVar7, fdatVar8, ikpVar3, gruVar3, gryVar5, dkyVar, hmlVar3, hpy.a(i7 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}

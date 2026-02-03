package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtt {
    public static final izp a;

    static {
        kis.a(4.0f, 44.0f);
        kis.a(44.0f, 4.0f);
        a = new izp(gtl.a);
    }

    public static final float a(float f, float f2, float f3) {
        float f4 = f2 - f;
        return fddu.e(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    public static final float b(float f, float f2, float f3, float f4, float f5) {
        return kjx.b(f4, f5, a(f, f2, f3));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.ics r20, defpackage.gtx r21, final boolean r22, final defpackage.ebk r23, final defpackage.fdau r24, defpackage.fdau r25, defpackage.hml r26, final int r27) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtt.c(ics, gtx, boolean, ebk, fdau, fdau, hml, int):void");
    }

    public static final void d(final float f, final fdap fdapVar, final ics icsVar, final boolean z, final fdae fdaeVar, gst gstVar, final ebk ebkVar, final fdau fdauVar, final fdau fdauVar2, final fddm fddmVar, hml hmlVar, final int i, final int i2) {
        int i3;
        gst gstVar2;
        ebk ebkVar2;
        fdau fdauVar3;
        fdau fdauVar4;
        int i4;
        hml hmlVar2;
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(985901935);
        if (i5 == 0) {
            i3 = (true != hmlVarC.A(f) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            gstVar2 = gstVar;
            i3 |= true != hmlVarC.D(gstVar2) ? 65536 : 131072;
        } else {
            gstVar2 = gstVar;
        }
        if ((1572864 & i) == 0) {
            ebkVar2 = ebkVar;
            i3 |= true != hmlVarC.D(ebkVar2) ? 524288 : 1048576;
        } else {
            ebkVar2 = ebkVar;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != hmlVarC.B(0) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            fdauVar3 = fdauVar;
            i3 |= true != hmlVarC.F(fdauVar3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            fdauVar3 = fdauVar;
        }
        if ((805306368 & i) == 0) {
            fdauVar4 = fdauVar2;
            i3 |= true != hmlVarC.F(fdauVar4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            fdauVar4 = fdauVar2;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != hmlVarC.D(fddmVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (hmlVarC.J(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            int i6 = i3;
            boolean z2 = ((29360128 & i3) == 8388608) | ((((i4 & 14) ^ 6) > 4 && hmlVarC.D(fddmVar)) || (i4 & 6) == 4);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (z2 || objS == hmk.a) {
                objS = new gtx(f, fdaeVar, fddmVar);
                hmwVar.af(objS);
            }
            gtx gtxVar = (gtx) objS;
            gtxVar.a = fdaeVar;
            gtxVar.b = fdapVar;
            gtxVar.k(f);
            int i7 = i6 >> 9;
            hmlVar2 = hmlVarC;
            e(gtxVar, icsVar, z, null, ebkVar2, fdauVar3, fdauVar4, hmlVar2, ((i6 >> 3) & 1008) | ((i6 >> 6) & 57344) | (458752 & i7) | (3670016 & i7));
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            final gst gstVar3 = gstVar2;
            hpxVarL.d = new fdat() { // from class: gth
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    fdap fdapVar2 = fdapVar;
                    ics icsVar2 = icsVar;
                    boolean z3 = z;
                    fdae fdaeVar2 = fdaeVar;
                    gst gstVar4 = gstVar3;
                    ebk ebkVar3 = ebkVar;
                    fdau fdauVar5 = fdauVar;
                    int i8 = i;
                    gtt.d(f2, fdapVar2, icsVar2, z3, fdaeVar2, gstVar4, ebkVar3, fdauVar5, fdauVar2, fddmVar, hmlVar3, hpy.a(i8 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final gtx gtxVar, final ics icsVar, final boolean z, gst gstVar, final ebk ebkVar, final fdau fdauVar, final fdau fdauVar2, hml hmlVar, final int i) {
        gtx gtxVar2;
        int i2;
        final gst gstVar2;
        gst gstVarB;
        hml hmlVarC = hmlVar.c(409861960);
        if ((i & 6) == 0) {
            gtxVar2 = gtxVar;
            i2 = (true != hmlVarC.F(gtxVar2) ? 2 : 4) | i;
        } else {
            gtxVar2 = gtxVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(ebkVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar2) ? 524288 : 1048576;
        }
        if (hmlVarC.J((599187 & i2) != 599186, i2 & 1)) {
            int i3 = i2 & (-7169);
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                gte gteVar = gte.a;
                gstVarB = gte.b(glz.a(hmlVarC));
            } else {
                hmlVarC.s();
                gstVarB = gstVar;
            }
            hmlVarC.l();
            int i4 = i3 >> 3;
            c(icsVar, gtxVar2, z, ebkVar, fdauVar, fdauVar2, hmlVarC, (i2 & 896) | ((i3 << 3) & 112) | (i4 & 14) | (i4 & 7168) | (57344 & i4) | (458752 & i4));
            gstVar2 = gstVarB;
        } else {
            hmlVarC.s();
            gstVar2 = gstVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gtg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    gtx gtxVar3 = gtxVar;
                    ics icsVar2 = icsVar;
                    boolean z2 = z;
                    gst gstVar3 = gstVar2;
                    ebk ebkVar2 = ebkVar;
                    int i5 = i;
                    gtt.e(gtxVar3, icsVar2, z2, gstVar3, ebkVar2, fdauVar, fdauVar2, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

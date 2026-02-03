package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxg {
    public static final void a(final int i, final ics icsVar, final long j, final long j2, final float f, final float f2, final dpn dpnVar, final fdau fdauVar, final fdat fdatVar, final fdat fdatVar2, hml hmlVar, final int i2) {
        int i3;
        int i4;
        dpn dpnVar2;
        fdat fdatVar3;
        fdat fdatVar4;
        hml hmlVar2;
        int i5 = i2 & 6;
        hml hmlVarC = hmlVar.c(414860860);
        if (i5 == 0) {
            i3 = i;
            i4 = (true != hmlVarC.B(i3) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != hmlVarC.C(j2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != hmlVarC.A(f) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != hmlVarC.A(f2) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            dpnVar2 = dpnVar;
            i4 |= true != hmlVarC.D(dpnVar2) ? 524288 : 1048576;
        } else {
            dpnVar2 = dpnVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != hmlVarC.F(fdauVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            fdatVar3 = fdatVar;
            i4 |= true != hmlVarC.F(fdatVar3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            fdatVar3 = fdatVar;
        }
        if ((805306368 & i2) == 0) {
            fdatVar4 = fdatVar2;
            i4 |= true != hmlVarC.F(fdatVar4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            fdatVar4 = fdatVar2;
        }
        if (hmlVarC.J((i4 & 306783379) != 306783378, i4 & 1)) {
            hmlVar2 = hmlVarC;
            gvk.c(icsVar, null, j, j2, 0.0f, 0.0f, null, hxe.d(1878374785, new gwz(dpnVar2, fdatVar4, fdatVar3, f, f2, i3, fdauVar), hmlVarC), hmlVar2, 114);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gws
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    ics icsVar2 = icsVar;
                    long j3 = j;
                    long j4 = j2;
                    float f3 = f;
                    float f4 = f2;
                    dpn dpnVar3 = dpnVar;
                    fdau fdauVar2 = fdauVar;
                    fdat fdatVar5 = fdatVar;
                    gxg.a(i6, icsVar2, j3, j4, f3, f4, dpnVar3, fdauVar2, fdatVar5, fdatVar2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final long j, final long j2, final fdau fdauVar, final fdat fdatVar, final fdat fdatVar2, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1955286154);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 65536 : 131072;
        }
        if (hmlVarC.J((74899 & i2) != 74898, 1 & i2)) {
            hmlVar2 = hmlVarC;
            gvk.c(eur.a(icsVar2), null, j, j2, 0.0f, 0.0f, null, hxe.d(830280655, new gxf(fdatVar2, fdatVar, fdauVar), hmlVarC), hmlVar2, 114);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gwr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    long j3 = j;
                    long j4 = j2;
                    fdau fdauVar2 = fdauVar;
                    fdat fdatVar3 = fdatVar;
                    gxg.b(icsVar3, j3, j4, fdauVar2, fdatVar3, fdatVar2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final int i, final ics icsVar, final dpn dpnVar, final long j, final long j2, final float f, final fdau fdauVar, final fdat fdatVar, final float f2, final fdat fdatVar2, hml hmlVar, final int i2) {
        int i3;
        int i4;
        dpn dpnVar2;
        long j3;
        long j4;
        float f3;
        fdau fdauVar2;
        fdat fdatVar3;
        float f4;
        fdat fdatVar4;
        hml hmlVar2;
        int i5 = i2 & 6;
        hml hmlVarC = hmlVar.c(519094802);
        if (i5 == 0) {
            i3 = i;
            i4 = (true != hmlVarC.B(i3) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            dpnVar2 = dpnVar;
            i4 |= true != hmlVarC.D(dpnVar2) ? 128 : 256;
        } else {
            dpnVar2 = dpnVar;
        }
        if ((i2 & 3072) == 0) {
            j3 = j;
            i4 |= true != hmlVarC.C(j3) ? 1024 : 2048;
        } else {
            j3 = j;
        }
        if ((i2 & 24576) == 0) {
            j4 = j2;
            i4 |= true != hmlVarC.C(j4) ? 8192 : 16384;
        } else {
            j4 = j2;
        }
        if ((196608 & i2) == 0) {
            f3 = f;
            i4 |= true != hmlVarC.A(f3) ? 65536 : 131072;
        } else {
            f3 = f;
        }
        if ((1572864 & i2) == 0) {
            fdauVar2 = fdauVar;
            i4 |= true != hmlVarC.F(fdauVar2) ? 524288 : 1048576;
        } else {
            fdauVar2 = fdauVar;
        }
        if ((12582912 & i2) == 0) {
            fdatVar3 = fdatVar;
            i4 |= true != hmlVarC.F(fdatVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            fdatVar3 = fdatVar;
        }
        if ((100663296 & i2) == 0) {
            f4 = f2;
            i4 |= true != hmlVarC.A(f4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            f4 = f2;
        }
        if ((805306368 & i2) == 0) {
            fdatVar4 = fdatVar2;
            i4 |= true != hmlVarC.F(fdatVar4) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            fdatVar4 = fdatVar2;
        }
        int i6 = i4;
        if (hmlVarC.J((i4 & 306783379) != 306783378, i6 & 1)) {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            int i7 = i6 >> 3;
            int i8 = i6 << 3;
            hmlVar2 = hmlVarC;
            a(i3, icsVar, j3, j4, f3, f4, dpnVar2, fdauVar2, fdatVar3, fdatVar4, hmlVar2, (i7 & 57344) | (i6 & 126) | (i7 & 896) | (i7 & 7168) | (458752 & (i6 >> 9)) | ((i6 << 12) & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i6 & 1879048192));
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gwq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i9 = i;
                    ics icsVar2 = icsVar;
                    dpn dpnVar3 = dpnVar;
                    long j5 = j;
                    long j6 = j2;
                    float f5 = f;
                    fdau fdauVar3 = fdauVar;
                    fdat fdatVar5 = fdatVar;
                    float f6 = f2;
                    gxg.c(i9, icsVar2, dpnVar3, j5, j6, f5, fdauVar3, fdatVar5, f6, fdatVar2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final int i, final ics icsVar, final long j, final long j2, final fdau fdauVar, final fdat fdatVar, final fdat fdatVar2, hml hmlVar, final int i2) {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(563434725);
        if (i4 == 0) {
            i3 = (true != hmlVarC.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.C(j2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != hmlVarC.F(fdatVar2) ? 524288 : 1048576;
        }
        if (hmlVarC.J((599187 & i3) != 599186, i3 & 1)) {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            b(icsVar, j, j2, fdauVar, fdatVar, fdatVar2, hmlVar2, (i3 >> 3) & 524286);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gwt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    ics icsVar2 = icsVar;
                    long j3 = j;
                    long j4 = j2;
                    fdau fdauVar2 = fdauVar;
                    fdat fdatVar3 = fdatVar;
                    gxg.d(i5, icsVar2, j3, j4, fdauVar2, fdatVar3, fdatVar2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtdb {
    public static final void a(final fdau fdauVar, ics icsVar, final gak gakVar, final float f, ikp ikpVar, final long j, final long j2, float f2, float f3, final fdat fdatVar, boolean z, final fdat fdatVar2, fdau fdauVar2, final long j3, long j4, final fdau fdauVar3, hml hmlVar, final int i, final int i2) {
        int i3;
        gak gakVar2;
        float f4;
        fdat fdatVar3;
        ics icsVar2;
        int i4;
        final ikp ikpVarB;
        final fdau fdauVar4;
        final long jA;
        final float f5;
        final float f6;
        final boolean z2;
        hml hmlVar2;
        final ics icsVar3;
        fdauVar.getClass();
        fdauVar3.getClass();
        hml hmlVarC = hmlVar.c(-1146176352);
        if ((i & 6) == 0) {
            i3 = (true != hmlVarC.F(fdauVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            gakVar2 = gakVar;
            i5 |= true != hmlVarC.D(gakVar2) ? 128 : 256;
        } else {
            gakVar2 = gakVar;
        }
        if ((i & 3072) == 0) {
            f4 = f;
            i5 |= true != hmlVarC.A(f4) ? 1024 : 2048;
        } else {
            f4 = f;
        }
        if ((i & 24576) == 0) {
            i5 |= 8192;
        }
        if ((i & 196608) == 0) {
            i5 |= true != hmlVarC.C(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i5 |= true != hmlVarC.C(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((805306368 & i) == 0) {
            fdatVar3 = fdatVar;
            i5 |= true != hmlVarC.F(fdatVar3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            fdatVar3 = fdatVar;
        }
        int i6 = i2 | 6;
        if ((i2 & 48) == 0) {
            i6 |= true != hmlVarC.F(fdatVar2) ? 16 : 32;
        }
        int i7 = i6 | 384;
        if ((i2 & 3072) == 0) {
            i7 |= true != hmlVarC.C(j3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i7 |= 8192;
        }
        if ((i2 & 196608) == 0) {
            i7 |= true != hmlVarC.F(fdauVar3) ? 65536 : 131072;
        }
        if ((306783379 & i5) == 306783378 && (74899 & i7) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            ikpVarB = ikpVar;
            f5 = f2;
            f6 = f3;
            z2 = z;
            fdauVar4 = fdauVar2;
            jA = j4;
            hmlVar2 = hmlVarC;
        } else {
            int i8 = (-57345) & i7;
            int i9 = i5 >> 27;
            int i10 = (-264298497) & i5;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar2 = ics.e;
                i4 = i9;
                ikpVarB = dtcz.b(hmlVarC);
                fdauVar4 = dtea.a;
                jA = dtdu.a(j3, hmlVarC);
                f5 = 1.0f;
                f6 = 1.0f;
                z2 = true;
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
                f5 = f2;
                f6 = f3;
                z2 = z;
                fdauVar4 = fdauVar2;
                jA = j4;
                i4 = i9;
                ikpVarB = ikpVar;
            }
            hmlVarC.l();
            int i11 = i10 << 3;
            int i12 = i8 << 3;
            hmlVar2 = hmlVarC;
            ics icsVar4 = icsVar2;
            gaj.e(fdauVar, icsVar4, gakVar2, f4, 0.0f, ikpVarB, j, j2, f5, f6, fdatVar3, z2, fdatVar2, fdauVar4, j3, jA, fdauVar3, hmlVar2, (i5 & 8190) | (i11 & 3670016) | (i11 & 29360128), (i12 & 896) | (i4 & 14) | (i12 & 112) | (i12 & 7168) | (57344 & i12) | (3670016 & i12));
            icsVar3 = icsVar4;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtda
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdau fdauVar5 = fdauVar;
                    ics icsVar5 = icsVar3;
                    gak gakVar3 = gakVar;
                    float f7 = f;
                    ikp ikpVar2 = ikpVarB;
                    long j5 = j;
                    long j6 = j2;
                    float f8 = f5;
                    float f9 = f6;
                    fdat fdatVar4 = fdatVar;
                    boolean z3 = z2;
                    fdat fdatVar5 = fdatVar2;
                    fdau fdauVar6 = fdauVar4;
                    long j7 = j3;
                    long j8 = jA;
                    int i13 = i;
                    dtdb.a(fdauVar5, icsVar5, gakVar3, f7, ikpVar2, j5, j6, f8, f9, fdatVar4, z3, fdatVar5, fdauVar6, j7, j8, fdauVar3, (hml) obj, hpy.a(i13 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}

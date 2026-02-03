package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtio {
    public static final void a(final ics icsVar, final long j, final long j2, final ind indVar, final ind indVar2, float f, float f2, float f3, float f4, hml hmlVar, final int i) {
        int i2;
        float f5;
        float f6;
        float f7;
        float f8;
        hml hmlVar2;
        final float f9;
        final float f10;
        final float f11;
        final float f12;
        hml hmlVarC = hmlVar.c(-897818363);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(indVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(indVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        int i3 = 1572864 | i2;
        if ((12582912 & i) == 0) {
            i3 = i2 | 5767168;
        }
        if ((100663296 & i) == 0) {
            i3 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((38347923 & i3) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
            f9 = f;
            f10 = f2;
            f11 = f3;
            f12 = f4;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                float f13 = dtim.a;
                f5 = dtim.b;
                f6 = dtim.a;
                f7 = f6;
                f8 = 1.0f;
            } else {
                hmlVarC.s();
                f5 = f;
                f8 = f2;
                f6 = f3;
                f7 = f4;
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            hcz.a(icsVar, j, j2, indVar, indVar2, f5, f8, f6, f7, hmlVar2, i3 & 3735550);
            f9 = f5;
            f10 = f8;
            f11 = f6;
            f12 = f7;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtin
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    long j3 = j;
                    long j4 = j2;
                    ind indVar3 = indVar;
                    ind indVar4 = indVar2;
                    float f14 = f9;
                    float f15 = f10;
                    float f16 = f11;
                    dtio.a(icsVar2, j3, j4, indVar3, indVar4, f14, f15, f16, f12, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

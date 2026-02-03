package defpackage;

import androidx.compose.material3.internal.IndeterminateCircularWavyProgressElement;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcz {
    static {
        den denVar = hlm.a;
        dea.c(500, 0, hlm.d, 2);
        dea.c(500, 0, hlm.a, 2);
    }

    public static final void a(final ics icsVar, final long j, final long j2, final ind indVar, final ind indVar2, final float f, final float f2, final float f3, final float f4, hml hmlVar, final int i) {
        int i2;
        ind indVar3;
        float f5;
        float f6;
        float f7;
        float f8;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(958856149);
        if (i3 == 0) {
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
            indVar3 = indVar2;
            i2 |= true != hmlVarC.F(indVar3) ? 8192 : 16384;
        } else {
            indVar3 = indVar2;
        }
        if ((196608 & i) == 0) {
            f5 = f;
            i2 |= true != hmlVarC.A(f5) ? 65536 : 131072;
        } else {
            f5 = f;
        }
        if ((1572864 & i) == 0) {
            f6 = f2;
            i2 |= true != hmlVarC.A(f6) ? 524288 : 1048576;
        } else {
            f6 = f2;
        }
        if ((12582912 & i) == 0) {
            f7 = f3;
            i2 |= true != hmlVarC.A(f7) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            f7 = f3;
        }
        if ((100663296 & i) == 0) {
            f8 = f4;
            i2 |= true != hmlVarC.A(f8) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            f8 = f4;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            float f9 = hcx.a;
            ics icsVarK = egq.k(icsVar, hcx.a);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarK);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            ico icoVar = ics.e;
            egt.a(egq.c(icoVar, 1.0f).a(new IndeterminateCircularWavyProgressElement(j, j2, indVar, indVar3, f5, f6, f7, f8)), hmlVarC);
            egt.a(dpa.a(egq.c(icoVar, 1.0f)), hmlVarC);
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hcy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    long j3 = j;
                    long j4 = j2;
                    ind indVar4 = indVar;
                    ind indVar5 = indVar2;
                    float f10 = f;
                    float f11 = f2;
                    int i4 = i;
                    hcz.a(icsVar2, j3, j4, indVar4, indVar5, f10, f11, f3, f4, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtii {
    public static final void a(final hcf hcfVar, ics icsVar, final fdat fdatVar, long j, float f, ikp ikpVar, final gqx gqxVar, float f2, float f3, final fdat fdatVar2, hml hmlVar, final int i, final int i2) {
        hcf hcfVar2;
        int i3;
        fdat fdatVar3;
        int i4;
        ics icsVar2;
        float f4;
        ikp ikpVar2;
        float f5;
        float f6;
        long j2;
        hml hmlVar2;
        final ics icsVar3;
        final long j3;
        final float f7;
        final ikp ikpVar3;
        final float f8;
        final float f9;
        fdatVar2.getClass();
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(-880522537);
        if (i5 == 0) {
            hcfVar2 = hcfVar;
            i3 = (true != hmlVarC.F(hcfVar2) ? 2 : 4) | i;
        } else {
            hcfVar2 = hcfVar;
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            i6 |= true != hmlVarC.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i6 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i6 |= 8192;
        }
        int i7 = 196608 | i6;
        if ((1572864 & i) == 0) {
            i7 = i6 | 720896;
        }
        if ((12582912 & i) == 0) {
            i7 |= true != hmlVarC.D(gqxVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i7 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((805306368 & i) == 0) {
            i7 |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        if ((i2 & 6) == 0) {
            fdatVar3 = fdatVar2;
            i4 = i2 | (true != hmlVarC.F(fdatVar3) ? 2 : 4);
        } else {
            fdatVar3 = fdatVar2;
            i4 = i2;
        }
        if ((306783379 & i7) == 306783378 && (i4 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            j3 = j;
            f7 = f;
            ikpVar3 = ikpVar;
            f8 = f2;
            f9 = f3;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                ico icoVar = ics.e;
                float f10 = dtif.a;
                float f11 = dtif.a;
                hmlVarC.v(1396064359);
                ikp ikpVarB = dtgs.b(13, hmlVarC);
                ((hmw) hmlVarC).ab();
                icsVar2 = icoVar;
                f4 = f11;
                ikpVar2 = ikpVarB;
                f5 = 3.0f;
                f6 = 3.0f;
                j2 = 9205357640488583168L;
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
                j2 = j;
                f4 = f;
                ikpVar2 = ikpVar;
                f5 = f2;
                f6 = f3;
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            hce.a(hcfVar2, icsVar2, fdatVar, j2, f4, ikpVar2, gqxVar, f5, f6, fdatVar3, hmlVar2, i7 & 29827070, i4 & 14);
            icsVar3 = icsVar2;
            j3 = j2;
            f7 = f4;
            ikpVar3 = ikpVar2;
            f8 = f5;
            f9 = f6;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtig
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    hcf hcfVar3 = hcfVar;
                    ics icsVar4 = icsVar3;
                    fdat fdatVar4 = fdatVar;
                    long j4 = j3;
                    float f12 = f7;
                    ikp ikpVar4 = ikpVar3;
                    gqx gqxVar2 = gqxVar;
                    float f13 = f8;
                    float f14 = f9;
                    int i8 = i;
                    dtii.a(hcfVar3, icsVar4, fdatVar4, j4, f12, ikpVar4, gqxVar2, f13, f14, fdatVar2, hmlVar3, hpy.a(i8 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final koa koaVar, final fdau fdauVar, final hcj hcjVar, final ics icsVar, boolean z, boolean z2, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        final boolean z3;
        final boolean z4;
        koaVar.getClass();
        fdauVar.getClass();
        hcjVar.getClass();
        hml hmlVarC = hmlVar.c(-1277076934);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(koaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(hcjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        int i3 = i2 | 1794048;
        if ((12582912 & i) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793491 & i3) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
            z3 = z;
            hmlVar2 = hmlVarC;
            z4 = z2;
        } else {
            hce.b(koaVar, fdauVar, hcjVar, icsVar, fdatVar, hmlVarC, 33554430 & i3);
            hmlVar2 = hmlVarC;
            z3 = true;
            z4 = true;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtih
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    koa koaVar2 = koaVar;
                    fdau fdauVar2 = fdauVar;
                    hcj hcjVar2 = hcjVar;
                    ics icsVar2 = icsVar;
                    boolean z5 = z3;
                    boolean z6 = z4;
                    dtii.b(koaVar2, fdauVar2, hcjVar2, icsVar2, z5, z6, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

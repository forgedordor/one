package defpackage;

import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmg {
    public static final /* synthetic */ int a = 0;
    private static final hpt b = new hsg(new fdae() { // from class: gmc
        @Override // defpackage.fdae
        public final Object invoke() {
            int i = gmg.a;
            return false;
        }
    });

    public static final void a(final gda gdaVar, final gpe gpeVar, final gsa gsaVar, final hcr hcrVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        gsa gsaVar2;
        hcr hcrVar2;
        fdat fdatVar2;
        gpe gpeVarB;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1317329884);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(gdaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(gpeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            gsaVar2 = gsaVar;
            i2 |= true != hmlVarC.D(gsaVar2) ? 128 : 256;
        } else {
            gsaVar2 = gsaVar;
        }
        if ((i & 3072) == 0) {
            hcrVar2 = hcrVar;
            i2 |= true != hmlVarC.D(hcrVar2) ? 1024 : 2048;
        } else {
            hcrVar2 = hcrVar;
        }
        if ((i & 24576) == 0) {
            fdatVar2 = fdatVar;
            i2 |= true != hmlVarC.F(fdatVar2) ? 8192 : 16384;
        } else {
            fdatVar2 = fdatVar;
        }
        if (hmlVarC.J((i2 & 9363) != 9362, i2 & 1)) {
            hpt hptVar = b;
            if (((Boolean) hmlVarC.e(hptVar)).booleanValue()) {
                hmlVarC.v(1458700415);
                hmlVarC.v(-1061322460);
                hmw hmwVar = (hmw) hmlVarC;
                hmwVar.ab();
                if (gpeVar == null) {
                    hmlVarC.v(-1061319320);
                    gpeVarB = glz.b(hmlVarC);
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-1061320250);
                    hmwVar.ab();
                    gpeVarB = gpeVar;
                }
                hmlVarC.v(-1061318046);
                hmwVar.ab();
                hmlVarC.v(-1061316102);
                hmwVar.ab();
                b(gdaVar, gpeVarB, gsaVar2, hcrVar2, fdatVar2, hmlVarC, i2 & 57344);
                hmwVar.ab();
            } else {
                hmlVarC.v(1459035990);
                hnj.a(hptVar.c(true), hxe.d(1535649272, new gme(gdaVar, gpeVar, gsaVar, hcrVar, fdatVar), hmlVarC), hmlVarC, 56);
                ((hmw) hmlVarC).ab();
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gmd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    gda gdaVar2 = gdaVar;
                    gpe gpeVar2 = gpeVar;
                    gsa gsaVar3 = gsaVar;
                    int i4 = i;
                    gmg.a(gdaVar2, gpeVar2, gsaVar3, hcrVar, fdatVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final gda gdaVar, final gpe gpeVar, final gsa gsaVar, final hcr hcrVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        char c;
        char c2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(904511636);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(gdaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(gpeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(gsaVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(hcrVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 8192 : 16384;
        }
        if (hmlVarC.J((i2 & 9363) != 9362, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            dnk dnkVarA = grb.a(false, 0.0f, 0L, 7);
            long j = gdaVar.a;
            boolean zC = hmlVarC.C(j);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zC || objS == hmk.a) {
                c = 1;
                c2 = 4;
                objS = new fnp(j, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.4f, ije.f(j)));
                hmwVar.af(objS);
            } else {
                c = 1;
                c2 = 4;
            }
            hpu[] hpuVarArr = new hpu[6];
            hpuVarArr[0] = gdd.a.c(gdaVar);
            hpuVarArr[c] = gpg.a.c(gpeVar);
            hpuVarArr[2] = dnh.a.c(dnkVarA);
            hpuVarArr[3] = gsc.a.c(gsaVar);
            hpuVarArr[c2] = fnr.a.c((fnp) objS);
            hpuVarArr[5] = hct.a.c(hcrVar);
            hnj.b(hpuVarArr, hxe.d(-1750539308, new gmf(hcrVar, fdatVar), hmlVarC), hmlVarC, 56);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gma
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    gda gdaVar2 = gdaVar;
                    gpe gpeVar2 = gpeVar;
                    gsa gsaVar2 = gsaVar;
                    int i4 = i;
                    gmg.b(gdaVar2, gpeVar2, gsaVar2, hcrVar, fdatVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(gda gdaVar, gsa gsaVar, hcr hcrVar, fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        gda gdaVar2;
        final fdat fdatVar2;
        final hcr hcrVar2;
        final gsa gsaVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-449719819);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(gdaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(hcrVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                gsaVar = glz.c(hmlVarC);
            } else {
                hmlVarC.s();
            }
            gsa gsaVar3 = gsaVar;
            hmlVarC.l();
            int i5 = i4 << 3;
            gdaVar2 = gdaVar;
            b(gdaVar2, glz.b(hmlVarC), gsaVar3, hcrVar, fdatVar, hmlVarC, (i2 & 14) | (i5 & 7168) | (i5 & 57344));
            hcrVar2 = hcrVar;
            fdatVar2 = fdatVar;
            gsaVar2 = gsaVar3;
        } else {
            gdaVar2 = gdaVar;
            fdatVar2 = fdatVar;
            hcrVar2 = hcrVar;
            hmlVarC.s();
            gsaVar2 = gsaVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final gda gdaVar3 = gdaVar2;
            hpxVarL.d = new fdat() { // from class: gmb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    gda gdaVar4 = gdaVar3;
                    gsa gsaVar4 = gsaVar2;
                    int i6 = i;
                    gmg.c(gdaVar4, gsaVar4, hcrVar2, fdatVar2, hmlVar2, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

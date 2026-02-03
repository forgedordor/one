package defpackage;

import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtff {
    public static final void a(gda gdaVar, gsa gsaVar, hcr hcrVar, final fdat fdatVar, hml hmlVar, final int i, final int i2) {
        gda gdaVarD;
        int i3;
        final gsa gsaVar2;
        final hcr hcrVarA;
        final gda gdaVar2;
        fdatVar.getClass();
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(648134875);
        if (i4 == 0) {
            int i5 = 2;
            if ((i2 & 1) == 0) {
                gdaVarD = gdaVar;
                if (hmlVarC.D(gdaVarD)) {
                    i5 = 4;
                }
            } else {
                gdaVarD = gdaVar;
            }
            i3 = i5 | i;
        } else {
            gdaVarD = gdaVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = 16;
            if ((i2 & 2) == 0) {
                gsaVar2 = gsaVar;
                if (hmlVarC.D(gsaVar2)) {
                    i6 = 32;
                }
            } else {
                gsaVar2 = gsaVar;
            }
            i3 |= i6;
        } else {
            gsaVar2 = gsaVar;
        }
        if ((i & 384) == 0) {
            int i7 = 128;
            if ((i2 & 4) == 0) {
                hcrVarA = hcrVar;
                if (hmlVarC.D(hcrVarA)) {
                    i7 = 256;
                }
            } else {
                hcrVarA = hcrVar;
            }
            i3 |= i7;
        } else {
            hcrVarA = hcrVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            gdaVar2 = gdaVarD;
        } else {
            int i8 = i2 & 4;
            int i9 = i2 & 2;
            int i10 = i2 & 1;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                if (i10 != 0) {
                    i3 &= -15;
                    gdaVarD = dtdu.d(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
                }
                if (i9 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    gsaVar2 = dtgs.a;
                }
                if (i8 != 0) {
                    i3 &= -897;
                    hcrVarA = dtfg.a();
                }
            } else {
                hmlVarC.s();
                if (i10 != 0) {
                    i3 &= -15;
                }
                if (i9 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if (i8 != 0) {
                    i3 &= -897;
                }
            }
            gda gdaVar3 = gdaVarD;
            gsa gsaVar3 = gsaVar2;
            hcr hcrVar2 = hcrVarA;
            hmlVarC.l();
            int i11 = i3 << 3;
            b(gdaVar3, new dtge(), gsaVar3, hcrVar2, fdatVar, hmlVarC, (i3 & 14) | (i11 & 896) | (i11 & 7168) | (i11 & 57344));
            gdaVar2 = gdaVar3;
            gsaVar2 = gsaVar3;
            hcrVarA = hcrVar2;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtfd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gda gdaVar4 = gdaVar2;
                    gsa gsaVar4 = gsaVar2;
                    hcr hcrVar3 = hcrVarA;
                    dtff.a(gdaVar4, gsaVar4, hcrVar3, fdatVar, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(gda gdaVar, gpe gpeVar, gsa gsaVar, hcr hcrVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        hcr hcrVar2;
        final gda gdaVar2;
        final gpe gpeVar2;
        final gsa gsaVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2124579738);
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
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            hcrVar2 = hcrVar;
            gsaVar2 = gsaVar;
            gpeVar2 = gpeVar;
            gdaVar2 = gdaVar;
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hcrVar2 = hcrVar;
            gmg.b(gdaVar, gpeVar, gsaVar, hcrVar2, hxe.d(1798917965, new dtfe(c(gdaVar, hmlVarC), fdatVar), hmlVarC), hmlVarC, (i2 & 14) | 24576 | (i2 & 112) | (i2 & 896) | (i2 & 7168));
            gdaVar2 = gdaVar;
            gpeVar2 = gpeVar;
            gsaVar2 = gsaVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final hcr hcrVar3 = hcrVar2;
            hpxVarL.d = new fdat() { // from class: dtfc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gda gdaVar3 = gdaVar2;
                    gpe gpeVar3 = gpeVar2;
                    gsa gsaVar3 = gsaVar2;
                    hcr hcrVar4 = hcrVar3;
                    dtff.b(gdaVar3, gpeVar3, gsaVar3, hcrVar4, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final fnp c(gda gdaVar, hml hmlVar) {
        hmlVar.v(-816036754);
        hmlVar.v(5004770);
        long j = gdaVar.a;
        boolean zC = hmlVar.C(j);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zC || objS == hmk.a) {
            objS = new fnp(j, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.4f, ije.f(j)));
            hmwVar.af(objS);
        }
        fnp fnpVar = (fnp) objS;
        hmwVar.ab();
        hmwVar.ab();
        return fnpVar;
    }
}

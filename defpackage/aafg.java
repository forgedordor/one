package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafg {
    public static final void a(final aaet aaetVar, hml hmlVar, final int i) {
        int i2;
        aaes aaesVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1906186501);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(aaetVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            c(aaetVar, hoxVar, hmlVarC, (i2 & 14) | 48);
            if (((Boolean) hoxVar.a()).booleanValue() && (aaesVar = aaetVar.j) != null) {
                d(aaesVar, hoxVar, null, hmlVarC, 48);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aaey
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aafg.a(aaetVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dkeg dkegVar, final evm evmVar, hml hmlVar, final int i) throws Resources.NotFoundException {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(182788783);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkegVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(evmVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            ico icoVar = ics.e;
            ics icsVarA = iex.a(dkr.c(efy.j(icoVar, 0.0f, 20.0f, 0.0f, 0.0f, 13), 1.0f, glz.a(hmlVarC).B, evmVar), evmVar);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dkef.k(dkegVar, efy.i(efy.j(icoVar, 0.0f, 0.0f, 16.0f, 0.0f, 11), 0.0f, 2.0f, 1), glz.d(hmlVarC).m, null, new ije(glz.a(hmlVarC).s), new kir(0.0f), new kir(0.0f), null, hmlVarC, (i2 & 14) | 905969712, 0, 1208);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aaex
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    dkeg dkegVar2 = dkegVar;
                    int i5 = i;
                    aafg.b(dkegVar2, evmVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final aaet aaetVar, final hox hoxVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-737453001);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(aaetVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            kme.a(aaetVar.h, new knl(false, false, 0, false, false, 37), hxe.d(-1478718080, new aafb(aaetVar, hoxVar), hmlVarC), hmlVarC, 432, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aaeu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    aaet aaetVar2 = aaetVar;
                    int i4 = i;
                    aafg.c(aaetVar2, hoxVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final aaes aaesVar, final hox hoxVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        hoxVar.getClass();
        hml hmlVarC = hmlVar.c(-207996074);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(aaesVar) : hmlVarC.F(aaesVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = ics.e;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(new kir(0.0f), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar2 = (hox) objS;
            hmwVar.ab();
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            aaer aaerVar = aaesVar.a;
            hmlVarC.v(5004770);
            int i4 = i3 & 112;
            Object objS2 = hmwVar.S();
            if (i4 == 32 || objS2 == obj) {
                objS2 = new fdae() { // from class: aaev
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hoxVar.b(false);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            divg divgVarA = aaerVar.a((fdae) objS2);
            diuy.c(icsVar2, null, 0L, 0L, divgVarA, hxe.d(1273316281, new aaff(aaesVar, divgVarA, kioVar, hoxVar2), hmlVarC), hmlVarC, ((i3 >> 6) & 14) | 196608, 14);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aaew
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    aaes aaesVar2 = aaesVar;
                    hox hoxVar3 = hoxVar;
                    int i5 = i;
                    aafg.d(aaesVar2, hoxVar3, icsVar2, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

package defpackage;

import androidx.compose.material3.internal.ParentSemanticsNodeElement;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhp {
    public static final void a(final koa koaVar, final fdat fdatVar, hcj hcjVar, final ics icsVar, final fdat fdatVar2, hml hmlVar, final int i) {
        int i2;
        fdat fdatVar3;
        final hcj hcjVar2 = hcjVar;
        hml hmlVarC = hmlVar.c(1084523924);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(koaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            fdatVar3 = fdatVar;
            i2 |= true != hmlVarC.F(fdatVar3) ? 16 : 32;
        } else {
            fdatVar3 = fdatVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(hcjVar2) : hmlVarC.F(hcjVar2)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(true) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.E(true) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i3 = i2;
        if (hmlVarC.J((4793491 & i3) != 4793490, i3 & 1)) {
            int i4 = i3 >> 6;
            int i5 = i3 >> 3;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            fdjx fdjxVar = (fdjx) objS;
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar4 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar4);
            }
            int i6 = i5 & 112;
            hsk.b(hmlVarC, icsVarB, jbb.c);
            if (hcjVar.c()) {
                hmlVarC.v(-2073533916);
                hcjVar2 = hcjVar;
                b(koaVar, hcjVar2, fdjxVar, fdatVar3, hmlVarC, (i3 & 14) | i6 | (i4 & 896) | (57344 & i5) | (458752 & (i3 << 12)));
                hmwVar.ab();
            } else {
                hcjVar2 = hcjVar;
                hmlVarC.v(-2073253304);
                hmwVar.ab();
            }
            c(hcjVar2, icsVar, fdatVar2, hmlVarC, ((i3 >> 18) & 14) | i6 | (i5 & 896) | ((i3 >> 12) & 7168));
            hmlVarC.n();
            boolean z = (i3 & 896) == 256 || ((i3 & 512) != 0 && hmlVarC.F(hcjVar2));
            Object objS2 = hmwVar.S();
            if (z || objS2 == obj) {
                objS2 = new fdap() { // from class: hgu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return new hha(hcjVar2);
                    }
                };
                hmwVar.af(objS2);
            }
            hob.c(hcjVar2, (fdap) objS2, hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final hcj hcjVar3 = hcjVar2;
            hpxVarL.d = new fdat() { // from class: hgv
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    koa koaVar2 = koaVar;
                    fdat fdatVar5 = fdatVar;
                    hcj hcjVar4 = hcjVar3;
                    ics icsVar2 = icsVar;
                    hhp.a(koaVar2, fdatVar5, hcjVar4, icsVar2, fdatVar2, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(koa koaVar, final hcj hcjVar, final fdjx fdjxVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        koa koaVar2;
        hml hmlVarC = hmlVar.c(-1865576299);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(koaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(hcjVar) : hmlVarC.F(hcjVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdjxVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.E(true) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 65536 : 131072;
        }
        if (hmlVarC.J((74899 & i2) != 74898, i2 & 1)) {
            String strB = jqu.b(R.string.tooltip_description, hmlVarC);
            boolean zF = ((i2 & 112) == 32 || ((i2 & 64) != 0 && hmlVarC.F(hcjVar))) | ((i2 & 896) == 256) | hmlVarC.F(fdjxVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: hgx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hcj hcjVar2 = hcjVar;
                        if (hcjVar2.c()) {
                            fdil.d(fdjxVar, null, null, new hhb(hcjVar2, null), 3);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            koaVar2 = koaVar;
            kna.b(koaVar2, (fdae) objS, new koc(true, false, 14), hxe.d(-680029385, new hhd(strB, fdatVar), hmlVarC), hmlVarC, (i2 & 14) | 3072, 0);
        } else {
            koaVar2 = koaVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final koa koaVar3 = koaVar2;
            hpxVarL.d = new fdat() { // from class: hgy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    koa koaVar4 = koaVar3;
                    hcj hcjVar2 = hcjVar;
                    fdjx fdjxVar2 = fdjxVar;
                    hhp.b(koaVar4, hcjVar2, fdjxVar2, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final hcj hcjVar, final ics icsVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-210489353);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.E(true) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(hcjVar) : hmlVarC.F(hcjVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if (hmlVarC.J((i2 & 1171) != 1170, i2 & 1)) {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            final String strB = jqu.b(R.string.tooltip_label, hmlVarC);
            ics icsVarA = itf.a(itf.a(icsVar, hcjVar, new hhk(hcjVar)), hcjVar, new hho(hcjVar)).a(new ParentSemanticsNodeElement(new fdap() { // from class: hgt
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    final fdjx fdjxVar2 = fdjxVar;
                    final hcj hcjVar2 = hcjVar;
                    jtk.i((jto) obj, strB, new fdae() { // from class: hgz
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdil.d(fdjxVar2, null, null, new hhe(hcjVar2, null), 3);
                            return true;
                        }
                    });
                    return fctx.a;
                }
            }));
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVar.a(hmlVarC, Integer.valueOf((i2 >> 9) & 14));
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hgw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hcj hcjVar2 = hcjVar;
                    ics icsVar2 = icsVar;
                    int i3 = i;
                    hhp.c(hcjVar2, icsVar2, fdatVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

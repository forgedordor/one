package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmxm {
    public static final float a(float f) {
        return fddu.e((f - 0.25f) / 0.75f, 0.0f, 1.0f);
    }

    public static final List b(hsf hsfVar) {
        return (List) hsfVar.a();
    }

    public static final void c(fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1111066645);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtfk.b(fdaeVar2, null, false, null, null, dmui.a, hmlVarC, (i2 & 14) | 1572864, 62);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmvu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmxm.c(fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final fdpl fdplVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(189195169);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(fdplVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hsf hsfVarB = hsb.b(fdplVar, fcvo.a, null, hmlVarC, 2);
            if (!b(hsfVarB).isEmpty()) {
                ico icoVar = ics.e;
                egc egcVar = dmuj.a;
                ics icsVarE = egq.e(icoVar, 40.0f);
                egc egcVar2 = dmuj.a;
                egc egcVar3 = dtdc.a;
                dtdi.a(fdaeVar, icsVarE, false, null, dtdc.b(glz.a(hmlVarC).a, glz.a(hmlVarC).p, hmlVarC, 12), null, null, egcVar2, hxe.d(-1758873418, new dmwr(hsfVarB), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 817889328, 364);
                hmlVarC = hmlVarC;
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmvw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdpl fdplVar2 = fdplVar;
                    int i3 = i;
                    dmxm.d(fdplVar2, fdaeVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dmvl dmvlVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(786970596);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(dmvlVar) : hmlVarC.F(dmvlVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final String strB = jqu.b(R.string.folders_button_content_description, hmlVarC);
            ico icoVar = ics.e;
            egc egcVar = dmuj.a;
            ics icsVarE = egq.e(icoVar, 40.0f);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(strB);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: dmvy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.k(jtoVar, strB);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarB = jsh.b(icsVarE, (fdap) objS);
            egc egcVar2 = dmuj.a;
            egc egcVar3 = dtdc.a;
            gal galVarB = dtdc.b(glz.a(hmlVarC).H, glz.a(hmlVarC).q, hmlVarC, 12);
            hmlVarC.v(5004770);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !hmlVarC.F(dmvlVar))) {
                z = false;
            }
            Object objS2 = hmwVar.S();
            if (z || objS2 == hmk.a) {
                objS2 = new fdae() { // from class: dmwj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dmvlVar.c.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            dtdi.a((fdae) objS2, icsVarB, false, null, galVarB, null, null, egcVar2, dmui.c, hmlVarC, 817889280, 364);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmxm.e(dmvlVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final ics icsVar, final dojw dojwVar, final int i, hml hmlVar, final int i2) {
        int i3;
        final String strC;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1605583583);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.F(dojwVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.B(i) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            boolean z = i != -1;
            String strB = jqu.b(dojwVar.l().b().a(), hmlVarC);
            if (z) {
                hmlVarC.v(1110520567);
                strC = jqu.c(R.string.gallery_item_content_description_selected_state, new Object[]{strB, Integer.valueOf(i + 1)}, hmlVarC);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1110787756);
                strC = jqu.c(R.string.gallery_item_content_description_unselected_state, new Object[]{strB, dngk.a(dojwVar.c())}, hmlVarC);
                ((hmw) hmlVarC).ab();
            }
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: dmwe
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((jto) obj2).getClass();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarC = jsh.c(icsVar, true, (fdap) objS);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(strC);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj) {
                objS2 = new fdap() { // from class: dmwf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        jto jtoVar = (jto) obj2;
                        jtoVar.getClass();
                        jtk.k(jtoVar, strC);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            ics icsVarB = jsh.b(icsVarC, (fdap) objS2);
            iby ibyVar = ibw.a;
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = dmvn.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarB);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            hmlVarC.v(1187208186);
            if (z) {
                g(i + 1, hmlVarC, 0);
            }
            hmwVar.ab();
            float f = z ? 10.0f : 0.0f;
            ico icoVar = ics.e;
            ics icsVarA = iex.a(efy.d(icoVar, f), evn.b(z ? 16.0f : 0.0f));
            ixm ixmVarA2 = ecz.a(ibyVar, false);
            int iA2 = dmvn.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVarC, icsVarA);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar4);
            edf edfVar = edf.a;
            hmlVarC.v(1660078118);
            if (dojwVar instanceof doju) {
                j(edfVar, (doju) dojwVar, hmlVarC, 6);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            djrv.a(Uri.parse(dojwVar.f()), null, ecs.a(icoVar, 1.0f, false), null, null, null, iuz.a, null, 0.0f, null, null, null, null, null, null, null, hmlVar2, 12583344, 0, 524152);
            hmlVar2.n();
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwg
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar2 = icsVar;
                    dojw dojwVar2 = dojwVar;
                    int i5 = i2;
                    dmxm.f(icsVar2, dojwVar2, i, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final int i, hml hmlVar, final int i2) {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1355826047);
        if (i4 == 0) {
            i3 = (true != hmlVarC.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            float fEg = ((kio) hmlVarC.e(jmh.e)).eg(kjm.c(20));
            final long j = glz.a(hmlVarC).G;
            float f = 10.0f - (fEg / 4.0f);
            ics icsVarK = egq.k(efy.e(idb.a(ics.e, 2.0f), 0.9f * f, f * 1.1f), fEg);
            evm evmVar = evn.a;
            ics icsVarA = dkl.a(ijn.c(icsVarK, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, evmVar, true, 1, 452607), glz.a(hmlVarC).a, evmVar);
            hmlVarC.v(5004770);
            boolean zC = hmlVarC.C(j);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zC || objS == hmk.a) {
                objS = new fdap() { // from class: dmwn
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        iew iewVar = (iew) obj;
                        iewVar.getClass();
                        final ind indVar = new ind(kin.d(iewVar, 2.0f), 0.0f, 0, 0, 30);
                        final long j2 = j;
                        return iewVar.p(new fdap() { // from class: dmvq
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                imw imwVar = (imw) obj2;
                                imwVar.getClass();
                                imwVar.p();
                                imy.e(imwVar, j2, 0.0f, 0L, indVar, 0, 110);
                                return fctx.a;
                            }
                        });
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarB = ifb.b(icsVarA, (fdap) objS);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = dmvn.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarB);
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
            hsk.b(hmlVarC, icsVarB2, jbb.c);
            hmlVar2 = hmlVarC;
            gyj.c(String.valueOf(i), null, 0L, kjm.c(12), null, null, 0L, null, kjm.c(14), 0, false, 0, 0, null, jyq.y(glz.d(hmlVarC).o, glz.a(hmlVarC).b, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), hmlVar2, 24576, 48, 129006);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i2;
                    dmxm.g(i, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(ics icsVar, final dmvl dmvlVar, boolean z, final fdae fdaeVar, hml hmlVar, final int i, final int i2) {
        int i3;
        ics icsVar2;
        final ics icsVar3;
        final boolean z2;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-584099422);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? hmlVarC.D(dmvlVar) : hmlVarC.F(dmvlVar)) ? 16 : 32;
        }
        int i5 = i2 & 4;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(fdaeVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            z2 = z;
        } else {
            int i6 = i3 & 7168;
            int i7 = i3 & 896;
            int i8 = i3 & 112;
            int i9 = (i3 & 14) | 64;
            if (i4 != 0) {
                icsVar = ics.e;
            }
            int i10 = i9 | i8;
            boolean z4 = (true ^ z3) | z;
            if (dmvlVar.f) {
                hmlVarC.v(-1993157779);
                icsVar2 = icsVar;
                o(icsVar2, dmvlVar, z4, fdaeVar, hmlVarC, i10 | i7 | i6);
                ((hmw) hmlVarC).ab();
            } else {
                icsVar2 = icsVar;
                hmlVarC.v(-1993069398);
                p(icsVar2, dmvlVar, z4, fdaeVar, hmlVarC, i10 | i7 | i6);
                ((hmw) hmlVarC).ab();
            }
            icsVar3 = icsVar2;
            z2 = z4;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar4 = icsVar3;
                    dmvl dmvlVar2 = dmvlVar;
                    boolean z5 = z2;
                    dmxm.h(icsVar4, dmvlVar2, z5, fdaeVar, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final fdpl fdplVar, final float f, final fdae fdaeVar, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(151603534);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdplVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final kio kioVar = (kio) hmlVarC.e(jmh.e);
            hwv hwvVarD = hxe.d(1717962770, new dmxk(fdplVar), hmlVarC);
            ics icsVarA = ien.a(ics.e, f);
            hmlVarC.v(-1633490746);
            boolean zD = hmlVarC.D(kioVar) | ((i2 & 7168) == 2048);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: dmwb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ivy ivyVar = (ivy) obj;
                        ivyVar.getClass();
                        fdapVar.invoke(new kir(kioVar.el((int) (ivyVar.g() & 4294967295L))));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarA2 = ixy.a(icsVarA, (fdap) objS);
            hwv hwvVarD2 = hxe.d(-645878892, new dmxl(fdaeVar), hmlVarC);
            hck hckVarB = dtil.b(glz.a(hmlVarC).J, 0L, 0L, glz.a(hmlVarC).s, 0L, hmlVarC, 54);
            hmlVarC = hmlVarC;
            dtct.a(hwvVarD, icsVarA2, hwvVarD2, null, 0.0f, null, hckVarB, null, hmlVarC, 390, 184);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdpl fdplVar2 = fdplVar;
                    float f2 = f;
                    fdae fdaeVar2 = fdaeVar;
                    dmxm.i(fdplVar2, f2, fdaeVar2, fdapVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final ede edeVar, final doju dojuVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2106222178);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(dojuVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarD = efy.d(edeVar.a(idb.a(ics.e, 2.0f), ibw.c), 4.0f);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = dmvn.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-688350448);
            Duration duration = dojuVar.g;
            if (duration.getSeconds() > 0) {
                String elapsedTime = DateUtils.formatElapsedTime(duration.getSeconds());
                elapsedTime.getClass();
                hmwVar = hmwVar2;
                gyj.c(elapsedTime, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyq.y(glz.d(hmlVarC).o, ije.d, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), hmlVarC, 0, 0, 131070);
                hmlVarC = hmlVarC;
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            dtfn.a(djrs.b(djrr.di, hmlVarC), null, null, ije.d, hmlVarC, 3120, 4);
            hmlVar2 = hmlVarC;
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    int i4 = i;
                    dmxm.j(edeVar2, dojuVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1634719668);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            egc egcVar = dmuj.a;
            ics icsVarI = efy.i(icsVar, 0.0f, 16.0f, 1);
            long j = glz.a(hmlVarC).s;
            gvk.c(icsVarI, glz.c(hmlVarC).e, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.4f, ije.f(j)), 0L, 0.0f, 0.0f, null, dmui.b, hmlVarC, 120);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmxm.k(icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final defpackage.ics r16, final defpackage.dmvl r17, final boolean r18, final defpackage.fdae r19, defpackage.hml r20, final int r21) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmxm.l(ics, dmvl, boolean, fdae, hml, int):void");
    }

    public static final void m(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1063579030);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final String strB = jqu.b(R.string.gallery_empty_state_content_description, hmlVarC);
            ics icsVarD = egq.d(icsVar, 1.0f);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(strB);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: dmwp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.k(jtoVar, strB);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarB = jsh.b(icsVarD, (fdap) objS);
            ixm ixmVarA = edl.a(ecr.e, ibw.k, hmlVarC, 54);
            int iA = dmvn.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarB);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            ico icoVar = ics.e;
            ics icsVarA = dkl.a(egq.k(icoVar, 56.0f), glz.a(hmlVarC).D, evn.a);
            ixm ixmVarA2 = ecz.a(ibw.a, false);
            int iA2 = dmvn.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVarC, icsVarA);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar4);
            dtfn.a(djrs.b(djrr.bR, hmlVarC), null, edf.a.a(icoVar, ibw.e), glz.a(hmlVarC).a, hmlVarC, 48, 0);
            hmlVarC.n();
            egt.a(egq.e(icoVar, 24.0f), hmlVarC);
            gyj.c(jqu.b(R.string.gallery_empty_state_title, hmlVarC), null, 0L, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, jyq.y(glz.d(hmlVarC).g, glz.a(hmlVarC).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), hmlVarC, 0, 0, 130046);
            egt.a(egq.e(icoVar, 8.0f), hmlVarC);
            gyj.c(jqu.b(R.string.gallery_empty_state_body, hmlVarC), null, 0L, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, jyq.y(glz.d(hmlVarC).k, glz.a(hmlVarC).s, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), hmlVarC, 0, 0, 130046);
            hmlVarC = hmlVarC;
            egt.a(egq.e(icoVar, 8.0f), hmlVarC);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmxm.m(icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void n(final ics icsVar, final oxm oxmVar, final dmvl dmvlVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-1821433156);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(oxmVar) : hmlVarC.F(oxmVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(dmvlVar) : hmlVarC.F(dmvlVar)) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final hsf hsfVarB = hsb.b(dmvlVar.a, fcvo.a, null, hmlVarC, 2);
            egc egcVar = dmuj.a;
            ekf ekfVar = new ekf();
            ecj ecjVarG = ecr.g(3.0f);
            ecj ecjVarG2 = ecr.g(3.0f);
            hmlVarC.v(-1746271574);
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && hmlVarC.F(oxmVar));
            if ((i2 & 896) != 256 && ((i2 & 512) == 0 || !hmlVarC.F(dmvlVar))) {
                z = false;
            }
            boolean zD = z | z2 | hmlVarC.D(hsfVarB);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: dmvo
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ekq ekqVar = (ekq) obj;
                        ekqVar.getClass();
                        oxm oxmVar2 = oxmVar;
                        elr.a(ekqVar, oxmVar2.a(), new oxi(new fdap() { // from class: dmvv
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                dojv dojvVar = (dojv) obj2;
                                dojvVar.getClass();
                                return dojvVar.f();
                            }
                        }, oxmVar2), new hxd(416107585, true, new dmxi(oxmVar2, dmvlVar, hsfVarB)), 12);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ekn.b(ekfVar, icsVar, null, null, ecjVarG2, ecjVarG, null, false, null, (fdap) objS, hmlVarC, ((i2 << 3) & 112) | 1769472, 0, 924);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmvp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    oxm oxmVar2 = oxmVar;
                    int i3 = i;
                    dmxm.n(icsVar2, oxmVar2, dmvlVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void o(final ics icsVar, final dmvl dmvlVar, final boolean z, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-848178505);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(dmvlVar) : hmlVarC.F(dmvlVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            final oxm oxmVarA = oxr.a(dmvlVar.d, null, hmlVarC, 1);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                context.getClass();
                objS = new hpl((Build.VERSION.SDK_INT < 33 || !(dmue.b(context, "android.permission.READ_MEDIA_IMAGES") || dmue.b(context, "android.permission.READ_MEDIA_VIDEO"))) ? (Build.VERSION.SDK_INT < 34 || !dmue.b(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) ? (Build.VERSION.SDK_INT >= 33 || !dmue.b(context, "android.permission.READ_EXTERNAL_STORAGE")) ? dmuk.a : dmuk.c : dmuk.b : dmuk.c, hsi.a);
                hmwVar.af(objS);
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            hoxVar.getClass();
            oxmVarA.getClass();
            hmlVarC.v(-1485230562);
            aem aemVar = new aem();
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(oxmVarA);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new fdap() { // from class: dmun
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
                    @Override // defpackage.fdap
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r7) {
                        /*
                            Method dump skipped, instructions count: 251
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmun.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            add addVarA = acr.a(aemVar, (fdap) objS2, hmlVarC);
            hmwVar.ab();
            hmlVarC.v(944257979);
            Object objA = hoxVar.a();
            dmuk dmukVar = dmuk.a;
            if (objA == dmukVar) {
                fctx fctxVar = fctx.a;
                hmlVarC.v(5004770);
                boolean zF2 = hmlVarC.F(addVarA);
                Object objS3 = hmwVar.S();
                if (zF2 || objS3 == obj) {
                    objS3 = new dmxj(addVarA, null);
                    hmwVar.af(objS3);
                }
                hmwVar.ab();
                hob.g(fctxVar, (fdat) objS3, hmlVarC);
            }
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                fdae fdaeVar2 = new fdae() { // from class: dmvx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Boolean.valueOf(!(oxmVarA.b().a instanceof orn));
                    }
                };
                hxn hxnVar = hrp.a;
                hnt hntVar = new hnt(fdaeVar2, null);
                hmwVar.af(hntVar);
                objS4 = hntVar;
            }
            hsf hsfVar = (hsf) objS4;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS5 = hmwVar.S();
            if (objS5 == obj) {
                fdae fdaeVar3 = new fdae() { // from class: dmvz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Boolean.valueOf(oxmVarA.a() > 0);
                    }
                };
                hxn hxnVar2 = hrp.a;
                hnt hntVar2 = new hnt(fdaeVar3, null);
                hmwVar.af(hntVar2);
                objS5 = hntVar2;
            }
            hsf hsfVar2 = (hsf) objS5;
            hmwVar.ab();
            if (hoxVar.a() == dmukVar) {
                hmlVarC.v(-792281658);
                dmue.c(efy.i(icsVar, 0.0f, 29.0f, 1), 2, hmlVarC, 48);
                hmwVar.ab();
            } else if (((Boolean) hsfVar.a()).booleanValue()) {
                hmlVarC.v(-792109670);
                ics icsVarD = egq.d(icsVar, 1.0f);
                ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
                int iA = dmvn.a(hmg.b(hmlVarC));
                hxi hxiVarAk = hmwVar.ak();
                ics icsVarB = icj.b(hmlVarC, icsVarD);
                fdae fdaeVar4 = jbb.a;
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar4);
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
                hmlVarC.v(-1141053794);
                if (hoxVar.a() == dmuk.b) {
                    dmuo.a(addVarA, hmlVarC, 8);
                }
                hmwVar.ab();
                ico icoVar = ics.e;
                ics icsVarB2 = edp.b(icoVar, 1.0f, z);
                if (r(hsfVar2)) {
                    hmlVarC.v(-1012720893);
                    n(joj.a(icsVarB2, "GALLERY_GRID"), oxmVarA, dmvlVar, hmlVarC, ((i2 << 3) & 896) | 576);
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-1012535234);
                    m(icsVarB2, hmlVarC, 0);
                    hmwVar.ab();
                }
                l(icoVar, dmvlVar, r(hsfVar2), fdaeVar, hmlVarC, (i2 & 112) | 70 | (i2 & 7168));
                hmlVarC.n();
                hmwVar.ab();
            } else {
                hmlVarC.v(-791439698);
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwa
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar2 = icsVar;
                    dmvl dmvlVar2 = dmvlVar;
                    boolean z2 = z;
                    dmxm.o(icsVar2, dmvlVar2, z2, fdaeVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void p(final ics icsVar, final dmvl dmvlVar, final boolean z, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        fdae fdaeVar2;
        hml hmlVarC = hmlVar.c(704374217);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(dmvlVar) : hmlVarC.F(dmvlVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            fdaeVar2 = fdaeVar;
            i2 |= true != hmlVarC.F(fdaeVar2) ? 1024 : 2048;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final oxm oxmVarA = oxr.a(dmvlVar.d, null, hmlVarC, 1);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                fdae fdaeVar3 = new fdae() { // from class: dmvr
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Boolean.valueOf(!(oxmVarA.b().a instanceof orn));
                    }
                };
                hxn hxnVar = hrp.a;
                hnt hntVar = new hnt(fdaeVar3, null);
                hmwVar.af(hntVar);
                objS = hntVar;
            }
            hsf hsfVar = (hsf) objS;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                fdae fdaeVar4 = new fdae() { // from class: dmvs
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Boolean.valueOf(oxmVarA.a() > 0);
                    }
                };
                hxn hxnVar2 = hrp.a;
                hnt hntVar2 = new hnt(fdaeVar4, null);
                hmwVar.af(hntVar2);
                objS2 = hntVar2;
            }
            hsf hsfVar2 = (hsf) objS2;
            hmwVar.ab();
            if (((Boolean) hsfVar.a()).booleanValue()) {
                ics icsVarD = egq.d(icsVar, 1.0f);
                ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
                int iA = dmvn.a(hmg.b(hmlVarC));
                hxi hxiVarAk = hmwVar.ak();
                ics icsVarB = icj.b(hmlVarC, icsVarD);
                fdae fdaeVar5 = jbb.a;
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar5);
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
                ics icsVarB2 = edp.b(icoVar, 1.0f, z);
                if (s(hsfVar2)) {
                    hmlVarC.v(-733470993);
                    n(joj.a(icsVarB2, "GALLERY_GRID"), oxmVarA, dmvlVar, hmlVarC, ((i2 << 3) & 896) | 576);
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-733285334);
                    m(icsVarB2, hmlVarC, 0);
                    hmwVar.ab();
                }
                l(icoVar, dmvlVar, s(hsfVar2), fdaeVar2, hmlVarC, (i2 & 112) | 70 | (i2 & 7168));
                hmlVarC.n();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmvt
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar2 = icsVar;
                    dmvl dmvlVar2 = dmvlVar;
                    boolean z2 = z;
                    dmxm.p(icsVar2, dmvlVar2, z2, fdaeVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void q(ics icsVar, final dmvm dmvmVar, final dmxn dmxnVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-447186681);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(dmvmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(dmxnVar) : hmlVarC.F(dmxnVar)) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            icsVar2 = icsVar;
            edj.a(icsVar2, null, hxe.d(800994141, new dmxg(dmxnVar, dmvmVar), hmlVarC), hmlVarC, (i2 & 14) | 3072, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmwl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar2;
                    dmvm dmvmVar2 = dmvmVar;
                    int i4 = i;
                    dmxm.q(icsVar3, dmvmVar2, dmxnVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final boolean r(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }

    private static final boolean s(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }
}

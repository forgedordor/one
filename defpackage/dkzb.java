package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzb {
    public static final float a(qrk qrkVar) {
        return ((Number) qrkVar.a()).floatValue();
    }

    public static final void b(final dkzd dkzdVar, final boolean z, final float f, hml hmlVar, final int i) {
        dkyb dkybVar;
        boolean z2;
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(2098216031);
        int i3 = i2 == 0 ? (true != hmlVarC.D(dkzdVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.A(f) ? 128 : 256;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            List listAo = dkzdVar.a;
            if (dkzdVar.h.a) {
                fddq fddqVar = new fddq(0, listAo.size() - 2);
                listAo = fddqVar.a() ? fcvo.a : fcva.ao(listAo.subList(fddqVar.f().intValue(), fddqVar.e().intValue() + 1));
            }
            int size = listAo.size();
            int i5 = size + 1;
            ics icsVarI = efy.i(ics.e, f, 0.0f, 2);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = dkyc.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarI);
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
            hmlVarC.v(-663178784);
            int i6 = 0;
            for (Object obj : listAo) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    fcva.m();
                }
                dkyb dkybVar2 = (dkyb) obj;
                Integer num = dkzdVar.b;
                if (num != null && num.intValue() == i6) {
                    dkybVar = dkybVar2;
                    z2 = true;
                } else {
                    dkybVar = dkybVar2;
                    z2 = false;
                }
                n(dkybVar, z2, o(i6, i5), z, hmlVarC, (i4 << 6) & 7168);
                i6 = i7;
            }
            hmwVar.ab();
            d(dkzdVar.d, o(size, i5), hmlVarC, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyr
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dkzd dkzdVar2 = dkzdVar;
                    boolean z3 = z;
                    int i8 = i;
                    dkzb.b(dkzdVar2, z3, f, (hml) obj2, hpy.a(i8 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dkzf dkzfVar, final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-744769197);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.F(dkzfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            if (dkzfVar instanceof dkzd) {
                hmlVarC.v(1536344826);
                e((dkzd) dkzfVar, icsVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(dkzfVar instanceof dkze)) {
                    hmlVarC.v(1536343228);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(1536347223);
                f((dkze) dkzfVar, icsVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkzf dkzfVar2 = dkzfVar;
                    int i6 = i;
                    dkzb.c(dkzfVar2, icsVar, (hml) obj, hpy.a(i6 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(fdae fdaeVar, int i, hml hmlVar, final int i2) {
        int i3;
        final fdae fdaeVar2;
        final int i4;
        int i5 = i2 & 6;
        hml hmlVarC = hmlVar.c(57748044);
        if (i5 == 0) {
            i3 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
            i4 = i;
        } else {
            fdaeVar2 = fdaeVar;
            i4 = i;
            m(jqu.b(R.string.custom_reaction_button_content_description, hmlVarC), false, fdaeVar2, i4, null, dkxx.a, hmlVarC, ((i3 << 6) & 896) | 1575984 | ((i3 << 9) & 57344), 32);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar2;
                    int i6 = i2;
                    dkzb.d(fdaeVar3, i4, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dkzd dkzdVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        float f;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1166131233);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkzdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = (i2 & 14) | 48;
            boolean z = dkzdVar.h.a;
            int size = z ? dkzdVar.a.size() : dkzdVar.a.size() + 1;
            hmlVarC.v(334365933);
            float f2 = (size * 48.0f) + 16.0f;
            float f3 = z ? ((Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp : f2;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            dpn dpnVarA = dpc.a(0, hmlVarC, 0, 1);
            ics icsVarC = dpc.c(icsVar, dpnVarA, false, true, false);
            hmlVarC.v(334376311);
            if (z) {
                f = 0.0f;
            } else {
                hmlVarC.v(46095896);
                f = ((((Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp - f3) / 2.0f) - 0.5f;
                if (Float.compare(f, 3.0f) <= 0 || Float.compare(f, 12.0f) >= 0) {
                    f = 12.0f;
                }
                hmwVar.ab();
            }
            hmwVar.ab();
            ics icsVarO = egq.o(efy.e(icsVarC, f, 12.0f), f3);
            ixm ixmVarA = ecz.a(dkzdVar.e, false);
            int iA = dkyc.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarO);
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
            if (z) {
                hmlVarC.v(185580455);
                l(dkzdVar, dpnVarA, f2, hmlVarC, i4);
                hmwVar.ab();
            } else {
                hmlVarC.v(185671657);
                j(dkzdVar, dpnVarA, f2, hmlVarC, i4);
                hmwVar.ab();
            }
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkzd dkzdVar2 = dkzdVar;
                    int i5 = i;
                    dkzb.e(dkzdVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final dkze dkzeVar, final ics icsVar, hml hmlVar, final int i) {
        dkyb dkybVar;
        boolean z;
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(-540195757);
        int i3 = i2 == 0 ? (true != hmlVarC.D(dkzeVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(new kir(0.0f), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            final kio kioVar = (kio) hmlVarC.e(jmh.e);
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                fdae fdaeVar = new fdae() { // from class: dkyj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Integer.valueOf(fddu.f(((int) ((((kir) hoxVar.a()).a - 16.0f) / 48.0f)) - 1, 0));
                    }
                };
                hxn hxnVar = hrp.a;
                hnt hntVar = new hnt(fdaeVar, null);
                hmwVar.af(hntVar);
                objS2 = hntVar;
            }
            hmwVar.ab();
            List listAm = fcva.am(dkzeVar.a, ((Number) ((hsf) objS2).a()).intValue());
            ics icsVarD = egq.d(icsVar, 1.0f);
            hmlVarC.v(-1633490746);
            boolean zD = hmlVarC.D(kioVar);
            Object objS3 = hmwVar.S();
            if (zD || objS3 == obj) {
                objS3 = new fdap() { // from class: dkyk
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ivy ivyVar = (ivy) obj2;
                        ivyVar.getClass();
                        hoxVar.b(new kir(kioVar.el((int) (ivyVar.g() >> 32))));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            ics icsVarE = efy.e(ixy.a(icsVarD, (fdap) objS3), 8.0f, 12.0f);
            ixm ixmVarA = egk.a(ecr.e, ibw.m, hmlVarC, 6);
            int iA = dkyc.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
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
            hmlVarC.v(-2146202439);
            int i4 = 0;
            for (Object obj2 : listAm) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    fcva.m();
                }
                dkyb dkybVar2 = (dkyb) obj2;
                Integer num = dkzeVar.b;
                if (num != null && num.intValue() == i4) {
                    dkybVar = dkybVar2;
                    z = true;
                } else {
                    dkybVar = dkybVar2;
                    z = false;
                }
                n(dkybVar, z, 65, false, hmlVarC, 3456);
                i4 = i5;
            }
            hmwVar.ab();
            d(dkzeVar.c, 65, hmlVarC, 48);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyl
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dkze dkzeVar2 = dkzeVar;
                    int i6 = i;
                    dkzb.f(dkzeVar2, icsVar, (hml) obj3, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final ics g(ics icsVar, boolean z, hml hmlVar, int i) {
        long j;
        hmlVar.v(-747147502);
        int i2 = (z ? 1 : 0) | i;
        evm evmVarA = evn.a(50);
        if (i2 != 0) {
            icsVar = ics.e.a(new ick("com.google.android.libraries.communications.ux.components.reactionsbar.reactionsBarShadow", evmVarA, new dkza(evmVarA)));
        }
        ics icsVarA = iex.a(icsVar, evmVarA);
        if (dljt.g(hmlVar)) {
            hmlVar.v(-1750426355);
            j = glz.a(hmlVar).H;
            hmlVar.o();
        } else {
            hmlVar.v(-1750354342);
            j = glz.a(hmlVar).n;
            hmlVar.o();
        }
        ics icsVarA2 = dkl.a(icsVarA, j, ikj.a);
        hmlVar.o();
        return icsVarA2;
    }

    public static final void h(final dkxy dkxyVar, final boolean z, final boolean z2, final int i, hml hmlVar, final int i2) {
        int i3;
        boolean z3;
        hox hoxVar;
        hml hmlVarC = hmlVar.c(1745336377);
        if ((i2 & 6) == 0) {
            i3 = (true != hmlVarC.D(dkxyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z3 = z;
            i3 |= true != hmlVarC.E(z3) ? 16 : 32;
        } else {
            z3 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.E(true) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.B(i) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl(true, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar2 = (hox) objS;
            hmwVar.ab();
            qrs qrsVarD = qsm.d(dkxyVar.a, hmlVarC);
            qrk qrkVarA = qqp.a(qrsVarD.a(), q(hoxVar2), true, null, 0.0f, 1, hmlVarC, 1573248, 952);
            m(dkxyVar.b, z3, dkxyVar.c, i, null, hxe.d(-250444528, new dkys(qrsVarD, qrkVarA), hmlVarC), hmlVarC, (i3 & 112) | 1572864 | (i3 & 7168) | (i3 & 57344), 32);
            if (q(hoxVar2) && a(qrkVarA) == 1.0f) {
                hoxVar = hoxVar2;
                p(hoxVar, false);
            } else {
                hoxVar = hoxVar2;
            }
            if (!q(hoxVar) && z2) {
                p(hoxVar, true);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkxy dkxyVar2 = dkxyVar;
                    boolean z4 = z;
                    boolean z5 = z2;
                    dkzb.h(dkxyVar2, z4, z5, i, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final dkxz dkxzVar, final boolean z, final int i, hml hmlVar, final int i2) {
        int i3;
        hml hmlVarC = hmlVar.c(598836881);
        if ((i2 & 6) == 0) {
            i3 = (true != hmlVarC.D(dkxzVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(true) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.B(i) ? 1024 : 2048;
        }
        if ((i3 & 1171) != 1170 || !hmlVarC.I()) {
            throw null;
        }
        hmlVarC.s();
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkxz dkxzVar2 = dkxzVar;
                    boolean z2 = z;
                    int i4 = i2;
                    dkzb.i(dkxzVar2, z2, i, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final dkzd dkzdVar, final dpn dpnVar, final float f, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-815497695);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dkzdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(8.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dpnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarO = egq.o(icoVar, f);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = dkyc.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarO);
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
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            hmlVarC.v(-1499914372);
            ics icsVarG = g(icoVar, false, hmlVarC, 1);
            hmwVar.ab();
            ics icsVarE = efy.e(icsVarG, true != dkzdVar.h.a ? 8.0f : 0.0f, true != ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() ? 0.0f : 4.0f);
            ixm ixmVarA2 = ecz.a(ibw.a, false);
            int iA2 = dkyc.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarE);
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
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            hmlVarC.v(1849434622);
            Object objS = hmwVar.S();
            Object obj = objS;
            if (objS == hmk.a) {
                dfw dfwVar = new dfw(false);
                dfwVar.d(true);
                hmwVar.af(dfwVar);
                obj = dfwVar;
            }
            hmwVar.ab();
            hmlVarC.v(1710547341);
            dap dapVarJ = dae.j(dea.c(310, 0, null, 6), ibw.k, 12);
            hmwVar.ab();
            cye.a((dfw) obj, null, dapVarJ, null, null, hxe.d(493306173, new dkyt(dkzdVar, dpnVar), hmlVarC), hmlVarC, 196608, 26);
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyd
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dkzd dkzdVar2 = dkzdVar;
                    dpn dpnVar2 = dpnVar;
                    int i3 = i;
                    dkzb.j(dkzdVar2, dpnVar2, f, (hml) obj2, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final dkya dkyaVar, boolean z, int i, hml hmlVar, final int i2) {
        int i3;
        final boolean z2;
        final int i4;
        hml hmlVarC = hmlVar.c(-1266063681);
        if ((i2 & 6) == 0) {
            i3 = (true != hmlVarC.D(dkyaVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(true) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.B(i) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            z2 = z;
            i4 = i;
        } else {
            int i5 = i3 & 112;
            int i6 = i3 << 3;
            z2 = z;
            i4 = i;
            m(dkyaVar.b, z2, dkyaVar.c, i4, Float.valueOf(30.0f), hxe.d(-562594282, new dkyu(dkyaVar), hmlVarC), hmlVarC, i5 | 1769472 | (i6 & 7168) | (i6 & 57344), 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkya dkyaVar2 = dkyaVar;
                    boolean z3 = z2;
                    int i7 = i2;
                    dkzb.k(dkyaVar2, z3, i4, (hml) obj, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final dkzd dkzdVar, final dpn dpnVar, final float f, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1952081288);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkzdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(8.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dpnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarC = dpc.c(icoVar, dpc.a(0, hmlVarC, 0, 1), false, true, false);
            ixm ixmVarA = egk.a(ecr.g(8.0f), ibw.m, hmlVarC, 6);
            int iA = dkyc.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
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
            egp egpVar = egp.a;
            egt.a(icoVar, hmlVarC);
            j(dkzdVar, dpnVar, f, hmlVarC, i2 & 8190);
            hmlVarC.v(1849434622);
            Object objS = hmwVar.S();
            Object obj = objS;
            if (objS == hmk.a) {
                dfw dfwVar = new dfw(false);
                dfwVar.d(true);
                hmwVar.af(dfwVar);
                obj = dfwVar;
            }
            hmwVar.ab();
            hmlVarC.v(-1629954327);
            dap dapVarN = dae.n(dea.c(210, 100, null, 4), 0.0f, 0L, 6);
            hmwVar.ab();
            cye.i(egpVar, (dfw) obj, null, dapVarN, null, null, hxe.d(-1356878148, new dkyv(dkzdVar), hmlVarC), hmlVarC, 1572870);
            egt.a(egq.o(icoVar, 4.0f), hmlVarC);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkyg
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dkzd dkzdVar2 = dkzdVar;
                    dpn dpnVar2 = dpnVar;
                    int i4 = i;
                    dkzb.l(dkzdVar2, dpnVar2, f, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final java.lang.String r26, boolean r27, defpackage.fdae r28, int r29, java.lang.Float r30, final defpackage.fdau r31, defpackage.hml r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkzb.m(java.lang.String, boolean, fdae, int, java.lang.Float, fdau, hml, int, int):void");
    }

    public static final void n(final dkyb dkybVar, boolean z, int i, boolean z2, hml hmlVar, final int i2) {
        int i3;
        boolean z3;
        final int i4;
        final boolean z4;
        hml hmlVarC = hmlVar.c(-1662958543);
        if ((i2 & 6) == 0) {
            i3 = (true != hmlVarC.D(dkybVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.B(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.E(true) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            z3 = z2;
            i4 = i;
            z4 = z;
        } else if (dkybVar instanceof dkxy) {
            hmlVarC.v(1250083229);
            int i5 = i3 >> 3;
            z3 = z2;
            h((dkxy) dkybVar, z, z3, i, hmlVarC, (i3 & 112) | (i5 & 896) | (i5 & 7168) | ((i3 << 6) & 57344));
            z4 = z;
            i4 = i;
            ((hmw) hmlVarC).ab();
        } else {
            z3 = z2;
            i4 = i;
            z4 = z;
            if (dkybVar instanceof dkxz) {
                hmlVarC.v(1250395058);
                i((dkxz) dkybVar, z4, i4, hmlVarC, ((i3 << 3) & 7168) | (i3 & 112) | ((i3 >> 6) & 896));
                ((hmw) hmlVarC).ab();
            } else {
                if (!(dkybVar instanceof dkya)) {
                    hmlVarC.v(-375317964);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(1250658000);
                k((dkya) dkybVar, z4, i4, hmlVarC, ((i3 << 3) & 7168) | (i3 & 112) | ((i3 >> 6) & 896));
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final boolean z5 = z3;
            hpxVarL.d = new fdat() { // from class: dkye
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkyb dkybVar2 = dkybVar;
                    boolean z6 = z4;
                    int i6 = i4;
                    dkzb.n(dkybVar2, z6, i6, z5, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final int o(int i, int i2) {
        int iAbs;
        if (i2 % 2 == 0) {
            int i3 = i2 / 2;
            iAbs = Math.min(Math.abs(i - i3), Math.abs(i - (i3 - 1)));
        } else {
            iAbs = (int) Math.abs(i - Math.floor(i2 / 2.0d));
        }
        return (iAbs * 65) + 25;
    }

    private static final void p(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    private static final boolean q(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }
}

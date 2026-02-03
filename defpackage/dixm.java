package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.gestures.AnchoredDraggableElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dixm {
    public static final void a(final ics icsVar, final String str, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-201331480);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarE = egq.e(egq.d(icsVar, 1.0f), 56.0f);
            evm evmVar = evn.a;
            egc egcVar = dtdc.a;
            dtdi.a(fdaeVar, icsVarE, false, evmVar, dtdc.b(f(hmlVarC), 0L, hmlVarC, 14), null, null, null, hxe.d(-1879918376, new dixj(str), hmlVarC), hmlVarC, ((i2 >> 6) & 14) | 805306368, 484);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    String str2 = str;
                    int i4 = i;
                    dixm.a(icsVar2, str2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final dsd dsdVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1688664918);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dsdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final kio kioVar = (kio) hmlVarC.e(jmh.e);
            final long jF = f(hmlVarC);
            final long j = glz.a(hmlVarC).c;
            ics icsVarA = iex.a(egq.d(icsVar, 1.0f), evn.a);
            hmlVarC.v(-1746271574);
            boolean zC = hmlVarC.C(jF) | hmlVarC.C(j);
            boolean z = (i4 & 112) == 32;
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            if ((zC || z) || objS == hmk.a) {
                hmwVar = hmwVar2;
                fdap fdapVar = new fdap() { // from class: dixg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        imz imzVar = (imz) obj;
                        imzVar.getClass();
                        dsd dsdVar2 = dsdVar;
                        diwy diwyVar = diwy.a;
                        diwy diwyVar2 = diwy.b;
                        float fA = dsdVar2.k().a(diwyVar);
                        float fA2 = dsdVar2.k().a(diwyVar2);
                        float fE = (fddu.e(dsdVar2.a(), Math.min(fA, fA2), Math.max(fA, fA2)) - fA) / (fA2 - fA);
                        float fAbs = 1.0f;
                        if (!Float.isNaN(fE)) {
                            if (fE < 1.0E-6f) {
                                fAbs = 0.0f;
                            } else if (fE <= 0.999999f) {
                                fAbs = Math.abs(fE);
                            }
                        }
                        imzVar.r(ijg.i(jF, j, fAbs), 0L, (126 & 4) != 0 ? imy.c(imzVar.b(), 0L) : 0L, (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
                        return fctx.a;
                    }
                };
                hmwVar.af(fdapVar);
                objS = fdapVar;
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            ics icsVarA2 = ifb.a(icsVarA, (fdap) objS);
            hmlVarC.v(-1633490746);
            boolean zD = hmlVarC.D(kioVar) | z;
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: dixh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Object objG;
                        final kjg kjgVar = (kjg) obj;
                        final kio kioVar2 = kioVar;
                        fdap fdapVar2 = new fdap() { // from class: dixa
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                duw duwVar = (duw) obj2;
                                duwVar.getClass();
                                fcue fcueVar = new fcue((fcuh) diwy.c);
                                while (fcueVar.hasNext()) {
                                    kio kioVar3 = kioVar2;
                                    kjg kjgVar2 = kjgVar;
                                    diwy diwyVar = (diwy) fcueVar.next();
                                    float fEn = (((int) (kjgVar2.a >> 32)) - kioVar3.en(72.0f)) * diwyVar.d;
                                    List list = duwVar.a;
                                    list.add(diwyVar);
                                    if (duwVar.b.length < list.size()) {
                                        float[] fArrCopyOf = Arrays.copyOf(duwVar.b, list.size() + 2);
                                        fArrCopyOf.getClass();
                                        duwVar.b = fArrCopyOf;
                                    }
                                    duwVar.b[list.size() - 1] = fEn;
                                }
                                return fctx.a;
                            }
                        };
                        duw duwVar = new duw();
                        fdapVar2.invoke(duwVar);
                        List list = duwVar.a;
                        float[] fArr = duwVar.b;
                        int size = list.size();
                        fArr.getClass();
                        fcur.a(size, fArr.length);
                        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                        fArrCopyOfRange.getClass();
                        dst dstVar = new dst(list, fArrCopyOfRange);
                        dsd dsdVar2 = dsdVar;
                        if (Float.isNaN(dsdVar2.a()) || (objG = dstVar.b(dsdVar2.a())) == null) {
                            objG = dsdVar2.g();
                        }
                        if (!fdbq.f(dsdVar2.k(), dstVar)) {
                            dsdVar2.c.b(dstVar);
                            dok dokVar = dsdVar2.b;
                            if (dokVar.b.c()) {
                                try {
                                    dsc dscVar = dsdVar2.d;
                                    float fA = dsdVar2.k().a(objG);
                                    if (!Float.isNaN(fA)) {
                                        drb.a(dscVar, fA);
                                        dsdVar2.i(null);
                                    }
                                    dsdVar2.h(objG);
                                    dsdVar2.j(objG);
                                } finally {
                                    dokVar.d();
                                }
                            } else {
                                dsdVar2.i(objG);
                            }
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            ics icsVarA3 = iye.a(icsVarA2, (fdap) objS2);
            int i5 = i4 << 3;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = diwz.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA3);
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
            fdauVar.a(edf.a, hmlVarC, Integer.valueOf((((i5 & 7168) >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    dsd dsdVar2 = dsdVar;
                    int i6 = i;
                    dixm.b(icsVar2, dsdVar2, fdauVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dsd dsdVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1395994083);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dsdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarD = efy.d(icoVar, 4.0f);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: dixc
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((kio) obj).getClass();
                        return new kjb(fdcu.b(dsdVar.c()) << 32);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarG = egq.g(egq.j(dkl.a(efs.a(icsVarD, (fdap) objS), glz.a(hmlVarC).p, evn.a), 64.0f), 48.0f);
            dwm dwmVar = dwm.b;
            ddz ddzVar = drd.a;
            der derVar = dljt.d(hmlVarC).p;
            int i5 = drd.c << 9;
            fdap fdapVar = drd.b;
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            int i6 = i4 | i5;
            boolean zD = ((((i6 & 14) ^ 6) > 4 && hmlVarC.D(dsdVar)) || (i6 & 6) == 4) | hmlVarC.D(kioVar);
            if ((((i6 & 112) ^ 48) <= 32 || !hmlVarC.D(fdapVar)) && (i6 & 48) != 32) {
                z = false;
            }
            boolean zD2 = zD | z | hmlVarC.D(derVar);
            Object objS2 = hmwVar.S();
            if (zD2 || objS2 == hmk.a) {
                objS2 = dro.a(dsdVar, kioVar, fdapVar, derVar);
                hmwVar.af(objS2);
            }
            ics icsVarA = joj.a(icsVarG.a(new AnchoredDraggableElement(dsdVar, dwmVar, (dzo) objS2)), "slider_test_tag");
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = diwz.a(hmg.b(hmlVarC));
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
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dtfn.a(djrs.b(djrr.aj, hmlVarC), null, egq.h(icoVar, 24.0f), glz.a(hmlVarC).s, hmlVarC, 384, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    dixm.c(dsdVar, (hml) obj, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ede edeVar, final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1633952583);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(edeVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, edeVar.a(ics.e, ibw.e), glz.a(hmlVarC).d, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVarC).h, hmlVar2, (i2 >> 3) & 14, 3120, 55288);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    int i4 = i;
                    dixm.d(edeVar2, str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dixn dixnVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-787446875);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dixnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 >> 3;
            hmlVarC.v(-835029301);
            Object systemService = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility");
            final AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(Boolean.valueOf(accessibilityManager != null && accessibilityManager.isEnabled()), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(accessibilityManager);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new fdap() { // from class: diha
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((hny) obj2).getClass();
                        final hox hoxVar2 = hoxVar;
                        final fdap fdapVar = new fdap() { // from class: digy
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                Boolean bool = (Boolean) obj3;
                                bool.booleanValue();
                                hoxVar2.b(bool);
                                return fctx.a;
                            }
                        };
                        AccessibilityManager accessibilityManager2 = accessibilityManager;
                        if (accessibilityManager2 != null) {
                            accessibilityManager2.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: digz
                                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                                public final void onAccessibilityStateChanged(boolean z) {
                                    fdapVar.invoke(Boolean.valueOf(z));
                                }
                            });
                        }
                        return new dihb(accessibilityManager2, fdapVar);
                    }
                };
                hmwVar.af(objS2);
            }
            int i5 = i4 & 14;
            hmwVar.ab();
            hob.c(accessibilityManager, (fdap) objS2, hmlVarC);
            boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
            hmwVar.ab();
            if (zBooleanValue) {
                hmlVarC.v(281644512);
                a(icsVar, dixnVar.a, dixnVar.b, hmlVarC, i5);
                hmwVar.ab();
            } else {
                hmlVarC.v(281751741);
                hmlVarC.v(1849434622);
                Object objS3 = hmwVar.S();
                if (objS3 == obj) {
                    objS3 = new dsd(diwy.a);
                    hmwVar.af(objS3);
                }
                dsd dsdVar = (dsd) objS3;
                hmwVar.ab();
                b(icsVar, dsdVar, hxe.d(-2123884570, new dixk(dixnVar, dsdVar), hmlVarC), hmlVarC, i5 | 432);
                Object objF = dsdVar.f();
                fdae fdaeVar = dixnVar.b;
                hmlVarC.v(-1633490746);
                int i6 = i2 & 14;
                Object objS4 = hmwVar.S();
                if (i6 == 4 || objS4 == obj) {
                    objS4 = new dixl(dsdVar, dixnVar, null);
                    hmwVar.af(objS4);
                }
                hmwVar.ab();
                hob.f(objF, fdaeVar, (fdat) objS4, hmlVarC);
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dixf
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dixn dixnVar2 = dixnVar;
                    int i7 = i;
                    dixm.e(dixnVar2, icsVar, (hml) obj2, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final long f(hml hmlVar) {
        hmlVar.v(-2000060728);
        long j = glz.a(hmlVar).G;
        ((hmw) hmlVar).ab();
        return j;
    }
}

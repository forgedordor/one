package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.material3.ClockDialModifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbj {
    public static final float a = 0.39453125f;
    public static final float b = 0.26953125f;
    public static final cth c = cti.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
    public static final cth d;
    public static final cth e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    private static final float j;

    static {
        cth cthVarA = cti.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        d = cthVarA;
        cug cugVar = new cug(cthVarA.b);
        int[] iArr = cthVarA.a;
        int i2 = cthVarA.b;
        for (int i3 = 0; i3 < i2; i3++) {
            cugVar.f((iArr[i3] % 12) + 12);
        }
        e = cugVar;
        j = 12.0f;
        f = 384.0f;
        g = 330.0f;
        h = 238.0f;
        i = 200.0f;
    }

    public static final boolean A(hbl hblVar) {
        return hblVar.d() >= 12;
    }

    public static final void B(final ics icsVar, final float f2, final fdat fdatVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1041042571);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.A(f2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            int i5 = i3 & 112;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i5 == 32 || objS == hmk.a) {
                objS = new hae(f2);
                hmwVar.af(objS);
            }
            ixm ixmVar = (ixm) objS;
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
            int i6 = (((((i3 << 3) & 112) | ((i3 >> 6) & 14)) << 6) & 896) | 6;
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVar, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVar.a(hmlVarC, Integer.valueOf((i6 >> 6) & 14));
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i7 = i2;
                    float f3 = f2;
                    int iA2 = hpy.a(i7 | 1);
                    hbj.B(icsVar2, f3, fdatVar, (hml) obj, iA2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void C(final fyf fyfVar, final ics icsVar, final gyq gyqVar, final boolean z, hml hmlVar, final int i2) {
        int i3;
        boolean z2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1432307537);
        if (i4 == 0) {
            i3 = (true != hmlVarC.F(fyfVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            z2 = z;
            i3 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if (hmlVarC.J((i3 & 1171) != 1170, i3 & 1)) {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: gzu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        float f2 = hbj.a;
                        jtk.L((jto) obj);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarJ = efy.j(jsh.c(icsVar, false, (fdap) objS), 0.0f, 0.0f, 0.0f, 24.0f, 7);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
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
            o(fyfVar, gyqVar, hmlVarC, (i3 & 14) | ((i3 >> 3) & 112));
            egt.a(egq.o(ics.e, 36.0f), hmlVarC);
            l(new gcy(), fyfVar, gyqVar, z2, hmlVarC, (i3 & 7168) | ((i3 << 3) & 112) | (i3 & 896));
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fyf fyfVar2 = fyfVar;
                    ics icsVar2 = icsVar;
                    int i5 = i2;
                    hbj.C(fyfVar2, icsVar2, gyqVar, z, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void D(final hbl hblVar, final ics icsVar, final gyq gyqVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-760850373);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? hmlVarC.D(hblVar) : hmlVarC.F(hblVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            r(icsVar, gyqVar, hblVar, hmlVarC, ((i3 << 6) & 896) | ((i3 >> 3) & 126));
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hbl hblVar2 = hblVar;
                    int i5 = i2;
                    ics icsVar2 = icsVar;
                    int iA = hpy.a(i5 | 1);
                    hbj.D(hblVar2, icsVar2, gyqVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void E(final hbl hblVar, final ics icsVar, final gyq gyqVar, final int i2, hml hmlVar, final int i3) {
        int i4;
        hml hmlVarC = hmlVar.c(-619286452);
        if ((i3 & 6) == 0) {
            i4 = (true != ((i3 & 8) == 0 ? hmlVarC.D(hblVar) : hmlVarC.F(hblVar)) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != hmlVarC.D(gyqVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != hmlVarC.B(i2) ? 1024 : 2048;
        }
        if (hmlVarC.J((i4 & 1171) != 1170, i4 & 1)) {
            hmlVarC.t();
            if ((i3 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            Object systemService = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility");
            systemService.getClass();
            final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            boolean zE = hmlVarC.E(true) | hmlVarC.E(true) | hmlVarC.E(true);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zE || objS == hmk.a) {
                objS = new hji();
                hmwVar.af(objS);
            }
            final hji hjiVar = (hji) objS;
            lvj lvjVar = (lvj) hmlVarC.e(lyj.a);
            boolean zD = hmlVarC.D(hjiVar) | hmlVarC.F(accessibilityManager);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: hex
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        hjg hjgVar;
                        if (((lva) obj) == lva.ON_RESUME) {
                            AccessibilityManager accessibilityManager2 = accessibilityManager;
                            hji hjiVar2 = hjiVar;
                            hjiVar2.b(accessibilityManager2.isEnabled());
                            accessibilityManager2.addAccessibilityStateChangeListener(hjiVar2);
                            hjh hjhVar = hjiVar2.a;
                            hjhVar.a(accessibilityManager2.isTouchExplorationEnabled());
                            accessibilityManager2.addTouchExplorationStateChangeListener(hjhVar);
                            if (Build.VERSION.SDK_INT >= 33 && (hjgVar = hjiVar2.b) != null) {
                                hjgVar.a(hji.c(accessibilityManager2));
                                hjgVar.b(hji.d(accessibilityManager2));
                                accessibilityManager2.addAccessibilityServicesStateChangeListener(hjgVar);
                            }
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            fdap fdapVar = (fdap) objS2;
            boolean zD2 = hmlVarC.D(hjiVar) | hmlVarC.F(accessibilityManager);
            Object objS3 = hmwVar.S();
            if (zD2 || objS3 == hmk.a) {
                objS3 = new fdae() { // from class: hey
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hjg hjgVar;
                        AccessibilityManager accessibilityManager2 = accessibilityManager;
                        hji hjiVar2 = hjiVar;
                        accessibilityManager2.removeAccessibilityStateChangeListener(hjiVar2);
                        accessibilityManager2.removeTouchExplorationStateChangeListener(hjiVar2.a);
                        if (Build.VERSION.SDK_INT >= 33 && (hjgVar = hjiVar2.b) != null) {
                            accessibilityManager2.removeAccessibilityServicesStateChangeListener(hjgVar);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hfa.a(lvjVar, fdapVar, (fdae) objS3, hmlVarC, 0);
            Object objS4 = hmwVar.S();
            Object obj = hmk.a;
            if (objS4 == obj) {
                objS4 = new jfw();
                hmwVar.af(objS4);
            }
            int i5 = i4 & 14;
            jfw jfwVar = (jfw) objS4;
            boolean z = i5 == 4 || ((i4 & 8) != 0 && hmlVarC.D(hblVar));
            Object objS5 = hmwVar.S();
            if (z || objS5 == obj) {
                objS5 = new fyf(hblVar, jfwVar);
                hmwVar.af(objS5);
            }
            fyf fyfVar = (fyf) objS5;
            Integer numValueOf = Integer.valueOf(hblVar.d());
            Integer numValueOf2 = Integer.valueOf(hblVar.e());
            boolean zF = hmlVarC.F(jfwVar) | hmlVarC.F(fyfVar) | (i5 == 4 || ((i4 & 8) != 0 && hmlVarC.F(hblVar)));
            Object objS6 = hmwVar.S();
            if (zF || objS6 == obj) {
                objS6 = new hba(jfwVar, fyfVar, hblVar, null);
                hmwVar.af(objS6);
            }
            int i6 = i4 & 1008;
            hob.f(numValueOf, numValueOf2, (fdat) objS6, hmlVarC);
            if (i2 == 1) {
                hmlVarC.v(2017551188);
                G(fyfVar, icsVar, gyqVar, !N(hjiVar), hmlVarC, i6);
                hmwVar.ab();
            } else {
                hmlVarC.v(2017749650);
                C(fyfVar, icsVar, gyqVar, !N(hjiVar), hmlVarC, i6);
                hmwVar.ab();
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gyz
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    hml hmlVar2 = (hml) obj2;
                    ((Integer) obj3).intValue();
                    hbl hblVar2 = hblVar;
                    ics icsVar2 = icsVar;
                    int i7 = i3;
                    hbj.E(hblVar2, icsVar2, gyqVar, i2, hmlVar2, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(final defpackage.ics r108, final defpackage.kew r109, final defpackage.fdap r110, defpackage.hbl r111, int r112, final defpackage.fae r113, final defpackage.fad r114, final defpackage.gyq r115, defpackage.hml r116, final int r117) {
        /*
            Method dump skipped, instructions count: 1275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbj.F(ics, kew, fdap, hbl, int, fae, fad, gyq, hml, int):void");
    }

    public static final void G(final fyf fyfVar, final ics icsVar, final gyq gyqVar, final boolean z, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1249591487);
        if (i4 == 0) {
            i3 = (true != hmlVarC.F(fyfVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if (hmlVarC.J((i3 & 1171) != 1170, i3 & 1)) {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: gze
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        float f2 = hbj.a;
                        jtk.L((jto) obj);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarC = jsh.c(icsVar, false, (fdap) objS);
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVarC, 48);
            int iA = hmg.a(hmlVarC);
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
            w(fyfVar, gyqVar, hmlVarC, (i3 & 14) | ((i3 >> 3) & 112));
            ico icoVar = ics.e;
            egt.a(egq.e(icoVar, 36.0f), hmlVarC);
            l(egq.k(icoVar, 256.0f), fyfVar, gyqVar, z, hmlVarC, ((i3 << 3) & 112) | 6 | (i3 & 896) | (i3 & 7168));
            egt.a(egq.e(icoVar, 24.0f), hmlVarC);
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    fyf fyfVar2 = fyfVar;
                    ics icsVar2 = icsVar;
                    int i5 = i2;
                    hbj.G(fyfVar2, icsVar2, gyqVar, z, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final String M(int i2, boolean z, int i3, hml hmlVar) {
        int i4 = hbk.b(i2, 1) ? R.string.m3c_time_picker_minute_suffix : z ? R.string.m3c_time_picker_hour_24h_suffix : R.string.m3c_time_picker_hour_suffix;
        Object[] objArr = {Integer.valueOf(i3)};
        String strB = hjw.b(i4, hmlVar);
        Locale localeF = lad.a((Configuration) hmlVar.e(AndroidCompositionLocals_androidKt.a)).f(0);
        if (localeF == null) {
            localeF = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
        String str = String.format(localeF, strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str.getClass();
        return str;
    }

    private static final boolean N(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }

    public static final float a(float f2, float f3) {
        float fAtan2 = ((float) Math.atan2(f2, f3)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + 6.2831855f : fAtan2;
    }

    public static final int b(hbl hblVar) {
        if (hblVar.k()) {
            return hblVar.d() % 24;
        }
        if (hblVar.d() % 12 == 0) {
            return 12;
        }
        return A(hblVar) ? hblVar.d() - 12 : hblVar.d();
    }

    public static final long c(hox hoxVar) {
        return ((ihs) hoxVar.a()).a;
    }

    public static final long d(fyf fyfVar) {
        float fC;
        float f2;
        float fC2 = fyfVar.c() / 256.0f;
        if (fyfVar.k() && A(fyfVar) && hbk.b(fyfVar.f(), 0)) {
            fC = fyfVar.c();
            f2 = 0.26953125f;
        } else {
            fC = fyfVar.c();
            f2 = 0.39453125f;
        }
        float f3 = fC2 * 24.0f;
        float f4 = ((kir) fddu.n(new kir((fC * f2) - f3), new kir(0.0f))).a;
        float fCos = (float) Math.cos(fyfVar.b());
        float fC3 = fyfVar.c() / 2.0f;
        float fSin = (float) Math.sin(fyfVar.b());
        float fC4 = fyfVar.c() / 2.0f;
        return (Float.floatToRawIntBits((r1 * fSin) + fC4) & 4294967295L) | (Float.floatToRawIntBits((fCos * (f4 + f3)) + fC3) << 32);
    }

    public static final ihu e(hox hoxVar) {
        return (ihu) hoxVar.a();
    }

    public static final kew f(hbl hblVar) {
        return new kew(gaz.a(b(hblVar), 2, 6), 0L, 6);
    }

    public static final kew g(hox hoxVar) {
        return (kew) hoxVar.a();
    }

    public static final kew h(hox hoxVar) {
        return (kew) hoxVar.a();
    }

    public static final kew i(hbl hblVar) {
        return new kew(gaz.a(hblVar.e(), 2, 6), 0L, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (defpackage.fdkj.c(100, r6) != r7) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.fyf r11, float r12, float r13, float r14, boolean r15, long r16, defpackage.ddz r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            r0 = r19
            boolean r1 = r0 instanceof defpackage.hbi
            if (r1 == 0) goto L15
            r1 = r0
            hbi r1 = (defpackage.hbi) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            hbi r1 = new hbi
            r1.<init>(r0)
        L1a:
            r6 = r1
            java.lang.Object r0 = r6.b
            fcyl r7 = defpackage.fcyl.a
            int r1 = r6.c
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L43
            if (r1 == r9) goto L3a
            if (r1 != r8) goto L32
            boolean r1 = r6.a
            fyf r2 = r6.d
            defpackage.fctl.b(r0)
            goto Lb2
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            boolean r1 = r6.a
            fyf r2 = r6.d
            defpackage.fctl.b(r0)
            r0 = r2
            goto L96
        L43:
            defpackage.fctl.b(r0)
            int r0 = defpackage.kjb.b(r16)
            float r0 = (float) r0
            float r0 = r13 - r0
            int r1 = defpackage.kjb.a(r16)
            float r1 = (float) r1
            float r1 = r12 - r1
            float r0 = a(r0, r1)
            int r1 = r11.f()
            boolean r1 = defpackage.hbk.b(r1, r9)
            if (r1 == 0) goto L71
            r1 = 1037465424(0x3dd67750, float:0.10471976)
            float r0 = r0 / r1
            r2 = 1084227584(0x40a00000, float:5.0)
            float r0 = r0 / r2
            double r3 = (double) r0
            double r3 = java.lang.Math.rint(r3)
            float r0 = (float) r3
            float r0 = r0 * r2
            goto L7b
        L71:
            r1 = 1057360530(0x3f060a92, float:0.5235988)
            float r0 = r0 / r1
            double r2 = (double) r0
            double r2 = java.lang.Math.rint(r2)
            float r0 = (float) r2
        L7b:
            float r0 = r0 * r1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r16
            r10 = r0
            r0 = r11
            y(r0, r1, r2, r3, r4)
            r6.d = r11
            r6.a = r15
            r6.c = r9
            r2 = r18
            java.lang.Object r2 = r11.g(r10, r2, r9, r6)
            if (r2 == r7) goto Lba
            r0 = r11
            r1 = r15
        L96:
            int r2 = r0.f()
            r3 = 0
            boolean r2 = defpackage.hbk.b(r2, r3)
            if (r2 == 0) goto Lb1
            if (r1 == 0) goto Lb1
            r6.d = r0
            r6.a = r9
            r6.c = r8
            r2 = 100
            java.lang.Object r2 = defpackage.fdkj.c(r2, r6)
            if (r2 == r7) goto Lba
        Lb1:
            r2 = r0
        Lb2:
            if (r1 == 0) goto Lb7
            r2.j(r9)
        Lb7:
            fctx r0 = defpackage.fctx.a
            return r0
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbj.j(fyf, float, float, float, boolean, long, ddz, fcxy):java.lang.Object");
    }

    public static final void k(final hbl hblVar, final gyq gyqVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-934561141);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? hmlVarC.D(hblVar) : hmlVarC.F(hblVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 16 : 32;
        }
        if (hmlVarC.J((i3 & 19) != 18, i3 & 1)) {
            hnj.b(new hpu[]{gyj.a.c(hct.a(4, hmlVarC)), jmh.j.c(kji.a)}, hxe.d(-477913269, new haf(hblVar, gyqVar), hmlVarC), hmlVarC, 56);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i2;
                    hbl hblVar2 = hblVar;
                    int iA = hpy.a(i5 | 1);
                    hbj.k(hblVar2, gyqVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final ics icsVar, final fyf fyfVar, final gyq gyqVar, final boolean z, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-478841003);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.F(fyfVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if (hmlVarC.J((i3 & 1171) != 1170, i3 & 1)) {
            czd.a(hbk.b(fyfVar.f(), 1) ? c : d, ifb.c(dkl.a(icsVar, gyqVar.a, evn.a).a(new ClockDialModifier(fyfVar, z, fyfVar.f(), gpg.b(1, hmlVarC))), new fdap() { // from class: gzg
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    fyf fyfVar2 = fyfVar;
                    imw imwVar = (imw) obj;
                    float fEn = imwVar.en(kiu.a(hbj.d(fyfVar2)));
                    float fEn2 = imwVar.en(kiu.b(hbj.d(fyfVar2)));
                    long jFloatToRawIntBits = Float.floatToRawIntBits(fEn);
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fEn2);
                    float fEn3 = ((imwVar.en(48.0f) / 2.0f) * imwVar.ep(fyfVar2.c())) / imwVar.ep(256.0f);
                    long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
                    imy.e(imwVar, ije.a, fEn3, j2, null, 0, 56);
                    imwVar.p();
                    gyq gyqVar2 = gyqVar;
                    long j3 = gyqVar2.b;
                    imy.e(imwVar, j3, fEn3, j2, null, 11, 56);
                    float fEn4 = imwVar.en(2.0f);
                    float fCos = (float) Math.cos(fyfVar2.b());
                    float fSin = (float) Math.sin(fyfVar2.b());
                    imy.l(imwVar, j3, iia.b(imwVar.b()), ihs.d(j2, (Float.floatToRawIntBits(fEn3 * fSin) & 4294967295L) | (Float.floatToRawIntBits(fCos * fEn3) << 32)), fEn4, 3, 240);
                    imy.e(imwVar, j3, imwVar.en(8.0f) / 2.0f, iia.b(imwVar.b()), null, 0, 120);
                    imy.e(imwVar, gyqVar2.a(true), fEn3, j2, null, 4, 56);
                    return fctx.a;
                }
            }), gpg.b(4, hmlVarC), null, hxe.d(747010833, new ham(gyqVar, fyfVar, z), hmlVarC), hmlVarC, 24576, 8);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gyr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    fyf fyfVar2 = fyfVar;
                    int i5 = i2;
                    hbj.l(icsVar2, fyfVar2, gyqVar, z, hmlVar2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void m(final ics icsVar, final fyf fyfVar, final int i2, final boolean z, hml hmlVar, final int i3) {
        int i4;
        hml hmlVar2;
        ics icsVar2;
        int i5 = i3 & 6;
        hml hmlVarC = hmlVar.c(-206784607);
        if (i5 == 0) {
            i4 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != hmlVarC.F(fyfVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != hmlVarC.B(i2) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if (hmlVarC.J((i4 & 1171) != 1170, i4 & 1)) {
            jyq jyqVarA = hct.a(1, hmlVarC);
            final kio kioVar = (kio) hmlVarC.e(jmh.e);
            final float fEn = kioVar.en(74.0f);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(new ihs(0L), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                hpl hplVar2 = new hpl(new kjb(0L), hsi.a);
                hmwVar.af(hplVar2);
                objS2 = hplVar2;
            }
            final hox hoxVar2 = (hox) objS2;
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                hpl hplVar3 = new hpl(ihu.a, hsi.a);
                hmwVar.af(hplVar3);
                objS3 = hplVar3;
            }
            final hox hoxVar3 = (hox) objS3;
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                objS4 = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS4);
            }
            final fdjx fdjxVar = (fdjx) objS4;
            final String strM = M(fyfVar.f(), fyfVar.k(), i2, hmlVarC);
            String strA = gaz.a(i2, 0, 7);
            boolean zD = hmlVarC.D(fyfVar);
            Object objS5 = hmwVar.S();
            if (zD || objS5 == obj) {
                fdae fdaeVar = new fdae() { // from class: gyu
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        long jD = hbj.d(fyfVar);
                        float fA = kiu.a(jD);
                        kio kioVar2 = kioVar;
                        float fEn2 = kioVar2.en(fA);
                        float fEn3 = kioVar2.en(kiu.b(jD));
                        return Boolean.valueOf(hbj.e(hoxVar3).g((Float.floatToRawIntBits(fEn2) << 32) | (Float.floatToRawIntBits(fEn3) & 4294967295L)));
                    }
                };
                hxn hxnVar = hrp.a;
                objS5 = new hnt(fdaeVar, null);
                hmwVar.af(objS5);
            }
            final hsf hsfVar = (hsf) objS5;
            iby ibyVar = ibw.e;
            Object objS6 = hmwVar.S();
            if (objS6 == obj) {
                objS6 = new fdap() { // from class: gyv
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ivy ivyVar = (ivy) obj2;
                        float f2 = hbj.a;
                        ivy ivyVarP = ivyVar.p();
                        long jB = ivyVarP != null ? kjh.b(ivyVarP.g()) : 0L;
                        hox hoxVar4 = hoxVar;
                        hox hoxVar5 = hoxVar3;
                        hoxVar2.b(new kjb(jB));
                        hoxVar5.b(ivz.d(ivyVar));
                        hoxVar4.b(new ihs(hbj.e(hoxVar5).a()));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS6);
            }
            ics icsVarA = dme.a(egq.k(gks.a(ixy.a(icsVar, (fdap) objS6)), 48.0f), true, null);
            boolean zF = ((i4 & 7168) == 2048) | hmlVarC.F(fdjxVar) | hmlVarC.F(fyfVar) | hmlVarC.A(fEn) | hmlVarC.D(hsfVar);
            Object objS7 = hmwVar.S();
            if (zF || objS7 == obj) {
                icsVar2 = icsVarA;
                fdap fdapVar = new fdap() { // from class: gyw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        jto jtoVar = (jto) obj2;
                        float f2 = hbj.a;
                        final fdjx fdjxVar2 = fdjxVar;
                        final fyf fyfVar2 = fyfVar;
                        final float f3 = fEn;
                        final boolean z2 = z;
                        final hox hoxVar4 = hoxVar;
                        final hox hoxVar5 = hoxVar2;
                        jtk.h(jtoVar, null, new fdae() { // from class: gzt
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                float f4 = hbj.a;
                                fdil.d(fdjxVar2, null, null, new han(fyfVar2, f3, z2, hoxVar4, hoxVar5, null), 3);
                                return true;
                            }
                        });
                        jtk.r(jtoVar, ((Boolean) hsfVar.a()).booleanValue());
                        return fctx.a;
                    }
                };
                hmwVar.af(fdapVar);
                objS7 = fdapVar;
            } else {
                icsVar2 = icsVarA;
            }
            ics icsVarC = jsh.c(icsVar2, true, (fdap) objS7);
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
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
            ico icoVar = ics.e;
            boolean zD2 = hmlVarC.D(strM);
            Object objS8 = hmwVar.S();
            if (zD2 || objS8 == obj) {
                objS8 = new fdap() { // from class: gyx
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        float f2 = hbj.a;
                        jtk.k((jto) obj2, strM);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS8);
            }
            hmlVar2 = hmlVarC;
            gyj.c(strA, jsh.b(icoVar, (fdap) objS8), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyqVarA, hmlVar2, 0, 0, 131068);
            hmlVar2.n();
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gyy
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    hml hmlVar3 = (hml) obj2;
                    ((Integer) obj3).intValue();
                    ics icsVar3 = icsVar;
                    fyf fyfVar2 = fyfVar;
                    int i6 = i3;
                    hbj.m(icsVar3, fyfVar2, i2, z, hmlVar3, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void n(final ics icsVar, hml hmlVar, final int i2) {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(2100674302);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (hmlVarC.J((i3 & 3) != 2, i3 & 1)) {
            jyq jyqVarY = jyq.y((jyq) hmlVarC.e(gyj.a), 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, new khi(khf.a, 17), 0, 15695871);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: gza
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        float f2 = hbj.a;
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarB = jsh.b(icsVar, (fdap) objS);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = hmg.a(hmlVarC);
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
            gyj.c(":", null, gdd.g(18, hmlVarC), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyqVarY, hmlVar2, 6, 0, 131066);
            hmlVar2.n();
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA2 = hpy.a(i2 | 1);
                    hbj.n(icsVar, (hml) obj, iA2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void o(final hbl hblVar, final gyq gyqVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(755539561);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? hmlVarC.D(hblVar) : hmlVarC.F(hblVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 16 : 32;
        }
        if (hmlVarC.J((i3 & 19) != 18, i3 & 1)) {
            ecj ecjVar = ecr.e;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecjVar, ibw.j, hmlVarC, 6);
            int iA = hmg.a(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
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
            k(hblVar, gyqVar, hmlVarC, i3 & 126);
            if (hblVar.k()) {
                hmlVarC.v(999019151);
                hmwVar.ab();
            } else {
                hmlVarC.v(998576130);
                ics icsVarJ = efy.j(icoVar, 0.0f, j, 0.0f, 0.0f, 13);
                ixm ixmVarA2 = ecz.a(ibw.a, false);
                int iA2 = hmg.a(hmlVarC);
                hxi hxiVarAk2 = hmwVar.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVarJ);
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
                int i5 = i3 << 3;
                p(egq.m(icoVar, 216.0f, 38.0f), hblVar, gyqVar, hmlVarC, (i5 & 896) | (i5 & 112) | 6);
                hmlVarC.n();
                hmwVar.ab();
            }
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i2;
                    hbl hblVar2 = hblVar;
                    int iA3 = hpy.a(i6 | 1);
                    hbj.o(hblVar2, gyqVar, (hml) obj, iA3);
                    return fctx.a;
                }
            };
        }
    }

    public static final void p(ics icsVar, hbl hblVar, gyq gyqVar, hml hmlVar, final int i2) {
        int i3;
        final ics icsVar2;
        final hbl hblVar2;
        final gyq gyqVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1261215927);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? hmlVarC.D(hblVar) : hmlVarC.F(hblVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = hap.a;
                hmwVar.af(objS);
            }
            ikp ikpVarE = gsc.e(15, hmlVarC);
            ikpVarE.getClass();
            eve eveVar = (eve) ikpVarE;
            icsVar2 = icsVar;
            hblVar2 = hblVar;
            gyqVar2 = gyqVar;
            q(icsVar2, hblVar2, gyqVar2, (ixm) objS, gsc.b(eveVar), gsc.a(eveVar), hmlVarC, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
        } else {
            icsVar2 = icsVar;
            hblVar2 = hblVar;
            gyqVar2 = gyqVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hab
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar2;
                    int i5 = i2;
                    hbl hblVar3 = hblVar2;
                    int iA = hpy.a(i5 | 1);
                    hbj.p(icsVar3, hblVar3, gyqVar2, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void q(final ics icsVar, final hbl hblVar, final gyq gyqVar, final ixm ixmVar, final ikp ikpVar, final ikp ikpVar2, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1374241901);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? hmlVarC.D(hblVar) : hmlVarC.F(hblVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.D(ixmVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.D(ikpVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.D(ikpVar2) ? 65536 : 131072;
        }
        int i5 = i3;
        if (hmlVarC.J((74899 & i5) != 74898, i5 & 1)) {
            long j2 = gyqVar.c;
            dky dkyVarA = dkz.a(1.0f, j2);
            ikp ikpVarE = gsc.e(15, hmlVarC);
            ikpVarE.getClass();
            eve eveVar = (eve) ikpVarE;
            final String strB = hjw.b(R.string.m3c_time_picker_period_toggle_description, hmlVarC);
            boolean zD = hmlVarC.D(strB);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: gzl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        float f2 = hbj.a;
                        jtk.L(jtoVar);
                        jtk.k(jtoVar, strB);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarB = dkr.b(eur.a(jsh.c(icsVar, false, (fdap) objS)), dkyVarA, eveVar);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarB);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVar, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB2, jbb.c);
            boolean z = !A(hblVar);
            int i6 = i5 & 112;
            boolean z2 = i6 == 32 || ((i5 & 64) != 0 && hmlVarC.F(hblVar));
            Object objS2 = hmwVar.S();
            if (z2 || objS2 == hmk.a) {
                objS2 = new fdae() { // from class: gzm
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hbl hblVar2 = hblVar;
                        if (hbj.A(hblVar2)) {
                            hblVar2.h(hblVar2.d() - 12);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            int i7 = (i5 << 3) & 7168;
            v(z, ikpVar, (fdae) objS2, gyqVar, gdy.a, hmlVarC, ((i5 >> 9) & 112) | 24576 | i7);
            egt.a(dkl.a(egq.c(idb.a(iwa.a(ics.e, "Spacer"), 2.0f), 1.0f), j2, ikj.a), hmlVarC);
            boolean zA = A(hblVar);
            boolean z3 = i6 == 32 || ((i5 & 64) != 0 && hmlVarC.F(hblVar));
            Object objS3 = hmwVar.S();
            if (z3 || objS3 == hmk.a) {
                objS3 = new fdae() { // from class: gzo
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hbl hblVar2 = hblVar;
                        if (!hbj.A(hblVar2)) {
                            hblVar2.h(hblVar2.d() + 12);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            v(zA, ikpVar2, (fdae) objS3, gyqVar, gdy.b, hmlVarC, ((i5 >> 12) & 112) | 24576 | i7);
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    hbl hblVar2 = hblVar;
                    gyq gyqVar2 = gyqVar;
                    ixm ixmVar2 = ixmVar;
                    int i8 = i2;
                    hbj.q(icsVar2, hblVar2, gyqVar2, ixmVar2, ikpVar, ikpVar2, hmlVar2, hpy.a(i8 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(ics icsVar, gyq gyqVar, hbl hblVar, hml hmlVar, final int i2) {
        int i3;
        final gyq gyqVar2;
        final ics icsVar2;
        Integer num;
        hmw hmwVar;
        hox hoxVar;
        boolean z;
        jfw jfwVar;
        final hbl hblVar2 = hblVar;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-475657989);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? hmlVarC.D(hblVar2) : hmlVarC.F(hblVar2)) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            Object[] objArr = new Object[0];
            int i5 = i3 & 896;
            hyr hyrVar = kew.a;
            Object[] objArr2 = i5 == 256 || ((i3 & 512) != 0 && hmlVarC.F(hblVar2));
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            if (objArr2 != false || objS == hmk.a) {
                objS = new fdae() { // from class: gzc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hpl(hbj.f(hblVar2), hsi.a);
                    }
                };
                hmwVar2.af(objS);
            }
            hox hoxVarD = hxy.d(objArr, hyrVar, (fdae) objS, hmlVarC, 0);
            Object[] objArr3 = new Object[0];
            Object[] objArr4 = i5 == 256 || ((i3 & 512) != 0 && hmlVarC.F(hblVar2));
            Object objS2 = hmwVar2.S();
            if (objArr4 != false || objS2 == hmk.a) {
                objS2 = new fdae() { // from class: gzn
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hpl(hbj.i(hblVar2), hsi.a);
                    }
                };
                hmwVar2.af(objS2);
            }
            hox hoxVarD2 = hxy.d(objArr3, hyrVar, (fdae) objS2, hmlVarC, 0);
            Object objS3 = hmwVar2.S();
            Object obj = hmk.a;
            if (objS3 == obj) {
                objS3 = new jfw();
                hmwVar2.af(objS3);
            }
            jfw jfwVar2 = (jfw) objS3;
            Integer numValueOf = Integer.valueOf(hblVar2.d());
            Integer numValueOf2 = Integer.valueOf(hblVar2.e());
            boolean zF = hmlVarC.F(jfwVar2) | hmlVarC.D(hoxVarD) | (i5 == 256 || ((i3 & 512) != 0 && hmlVarC.F(hblVar2))) | hmlVarC.D(hoxVarD2);
            Object objS4 = hmwVar2.S();
            if (zF || objS4 == obj) {
                num = numValueOf;
                hmwVar = hmwVar2;
                hoxVar = hoxVarD2;
                z = false;
                jfwVar = jfwVar2;
                objS4 = new haq(jfwVar, hblVar2, hoxVarD, hoxVar, null);
                hmwVar.af(objS4);
            } else {
                hmwVar = hmwVar2;
                num = numValueOf;
                hoxVar = hoxVarD2;
                z = false;
                jfwVar = jfwVar2;
            }
            hob.f(num, numValueOf2, (fdat) objS4, hmlVarC);
            int i6 = i3;
            hmw hmwVar3 = hmwVar;
            boolean z2 = z;
            ics icsVarJ = efy.j(icsVar, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 48);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar3.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar3.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar3.z || !fdbq.f(hmwVar3.S(), Integer.valueOf(iA))) {
                Object objValueOf = Integer.valueOf(iA);
                hmwVar3.af(objValueOf);
                hmlVarC.h(objValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            hpu[] hpuVarArr = new hpu[2];
            hpuVarArr[z2 ? 1 : 0] = gyj.a.c(jyq.y(hct.a(5, hmlVarC), gyqVar.c(true), 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 0, 16744446));
            hpuVarArr[1] = jmh.j.c(kji.a);
            hblVar2 = hblVar;
            gyqVar2 = gyqVar;
            icsVar2 = icsVar;
            hnj.b(hpuVarArr, hxe.d(1306700887, new haz(hoxVarD, hblVar2, jfwVar, gyqVar2, hoxVar), hmlVarC), hmlVarC, 56);
            if (((hbo) hblVar2).a) {
                hmlVarC.v(-1381611861);
                hmwVar3.ab();
            } else {
                hmlVarC.v(-1381946289);
                ico icoVar = ics.e;
                ics icsVarJ2 = efy.j(icoVar, j, 0.0f, 0.0f, 0.0f, 14);
                ixm ixmVarA2 = ecz.a(ibw.a, z2);
                int iA2 = hmg.a(hmlVarC);
                hxi hxiVarAk2 = hmwVar3.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVarJ2);
                hmlVarC.x();
                if (hmwVar3.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA2, fdatVar);
                hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
                if (hmwVar3.z || !fdbq.f(hmwVar3.S(), Integer.valueOf(iA2))) {
                    Object objValueOf2 = Integer.valueOf(iA2);
                    hmwVar3.af(objValueOf2);
                    hmlVarC.h(objValueOf2, fdatVar3);
                }
                hsk.b(hmlVarC, icsVarB2, fdatVar4);
                x(egq.m(icoVar, 52.0f, 72.0f), hblVar2, gyqVar2, hmlVarC, ((i6 >> 3) & 112) | 6 | ((i6 << 3) & 896));
                hmlVarC.n();
                hmwVar3.ab();
            }
            hmlVarC.n();
        } else {
            gyqVar2 = gyqVar;
            icsVar2 = icsVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzw
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar3 = icsVar2;
                    int i7 = i2;
                    gyq gyqVar3 = gyqVar2;
                    int iA3 = hpy.a(i7 | 1);
                    hbj.r(icsVar3, gyqVar3, hblVar2, (hml) obj2, iA3);
                    return fctx.a;
                }
            };
        }
    }

    public static final void s(hox hoxVar, kew kewVar) {
        hoxVar.b(kewVar);
    }

    public static final void t(hox hoxVar, kew kewVar) {
        hoxVar.b(kewVar);
    }

    public static final void u(final ics icsVar, final int i2, final hbl hblVar, final int i3, final gyq gyqVar, hml hmlVar, final int i4) {
        int i5;
        int i6;
        hml hmlVar2;
        int i7 = i4 & 6;
        hml hmlVarC = hmlVar.c(-1148055889);
        if (i7 == 0) {
            i5 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 = i2;
            i5 |= true != hmlVarC.B(i6) ? 16 : 32;
        } else {
            i6 = i2;
        }
        if ((i4 & 384) == 0) {
            i5 |= true != ((i4 & 512) == 0 ? hmlVarC.D(hblVar) : hmlVarC.F(hblVar)) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i5 |= true != hmlVarC.B(i3) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i5 |= true != hmlVarC.D(gyqVar) ? 8192 : 16384;
        }
        if (hmlVarC.J((i5 & 9363) != 9362, i5 & 1)) {
            boolean zB = hbk.b(hblVar.f(), i3);
            final String strB = hjw.b(true != hbk.b(i3, 0) ? R.string.m3c_time_picker_minute_selection : R.string.m3c_time_picker_hour_selection, hmlVarC);
            long jB = gyqVar.b(zB);
            long jC = gyqVar.c(zB);
            boolean zD = hmlVarC.D(strB);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: hac
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        float f2 = hbj.a;
                        jtk.q(jtoVar, 3);
                        jtk.k(jtoVar, strB);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarC = jsh.c(icsVar, true, (fdap) objS);
            ikp ikpVarE = gsc.e(15, hmlVarC);
            boolean z = ((i5 & 7168) == 2048) | ((i5 & 896) == 256 || ((i5 & 512) != 0 && hmlVarC.F(hblVar)));
            Object objS2 = hmwVar.S();
            if (z || objS2 == hmk.a) {
                objS2 = new fdae() { // from class: gys
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        float f2 = hbj.a;
                        hbl hblVar2 = hblVar;
                        int i8 = i3;
                        if (!hbk.b(i8, hblVar2.f())) {
                            hblVar2.j(i8);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmlVar2 = hmlVarC;
            gvk.d(zB, (fdae) objS2, icsVarC, false, ikpVarE, jB, 0.0f, null, null, hxe.d(-1477282471, new hbf(i3, hblVar, i6, jC), hmlVarC), hmlVar2, 1992);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gyt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar3 = (hml) obj;
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i8 = i2;
                    hbl hblVar2 = hblVar;
                    int i9 = i4;
                    hbj.u(icsVar2, i8, hblVar2, i3, gyqVar, hmlVar3, hpy.a(i9 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void v(final boolean z, final ikp ikpVar, final fdae fdaeVar, final gyq gyqVar, final fdau fdauVar, hml hmlVar, final int i2) {
        int i3;
        ikp ikpVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1523811083);
        if (i4 == 0) {
            i3 = (true != hmlVarC.E(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ikpVar2 = ikpVar;
            i3 |= true != hmlVarC.D(ikpVar2) ? 16 : 32;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 8192 : 16384;
        }
        if (hmlVarC.J((i3 & 9363) != 9362, i3 & 1)) {
            long j2 = z ? gyqVar.f : gyqVar.g;
            long j3 = z ? gyqVar.d : gyqVar.e;
            ics icsVarC = egq.c(idb.a(ics.e, true != z ? 1.0f : 0.0f), 1.0f);
            int i5 = i3 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            int i6 = i3;
            Object objS = hmwVar.S();
            if (i5 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: gzh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        float f2 = hbj.a;
                        jtk.r((jto) obj, z);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            ics icsVarC2 = jsh.c(icsVarC, false, (fdap) objS);
            egd egdVar = new egd(0.0f, 0.0f, 0.0f, 0.0f);
            egc egcVar = gam.a;
            gax.b(fdaeVar, icsVarC2, false, ikpVar2, gam.e(j3, j2, hmlVarC, 12), egdVar, fdauVar, hmlVarC, ((i6 >> 6) & 14) | 12582912 | ((i6 << 6) & 7168) | (1879048192 & (i6 << 15)), 356);
            hmlVarC = hmlVarC;
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    ikp ikpVar3 = ikpVar;
                    fdae fdaeVar2 = fdaeVar;
                    int i7 = i2;
                    hbj.v(z2, ikpVar3, fdaeVar2, gyqVar, fdauVar, hmlVar2, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void w(final hbl hblVar, final gyq gyqVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(2054675515);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? hmlVarC.D(hblVar) : hmlVarC.F(hblVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 16 : 32;
        }
        if (hmlVarC.J((i3 & 19) != 18, i3 & 1)) {
            ecj ecjVar = ecr.e;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecjVar, ibw.m, hmlVarC, 6);
            int iA = hmg.a(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
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
            k(hblVar, gyqVar, hmlVarC, i3 & 126);
            if (hblVar.k()) {
                hmlVarC.v(1364726507);
                hmwVar.ab();
            } else {
                hmlVarC.v(1364287330);
                ics icsVarJ = efy.j(icoVar, j, 0.0f, 0.0f, 0.0f, 14);
                ixm ixmVarA2 = ecz.a(ibw.a, false);
                int iA2 = hmg.a(hmlVarC);
                hxi hxiVarAk2 = hmwVar.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVarJ);
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
                int i5 = i3 << 3;
                x(egq.m(icoVar, 52.0f, 80.0f), hblVar, gyqVar, hmlVarC, (i5 & 896) | (i5 & 112) | 6);
                hmlVarC.n();
                hmwVar.ab();
            }
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i2;
                    hbl hblVar2 = hblVar;
                    int iA3 = hpy.a(i6 | 1);
                    hbj.w(hblVar2, gyqVar, (hml) obj, iA3);
                    return fctx.a;
                }
            };
        }
    }

    public static final void x(final ics icsVar, final hbl hblVar, final gyq gyqVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1898918107);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? hmlVarC.D(hblVar) : hmlVarC.F(hblVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(gyqVar) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = hbh.a;
                hmwVar.af(objS);
            }
            ikp ikpVarE = gsc.e(15, hmlVarC);
            ikpVarE.getClass();
            eve eveVar = (eve) ikpVarE;
            eve eveVarC = gsc.c(eveVar);
            eve eveVar2 = grz.a;
            evf evfVar = grz.i;
            q(icsVar, hblVar, gyqVar, (ixm) objS, eveVarC, eve.d(eveVar, evfVar, evfVar, null, null, 12), hmlVarC, (i3 & 896) | (i3 & 14) | 3072 | (i3 & 112));
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gzs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i5 = i2;
                    hbl hblVar2 = hblVar;
                    int iA = hpy.a(i5 | 1);
                    hbj.x(icsVar2, hblVar2, gyqVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void y(hbl hblVar, float f2, float f3, float f4, long j2) {
        if (hbk.b(hblVar.f(), 0) && hblVar.k()) {
            float fHypot = (float) Math.hypot(kjb.a(j2) - f2, kjb.b(j2) - f3);
            if (A(hblVar)) {
                hblVar.h(hblVar.d() - (fHypot >= f4 ? 12 : 0));
            } else {
                hblVar.h(hblVar.d() + (fHypot < f4 ? 12 : 0));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[Catch: NumberFormatException | IllegalArgumentException -> 0x00cf, TryCatch #0 {NumberFormatException | IllegalArgumentException -> 0x00cf, blocks: (B:19:0x004a, B:21:0x0056, B:23:0x005e, B:26:0x0075, B:29:0x007d, B:31:0x0083, B:42:0x009e, B:44:0x00a3, B:46:0x00aa, B:48:0x00b1, B:50:0x00bc, B:51:0x00cc, B:35:0x008e, B:37:0x0094, B:41:0x009d, B:47:0x00ae, B:24:0x006b), top: B:54:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(int r5, defpackage.hbl r6, defpackage.kew r7, defpackage.kew r8, int r9, defpackage.jfw r10, defpackage.fdap r11) {
        /*
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r10.a = r1
            java.lang.String r10 = r7.a()
            java.lang.String r8 = r8.a()
            boolean r8 = defpackage.fdbq.f(r10, r8)
            if (r8 == 0) goto L19
            r11.invoke(r7)
            return
        L19:
            java.lang.String r8 = r7.a()
            int r8 = r8.length()
            r10 = 12
            if (r8 != 0) goto L4a
            boolean r5 = defpackage.hbk.b(r5, r0)
            if (r5 == 0) goto L3d
            boolean r5 = A(r6)
            if (r5 == 0) goto L39
            r5 = r6
            hbo r5 = (defpackage.hbo) r5
            boolean r5 = r5.a
            if (r5 != 0) goto L39
            r0 = r10
        L39:
            r6.h(r0)
            goto L40
        L3d:
            r6.i(r0)
        L40:
            java.lang.String r5 = ""
            kew r5 = defpackage.kew.c(r7, r5)
            r11.invoke(r5)
            return
        L4a:
            java.lang.String r8 = r7.a()     // Catch: java.lang.Throwable -> Lcf
            int r8 = r8.length()     // Catch: java.lang.Throwable -> Lcf
            r1 = 3
            r2 = 1
            if (r8 != r1) goto L6b
            long r3 = r7.c     // Catch: java.lang.Throwable -> Lcf
            int r8 = defpackage.jyo.e(r3)     // Catch: java.lang.Throwable -> Lcf
            if (r8 != r2) goto L6b
            java.lang.String r8 = r7.a()     // Catch: java.lang.Throwable -> Lcf
            char r8 = r8.charAt(r0)     // Catch: java.lang.Throwable -> Lcf
            int r8 = defpackage.fdfv.c(r8)     // Catch: java.lang.Throwable -> Lcf
            goto L73
        L6b:
            java.lang.String r8 = r7.a()     // Catch: java.lang.Throwable -> Lcf
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Throwable -> Lcf
        L73:
            if (r8 > r9) goto Lcf
            boolean r5 = defpackage.hbk.b(r5, r0)     // Catch: java.lang.Throwable -> Lcf
            if (r5 == 0) goto Lae
            if (r8 != r10) goto L8e
            boolean r5 = A(r6)     // Catch: java.lang.Throwable -> Lcf
            if (r5 != 0) goto L8d
            r5 = r6
            hbo r5 = (defpackage.hbo) r5     // Catch: java.lang.Throwable -> Lcf
            boolean r5 = r5.a     // Catch: java.lang.Throwable -> Lcf
            if (r5 != 0) goto L8d
            r8 = r10
            r10 = r0
            goto L9e
        L8d:
            r8 = r10
        L8e:
            boolean r5 = A(r6)     // Catch: java.lang.Throwable -> Lcf
            if (r5 == 0) goto L9c
            r5 = r6
            hbo r5 = (defpackage.hbo) r5     // Catch: java.lang.Throwable -> Lcf
            boolean r5 = r5.a     // Catch: java.lang.Throwable -> Lcf
            if (r5 != 0) goto L9c
            goto L9d
        L9c:
            r10 = r0
        L9d:
            int r10 = r10 + r8
        L9e:
            r6.h(r10)     // Catch: java.lang.Throwable -> Lcf
            if (r8 <= r2) goto Lb1
            r5 = r6
            hbo r5 = (defpackage.hbo) r5     // Catch: java.lang.Throwable -> Lcf
            boolean r5 = r5.a     // Catch: java.lang.Throwable -> Lcf
            if (r5 != 0) goto Lb1
            r6.j(r2)     // Catch: java.lang.Throwable -> Lcf
            goto Lb1
        Lae:
            r6.i(r8)     // Catch: java.lang.Throwable -> Lcf
        Lb1:
            java.lang.String r5 = r7.a()     // Catch: java.lang.Throwable -> Lcf
            int r5 = r5.length()     // Catch: java.lang.Throwable -> Lcf
            r6 = 2
            if (r5 <= r6) goto Lcc
            java.lang.String r5 = r7.a()     // Catch: java.lang.Throwable -> Lcf
            char r5 = r5.charAt(r0)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lcf
            kew r7 = defpackage.kew.c(r7, r5)     // Catch: java.lang.Throwable -> Lcf
        Lcc:
            r11.invoke(r7)     // Catch: java.lang.Throwable -> Lcf
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbj.z(int, hbl, kew, kew, int, jfw, fdap):void");
    }
}

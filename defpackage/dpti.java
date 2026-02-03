package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpti {
    public static final long a(hsf hsfVar) {
        return ((Number) hsfVar.a()).longValue();
    }

    public static final dpts b(hox hoxVar) {
        return (dpts) hoxVar.a();
    }

    public static final void c(hox hoxVar, dpts dptsVar) {
        hoxVar.b(dptsVar);
    }

    public static final void d(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void e(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final boolean f(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    public static final boolean g(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }

    public static final void h(final dplv dplvVar, final ics icsVar, final dpto dptoVar, final boolean z, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        hox hoxVar;
        hox hoxVar2;
        Object obj;
        hml hmlVar2;
        hml hmlVarC = hmlVar.c(-2118775659);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(dplvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dptoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.E(false) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            dptt dpttVar = dptoVar.b;
            dpsf dpsfVar = (dpsf) dpttVar;
            hsf hsfVarB = hsb.b(dpsfVar.c, false, null, hmlVarC, 2);
            hsf hsfVarB2 = hsb.b(dpsfVar.e, 0L, null, hmlVarC, 2);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(dpttVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                hpl hplVar = new hpl(Boolean.valueOf(a(hsfVarB2) > 0), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar3 = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(5004770);
            boolean zD2 = hmlVarC.D(dpttVar);
            Object objS2 = hmwVar.S();
            if (zD2 || objS2 == hmk.a) {
                objS2 = new hpl(null, hsi.a);
                hmwVar.af(objS2);
            }
            hox hoxVar4 = (hox) objS2;
            hmwVar.ab();
            hmlVarC.v(-328883278);
            if (g(hsfVarB)) {
                hoxVar3.b(true);
                final View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
                fctx fctxVar = fctx.a;
                hoxVar = hoxVar3;
                hmlVarC.v(5004770);
                boolean zF = hmlVarC.F(view);
                Object objS3 = hmwVar.S();
                if (zF) {
                    hoxVar2 = hoxVar4;
                } else {
                    hoxVar2 = hoxVar4;
                    if (objS3 == hmk.a) {
                    }
                    hmwVar.ab();
                    hob.c(fctxVar, (fdap) objS3, hmlVarC);
                }
                objS3 = new fdap() { // from class: dpsq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((hny) obj2).getClass();
                        View view2 = view;
                        boolean keepScreenOn = view2.getKeepScreenOn();
                        view2.setKeepScreenOn(true);
                        return new dpte(view2, keepScreenOn);
                    }
                };
                hmwVar.af(objS3);
                hmwVar.ab();
                hob.c(fctxVar, (fdap) objS3, hmlVarC);
            } else {
                hoxVar = hoxVar3;
                hoxVar2 = hoxVar4;
            }
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS4 = hmwVar.S();
            Object obj2 = hmk.a;
            if (objS4 == obj2) {
                hpl hplVar2 = new hpl(true, hsi.a);
                hmwVar.af(hplVar2);
                objS4 = hplVar2;
            }
            final hox hoxVar5 = (hox) objS4;
            hmwVar.ab();
            if (!g(hsfVarB)) {
                d(hoxVar5, true);
            }
            hmlVarC.v(-1746271574);
            boolean zF2 = hmlVarC.F(dptoVar) | hmlVarC.F(dplvVar);
            Object objS5 = hmwVar.S();
            if (zF2 || objS5 == obj2) {
                objS5 = new fdae() { // from class: dpsi
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dpti.d(hoxVar5, !dpti.f(r0));
                        if (dptoVar.d) {
                            dplvVar.h();
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            fdae fdaeVar = (fdae) objS5;
            hmwVar.ab();
            Boolean boolValueOf = Boolean.valueOf(z);
            hmlVarC.v(-1746271574);
            int i3 = i2;
            boolean zD3 = ((i2 & 7168) == 2048) | hmlVarC.D(hsfVarB) | hmlVarC.F(dpttVar);
            Object objS6 = hmwVar.S();
            if (zD3 || objS6 == obj2) {
                obj = null;
                objS6 = new dpsw(z, dpttVar, hsfVarB, null);
                hmwVar.af(objS6);
            } else {
                obj = null;
            }
            hmwVar.ab();
            hob.g(boolValueOf, (fdat) objS6, hmlVarC);
            hmlVar2 = hmlVarC;
            edj.a(icsVar, null, hxe.d(828572287, new dptc(fdaeVar, dplvVar, dptoVar, dpttVar, fdapVar, z, hoxVar5, hsfVarB, hoxVar, hoxVar2, hsfVarB2), hmlVarC), hmlVar2, ((i3 >> 3) & 14) | 3072, 6);
            fctx fctxVar2 = fctx.a;
            hmlVar2.v(-1633490746);
            boolean zF3 = ((i3 & 57344) == 16384) | hmlVar2.F(dpttVar);
            Object objS7 = hmwVar.S();
            if (zF3 || objS7 == obj2) {
                objS7 = new dptd(dpttVar, null);
                hmwVar.af(objS7);
            }
            hmwVar.ab();
            hob.g(fctxVar2, (fdat) objS7, hmlVar2);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpsj
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dplv dplvVar2 = dplvVar;
                    ics icsVar2 = icsVar;
                    dpto dptoVar2 = dptoVar;
                    boolean z2 = z;
                    dpti.h(dplvVar2, icsVar2, dptoVar2, z2, fdapVar, (hml) obj3, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final ics icsVar, final dptt dpttVar, final boolean z, final boolean z2, final dpts dptsVar, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        final hox hoxVar;
        hmw hmwVar;
        dptq dptqVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(350832769);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(dpttVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(dptsVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final lvj lvjVar = (lvj) hmlVarC.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            final ExoPlayer exoPlayer = ((dpsf) dpttVar).h;
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(dpttVar) | hmlVarC.F(lvjVar);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: dpsl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((hny) obj).getClass();
                        final dptt dpttVar2 = dpttVar;
                        lvh lvhVar = new lvh() { // from class: dpsk
                            @Override // defpackage.lvh
                            public final void gL(lvj lvjVar2, lva lvaVar) {
                                if (lvaVar == lva.ON_STOP) {
                                    dpttVar2.b();
                                }
                            }
                        };
                        lvj lvjVar2 = lvjVar;
                        lvjVar2.P().c(lvhVar);
                        return new dpth(lvjVar2, lvhVar, dpttVar2);
                    }
                };
                hmwVar2.af(objS);
            }
            hmwVar2.ab();
            hob.c(dpttVar, (fdap) objS, hmlVarC);
            Object objS2 = hmwVar2.S();
            Object obj = hmk.a;
            if (objS2 == obj) {
                objS2 = hob.a(fcyi.a, hmlVarC);
                hmwVar2.af(objS2);
            }
            final fdjx fdjxVar = (fdjx) objS2;
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar2.S();
            if (objS3 == obj) {
                objS3 = new dptq();
                hmwVar2.af(objS3);
            }
            final dptq dptqVar2 = (dptq) objS3;
            hmwVar2.ab();
            hmlVarC.v(1849434622);
            Object objS4 = hmwVar2.S();
            if (objS4 == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar2.af(hplVar);
                objS4 = hplVar;
            }
            hox hoxVar2 = (hox) objS4;
            hmwVar2.ab();
            hmlVarC.v(5004770);
            boolean zF2 = hmlVarC.F(exoPlayer);
            Object objS5 = hmwVar2.S();
            if (zF2 || objS5 == obj) {
                objS5 = new fdap() { // from class: dpsm
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
                        Context context = (Context) obj2;
                        context.getClass();
                        SurfaceView surfaceView = new SurfaceView(context);
                        ohi ohiVar = new ohi(context);
                        ohiVar.setKeepScreenOn(true);
                        AspectRatioFrameLayout aspectRatioFrameLayout = ohiVar.b;
                        mee.g(aspectRatioFrameLayout);
                        aspectRatioFrameLayout.b(3);
                        mee.c(true);
                        ohiVar.setClickable(ohiVar.hasOnClickListeners());
                        if (ohiVar.m) {
                            ohiVar.m = false;
                            if (ohiVar.r()) {
                                ohiVar.g.d(ohiVar.l);
                            } else {
                                ogh oghVar = ohiVar.g;
                                if (oghVar != null) {
                                    oghVar.b();
                                    oghVar.d(null);
                                }
                            }
                            ohiVar.j();
                        }
                        mcg mcgVar = exoPlayer;
                        mee.c(Looper.myLooper() == Looper.getMainLooper());
                        mee.a(mcgVar == null || ((mrn) mcgVar).k == Looper.getMainLooper());
                        mcg mcgVar2 = ohiVar.l;
                        if (mcgVar2 != mcgVar) {
                            if (mcgVar2 != null) {
                                mcgVar2.P(ohiVar.a);
                                if (mcgVar2.m(27)) {
                                    View view = ohiVar.d;
                                    if (view instanceof SurfaceView) {
                                        mcgVar2.N((SurfaceView) view);
                                    }
                                }
                                Class cls = ohiVar.i;
                                if (cls != null && cls.isAssignableFrom(mcgVar2.getClass())) {
                                    try {
                                        Method method = ohiVar.j;
                                        mee.f(method);
                                        method.invoke(mcgVar2, null);
                                    } catch (IllegalAccessException | InvocationTargetException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                            }
                            SubtitleView subtitleView = ohiVar.f;
                            if (subtitleView != null) {
                                subtitleView.a(null);
                            }
                            ohiVar.l = mcgVar;
                            if (ohiVar.r()) {
                                ohiVar.g.d(mcgVar);
                            }
                            ohiVar.i();
                            ohiVar.l();
                            ohiVar.m(true);
                            if (mcgVar != null) {
                                if (mcgVar.m(27)) {
                                    View view2 = ohiVar.d;
                                    if (view2 instanceof SurfaceView) {
                                        mcgVar.U((SurfaceView) view2);
                                    }
                                    if (mcgVar.m(30)) {
                                        mcs mcsVarJ = mcgVar.J();
                                        int i4 = 0;
                                        loop0: while (true) {
                                            ekgb ekgbVar = mcsVarJ.b;
                                            if (i4 >= ekgbVar.size()) {
                                                break;
                                            }
                                            if (((mcr) ekgbVar.get(i4)).a() == 2) {
                                                mcr mcrVar = (mcr) ekgbVar.get(i4);
                                                for (int i5 = 0; i5 < mcrVar.c.length; i5++) {
                                                    if (mcrVar.d(i5)) {
                                                        break loop0;
                                                    }
                                                }
                                            }
                                            i4++;
                                        }
                                    } else {
                                        ohiVar.h();
                                    }
                                }
                                if (subtitleView != null && mcgVar.m(28)) {
                                    subtitleView.a(mcgVar.L().b);
                                }
                                mcgVar.M(ohiVar.a);
                                Class cls2 = ohiVar.i;
                                if (cls2 != null && cls2.isAssignableFrom(mcgVar.getClass())) {
                                    try {
                                        Method method2 = ohiVar.j;
                                        mee.f(method2);
                                        Object obj3 = ohiVar.k;
                                        mee.f(obj3);
                                        method2.invoke(mcgVar, obj3);
                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                        throw new RuntimeException(e2);
                                    }
                                }
                                ohiVar.e(false);
                            } else {
                                ohiVar.c();
                            }
                        }
                        mcgVar.getClass();
                        mcgVar.U(surfaceView);
                        return surfaceView;
                    }
                };
                hmwVar2.af(objS5);
            }
            fdap fdapVar = (fdap) objS5;
            hmwVar2.ab();
            hmlVarC.v(-1224400529);
            int i4 = i2;
            boolean zF3 = hmlVarC.F(fdjxVar) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((i4 & 57344) == 16384) | hmlVarC.F(dptqVar2);
            Object objS6 = hmwVar2.S();
            if (zF3 || objS6 == obj) {
                hoxVar = hoxVar2;
                hmwVar = hmwVar2;
                fdap fdapVar2 = new fdap() { // from class: dpsn
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        SurfaceView surfaceView = (SurfaceView) obj2;
                        surfaceView.getClass();
                        hox hoxVar3 = hoxVar;
                        if (z2 && !z && dptsVar == null) {
                            fdil.d(fdjxVar, null, null, new dptg(surfaceView, dptqVar2, hoxVar3, null), 3);
                        } else {
                            dpti.e(hoxVar3, false);
                        }
                        return fctx.a;
                    }
                };
                dptqVar = dptqVar2;
                hmwVar.af(fdapVar2);
                objS6 = fdapVar2;
            } else {
                dptqVar = dptqVar2;
                hoxVar = hoxVar2;
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            kli.b(fdapVar, icsVar2, (fdap) objS6, hmlVarC, (i4 << 3) & 112, 0);
            if (((Boolean) hoxVar.a()).booleanValue()) {
                dnc.b((ijp) dptqVar.c.a(), null, icsVar, null, null, hmlVarC, ((i4 << 6) & 896) | 48, 248);
                hmlVarC = hmlVarC;
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpso
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar3 = icsVar;
                    dptt dpttVar2 = dpttVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    dpti.i(icsVar3, dpttVar2, z3, z4, dptsVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final /* synthetic */ String j(long j, hml hmlVar) {
        hmlVar.v(-594652735);
        StringBuilder sb = new StringBuilder();
        LocaleList locales = ((Configuration) hmlVar.e(AndroidCompositionLocals_androidKt.a)).getLocales();
        locales.getClass();
        String strL = mgb.L(sb, new Formatter(sb, locales.size() > 0 ? locales.get(0) : Locale.getDefault()), j);
        strL.getClass();
        hmlVar.o();
        return strL;
    }

    public static final void k(final dplv dplvVar, final ics icsVar, final dpto dptoVar, final boolean z, final fdap fdapVar, final fdav fdavVar, hml hmlVar, final int i) {
        dplv dplvVar2;
        int i2;
        fdap fdapVar2;
        dptoVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1729289080);
        if (i3 == 0) {
            dplvVar2 = dplvVar;
            i2 = (true != hmlVarC.F(dplvVar2) ? 2 : 4) | i;
        } else {
            dplvVar2 = dplvVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dptoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            fdapVar2 = fdapVar;
            i4 |= true != hmlVarC.F(fdapVar2) ? 65536 : 131072;
        } else {
            fdapVar2 = fdapVar;
        }
        if ((1572864 & i) == 0) {
            i4 |= true != hmlVarC.F(fdavVar) ? 524288 : 1048576;
        }
        if ((i4 & 599187) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = joj.a(icsVar, "LocalVideoRenderer");
            hmlVarC.v(-1066585843);
            hmlVarC.v(-487940011);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new kpv(kioVar);
                hmwVar.af(objS);
            }
            kpv kpvVar = (kpv) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new kph();
                hmwVar.af(objS2);
            }
            kph kphVar = (kph) objS2;
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS3 = hplVar;
            }
            hox hoxVar = (hox) objS3;
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                objS4 = new kpo(kphVar);
                hmwVar.af(objS4);
            }
            kpo kpoVar = (kpo) objS4;
            Object objS5 = hmwVar.S();
            if (objS5 == obj) {
                hpl hplVar2 = new hpl(fctx.a, hpb.a);
                hmwVar.af(hplVar2);
                objS5 = hplVar2;
            }
            hox hoxVar2 = (hox) objS5;
            boolean zF = hmlVarC.F(kpvVar) | hmlVarC.B(257);
            Object objS6 = hmwVar.S();
            if (zF || objS6 == obj) {
                objS6 = new dpss(hoxVar2, kpvVar, kpoVar, hoxVar);
                hmwVar.af(objS6);
            }
            ixm ixmVar = (ixm) objS6;
            Object objS7 = hmwVar.S();
            if (objS7 == obj) {
                objS7 = new dpst(hoxVar, kpoVar);
                hmwVar.af(objS7);
            }
            boolean zF2 = hmlVarC.F(kpvVar);
            Object objS8 = hmwVar.S();
            if (zF2 || objS8 == obj) {
                objS8 = new dpsu(kpvVar);
                hmwVar.af(objS8);
            }
            iwh.b(jsh.c(icsVarA, false, (fdap) objS8), hxe.d(-1759682870, new dpsv(hoxVar2, kphVar, dplvVar2, dptoVar, z, fdapVar2, fdavVar), hmlVarC), ixmVar, hmlVarC, 48);
            hmwVar.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpsp
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dplv dplvVar3 = dplvVar;
                    ics icsVar2 = icsVar;
                    dpto dptoVar2 = dptoVar;
                    boolean z2 = z;
                    fdap fdapVar3 = fdapVar;
                    dpti.k(dplvVar3, icsVar2, dptoVar2, z2, fdapVar3, fdavVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

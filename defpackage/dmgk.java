package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmgk {
    public static final dia a(Duration duration, des desVar) {
        return dea.c((int) duration.toMillis(), 0, desVar, 2);
    }

    public static final void b(final Integer num, hml hmlVar, final int i, final int i2) {
        int i3;
        hml hmlVarC = hmlVar.c(319757845);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(num) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (1 == i2) {
                num = null;
            }
            final Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(context) | ((i3 & 14) == 4);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: dmds
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((hny) obj).getClass();
                        Activity activityB = dpgx.b(context);
                        int requestedOrientation = activityB.getRequestedOrientation();
                        Integer num2 = num;
                        if (num2 != null) {
                            num2.intValue();
                            activityB.setRequestedOrientation(1);
                        } else {
                            activityB.setRequestedOrientation(14);
                        }
                        return new dmeo(activityB, requestedOrientation);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.c(num, (fdap) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmdt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmgk.b(num, (hml) obj, hpy.a(i4 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dmhi dmhiVar, hml hmlVar, final int i) {
        int i2;
        ddp ddpVar;
        hox hoxVar;
        long j;
        hmw hmwVar;
        int i3;
        Object obj;
        final boolean z;
        final sgd sgdVar;
        hml hmlVar2;
        hmw hmwVar2;
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(-250248083);
        if (i4 == 0) {
            i2 = i | (true != hmlVarC.D(dmhiVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            int i5 = i2 & 14;
            e(dmhiVar, hmlVarC, i5);
            sgd sgdVarA = sgg.a(hmlVarC);
            long j2 = dlv.a(hmlVarC) ? ije.a : ije.d;
            long jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.96f, ije.f(j2));
            boolean z2 = !dlv.a(hmlVarC);
            hmlVarC.v(5004770);
            hmw hmwVar3 = (hmw) hmlVarC;
            Object objS = hmwVar3.S();
            if (i5 == 4 || objS == hmk.a) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar3.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar2 = (hox) objS;
            hmwVar3.ab();
            hmlVarC.v(-1346940673);
            Configuration configuration = (Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a);
            float fMin = Math.min(configuration.screenWidthDp, configuration.screenHeightDp / 2);
            hmwVar3.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar3.S();
            Object obj2 = hmk.a;
            if (objS2 == obj2) {
                objS2 = ddq.a(0.0f);
                hmwVar3.af(objS2);
            }
            ddp ddpVar2 = (ddp) objS2;
            hmwVar3.ab();
            Object objS3 = hmwVar3.S();
            if (objS3 == obj2) {
                objS3 = hob.a(fcyi.a, hmlVarC);
                hmwVar3.af(objS3);
            }
            final fdjx fdjxVar = (fdjx) objS3;
            if (Build.VERSION.SDK_INT >= 35) {
                hmlVarC.v(923152505);
                Duration duration = dmcc.a;
                koa koaVar = dmcc.d;
                hmlVarC.v(-1633490746);
                boolean zF = (i5 == 4) | hmlVarC.F(fdjxVar);
                Object objS4 = hmwVar3.S();
                if (zF || objS4 == obj2) {
                    objS4 = new fdae() { // from class: dmdz
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdil.d(fdjxVar, null, null, new dmep(dmhiVar, null), 3);
                            return fctx.a;
                        }
                    };
                    hmwVar3.af(objS4);
                }
                hmwVar3.ab();
                hoxVar = hoxVar2;
                ddpVar = ddpVar2;
                hmlVar2 = hmlVarC;
                kna.b(koaVar, (fdae) objS4, new koc(512, true, false), hxe.d(1300872678, new dmes(ddpVar, jF, dmhiVar, fMin, hoxVar), hmlVarC), hmlVar2, 3456, 0);
                hmwVar3.ab();
                obj = obj2;
                i3 = -1633490746;
                hmwVar = hmwVar3;
                sgdVar = sgdVarA;
                j = jF;
                z = z2;
            } else {
                ddpVar = ddpVar2;
                hmlVarC.v(923691099);
                iby ibyVar = ibw.e;
                hmlVarC.v(-1633490746);
                boolean zF2 = hmlVarC.F(fdjxVar) | (i5 == 4);
                Object objS5 = hmwVar3.S();
                if (zF2 || objS5 == obj2) {
                    objS5 = new fdae() { // from class: dmec
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdil.d(fdjxVar, null, null, new dmet(dmhiVar, null), 3);
                            return fctx.a;
                        }
                    };
                    hmwVar3.af(objS5);
                }
                hmwVar3.ab();
                hoxVar = hoxVar2;
                j = jF;
                hmwVar = hmwVar3;
                i3 = -1633490746;
                obj = obj2;
                z = z2;
                sgdVar = sgdVarA;
                kna.c(ibyVar, 0L, (fdae) objS5, new koc(true, true, 8), hxe.d(814122702, new dmew(ddpVar, j, dmhiVar, fMin, hoxVar), hmlVarC), hmlVarC, 27654, 2);
                hmlVar2 = hmlVarC;
                hmwVar.ab();
            }
            Object objD = ddpVar.d();
            hmlVar2.v(-1224400529);
            boolean zD = hmlVar2.D(sgdVar) | hmlVar2.C(j) | hmlVar2.F(ddpVar) | hmlVar2.E(z);
            Object objS6 = hmwVar.S();
            if (zD || objS6 == obj) {
                dmex dmexVar = new dmex(sgdVar, j, ddpVar, z, null);
                hmwVar2 = hmwVar;
                hmwVar2.af(dmexVar);
                objS6 = dmexVar;
            } else {
                hmwVar2 = hmwVar;
            }
            hmwVar2.ab();
            hob.g(objD, (fdat) objS6, hmlVar2);
            Boolean boolValueOf = Boolean.valueOf(f(hoxVar));
            hmlVar2.v(i3);
            boolean zF3 = hmlVar2.F(ddpVar) | hmlVar2.D(hoxVar);
            Object objS7 = hmwVar2.S();
            if (zF3 || objS7 == obj) {
                objS7 = new dmey(ddpVar, hoxVar, null);
                hmwVar2.af(objS7);
            }
            hmwVar2.ab();
            hob.g(boolValueOf, (fdat) objS7, hmlVar2);
            fctx fctxVar = fctx.a;
            hmlVar2.v(i3);
            boolean zD2 = hmlVar2.D(sgdVar) | hmlVar2.E(z);
            Object objS8 = hmwVar2.S();
            if (zD2 || objS8 == obj) {
                objS8 = new fdap() { // from class: dmed
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((hny) obj3).getClass();
                        return new dmez(sgdVar, z);
                    }
                };
                hmwVar2.af(objS8);
            }
            hmwVar2.ab();
            hob.c(fctxVar, (fdap) objS8, hmlVar2);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmee
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    int i6 = i;
                    dmgk.c(dmhiVar, (hml) obj3, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ddp ddpVar, final Duration duration, final ddp ddpVar2, final ddp ddpVar3, final ddp ddpVar4, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(452075919);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(ddpVar) : hmlVarC.F(ddpVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(duration) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(ddpVar2) : hmlVarC.F(ddpVar2)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? hmlVarC.D(ddpVar3) : hmlVarC.F(ddpVar3)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? hmlVarC.D(ddpVar4) : hmlVarC.F(ddpVar4)) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            fctx fctxVar = fctx.a;
            hmlVarC.v(-1224400529);
            boolean zF = ((i2 & 14) == 4 || ((i2 & 8) != 0 && hmlVarC.F(ddpVar))) | hmlVarC.F(duration) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && hmlVarC.F(ddpVar3))) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && hmlVarC.F(ddpVar2)));
            if ((57344 & i2) != 16384 && ((i2 & 32768) == 0 || !hmlVarC.F(ddpVar4))) {
                z = false;
            }
            boolean z2 = zF | z;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (z2 || objS == hmk.a) {
                dmgi dmgiVar = new dmgi(ddpVar, duration, ddpVar3, ddpVar2, ddpVar4, null);
                hmwVar.af(dmgiVar);
                objS = dmgiVar;
            }
            hmwVar.ab();
            hob.g(fctxVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmdv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ddp ddpVar5 = ddpVar;
                    Duration duration2 = duration;
                    ddp ddpVar6 = ddpVar2;
                    ddp ddpVar7 = ddpVar3;
                    dmgk.d(ddpVar5, duration2, ddpVar6, ddpVar7, ddpVar4, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dmhi dmhiVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2030580212);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dmhiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            hmlVarC.v(-1565857394);
            Configuration configuration = (Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a);
            boolean z = configuration.screenWidthDp < 600 || configuration.screenHeightDp < 480;
            hmwVar.ab();
            if (z) {
                hmlVarC.v(1599421517);
                b(1, hmlVarC, 6, 0);
                hmwVar.ab();
            } else {
                hmlVarC.v(1599498645);
                b(null, hmlVarC, 0, 1);
                hmwVar.ab();
            }
            lva lvaVar = lva.ON_PAUSE;
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(fdjxVar) | ((i2 & 14) == 4);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new fdae() { // from class: dmdx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdil.d(fdjxVar, null, null, new dmgj(dmhiVar, null), 3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            lyh.a(lvaVar, null, (fdae) objS2, hmlVarC, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmdy
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    dmgk.e(dmhiVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean f(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    public static final void g(final dmhi dmhiVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        Object obj;
        final jfw jfwVar;
        ddp ddpVar;
        int i3;
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(-2025522367);
        if (i4 == 0) {
            i2 = i | (true != hmlVarC.D(dmhiVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            Object obj2 = hmk.a;
            if (objS == obj2) {
                objS = ddq.a(0.0f);
                hmwVar2.af(objS);
            }
            final ddp ddpVar2 = (ddp) objS;
            hmwVar2.ab();
            lvj lvjVar = (lvj) hmlVarC.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar2.S();
            if (objS2 == obj2) {
                objS2 = new jfw();
                hmwVar2.af(objS2);
            }
            final jfw jfwVar2 = (jfw) objS2;
            hmwVar2.ab();
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(ddpVar2);
            Object objS3 = hmwVar2.S();
            if (zF || objS3 == obj2) {
                objS3 = new fdap() { // from class: dmef
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ikl iklVar = (ikl) obj3;
                        iklVar.getClass();
                        ddp ddpVar3 = ddpVar2;
                        iklVar.x(((Number) ddpVar3.d()).floatValue());
                        iklVar.y(((Number) ddpVar3.d()).floatValue());
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS3);
            }
            hmwVar2.ab();
            ics icsVarA = ijn.a(icsVar, (fdap) objS3);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dmdp.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
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
            edf edfVar = edf.a;
            fdau fdauVarD = dmhiVar.d();
            hmlVarC.v(-1746271574);
            boolean zF2 = ((i2 & 14) == 4) | hmlVarC.F(lvjVar) | hmlVarC.F(jfwVar2);
            Object objS4 = hmwVar2.S();
            if (zF2 || objS4 == obj2) {
                objS4 = new dmek(dmhiVar, lvjVar, jfwVar2, null);
                hmwVar2.af(objS4);
            }
            hmwVar2.ab();
            hob.g(fdauVarD, (fdat) objS4, hmlVarC);
            hmlVarC.v(1849434622);
            Object objS5 = hmwVar2.S();
            if (objS5 == obj2) {
                objS5 = new fdap() { // from class: dmeg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        Context context = (Context) obj3;
                        context.getClass();
                        return new PreviewView(context);
                    }
                };
                hmwVar2.af(objS5);
            }
            fdap fdapVar = (fdap) objS5;
            hmwVar2.ab();
            ico icoVar = ics.e;
            iby ibyVar = ibw.e;
            ics icsVarA2 = edfVar.a(icoVar, ibyVar);
            evm evmVar = evn.a;
            ics icsVarA3 = dihi.a(dkr.c(egq.c(iex.a(icsVarA2, evmVar), 1.0f), 0.0f, ijg.d(4287533455L), evmVar), jqu.b(R.string.popup_camera_preview_content_description, hmlVarC), true);
            hmlVarC.v(5004770);
            boolean zF3 = hmlVarC.F(jfwVar2);
            Object objS6 = hmwVar2.S();
            if (zF3 || objS6 == obj2) {
                objS6 = new fdap() { // from class: dmeh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        PreviewView previewView = (PreviewView) obj3;
                        previewView.getClass();
                        previewView.d(2);
                        jfwVar2.a = previewView;
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS6);
            }
            hmwVar2.ab();
            kli.b(fdapVar, icsVarA3, (fdap) objS6, hmlVarC, 6, 0);
            hmlVarC.v(338642734);
            if (!(dmhiVar instanceof dmhc) || ((dmhc) dmhiVar).c == null) {
                hmwVar = hmwVar2;
                obj = obj2;
                jfwVar = jfwVar2;
                ddpVar = ddpVar2;
                i3 = 5004770;
            } else {
                ics icsVarC = egq.c(iex.a(edfVar.a(icoVar, ibyVar), evmVar), 1.0f);
                long j = ije.a;
                ecz.b(idb.a(dkl.a(icsVarC, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.3f, ije.f(j)), ikj.a), 1.0f), hmlVarC, 0);
                final String strB = jqu.b(R.string.popup_camera_countdown_text_content_description, hmlVarC);
                qrs qrsVarD = qsm.d(new qrx(R.raw.countdown_lottie), hmlVarC);
                ics icsVarA4 = idb.a(iex.a(edfVar.a(egq.c(icoVar, 1.0f), ibyVar), evmVar), 2.0f);
                hmlVarC.v(5004770);
                boolean zD = hmlVarC.D(strB);
                Object objS7 = hmwVar2.S();
                if (zD || objS7 == obj2) {
                    objS7 = new fdap() { // from class: dmei
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            jto jtoVar = (jto) obj3;
                            jtoVar.getClass();
                            jtk.k(jtoVar, strB);
                            return fctx.a;
                        }
                    };
                    hmwVar2.af(objS7);
                }
                hmwVar2.ab();
                ics icsVarC2 = jsh.c(icsVarA4, false, (fdap) objS7);
                i3 = 5004770;
                ddpVar = ddpVar2;
                obj = obj2;
                jfwVar = jfwVar2;
                hmwVar = hmwVar2;
                qrj.c(qrsVarD.a(), icsVarC2, false, false, null, 1.05f, 0, 0, null, null, null, false, hmlVarC, 196608, 0, 262108);
                hmlVarC = hmlVarC;
            }
            hmwVar.ab();
            fctx fctxVar = fctx.a;
            hmlVarC.v(i3);
            boolean zF4 = hmlVarC.F(jfwVar);
            Object objS8 = hmwVar.S();
            if (zF4 || objS8 == obj) {
                objS8 = new fdap() { // from class: dmej
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((hny) obj3).getClass();
                        return new dmem(jfwVar);
                    }
                };
                hmwVar.af(objS8);
            }
            hmwVar.ab();
            hob.c(fctxVar, (fdap) objS8, hmlVarC);
            hmlVarC.n();
            hmlVarC.v(i3);
            boolean zF5 = hmlVarC.F(ddpVar);
            Object objS9 = hmwVar.S();
            if (zF5 || objS9 == obj) {
                objS9 = new dmel(ddpVar, null);
                hmwVar.af(objS9);
            }
            hmwVar.ab();
            hob.g(fctxVar, (fdat) objS9, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmdq
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dmhi dmhiVar2 = dmhiVar;
                    int i5 = i;
                    dmgk.g(dmhiVar2, icsVar, (hml) obj3, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final dmhi dmhiVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1836417432);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dmhiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 & 112;
            if (dmhiVar instanceof dmgw) {
                hmlVarC.v(581858241);
                i((dmgw) dmhiVar, icsVar, hmlVarC, i4);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(581920954);
                g(dmhiVar, icsVar, hmlVarC, i2 & 126);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmdw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmhi dmhiVar2 = dmhiVar;
                    int i5 = i;
                    dmgk.h(dmhiVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final dmgw dmgwVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1893418027);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dmgwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = ddq.a(1.0f);
                hmwVar.af(objS);
            }
            ddp ddpVar = (ddp) objS;
            hmwVar.ab();
            float fFloatValue = ((Number) ddpVar.d()).floatValue();
            ics icsVarA = ifj.a(icsVar, fFloatValue, fFloatValue);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dmdp.a(hmg.b(hmlVarC));
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
            Uri uri = Uri.parse(dmgwVar.b.b);
            String strB = jqu.b(R.string.popup_camera_gif_viewer_content_description, hmlVarC);
            ico icoVar = ics.e;
            evm evmVar = evn.a;
            djrv.a(uri, strB, dkr.c(egq.c(iex.a(icoVar, evmVar), 1.0f), 0.0f, ijg.d(4287533455L), evmVar), null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, hmlVarC, 0, 0, 524280);
            hmlVar2 = hmlVarC;
            hmlVar2.n();
            fctx fctxVar = fctx.a;
            hmlVar2.v(-1633490746);
            boolean zF = hmlVar2.F(ddpVar);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new dmen(ddpVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hob.g(fctxVar, (fdat) objS2, hmlVar2);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmdu
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dmgw dmgwVar2 = dmgwVar;
                    int i4 = i;
                    dmgk.i(dmgwVar2, icsVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final dmhi dmhiVar, final float f, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1537689622);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dmhiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarC = egq.c(ics.e, 1.0f);
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
                objS6 = new dmfw(hoxVar2, kpvVar, kpoVar, hoxVar);
                hmwVar.af(objS6);
            }
            ixm ixmVar = (ixm) objS6;
            Object objS7 = hmwVar.S();
            if (objS7 == obj) {
                objS7 = new dmfx(hoxVar, kpoVar);
                hmwVar.af(objS7);
            }
            boolean zF2 = hmlVarC.F(kpvVar);
            Object objS8 = hmwVar.S();
            if (zF2 || objS8 == obj) {
                objS8 = new dmfy(kpvVar);
                hmwVar.af(objS8);
            }
            iwh.b(jsh.c(icsVarC, false, (fdap) objS8), hxe.d(-1759682870, new dmga(hoxVar2, kphVar, dmhiVar, f, fdaeVar), hmlVarC), ixmVar, hmlVarC, 48);
            hmwVar.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmdr
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dmhi dmhiVar2 = dmhiVar;
                    float f2 = f;
                    int i4 = i;
                    dmgk.j(dmhiVar2, f2, fdaeVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final String str, final boolean z, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2049818465);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new dfw(false);
                hmwVar.af(objS);
            }
            dfw dfwVar = (dfw) objS;
            hmwVar.ab();
            dfwVar.d(Boolean.valueOf(z));
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: dmea
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(((Integer) obj2).intValue() / 2);
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            icsVar2 = icsVar;
            cye.a(dfwVar, icsVar2, dae.r((fdap) objS2).a(dae.l(null, 3)), dae.m(null, 3), null, hxe.d(931258937, new dmgb(str), hmlVarC), hmlVarC, ((i2 >> 3) & 112) | 200064, 16);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmeb
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    boolean z2 = z;
                    int i4 = i;
                    dmgk.k(str2, z2, icsVar2, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

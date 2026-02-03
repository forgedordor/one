package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dirw {
    public static final void a(final diqi diqiVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2143150952);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diqiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            c(diqiVar.c, diqiVar.d, diqiVar.e, null, 0L, 0L, 0.0f, 0.0f, hxe.d(561251407, new dirm(diqiVar), hmlVarC), hmlVarC, 100663296, 248);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diri
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dirw.a(diqiVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final diqp diqpVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1358968908);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diqpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (diqpVar instanceof diqn) {
            hmlVarC.v(-299058382);
            k((diqn) diqpVar, fdaeVar, hmlVarC, i2 & 112);
            ((hmw) hmlVarC).ab();
        } else if (diqpVar instanceof diqj) {
            hmlVarC.v(-299056106);
            d((diqj) diqpVar, fdaeVar, hmlVarC, i2 & 112);
            ((hmw) hmlVarC).ab();
        } else if (diqpVar instanceof diqm) {
            hmlVarC.v(-299053701);
            j((diqm) diqpVar, fdaeVar, hmlVarC, i2 & 112);
            ((hmw) hmlVarC).ab();
        } else if (diqpVar instanceof diqk) {
            hmlVarC.v(-299051414);
            e((diqk) diqpVar, hmlVarC, 0);
            ((hmw) hmlVarC).ab();
        } else if (diqpVar instanceof diql) {
            hmlVarC.v(-299049588);
            f((diql) diqpVar, hmlVarC, 0);
            ((hmw) hmlVarC).ab();
        } else if (diqpVar instanceof diqo) {
            hmlVarC.v(-299047799);
            l((diqo) diqpVar, hmlVarC, 0);
            ((hmw) hmlVarC).ab();
        } else {
            if (!(diqpVar instanceof diqi)) {
                hmlVarC.v(-299059450);
                ((hmw) hmlVarC).ab();
                throw new fctg();
            }
            hmlVarC.v(-299045938);
            a((diqi) diqpVar, hmlVarC, 0);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diqw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diqp diqpVar2 = diqpVar;
                    int i4 = i;
                    dirw.b(diqpVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final int r21, final java.lang.String r22, final defpackage.dirz r23, defpackage.ics r24, long r25, long r27, float r29, float r30, final defpackage.fdau r31, defpackage.hml r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dirw.c(int, java.lang.String, dirz, ics, long, long, float, float, fdau, hml, int, int):void");
    }

    public static final void d(final diqj diqjVar, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2120580246);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diqjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            g(djrr.bb, diqjVar.a, 0, diqjVar.b, null, fdaeVar2, hmlVarC, ((i2 << 12) & 458752) | 6, 16);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diqr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diqj diqjVar2 = diqjVar;
                    int i4 = i;
                    dirw.d(diqjVar2, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final diqk diqkVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1352888872);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diqkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (diqkVar.a.length() == 0) {
            hmlVarC.v(60829561);
            String str = diqkVar.c;
            int i4 = diqkVar.b;
            dirz dirzVar = diqkVar.d;
            int i5 = dirzVar.a;
            djrr djrrVar = djrr.bR;
            ije ijeVar = new ije(s(i5, dljt.g(hmlVarC), hmlVarC));
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdae() { // from class: diqx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            g(djrrVar, str, i4, dirzVar, ijeVar, (fdae) objS, hmlVarC, 196614, 0);
            hmwVar.ab();
        } else {
            hmlVarC.v(61103694);
            c(diqkVar.b, diqkVar.c, diqkVar.d, null, 0L, 0L, 0.0f, 0.0f, hxe.d(949466419, new dirr(diqkVar), hmlVarC), hmlVarC, 100663296, 248);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dirb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dirw.e(diqkVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final diql diqlVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1329682360);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diqlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = diqlVar.c;
            String str = diqlVar.d;
            dirz dirzVar = diqlVar.e;
            int i5 = dirzVar.b;
            float fT = t(i5, hmlVarC);
            float f = diqlVar.b;
            c(i4, str, dirzVar, null, 0L, 0L, fT * f, t(i5, hmlVarC) * f, hxe.d(1393668847, new dirs(diqlVar), hmlVarC), hmlVarC, 100663296, 56);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diqs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dirw.f(diqlVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.djrr r18, final java.lang.String r19, final int r20, final defpackage.dirz r21, defpackage.ije r22, final defpackage.fdae r23, defpackage.hml r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dirw.g(djrr, java.lang.String, int, dirz, ije, fdae, hml, int, int):void");
    }

    public static final void h(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-929465029);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            djrv.a(Uri.parse(str), null, efy.d(ics.e, 0.5f), null, null, null, iuz.b, null, 0.0f, null, null, null, null, null, null, null, hmlVar2, 12583344, 0, 524152);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diqt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dirw.h(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1680758493);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, dihi.c(ics.e), ((ije) hmlVarC.e(gea.a)).i, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, q(hmlVarC), hmlVar2, i2 & 14, 0, 65016);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dird
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dirw.i(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final diqm diqmVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1226331052);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diqmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final jmj jmjVar = (jmj) hmlVarC.e(jmh.k);
            final Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            final View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            String str = diqmVar.a;
            dirz dirzVar = diqmVar.b;
            djrr djrrVar = djrr.dC;
            hmlVarC.v(-1224400529);
            boolean zD = hmlVarC.D(jmjVar) | hmlVarC.F(context) | hmlVarC.F(view);
            boolean z = (i2 & 112) == 32;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | zD) || objS == hmk.a) {
                objS = new fdae() { // from class: dirg
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        jmj jmjVar2 = jmjVar;
                        if (jmjVar2 != null) {
                            Context context2 = context;
                            jmjVar2.a();
                            InputMethodManager inputMethodManager = (InputMethodManager) context2.getSystemService(InputMethodManager.class);
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                            }
                        }
                        fdaeVar.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            g(djrrVar, str, 0, dirzVar, null, (fdae) objS, hmlVarC, 6, 16);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dirh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diqm diqmVar2 = diqmVar;
                    int i4 = i;
                    dirw.j(diqmVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final diqn diqnVar, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1774718724);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diqnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            g(djrr.dX, diqnVar.a, 0, diqnVar.b, null, fdaeVar2, hmlVarC, ((i2 << 12) & 458752) | 6, 16);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diqv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diqn diqnVar2 = diqnVar;
                    int i4 = i;
                    dirw.k(diqnVar2, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final diqo diqoVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(374984922);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diqoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            jyk jykVarA = jyl.a(hmlVarC);
            String str = diqoVar.b;
            dirz dirzVar = diqoVar.c;
            c(0, str, dirzVar, null, 0L, 0L, Math.max(((int) (((int) (jyk.a(jykVarA, diqoVar.a, q(hmlVarC), 0, 0, 0L, 1020).c >> 32)) / Resources.getSystem().getDisplayMetrics().density)) + (t(dirzVar.b, hmlVarC) - r(8, hmlVarC)), r(40, hmlVarC)), 0.0f, hxe.d(1736483153, new diru(diqoVar), hmlVarC), hmlVarC, 100663296, 184);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dirf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dirw.l(diqoVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void m(final diqh diqhVar, hml hmlVar, final int i) {
        int i2;
        Object obj;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1447191808);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diqhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            fdae fdaeVar = diqhVar.c;
            ico icoVar = ics.e;
            hmlVarC.v(1849434622);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            Object obj2 = hmk.a;
            if (objS == obj2) {
                objS = new ebk();
                hmwVar2.af(objS);
            }
            hmwVar2.ab();
            ics icsVarB = dihi.b(dli.c(icoVar, (ebk) objS, null, false, null, null, fdaeVar, 20));
            ixm ixmVarA = egk.a(ecr.g(8.0f), ibw.m, hmlVarC, 6);
            int iA = diqq.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarB);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
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
            hsk.b(hmlVarC, icsVarB2, jbb.c);
            diih diihVar = diqhVar.b;
            if (diihVar != null) {
                hmlVarC.v(-1515461608);
                kio kioVar = (kio) hmlVarC.e(jmh.e);
                List list = diqhVar.a;
                hmlVarC.v(-1633490746);
                boolean z = (i2 & 112) == 32;
                boolean zD = hmlVarC.D(kioVar) | z;
                Object objS2 = hmwVar2.S();
                if (zD || objS2 == obj2) {
                    objS2 = new fdap() { // from class: diqy
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            ((Integer) obj3).intValue();
                            return dae.l(null, 3).a(dae.n(null, 0.0f, 0L, 7)).a(dap.a);
                        }
                    };
                    hmwVar2.af(objS2);
                }
                fdap fdapVar = (fdap) objS2;
                hmwVar2.ab();
                hmlVarC.v(-1633490746);
                boolean zD2 = z | hmlVarC.D(kioVar);
                Object objS3 = hmwVar2.S();
                if (zD2 || objS3 == obj2) {
                    objS3 = new fdap() { // from class: diqz
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            ((Integer) obj3).intValue();
                            return dae.m(null, 3).a(dae.o(null, 0.0f, 0L, 7)).a(dar.a);
                        }
                    };
                    hmwVar2.af(objS3);
                }
                hmwVar2.ab();
                obj = obj2;
                hmwVar = hmwVar2;
                diig.b(list, diihVar, fdapVar, (fdap) objS3, null, hxe.d(20149687, new dirn(diqhVar), hmlVarC), hmlVarC, 196608);
                hmwVar.ab();
            } else {
                obj = obj2;
                hmwVar = hmwVar2;
                hmlVarC.v(-1513839719);
                Iterator it = diqhVar.a.iterator();
                while (it.hasNext()) {
                    b((diqp) it.next(), fdaeVar, hmlVarC, 0);
                }
                hmwVar.ab();
            }
            hmlVarC.n();
            Integer numValueOf2 = Integer.valueOf(diqhVar.a.size());
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            Object objS4 = hmwVar.S();
            if (i4 == 4 || objS4 == obj) {
                objS4 = new diro(diqhVar, null);
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            hob.g(numValueOf2, (fdat) objS4, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dira
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    int i5 = i;
                    dirw.m(diqhVar, (hml) obj3, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final float o(long j, hml hmlVar) {
        hmlVar.v(1135685962);
        float fEg = ((kio) hmlVar.e(jmh.e)).eg(j);
        hmlVar.o();
        return fEg;
    }

    public static final void p(final dirx dirxVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        ics icsVarA;
        hml hmlVarC = hmlVar.c(-486407539);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dirxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = dirxVar.b;
            if (i4 != 1) {
                icsVarA = icsVar.a(i4 == 2 ? efy.j(ics.e, 0.0f, 0.0f, 52.0f, 0.0f, 11) : efy.j(ics.e, 52.0f, 0.0f, 0.0f, 0.0f, 14));
            } else {
                icsVarA = icsVar;
            }
            ixm ixmVarA = egk.a(ecr.g(12.0f), ibw.m, hmlVarC, 6);
            int iA = diqq.a(hmg.b(hmlVarC));
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
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-138045732);
            Iterator it = dirxVar.a.iterator();
            while (it.hasNext()) {
                m((diqh) it.next(), hmlVarC, (i3 >> 3) & 112);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diqu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dirx dirxVar2 = dirxVar;
                    int i5 = i;
                    dirw.p(dirxVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final jyq q(hml hmlVar) {
        hmlVar.v(-429571024);
        jyq jyqVarY = jyq.y((jyq) hmlVar.e(gyj.a), 0L, glz.d(hmlVar).j.g(), null, null, null, null, 0L, null, 0, 0, glz.d(hmlVar).j.g(), null, null, 0, 16646141);
        ((hmw) hmlVar).ab();
        return jyqVarY;
    }

    private static final float r(int i, hml hmlVar) {
        hmlVar.v(-383972475);
        float fO = o(kjm.c(i), hmlVar);
        ((hmw) hmlVar).ab();
        return fO;
    }

    private static final long s(int i, boolean z, hml hmlVar) {
        long j;
        hmlVar.v(1978301337);
        if (i != 1) {
            j = ije.d;
        } else if (z) {
            hmlVar.v(34035814);
            j = glz.a(hmlVar).H;
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(34108199);
            j = glz.a(hmlVar).J;
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return j;
    }

    private static final float t(int i, hml hmlVar) {
        float fO;
        hmlVar.v(678237569);
        if (i - 1 != 0) {
            hmlVar.v(-1048718361);
            long jG = glz.d(hmlVar).d.g();
            kjm.e(jG);
            fO = o(kjm.d(kjl.b(jG), (float) (kjl.a(jG) * 1.13d)), hmlVar);
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(-1048720985);
            fO = o(glz.d(hmlVar).e.g(), hmlVar);
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return fO;
    }
}

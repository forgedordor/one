package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctra {
    public static final int a(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final void b(final ctqg ctqgVar, boolean z, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        final boolean z2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-566364287);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctqgVar) ? 2 : 4) | i;
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
            z2 = z;
        } else {
            dljl dljlVar = dljt.d(hmlVarC).q;
            dap dapVarK = dae.k(dea.c(300, 0, dljt.d(hmlVarC).r.e, 2), null, 14);
            dljl dljlVar2 = dljt.d(hmlVarC).q;
            z2 = z;
            cye.b(z2, null, dapVarK, dae.q(dea.c(300, 0, dljt.d(hmlVarC).r.e, 2), null, 14), null, hxe.d(-1378860967, new ctqr(ctqgVar, icsVar), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 196608, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctql
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ctqg ctqgVar2 = ctqgVar;
                    boolean z3 = z2;
                    int i4 = i;
                    ctra.b(ctqgVar2, z3, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ctqe ctqeVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1510951244);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctqeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            final View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            final jmj jmjVar = (jmj) hmlVarC.e(jmh.k);
            hmlVarC.v(-325188813);
            ics icsVarD = egq.d(icsVar, 1.0f);
            if (ctqeVar.d.a) {
                icsVarD = icsVarD.a(iex.a(efy.j(ics.e, 12.0f, 0.0f, 12.0f, 12.0f, 2), glz.c(hmlVarC).d));
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(-1224400529);
            boolean zD = ((i2 & 14) == 4) | hmlVarC.D(jmjVar) | hmlVarC.F(context) | hmlVarC.F(view);
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdae() { // from class: ctqm
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ctqeVar.c.invoke();
                        ctra.f(jmjVar, context, view);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarA = joj.a(dli.e(icsVarD, false, null, (fdae) objS, 15), "EmergencyStartChatBanner");
            long jL = l(hmlVarC);
            hmlVarC.v(25399912);
            float f = true != dljt.h(hmlVarC) ? 0.0f : 1.0f;
            hmwVar.ab();
            gvk.c(icsVarA, null, jL, 0L, 0.0f, f, null, hxe.d(-1487903985, new ctqv(ctqeVar), hmlVarC), hmlVarC, 90);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctqn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ctqe ctqeVar2 = ctqeVar;
                    int i4 = i;
                    ctra.c(ctqeVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(hml hmlVar, int i) {
        hml hmlVarC = hmlVar.c(1916131773);
        final int i2 = 0;
        if (i != 0) {
            dtfn.a(jqq.a(R.drawable.ic_emergency, hmlVarC, 0), null, egq.k(ics.e, 24.0f), i(hmlVarC), hmlVarC, 384, 0);
            i2 = i;
        } else if (hmlVarC.I()) {
            hmlVarC.s();
        } else {
            i = 0;
            dtfn.a(jqq.a(R.drawable.ic_emergency, hmlVarC, 0), null, egq.k(ics.e, 24.0f), i(hmlVarC), hmlVarC, 384, 0);
            i2 = i;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctqi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ctra.d((hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1234038522);
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
            dthx.b(str, null, i(hmlVar2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).k, hmlVar2, i2 & 14, 0, 65530);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctqp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ctra.e(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(jmj jmjVar, Context context, View view) {
        if (jmjVar != null) {
            jmjVar.a();
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final void g(final ctqg ctqgVar, boolean z, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        final boolean z2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1013695481);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctqgVar) ? 2 : 4) | i;
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
            z2 = z;
        } else {
            z2 = z;
            cye.b(z2, null, dae.n(glz.b(hmlVarC).b(), 0.0f, ikz.a, 2), dae.o(dea.c(0, 0, null, 6), 0.0f, 0L, 6), null, hxe.d(-1826192161, new ctqs(ctqgVar, icsVar), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 199680, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctqq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ctqg ctqgVar2 = ctqgVar;
                    boolean z3 = z2;
                    int i4 = i;
                    ctra.g(ctqgVar2, z3, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final ctqf ctqfVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1033490804);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctqfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            final Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            final View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            final jmj jmjVar = (jmj) hmlVarC.e(jmh.k);
            ics icsVarA = joj.a(ctqfVar.c.a ? egq.d(efy.j(icsVar, 12.0f, 0.0f, 12.0f, 12.0f, 2), 1.0f) : efy.f(icsVar, 16.0f, 14.0f, 16.0f, 12.0f), "EmergencyStartChatButton");
            egc egcVar = dtdc.a;
            gal galVarD = dtdc.d(hmlVarC);
            gal galVarA = galVarD.a(l(hmlVarC), galVarD.b, galVarD.c, galVarD.d);
            hmlVarC.v(-1224400529);
            boolean zD = hmlVarC.D(jmjVar) | ((i4 & 14) == 4) | hmlVarC.F(context) | hmlVarC.F(view);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdae() { // from class: ctqj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ctqfVar.b.invoke();
                        ctra.f(jmjVar, context, view);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dtdi.c((fdae) objS, icsVarA, false, null, galVarA, null, null, hxe.d(-1809924538, new ctqw(ctqfVar), hmlVarC), hmlVar2, 805306368, 492);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctqk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ctqf ctqfVar2 = ctqfVar;
                    int i5 = i;
                    ctra.h(ctqfVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final long i(hml hmlVar) {
        long jA;
        hmlVar.v(866521451);
        if (dljt.g(hmlVar)) {
            hmlVar.v(-496538375);
            jA = jql.a(R.color.gm3_ref_palette_error90, hmlVar);
            hmlVar.o();
        } else {
            hmlVar.v(-496536647);
            jA = jql.a(R.color.gm3_ref_palette_error30, hmlVar);
            hmlVar.o();
        }
        hmlVar.o();
        return jA;
    }

    public static final void j(final ctqg ctqgVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-261843908);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(ctqgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icsVar = ics.e;
            hmlVarC.v(-1427495290);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl(ctqgVar, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            if (ctqgVar != null && !fdbq.f(ctqgVar, k(hoxVar))) {
                hoxVar.b(ctqgVar);
            }
            fcti fctiVar = new fcti(k(hoxVar), Boolean.valueOf(ctqgVar != null));
            hmwVar.ab();
            ctqg ctqgVar2 = (ctqg) fctiVar.a;
            boolean zBooleanValue = ((Boolean) fctiVar.b).booleanValue();
            int i4 = (i3 << 3) & 896;
            g(ctqgVar2, zBooleanValue && (ctqgVar2 instanceof ctqf), icsVar, hmlVarC, i4);
            b(ctqgVar2, zBooleanValue && (ctqgVar2 instanceof ctqe), icsVar, hmlVarC, i4);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctqo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ctqg ctqgVar3 = ctqgVar;
                    int i5 = i;
                    ctra.j(ctqgVar3, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final ctqg k(hox hoxVar) {
        return (ctqg) hoxVar.a();
    }

    private static final long l(hml hmlVar) {
        long jA;
        hmlVar.v(-850744630);
        if (dljt.g(hmlVar)) {
            hmlVar.v(-1521800616);
            jA = jql.a(R.color.gm3_ref_palette_error30, hmlVar);
            ((hmw) hmlVar).ab();
        } else {
            hmlVar.v(-1521798888);
            jA = jql.a(R.color.gm3_ref_palette_error90, hmlVar);
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return jA;
    }
}

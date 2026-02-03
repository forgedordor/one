package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaal {
    public static final void a(final aaah aaahVar, hml hmlVar, final int i) {
        int i2;
        fr frVarI;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-897278471);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(aaahVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(view);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            fr frVarA = null;
            if (zD || objS == hmk.a) {
                try {
                    objS = fr.f(view);
                } catch (IllegalStateException unused) {
                    objS = null;
                }
                hmwVar.af(objS);
            }
            ea eaVar = (ea) objS;
            hmwVar.ab();
            hmlVarC.v(-1633490746);
            boolean zD2 = hmlVarC.D(eaVar) | hmlVarC.D(context);
            Object objS2 = hmwVar.S();
            if (zD2 || objS2 == hmk.a) {
                if (eaVar == null || (frVarI = eaVar.I()) == null) {
                    eg egVar = context instanceof eg ? (eg) context : null;
                    if (egVar != null) {
                        frVarA = egVar.a();
                    }
                } else {
                    frVarA = frVarI;
                }
                hmwVar.af(frVarA);
                objS2 = frVarA;
            }
            final fr frVar = (fr) objS2;
            hmwVar.ab();
            final fdci fdciVar = new fdci();
            hmlVarC.v(1003837636);
            if (frVar != null) {
                ea eaVarH = frVar.h("ReactionPickerFragment");
                if (eaVarH != null) {
                    cg cgVar = new cg(frVar);
                    cgVar.o(eaVarH);
                    cgVar.c();
                }
                fdciVar.a = aabc.a(aaahVar.a);
                ((aaao) fdciVar.a).t(frVar, "ReactionPickerFragment");
                if (((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue()) {
                    aabj aabjVarH = ((aaao) fdciVar.a).H();
                    dpgl dpglVarB = dpgm.b(glz.a(hmlVarC), dljt.h(hmlVarC), ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue());
                    aabjVarH.r = dpglVarB;
                    dpbq dpbqVar = aabjVarH.u;
                    if (dpbqVar != null) {
                        dpbqVar.d(dpglVarB);
                    }
                    View view2 = aabjVarH.c.Q;
                    if (view2 != null) {
                        aabj.a(view2, dpglVarB);
                    }
                }
                ((aaao) fdciVar.a).H().n = aaahVar.b;
                ((aaao) fdciVar.a).H().m = aaahVar.c;
                ((aaao) fdciVar.a).H().o = aaahVar.d;
                ((aaao) fdciVar.a).H().p = aaahVar.e;
                fdap fdapVar = aaahVar.f;
                if (fdapVar != null) {
                    ((aaao) fdciVar.a).H().q = fdapVar;
                }
            }
            hmwVar.ab();
            hob.c(context, new fdap() { // from class: aaai
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((hny) obj).getClass();
                    return new aaak(frVar, fdciVar);
                }
            }, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aaaj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aaal.a(aaahVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

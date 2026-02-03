package defpackage;

import android.content.Context;
import android.support.v4.app.FragmentContainerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpef {
    public static final void a(ViewGroup viewGroup, fdap fdapVar) {
        if (viewGroup instanceof FragmentContainerView) {
            fdapVar.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, fdapVar);
            }
        }
    }

    public static final void b(final fdau fdauVar, final ics icsVar, fdap fdapVar, final fdap fdapVar2, hml hmlVar, final int i) {
        int i2;
        final fdap fdapVar3;
        fdauVar.getClass();
        hml hmlVarC = hmlVar.c(261744271);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(fdauVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.E(false) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.F(fdapVar2) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            fdapVar3 = fdapVar;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: dpdz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((View) obj2).getClass();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            final fdap fdapVar4 = (fdap) objS;
            hmwVar.ab();
            View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(view);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj) {
                try {
                    objS2 = fr.f(view);
                } catch (IllegalStateException unused) {
                    objS2 = null;
                }
                hmwVar.af(objS2);
            }
            final ea eaVar = (ea) objS2;
            hmwVar.ab();
            hmlVarC.v(5004770);
            boolean zD2 = hmlVarC.D(view);
            Object objS3 = hmwVar.S();
            if (zD2 || objS3 == hmk.a) {
                objS3 = new fdap() { // from class: dpea
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        LayoutInflater layoutInflaterFrom;
                        Context context = (Context) obj2;
                        context.getClass();
                        ea eaVar2 = eaVar;
                        if (eaVar2 == null || (layoutInflaterFrom = eaVar2.K()) == null) {
                            layoutInflaterFrom = LayoutInflater.from(context);
                        }
                        fdau fdauVar2 = fdauVar;
                        layoutInflaterFrom.getClass();
                        return (View) fdauVar2.a(layoutInflaterFrom, new FrameLayout(context), false);
                    }
                };
                hmwVar.af(objS3);
            }
            fdap fdapVar5 = (fdap) objS3;
            hmwVar.ab();
            final Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            hmlVarC.v(-1866782280);
            hmwVar.ab();
            hmlVarC.v(-1746271574);
            boolean zF = ((i3 & 7168) == 2048) | hmlVarC.F(eaVar) | hmlVarC.F(context);
            Object objS4 = hmwVar.S();
            if (zF || objS4 == hmk.a) {
                objS4 = new fdap() { // from class: dpeb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        fr frVarI;
                        View view2 = (View) obj2;
                        view2.getClass();
                        fdapVar4.invoke(view2);
                        final fr frVarA = null;
                        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                        if (viewGroup != null) {
                            ea eaVar2 = eaVar;
                            if (eaVar2 == null || (frVarI = eaVar2.I()) == null) {
                                Context context2 = context;
                                eg egVar = context2 instanceof eg ? (eg) context2 : null;
                                if (egVar != null) {
                                    frVarA = egVar.a();
                                }
                            } else {
                                frVarA = frVarI;
                            }
                            dpef.a(viewGroup, new fdap() { // from class: dpee
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj3) {
                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) obj3;
                                    fragmentContainerView.getClass();
                                    fr frVar = frVarA;
                                    ea eaVarG = frVar != null ? frVar.g(fragmentContainerView.getId()) : null;
                                    if (eaVarG != null && !frVar.ag()) {
                                        cg cgVar = new cg(frVar);
                                        cgVar.o(eaVarG);
                                        cgVar.j();
                                    }
                                    return fctx.a;
                                }
                            });
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            fdap fdapVar6 = (fdap) objS4;
            hmwVar.ab();
            hmlVarC.v(-1746271574);
            boolean zF2 = hmlVarC.F(eaVar) | ((57344 & i3) == 16384);
            boolean z = (458752 & i3) == 131072;
            Object objS5 = hmwVar.S();
            if ((zF2 | z) || objS5 == hmk.a) {
                objS5 = new fdap() { // from class: dpec
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        fdapVar2.invoke(view2);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            kli.c(fdapVar5, icsVar, fdapVar6, (fdap) objS5, hmlVarC, i3 & 112, 0);
            fdapVar3 = fdapVar4;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dped
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    fdau fdauVar2 = fdauVar;
                    ics icsVar2 = icsVar;
                    fdap fdapVar7 = fdapVar3;
                    dpef.b(fdauVar2, icsVar2, fdapVar7, fdapVar2, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

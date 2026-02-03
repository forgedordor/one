package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lss {
    public static final void a(final Class cls, final ics icsVar, final lsu lsuVar, final Bundle bundle, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1012439764);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(cls) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(lsuVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(bundle) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            final hsf hsfVarA = hsc.a(fdapVar, hmlVarC);
            final int iA = hmg.a(hmlVarC);
            View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            hmlVarC.w(5004770);
            boolean zD = hmlVarC.D(view);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            if (zD || objS == hmk.a) {
                objS = fr.l(view);
                hmwVar2.af(objS);
            }
            final fr frVar = (fr) objS;
            hmwVar2.ab();
            final Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
            hmlVarC.w(1849434622);
            Object objS2 = hmwVar2.S();
            boolean z = true;
            Object obj = hmk.a;
            if (objS2 == obj) {
                objS2 = new lst(iA);
                hmwVar2.af(objS2);
            }
            final lst lstVar = (lst) objS2;
            hmwVar2.ab();
            kli.b(lstVar, icsVar, null, hmlVarC, i2 & 112, 4);
            Object[] objArr = {frVar, lstVar, cls, lsuVar};
            hmlVarC.w(-1224400529);
            boolean zF = hmlVarC.F(frVar) | hmlVarC.F(lstVar) | hmlVarC.F(context) | hmlVarC.F(cls);
            if ((((i2 & 896) ^ 384) <= 256 || !hmlVarC.D(lsuVar)) && (i2 & 384) != 256) {
                z = false;
            }
            boolean zF2 = zF | z | hmlVarC.F(bundle) | hmlVarC.B(iA) | hmlVarC.D(hsfVarA);
            Object objS3 = hmwVar2.S();
            if (zF2 || objS3 == obj) {
                hmwVar = hmwVar2;
                fdap fdapVar2 = new fdap() { // from class: lso
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        fdce fdceVar = new fdce();
                        lst lstVar2 = lstVar;
                        int id = lstVar2.a().getId();
                        fr frVar2 = frVar;
                        ea eaVarG = frVar2.g(id);
                        lsu lsuVar2 = lsuVar;
                        if (eaVarG == null) {
                            int i4 = iA;
                            Bundle bundle2 = bundle;
                            Class cls2 = cls;
                            Context context2 = context;
                            em emVarK = frVar2.k();
                            context2.getClassLoader();
                            ea eaVarB = emVarK.b(cls2.getName());
                            eaVarB.aw((dz) lsuVar2.a.a());
                            eaVarB.at(bundle2);
                            cg cgVar = new cg(frVar2);
                            cgVar.A();
                            cgVar.C(lstVar2.a(), eaVarB, String.valueOf(i4));
                            if (frVar2.ag()) {
                                fdceVar.a = true;
                                eaVarB.P().c(new lsq(fdceVar, eaVarB));
                                cgVar.d();
                            } else {
                                cgVar.c();
                            }
                            eaVarG = eaVarB;
                        }
                        hsf hsfVar = hsfVarA;
                        frVar2.Q(lstVar2.a());
                        fdap fdapVar3 = (fdap) hsfVar.a();
                        eaVarG.getClass();
                        fdapVar3.invoke(eaVarG);
                        return new lsr(frVar2, eaVarG, lsuVar2, fdceVar);
                    }
                };
                hmwVar.af(fdapVar2);
                objS3 = fdapVar2;
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            hob.d(objArr, (fdap) objS3, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: lsp
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    Class cls2 = cls;
                    ics icsVar2 = icsVar;
                    lsu lsuVar2 = lsuVar;
                    Bundle bundle2 = bundle;
                    lss.a(cls2, icsVar2, lsuVar2, bundle2, fdapVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}

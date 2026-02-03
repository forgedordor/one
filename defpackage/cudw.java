package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudw {
    public static final void a(final dihq dihqVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-262230002);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dihqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final lvj lvjVar = (lvj) hmlVarC.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i4 = adc.a;
            ach achVarA = adc.a(hmlVarC);
            if (achVarA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            final ace aceVarC = achVarA.c();
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(aceVarC) | ((i2 & 14) == 4) | hmlVarC.F(lvjVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: cudj
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((hny) obj).getClass();
                        dihq dihqVar2 = dihqVar;
                        cudp cudpVar = new cudp(dihqVar2, dihqVar2.f);
                        aceVarC.b(lvjVar, cudpVar);
                        return new cudq(cudpVar);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.c(dihqVar, (fdap) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cudk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cudw.a(dihqVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(igr igrVar, hml hmlVar, final int i) {
        int i2;
        final igr igrVar2;
        igrVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1947308496);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(igrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            igrVar2 = igrVar;
        } else {
            View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            dpir dpirVar = (dpir) hmlVarC.e(dpjg.a);
            jpb jpbVar = (jpb) hmlVarC.e(jmh.o);
            hmlVarC.v(-1224400529);
            boolean zD = hmlVarC.D(jpbVar) | ((i2 & 14) == 4) | hmlVarC.F(dpirVar) | hmlVarC.F(view);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                igrVar2 = igrVar;
                cudt cudtVar = new cudt(jpbVar, igrVar2, dpirVar, view, null);
                hmwVar.af(cudtVar);
                objS = cudtVar;
            } else {
                igrVar2 = igrVar;
            }
            hmwVar.ab();
            hob.g(jpbVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cudl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cudw.b(igrVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.cudh r28, defpackage.hml r29, final int r30) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cudw.c(cudh, hml, int):void");
    }

    private static final cuce d(hsf hsfVar) {
        return (cuce) hsfVar.a();
    }

    private static final cuci e(hsf hsfVar) {
        return (cuci) hsfVar.a();
    }
}

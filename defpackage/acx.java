package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acx {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z, final fdae fdaeVar, hml hmlVar, final int i, final int i2) {
        int i3;
        boolean z2;
        hml hmlVarC = hmlVar.c(-361453782);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            z2 = z;
        } else {
            boolean z3 = (z ? 1 : 0) | i2;
            final boolean z4 = 1 == z3;
            hsf hsfVarA = hsc.a(fdaeVar, hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new acv(z4, hsfVarA);
                hmwVar.af(objS);
            }
            final acv acvVar = (acv) objS;
            boolean zF = ((i3 & 14) == 4) | hmlVarC.F(acvVar);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new fdae() { // from class: acs
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        acvVar.h(z4);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hob.i((fdae) objS2, hmlVarC);
            int i4 = adc.a;
            ach achVarA = adc.a(hmlVarC);
            if (achVarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            final ace aceVarC = achVarA.c();
            final lvj lvjVar = (lvj) hmlVarC.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zF2 = hmlVarC.F(aceVarC) | hmlVarC.F(lvjVar) | hmlVarC.F(acvVar);
            Object objS3 = hmwVar.S();
            if (zF2 || objS3 == obj) {
                objS3 = new fdap() { // from class: act
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ace aceVar = aceVarC;
                        lvj lvjVar2 = lvjVar;
                        acv acvVar2 = acvVar;
                        aceVar.b(lvjVar2, acvVar2);
                        return new acw(acvVar2);
                    }
                };
                hmwVar.af(objS3);
            }
            hob.b(lvjVar, aceVarC, (fdap) objS3, hmlVarC);
            z2 = z3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final boolean z5 = true == z2;
            hpxVarL.d = new fdat() { // from class: acu
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    boolean z6 = z5;
                    int i5 = i;
                    acx.a(z6, fdaeVar, (hml) obj2, hpy.a(i5 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}

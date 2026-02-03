package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afoa {
    public static final void a(final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2145760288);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final afny afnyVar = new afny(fdaeVar);
            final lvj lvjVar = (lvj) hmlVarC.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i4 = adc.a;
            ach achVarA = adc.a(hmlVarC);
            if (achVarA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            final ace aceVarC = achVarA.c();
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(aceVarC) | hmlVarC.F(lvjVar) | hmlVarC.F(afnyVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: afnv
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((hny) obj).getClass();
                        ace aceVar = aceVarC;
                        lvj lvjVar2 = lvjVar;
                        afny afnyVar2 = afnyVar;
                        aceVar.b(lvjVar2, afnyVar2);
                        return new afnx(afnyVar2);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.c(afnyVar, (fdap) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afnw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    afoa.a(fdaeVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdvc fdvcVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(605007432);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            afns afnsVar = (afns) hro.a(fdvcVar, hmlVarC).a();
            if (!afnsVar.a) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: afnt
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            fdvc fdvcVar2 = fdvcVar;
                            int i4 = i;
                            afoa.b(fdvcVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            gvk.c(ehm.b(egq.c(icsVar, 1.0f), new efr(ehv.f(hmlVarC), 32)), null, 0L, 0L, 0.0f, 0.0f, null, hxe.d(2139502413, new afnz(afnsVar), hmlVarC), hmlVarC, 126);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: afnu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdvc fdvcVar2 = fdvcVar;
                    int i4 = i;
                    afoa.b(fdvcVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}

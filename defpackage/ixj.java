package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixj {
    public static final void a(fdau fdauVar, hml hmlVar, int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(441837433);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdauVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new ixe();
                hmwVar.af(objS);
            }
            ixe ixeVar = (ixe) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = ixf.a;
                hmwVar.af(objS2);
            }
            fdae fdaeVar = (fdae) objS2;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.a(hmlVarC, ixg.a);
            hsk.b(hmlVarC, ixeVar, ixh.a);
            fdauVar.a(ixeVar, hmlVarC, Integer.valueOf((i2 << 3) & 112));
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new ixi(fdauVar, i);
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguv {
    public static void a(fguw fguwVar, fgry fgryVar) {
        fgry fgryVarO = fgryVar;
        int i = 0;
        while (fgryVarO != null) {
            fgry fgryVar2 = fgryVarO.k;
            int iHP = fgryVar2 != null ? fgryVar2.hP() : 0;
            fgry fgryVarP = fgryVarO.P();
            fguwVar.a(fgryVarO, i);
            if (fgryVar2 != null && !fgryVarO.X()) {
                if (iHP == fgryVar2.hP()) {
                    fgryVarO = fgryVar2.O(fgryVarO.l);
                } else if (fgryVarP == null) {
                    i--;
                    fgryVarO = fgryVar2;
                } else {
                    fgryVarO = fgryVarP;
                }
            }
            if (fgryVarO.hP() > 0) {
                fgryVarO = fgryVarO.O(0);
                i++;
            } else {
                while (fgryVarO.P() == null && i > 0) {
                    fguwVar.b(fgryVarO, i);
                    fgryVarO = fgryVarO.k;
                    i--;
                }
                fguwVar.b(fgryVarO, i);
                if (fgryVarO == fgryVar) {
                    return;
                } else {
                    fgryVarO = fgryVarO.P();
                }
            }
        }
    }
}

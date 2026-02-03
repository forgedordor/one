package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgun extends fguu {
    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        if (fgrsVar2 instanceof fgsa) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (fgry fgryVar : fgrsVar2.g) {
            if (fgryVar instanceof fgsb) {
                arrayList.add((fgsb) fgryVar);
            }
        }
        for (fgsb fgsbVar : DesugarCollections.unmodifiableList(arrayList)) {
            String strP = fgrsVar2.p();
            Map map = fgsl.a;
            fgsa fgsaVar = new fgsa(fgsl.b(strP, fgsj.b), fgrsVar2.l(), fgrsVar2.v());
            fgqz.g(fgsbVar.k);
            fgry fgryVar2 = fgsbVar.k;
            fgqz.c(true);
            if (fgsbVar != fgsaVar) {
                fgry fgryVar3 = fgsaVar.k;
                if (fgryVar3 != null) {
                    fgryVar3.hT(fgsaVar);
                }
                int i = fgsbVar.l;
                fgryVar2.u().set(i, fgsaVar);
                fgsaVar.k = fgryVar2;
                fgsaVar.l = i;
                fgsbVar.k = null;
            }
            fgsaVar.K(fgsbVar);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}

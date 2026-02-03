package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguk extends fguu {
    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        fgte fgteVar;
        fgrs fgrsVarA = fgrsVar2.A();
        if (fgrsVarA != null && !(fgrsVarA instanceof fgrm)) {
            if (fgrsVar2.k == null) {
                fgteVar = new fgte(0);
            } else {
                List<fgrs> listT = fgrsVar2.A().t();
                fgte fgteVar2 = new fgte(listT.size() - 1);
                for (fgrs fgrsVar3 : listT) {
                    if (fgrsVar3 != fgrsVar2) {
                        fgteVar2.add(fgrsVar3);
                    }
                }
                fgteVar = fgteVar2;
            }
            if (fgteVar.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return ":only-child";
    }
}

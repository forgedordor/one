package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgul extends fguu {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        fgrs fgrsVarA = fgrsVar2.A();
        if (fgrsVarA != null && !(fgrsVarA instanceof fgrm)) {
            fgte fgteVarC = fgrsVarA.C();
            int size = fgteVarC.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (((fgrs) fgteVarC.get(i2)).e.equals(fgrsVar2.e)) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return ":only-of-type";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgva extends fgvh {
    final fgta a;

    public fgva(fguu fguuVar) {
        this.b = fguuVar;
        this.a = new fgta(fguuVar);
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        for (int i = 0; i < fgrsVar2.hP(); i++) {
            fgry fgryVarO = fgrsVar2.O(i);
            if ((fgryVarO instanceof fgrs) && this.a.a(fgrsVar2, (fgrs) fgryVarO) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.b);
    }
}

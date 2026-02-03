package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgve extends fgvh {
    public fgve(fguu fguuVar) {
        this.b = fguuVar;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        if (fgrsVar == fgrsVar2) {
            return false;
        }
        for (fgrs fgrsVarA = fgrsVar2.A(); fgrsVarA != null; fgrsVarA = fgrsVarA.A()) {
            if (this.b.a(fgrsVar, fgrsVarA)) {
                return true;
            }
            if (fgrsVarA == fgrsVar) {
                break;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ", this.b);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgvf extends fgvh {
    public fgvf(fguu fguuVar) {
        this.b = fguuVar;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        if (fgrsVar == fgrsVar2) {
            return false;
        }
        for (fgrs fgrsVarY = fgrsVar2.y(); fgrsVarY != null; fgrsVarY = fgrsVarY.y()) {
            if (this.b.a(fgrsVar, fgrsVarY)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.b);
    }
}

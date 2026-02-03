package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgvb extends fgvh {
    public fgvb(fguu fguuVar) {
        this.b = fguuVar;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        fgrs fgrsVarA;
        return (fgrsVar == fgrsVar2 || (fgrsVarA = fgrsVar2.A()) == null || !this.b.a(fgrsVar, fgrsVarA)) ? false : true;
    }

    public final String toString() {
        return String.format("%s > ", this.b);
    }
}

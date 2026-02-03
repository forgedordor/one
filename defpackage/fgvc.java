package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgvc extends fgvh {
    public fgvc(fguu fguuVar) {
        this.b = fguuVar;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        fgrs fgrsVarY;
        return (fgrsVar == fgrsVar2 || (fgrsVarY = fgrsVar2.y()) == null || !this.b.a(fgrsVar, fgrsVarY)) ? false : true;
    }

    public final String toString() {
        return String.format("%s + ", this.b);
    }
}

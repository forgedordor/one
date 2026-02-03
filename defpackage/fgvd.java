package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgvd extends fgvh {
    public fgvd(fguu fguuVar) {
        this.b = fguuVar;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return !this.b.a(fgrsVar, fgrsVar2);
    }

    public final String toString() {
        return String.format(":not(%s)", this.b);
    }
}

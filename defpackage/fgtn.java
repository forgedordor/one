package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtn extends fgth {
    public fgtn(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return !this.b.equalsIgnoreCase(fgrsVar2.hS(this.a));
    }

    public final String toString() {
        return String.format("[%s!=%s]", this.a, this.b);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtu extends fguu {
    private final String a;

    public fgtu(String str) {
        this.a = str;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrsVar2.s().contains(this.a);
    }

    public final String toString() {
        return String.format(":containsWholeText(%s)", this.a);
    }
}

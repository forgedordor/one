package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtt extends fguu {
    private final String a;

    public fgtt(String str) {
        this.a = str;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrsVar2.r().contains(this.a);
    }

    public final String toString() {
        return String.format(":containsWholeOwnText(%s)", this.a);
    }
}

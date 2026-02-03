package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgus extends fguu {
    private final String a;

    public fgus(String str) {
        this.a = str;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrsVar2.n().equals(this.a);
    }

    public final String toString() {
        return String.format("%s", this.a);
    }
}

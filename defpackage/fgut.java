package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgut extends fguu {
    private final String a;

    public fgut(String str) {
        this.a = str;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrsVar2.n().endsWith(this.a);
    }

    public final String toString() {
        return String.format("%s", this.a);
    }
}

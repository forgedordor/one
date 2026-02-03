package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgts extends fguu {
    private final String a;

    public fgts(String str) {
        this.a = fgrb.a(fgre.b(str));
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrb.a(fgrsVar2.q()).contains(this.a);
    }

    public final String toString() {
        return String.format(":contains(%s)", this.a);
    }
}

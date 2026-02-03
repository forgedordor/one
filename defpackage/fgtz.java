package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtz extends fgty {
    public fgtz(int i) {
        super(i);
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrsVar2.k() > this.a;
    }

    public final String toString() {
        return String.format(":gt(%d)", Integer.valueOf(this.a));
    }
}

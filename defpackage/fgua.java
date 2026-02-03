package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgua extends fgty {
    public fgua(int i) {
        super(i);
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrsVar != fgrsVar2 && fgrsVar2.k() < this.a;
    }

    public final String toString() {
        return String.format(":lt(%d)", Integer.valueOf(this.a));
    }
}

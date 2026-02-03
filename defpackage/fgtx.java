package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtx extends fgty {
    public fgtx(int i) {
        super(i);
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrsVar2.k() == this.a;
    }

    public final String toString() {
        return String.format(":eq(%d)", Integer.valueOf(this.a));
    }
}

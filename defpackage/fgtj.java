package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtj extends fgth {
    public fgtj(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrsVar2.W(this.a) && this.b.equalsIgnoreCase(fgrsVar2.hS(this.a).trim());
    }

    public final String toString() {
        return String.format("[%s=%s]", this.a, this.b);
    }
}

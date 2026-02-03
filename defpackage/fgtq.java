package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtq extends fguu {
    private final String a;

    public fgtq(String str) {
        this.a = fgrb.a(str);
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return fgrb.a(fgrsVar2.m()).contains(this.a);
    }

    public final String toString() {
        return String.format(":containsData(%s)", this.a);
    }
}

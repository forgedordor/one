package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtw extends fguu {
    private final String a;

    public fgtw(String str) {
        this.a = str;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        fgrh fgrhVar = fgrsVar2.h;
        return this.a.equals(fgrhVar != null ? fgrhVar.e("id") : "");
    }

    public final String toString() {
        return String.format("#%s", this.a);
    }
}

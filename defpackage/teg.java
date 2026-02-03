package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class teg implements tcy {
    public final ditp a;
    public final fdae b;

    public teg(ditp ditpVar, fdae fdaeVar) {
        this.a = ditpVar;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof teg)) {
            return false;
        }
        teg tegVar = (teg) obj;
        return fdbq.f(this.a, tegVar.a) && fdbq.f(this.b, tegVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FullBannerUiData(bannerUiData=" + this.a + ", onShownCallback=" + this.b + ")";
    }
}

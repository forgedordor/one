package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class disa {
    public final String a;
    public final fdae b;

    public disa(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof disa)) {
            return false;
        }
        disa disaVar = (disa) obj;
        return fdbq.f(this.a, disaVar.a) && fdbq.f(this.b, disaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BannerButtonData(text=" + this.a + ", onClick=" + this.b + ")";
    }
}

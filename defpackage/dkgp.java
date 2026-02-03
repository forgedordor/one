package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgp {
    public final String a;
    public final fdae b;

    public dkgp(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkgp)) {
            return false;
        }
        dkgp dkgpVar = (dkgp) obj;
        return fdbq.f(this.a, dkgpVar.a) && fdbq.f(this.b, dkgpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CustomAccessibilityActionUiData(label=" + this.a + ", callback=" + this.b + ")";
    }
}

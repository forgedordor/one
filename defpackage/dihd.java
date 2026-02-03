package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dihd {
    public final String a;
    public final fdae b;

    public dihd(String str, fdae fdaeVar) {
        fdaeVar.getClass();
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dihd)) {
            return false;
        }
        dihd dihdVar = (dihd) obj;
        return fdbq.f(this.a, dihdVar.a) && fdbq.f(this.b, dihdVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccessibleCallback(onClickDescription=" + this.a + ", onClick=" + this.b + ")";
    }
}

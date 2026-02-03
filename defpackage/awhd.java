package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhd {
    public final String a;
    public final String b;

    public awhd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awhd)) {
            return false;
        }
        awhd awhdVar = (awhd) obj;
        return fdbq.f(this.a, awhdVar.a) && fdbq.f(this.b, awhdVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AppCapability(key=" + this.a + ", value=" + this.b + ")";
    }
}

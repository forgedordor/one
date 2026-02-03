package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvqf {
    public final boolean a;
    private final String b;

    public bvqf(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvqf)) {
            return false;
        }
        bvqf bvqfVar = (bvqf) obj;
        return this.a == bvqfVar.a && fdbq.f(this.b, bvqfVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ThrottleResult(shouldThrottle=" + this.a + ", reason=" + this.b + ")";
    }
}

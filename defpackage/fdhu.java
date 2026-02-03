package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhu {
    public final Object a;
    public final long b;

    public fdhu(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdhu)) {
            return false;
        }
        fdhu fdhuVar = (fdhu) obj;
        return fdbq.f(this.a, fdhuVar.a) && fdhi.p(this.b, fdhuVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        long j = this.b;
        long j2 = fdhi.a;
        return (iHashCode * 31) + fdhh.a(j);
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + fdhi.n(this.b) + ")";
    }
}

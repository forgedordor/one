package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcvv<T> {
    public final int a;
    public final Object b;

    public fcvv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcvv)) {
            return false;
        }
        fcvv fcvvVar = (fcvv) obj;
        return this.a == fcvvVar.a && fdbq.f(this.b, fcvvVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}

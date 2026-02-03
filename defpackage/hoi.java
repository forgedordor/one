package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoi {
    private final Object a;
    private final Object b;

    public hoi(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private static final int a(Object obj) {
        return obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoi)) {
            return false;
        }
        hoi hoiVar = (hoi) obj;
        return fdbq.f(this.a, hoiVar.a) && fdbq.f(this.b, hoiVar.b);
    }

    public final int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}

package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes6.dex */
public final class fdog {
    public static final fdof a = new fdof();
    public final Object b;

    public static final Object a(Object obj) {
        if (obj instanceof fdof) {
            return null;
        }
        return obj;
    }

    public static final Throwable b(Object obj) {
        fdoe fdoeVar = obj instanceof fdoe ? (fdoe) obj : null;
        if (fdoeVar != null) {
            return fdoeVar.a;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof fdof);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdog) && fdbq.f(this.b, ((fdog) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return obj instanceof fdoe ? ((fdoe) obj).toString() : a.h(obj, "Value(", ")");
    }
}

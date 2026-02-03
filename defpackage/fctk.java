package defpackage;

import java.io.Serializable;

/* compiled from: PG */
@fdac
/* loaded from: classes6.dex */
public final class fctk implements Serializable {
    public final Object a;

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String b(Object obj) {
        return obj instanceof fctj ? ((fctj) obj).toString() : a.h(obj, "Success(", ")");
    }

    public static final Throwable c(Object obj) {
        if (obj instanceof fctj) {
            return ((fctj) obj).a;
        }
        return null;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof fctj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fctk) && fdbq.f(this.a, ((fctk) obj).a);
    }

    public final int hashCode() {
        return a(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}

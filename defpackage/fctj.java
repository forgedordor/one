package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fctj implements Serializable {
    public final Throwable a;

    public fctj(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fctj) && fdbq.f(this.a, ((fctj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ")";
    }
}

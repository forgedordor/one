package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chcq implements chda {
    private final Status a;

    public chcq(Status status) {
        status.getClass();
        this.a = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chcq) && fdbq.f(this.a, ((chcq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Grpc(status=" + this.a + ")";
    }
}

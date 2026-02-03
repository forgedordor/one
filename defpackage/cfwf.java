package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfwf {
    private final long a;

    public cfwf(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfwf) && this.a == ((cfwf) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "NetworkHandle(networkId=" + this.a + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chhn extends chho {
    public static final chhn a = new chhn();

    private chhn() {
    }

    @Override // defpackage.chho
    public final long a(long j, int i) {
        if (i > 0) {
            return fdhi.k(j, i);
        }
        throw new IllegalArgumentException("Attempt count must be a positive integer.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chhn)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1319589771;
    }

    public final String toString() {
        return "LinearRetryBackoffStrategy";
    }
}

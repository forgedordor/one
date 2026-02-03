package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csoe {
    public final long a;

    public csoe(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csoe) && this.a == ((csoe) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "BugleClassificationId(id=" + this.a + ")";
    }
}

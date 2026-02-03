package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class kjn {
    public final long a;

    public static String a(long j) {
        return b(j, 0L) ? "Unspecified" : b(j, 4294967296L) ? "Sp" : b(j, 8589934592L) ? "Em" : "Invalid";
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kjn) && this.a == ((kjn) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return a(this.a);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egxx extends egyz {
    public final long a;

    public egxx(long j) {
        this.a = j;
    }

    @Override // defpackage.egyz
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof egyz) && this.a == ((egyz) obj).a();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "LoadTaskIdentifier{index=" + this.a + "}";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bww extends bzi {
    private final long a;
    private final long b;
    private final bwj c;

    public bww(long j, long j2, bwj bwjVar) {
        this.a = j;
        this.b = j2;
        this.c = bwjVar;
    }

    @Override // defpackage.bzi
    public final long a() {
        return this.b;
    }

    @Override // defpackage.bzi
    public final long b() {
        return this.a;
    }

    @Override // defpackage.bzi
    public final bwj c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzi) {
            bzi bziVar = (bzi) obj;
            if (this.a == bziVar.b() && this.b == bziVar.a() && this.c.equals(bziVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}

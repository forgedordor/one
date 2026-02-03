package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cshl {
    public boolean a;
    public int b;
    public long c;

    public cshl() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cshl)) {
            return false;
        }
        cshl cshlVar = (cshl) obj;
        return this.a == cshlVar.a && this.b == cshlVar.b && this.c == cshlVar.c;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) * 31) + this.b;
        long j = this.c;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "InitializationStatus(isInitialized=" + this.a + ", attemptCount=" + this.b + ", nextAllowedRetryTimestampMillis=" + this.c + ")";
    }

    public /* synthetic */ cshl(byte[] bArr) {
        this.a = false;
        this.b = 0;
        this.c = 0L;
    }
}

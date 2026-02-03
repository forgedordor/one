package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chhp {
    public final long a;
    public final chho b;
    private final int c;
    private final chhk d;

    public /* synthetic */ chhp(int i, long j, chho chhoVar, int i2) {
        if ((i2 & 2) != 0) {
            long j2 = fdhi.a;
            j = 0;
        }
        chhoVar = (i2 & 4) != 0 ? chhn.a : chhoVar;
        i = 1 == (i2 & 1) ? 0 : i;
        chhoVar.getClass();
        this.c = i;
        this.a = j;
        this.b = chhoVar;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chhp)) {
            return false;
        }
        chhp chhpVar = (chhp) obj;
        if (this.c != chhpVar.c || !fdhi.p(this.a, chhpVar.a) || !fdbq.f(this.b, chhpVar.b)) {
            return false;
        }
        chhk chhkVar = chhpVar.d;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        long j = fdhi.a;
        return ((((this.c * 31) + fdhh.a(this.a)) * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "RetryConfiguration(maxExecutionAttempts=" + this.c + ", baseRetryDelay=" + fdhi.n(this.a) + ", retryBackoffStrategy=" + this.b + ", recoveryConfiguration=null)";
    }
}

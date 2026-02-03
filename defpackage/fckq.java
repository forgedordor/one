package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fckq {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public fckq(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = ekhx.o(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fckq)) {
            return false;
        }
        fckq fckqVar = (fckq) obj;
        return this.a == fckqVar.a && this.b == fckqVar.b && this.c == fckqVar.c && Double.compare(this.d, fckqVar.d) == 0 && ejwh.a(this.e, fckqVar.e) && ejwh.a(this.f, fckqVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.f("maxAttempts", this.a);
        ejwfVarB.g("initialBackoffNanos", this.b);
        ejwfVarB.g("maxBackoffNanos", this.c);
        ejwfVarB.d("backoffMultiplier", this.d);
        ejwfVarB.b("perAttemptRecvTimeoutNanos", this.e);
        ejwfVarB.b("retryableStatusCodes", this.f);
        return ejwfVarB.toString();
    }
}

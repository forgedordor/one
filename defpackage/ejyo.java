package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejyo {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public ejyo() {
        ejwl.a(true);
        ejwl.a(true);
        ejwl.a(true);
        ejwl.a(true);
        ejwl.a(true);
        ejwl.a(true);
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ejyo)) {
            return false;
        }
        ejyo ejyoVar = (ejyo) obj;
        long j = ejyoVar.a;
        long j2 = ejyoVar.b;
        long j3 = ejyoVar.c;
        long j4 = ejyoVar.d;
        long j5 = ejyoVar.e;
        long j6 = ejyoVar.f;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("hitCount", 0L);
        ejwfVarB.g("missCount", 0L);
        ejwfVarB.g("loadSuccessCount", 0L);
        ejwfVarB.g("loadExceptionCount", 0L);
        ejwfVarB.g("totalLoadTime", 0L);
        ejwfVarB.g("evictionCount", 0L);
        return ejwfVarB.toString();
    }
}

package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgch {
    public int a = 0;
    private final long b;
    private final long c;
    private final long d;
    private int e;
    private int f;
    private final dgcg g;
    private final dhip h;

    public dgch(long j, long j2, long j3, dgcg dgcgVar, dhip dhipVar) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.g = dgcgVar;
        this.h = dhipVar;
        this.e = ((Integer) dgcgVar.a.d()).intValue();
        this.f = ((Integer) dgcgVar.b.d()).intValue();
    }

    public final long a() {
        long jMax;
        Object[] objArr = {Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.a)};
        dhip dhipVar = this.h;
        dhja.d(dhipVar, "retries=%d throttleCounter=%d retryAfter=%d", objArr);
        int i = this.e;
        if (i > 0) {
            int i2 = i > 3 ? i - 3 : 0;
            long jNextInt = new Random().nextInt(32);
            long j = this.b;
            jMax = Math.max(Math.min((j * (1 << i2)) + ((jNextInt * j) / 64), this.c), this.a);
        } else {
            jMax = 0;
        }
        if (this.f < this.d) {
            return jMax;
        }
        dhja.d(dhipVar, "Reached at throttling threshold. returning min delay at minimum.", new Object[0]);
        return Math.max(jMax, this.b);
    }

    public final synchronized void b() {
        this.e++;
        long jLongValue = dhkl.a().longValue();
        dgcg dgcgVar = this.g;
        if (jLongValue - dgcgVar.a() > TimeUnit.DAYS.toMillis(1L)) {
            dhja.d(this.h, "Reset throttleCounter.", new Object[0]);
            this.f = 0;
            dgcgVar.c(0);
            Long lA = dhkl.a();
            lA.longValue();
            dgcgVar.c.e(lA);
        }
        this.f++;
        dgcgVar.b(this.e);
        dgcgVar.c(this.f);
    }

    public final synchronized void c() {
        this.e = 0;
        this.g.b(0);
    }

    public final String toString() {
        dgcg dgcgVar = this.g;
        return "[RetryDelayCalculator - retries=" + this.e + ", throttleCounter=" + this.f + ", lastThrottleTimerResetTimestamp=" + dgcgVar.a() + "]";
    }
}

package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anh {
    final /* synthetic */ ank a;
    private final long b;
    private long c = -1;

    public anh(ank ankVar, long j) {
        this.a = ankVar;
        this.b = j;
    }

    final int a() {
        if (!this.a.d()) {
            return 700;
        }
        long jC = c();
        if (jC <= 120000) {
            return 1000;
        }
        return jC <= 300000 ? 2000 : 4000;
    }

    final int b() {
        boolean zD = this.a.d();
        long j = this.b;
        if (zD) {
            if (j > 0) {
                return Math.min((int) j, 1800000);
            }
            return 1800000;
        }
        if (j > 0) {
            return Math.min((int) j, 10000);
        }
        return 10000;
    }

    final long c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.c;
        if (j == -1) {
            this.c = jUptimeMillis;
            j = jUptimeMillis;
        }
        return jUptimeMillis - j;
    }

    final void d() {
        this.c = -1L;
    }
}

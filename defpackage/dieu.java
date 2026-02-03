package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dieu implements diep {
    @Override // defpackage.diep
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.diep
    public final long b() {
        return diet.a ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000;
    }

    @Override // defpackage.diep
    public final long c() {
        return System.nanoTime();
    }

    @Override // defpackage.diep
    public final Duration d() {
        return Duration.ofMillis(SystemClock.currentThreadTimeMillis());
    }

    @Override // defpackage.diep
    public final Duration e() {
        return Duration.ofMillis(SystemClock.uptimeMillis());
    }

    @Override // defpackage.diep
    public final Instant f() {
        return Instant.now();
    }
}

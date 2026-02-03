package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cff {
    final /* synthetic */ akv a;

    public cff(akv akvVar) {
        this.a = akvVar;
    }

    public final long a() {
        return ((Long) this.a.a(Long.valueOf(TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())))).longValue();
    }

    public final long b() {
        return ((Long) this.a.a(Long.valueOf(TimeUnit.NANOSECONDS.toMicros(System.nanoTime())))).longValue();
    }
}

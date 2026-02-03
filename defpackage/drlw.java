package defpackage;

import j$.time.Instant;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drlw extends FutureTask implements RunnableScheduledFuture {
    private final drlm a;
    private final long b;
    private final long c;

    public drlw(Runnable runnable, drlm drlmVar, long j, long j2) {
        super(runnable, null);
        this.a = drlmVar;
        this.b = System.nanoTime() + j;
        this.c = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (!(delayed2 instanceof drlw)) {
            return Long.signum(getDelay(TimeUnit.NANOSECONDS) - delayed2.getDelay(TimeUnit.NANOSECONDS));
        }
        drlw drlwVar = (drlw) delayed2;
        long j = this.b - drlwVar.b;
        if (j < 0) {
            return -1;
        }
        return (j <= 0 && this.c < drlwVar.c) ? -1 : 1;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        if (timeUnit != null) {
            return timeUnit.convert(this.b - System.nanoTime(), TimeUnit.NANOSECONDS);
        }
        return 0L;
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        long epochMilli = Instant.now().toEpochMilli();
        super.run();
        drlm drlmVar = this.a;
        if (drlmVar != null) {
            drlmVar.b = Instant.now().toEpochMilli() - epochMilli;
        }
    }
}

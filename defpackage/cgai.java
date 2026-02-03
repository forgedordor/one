package defpackage;

import android.net.TrafficStats;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgai extends eoon {
    public static final cczv a = cdag.h(cdag.b, "enable_silent_feedback_on_traffic_executor_failure", false);
    public final fcsu b;
    private final eosc c;
    private boolean d = false;
    private final int e;

    public cgai(fcsu fcsuVar, int i, eosc eoscVar) {
        this.b = fcsuVar;
        this.e = i;
        this.c = eoscVar;
    }

    public final int a() {
        int i = this.e;
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.d;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        eiju eijuVarF = eijx.f(new Runnable() { // from class: cgah
            @Override // java.lang.Runnable
            public final void run() {
                cgai cgaiVar = this.a;
                int threadStatsTag = TrafficStats.getThreadStatsTag();
                TrafficStats.setThreadStatsTag(cgaiVar.a());
                try {
                    runnable.run();
                } finally {
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                }
            }
        }, this.c);
        if (((Boolean) a.e()).booleanValue()) {
            eijuVarF.f(Throwable.class, new eooz() { // from class: cgag
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return ((cden) this.a.b.b()).b((Throwable) obj);
                }
            }, eoqg.a);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.d;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.d;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.d = true;
    }

    @Override // java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ List shutdownNow() {
        shutdown();
        int i = ekgb.d;
        return ekoe.a;
    }
}

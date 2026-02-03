package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdlh extends fdlg implements fdkh {
    private final Executor a;

    public fdlh(Executor executor) {
        Method method;
        this.a = executor;
        Method method2 = fdxw.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = fdxw.a) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, true);
        } catch (Throwable unused) {
        }
    }

    private static final void j(fcyh fcyhVar, RejectedExecutionException rejectedExecutionException) {
        fdlw.d(fcyhVar, fdle.a("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture k(ScheduledExecutorService scheduledExecutorService, Runnable runnable, fcyh fcyhVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            j(fcyhVar, e);
            return null;
        }
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            j(fcyhVar, e);
            fdjq fdjqVar = fdkq.a;
            fdzy.a.a(fcyhVar, runnable);
        }
    }

    @Override // defpackage.fdkh
    public final fdks c(long j, Runnable runnable, fcyh fcyhVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureK = scheduledExecutorService != null ? k(scheduledExecutorService, runnable, fcyhVar, j) : null;
        return scheduledFutureK != null ? new fdkr(scheduledFutureK) : fdkd.a.v(j, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.fdkh
    public final void d(long j, fdis fdisVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureK = scheduledExecutorService != null ? k(scheduledExecutorService, new fdmq(this, fdisVar), ((fdiu) fdisVar).b, j) : null;
        if (scheduledFutureK != null) {
            ((fdiu) fdisVar).D(new fdio(scheduledFutureK));
        } else {
            fdkd.a.d(j, fdisVar);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdlh) && ((fdlh) obj).a == this.a;
    }

    @Override // defpackage.fdlg
    public final Executor g() {
        return this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.fdjq
    public final String toString() {
        return this.a.toString();
    }
}

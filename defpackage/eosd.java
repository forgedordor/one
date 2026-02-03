package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface eosd extends ScheduledExecutorService, eosc {
    eosb d(Runnable runnable, long j, TimeUnit timeUnit);

    eosb e(Callable callable, long j, TimeUnit timeUnit);

    eosb f(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    eosb g(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}

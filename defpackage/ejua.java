package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejua {
    public static ListenableFuture a(Runnable runnable, long j, TimeUnit timeUnit, diep diepVar, eosd eosdVar) {
        long jA = diepVar.a() + TimeUnit.MILLISECONDS.convert(0L, timeUnit);
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        SettableFuture settableFutureCreate = SettableFuture.create();
        final AtomicReference atomicReference = new AtomicReference(null);
        eosb eosbVarSchedule = eosdVar.schedule(new ejtz(settableFutureCreate, runnable, atomicReference, eosdVar, jA, jConvert, diepVar), 0L, timeUnit);
        while (!atomicReference.compareAndSet(null, eosbVarSchedule) && atomicReference.get() == null) {
        }
        settableFutureCreate.b(new Runnable() { // from class: ejty
            @Override // java.lang.Runnable
            public final void run() {
                ((Future) atomicReference.get()).cancel(false);
            }
        }, eoqg.a);
        return settableFutureCreate;
    }
}

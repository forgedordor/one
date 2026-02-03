package defpackage;

import android.os.Handler;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzsn {
    public final diep a;
    public final fcsu b;
    public final dzsb c;
    public final Handler d;
    public final dzlm e;
    public int f = 0;
    public long g = -1;
    public volatile long h = -1;
    volatile boolean i = false;
    final AtomicReference j = new AtomicReference(eorv.a);
    public final dzhl k;
    private final eosd l;

    public dzsn(diep diepVar, eosd eosdVar, dzhl dzhlVar, fcsu fcsuVar, dzsb dzsbVar, dzlm dzlmVar, Handler handler) {
        this.a = diepVar;
        this.l = eosdVar;
        this.k = dzhlVar;
        this.b = fcsuVar;
        this.c = dzsbVar;
        this.d = handler;
        this.e = dzlmVar;
    }

    public final void a(Runnable runnable, int i) {
        if (this.i) {
            AtomicReference atomicReference = this.j;
            SettableFuture settableFutureCreate = SettableFuture.create();
            atomicReference.set(settableFutureCreate);
            if (this.i) {
                settableFutureCreate.o(this.l.schedule(runnable, i, TimeUnit.MILLISECONDS));
            }
        }
    }

    final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.j.set(eork.l(new dzsk(this), this.l));
    }
}

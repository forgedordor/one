package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfe implements Executor, dzjg {
    public final eosd a;
    private final dzjh b;
    private final fcsu e;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean f = new AtomicBoolean();

    public dzfe(eosd eosdVar, dzjh dzjhVar, fcsu fcsuVar) {
        this.a = eosdVar;
        this.b = dzjhVar;
        this.e = fcsuVar;
        dzji dzjiVar = dzjhVar.a.a;
        int i = dzji.c;
        if (dzjiVar.b.get() > 0) {
            k();
        } else {
            dzjhVar.a(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.schedule(new Callable() { // from class: dzfd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterResume", 120, "DeferrableExecutor.java")).q("DeferrableExecutor unblocked after onResume");
                this.a.i();
                return null;
            }
        }, 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.dzjg
    public final void d(Activity activity) {
        this.b.b(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d) {
            this.a.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            j();
        } else {
            if (this.f.getAndSet(true)) {
                return;
            }
            if (((Boolean) ((ejwi) ((eyig) this.e).a).e(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: dzfb
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        dzfe dzfeVar = this.a;
                        dzfeVar.a.schedule(new dzfc(dzfeVar), 7000L, TimeUnit.MILLISECONDS);
                        return false;
                    }
                });
            } else {
                this.a.schedule(new dzfc(this), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void i() {
        this.d = true;
        j();
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}

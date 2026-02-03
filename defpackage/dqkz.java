package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqkz extends eooi implements Runnable, eosb {
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d = new AtomicLong(0);
    Runnable e;
    final /* synthetic */ dqlb f;

    public dqkz(dqlb dqlbVar, Runnable runnable, long j, long j2, boolean z) {
        this.f = dqlbVar;
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long d() {
        return Math.max(0L, ((this.d.get() * this.b) + this.a) - this.f.a.a());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return dqlb.h(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(d(), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            this.e.run();
            if (this.c) {
                dqlb dqlbVar = this.f;
                dqlbVar.b.postDelayed(this, d());
            } else {
                dqlb dqlbVar2 = this.f;
                dqlbVar2.b.postDelayed(this, this.b);
            }
        } catch (Throwable th) {
            this.e = null;
            setException(th);
        }
    }
}

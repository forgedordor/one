package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhy {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(fdhy.class, "c");
    public final fdib b;
    public volatile long c;

    public fdhy(long j, fdib fdibVar) {
        this.b = fdibVar;
        this.c = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        boolean zCompareAndSet = a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.b == fdia.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.c);
    }
}

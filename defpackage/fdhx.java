package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhx {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(fdhx.class, "c");
    public final fdib b;
    public volatile int c;

    public fdhx(int i, fdib fdibVar) {
        this.b = fdibVar;
        this.c = i;
    }

    public final int a() {
        return a.decrementAndGet(this);
    }

    public final int b() {
        return a.incrementAndGet(this);
    }

    public final boolean c(int i, int i2) {
        boolean zCompareAndSet = a.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.b == fdia.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.c);
    }
}

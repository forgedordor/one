package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhw {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(fdhw.class, "c");
    public final fdib b;
    public volatile int c;

    public fdhw(boolean z, fdib fdibVar) {
        this.b = fdibVar;
        this.c = z ? 1 : 0;
    }

    public final boolean a(boolean z, boolean z2) {
        boolean zCompareAndSet = a.compareAndSet(this, z ? 1 : 0, z2 ? 1 : 0);
        if (!zCompareAndSet || this.b == fdia.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final boolean b() {
        return this.c != 0;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}

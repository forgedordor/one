package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmb extends AtomicInteger {
    public final dqmh a;
    public final long b;
    public final AtomicReference c;
    private final ListenableFuture d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqmb(long j, dqmh dqmhVar, ListenableFuture listenableFuture) {
        super(dqmc.a(dqmf.a(j), false, false));
        dqmhVar.getClass();
        this.a = dqmhVar;
        this.d = listenableFuture;
        this.b = dqmf.c(j);
        this.c = new AtomicReference();
    }

    public final void a() {
        int i;
        do {
            i = get();
        } while (!compareAndSet(i, dqmc.e(i, 0, false, true, 3)));
        if (dqmc.d(i)) {
            dqmh dqmhVar = this.a;
            if (!dqmhVar.d) {
                throw new IllegalStateException("Could not have been boosted while not holding a lock.");
            }
            dqmhVar.e = dqmhVar.c;
        }
        for (dqlz dqlzVar = (dqlz) this.c.getAndSet(dqly.a); dqlzVar != null; dqlzVar = dqlzVar.b) {
            LockSupport.unpark(dqlzVar.a.a);
        }
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return "Booster[Thread=[" + this.a.a + ", future=[" + this.d + "]]";
    }
}

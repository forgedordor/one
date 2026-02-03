package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcov implements Runnable {
    final /* synthetic */ fbzm a;

    public fcov(fbzm fbzmVar) {
        this.a = fbzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fbzm fbzmVar = this.a;
        fbzn fbznVar = fbzmVar.b;
        AtomicLong atomicLong = fbznVar.c;
        long j = fbzmVar.a;
        long jMax = Math.max(j + j, j);
        if (atomicLong.compareAndSet(j, jMax)) {
            fbzn.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{fbznVar.b, Long.valueOf(jMax)});
        }
    }
}

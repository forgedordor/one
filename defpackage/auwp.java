package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auwp {
    public final eooy a;
    private final Executor d;
    private final eijt e = new eijt();
    public final AtomicLong b = new AtomicLong(Long.MIN_VALUE);
    public final AtomicLong c = new AtomicLong(Long.MIN_VALUE);

    public auwp(eooy eooyVar, Executor executor) {
        this.a = eooyVar;
        this.d = executor;
    }

    public final eiju a() {
        final long jIncrementAndGet = this.b.incrementAndGet();
        ejwl.l(jIncrementAndGet != Long.MIN_VALUE);
        return eiju.g(this.e.a(new eooy() { // from class: auwn
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                long j = jIncrementAndGet;
                final auwp auwpVar = this.a;
                if (j <= auwpVar.c.get()) {
                    return eijx.c();
                }
                AtomicLong atomicLong = auwpVar.b;
                eooy eooyVar = auwpVar.a;
                final long j2 = atomicLong.get();
                return eiju.g(eooyVar.a()).h(new ejvr() { // from class: auwo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        auwpVar.c.set(j2);
                        return obj;
                    }
                }, eoqg.a);
            }
        }, this.d));
    }
}

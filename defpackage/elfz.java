package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elfz {
    static final ScheduledExecutorService a;
    private static final ThreadFactory b;

    static {
        eosw eoswVar = new eosw();
        eoswVar.d("RetryingFuture-Timer-%d");
        eoswVar.c(true);
        ThreadFactory threadFactoryB = eosw.b(eoswVar);
        b = threadFactoryB;
        a = Executors.newSingleThreadScheduledExecutor(threadFactoryB);
    }
}

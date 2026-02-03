package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dvhm {
    public final eosc a;

    public dvhm() {
        eosw eoswVar = new eosw();
        eoswVar.c(true);
        eoswVar.d("LIT-TimeoutScheduler");
        this.a = a(new ScheduledThreadPoolExecutor(1, eosw.b(eoswVar)));
    }

    protected abstract eosc a(ScheduledExecutorService scheduledExecutorService);
}

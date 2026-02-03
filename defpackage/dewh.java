package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dewh extends dewj {
    final /* synthetic */ dewk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dewh(dewk dewkVar, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(timeUnit, blockingQueue);
        this.a = dewkVar;
    }

    @Override // defpackage.dewj, java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (!(runnable instanceof dewd)) {
            dhja.h(dewk.a, "Business media download executed: Runnable is not an instance of BusinessInfoMediaRetrievalRunnable", new Object[0]);
            return;
        }
        dewd dewdVar = (dewd) runnable;
        String str = dewdVar.b;
        dhja.l(dewk.a, "Business media download executed for botId %s", dhiz.GENERIC.c(str));
        int i = dewdVar.a;
        if (i == 0 || i == 2) {
            dewk dewkVar = this.a;
            dewi dewiVar = dewdVar.d;
            dewkVar.h(str);
        }
    }
}

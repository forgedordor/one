package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dewg extends dewj {
    final /* synthetic */ dewk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dewg(dewk dewkVar, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(timeUnit, blockingQueue);
        this.a = dewkVar;
    }

    @Override // defpackage.dewj, java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (!(runnable instanceof dewf)) {
            dhja.h(dewk.a, "Business metadata download executed: Runnable is not an instance of BusinessInfoRetrievalRunnable", new Object[0]);
            return;
        }
        dewf dewfVar = (dewf) runnable;
        String str = dewfVar.b;
        dhip dhipVar = dewk.a;
        dhiz dhizVar = dhiz.GENERIC;
        dhja.l(dhipVar, "Business metadata download executed for botId %s", dhizVar.c(str));
        if (dewfVar.d == dewi.INFO_LOCALLY_AVAILABLE) {
            dhja.l(dhipVar, "Checking business media retrieval for botId %s", dhizVar.c(str));
            this.a.e(str);
        } else {
            this.a.h(str);
            dhja.h(dhipVar, "Unable to start business media retrieval for botId %s, business info is not locally available", dhizVar.c(str));
        }
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqnx {
    public static eiju a(eiju eijuVar) {
        return eijuVar.h(new ejvr() { // from class: cqnu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public static eiju b(eiju eijuVar, final ejxr ejxrVar, ScheduledExecutorService scheduledExecutorService, Duration duration) {
        return eijuVar.j(duration.toMillis(), TimeUnit.MILLISECONDS, scheduledExecutorService).f(TimeoutException.class, new eooz() { // from class: cqnv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return (ListenableFuture) ejxrVar.get();
            }
        }, scheduledExecutorService);
    }

    @Deprecated
    public static void c(ListenableFuture listenableFuture, String str, String str2) {
        eika.l(listenableFuture, new cqnw(str, str2), eoqg.a);
    }
}

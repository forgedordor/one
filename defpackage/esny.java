package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esny {
    public static fbnd a(esof esofVar) {
        fcox fcoxVar = new fcox(esofVar.r(), esofVar.q());
        esmi esmiVar = (esmi) esofVar;
        fcoxVar.g(esmiVar.d);
        Executor executor = esmiVar.c;
        fcoxVar.p(executor);
        fcoxVar.k(executor);
        fcoxVar.h(esmiVar.k, TimeUnit.MILLISECONDS);
        long j = esmiVar.m;
        fcoxVar.n(j, TimeUnit.MILLISECONDS);
        fcoxVar.o(j, TimeUnit.MILLISECONDS);
        ScheduledExecutorService scheduledExecutorService = esmiVar.e;
        if (scheduledExecutorService != null) {
            fcoxVar.e = new fcdj(scheduledExecutorService);
        }
        String str = esmiVar.f;
        if (str != null) {
            fcoxVar.l(str);
        }
        return fbnk.b(fcoxVar.a(), new drgt(esmiVar.g));
    }
}

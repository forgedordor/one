package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehms {
    public static final ecnr a;
    public final Context b;
    public final ebbw c;
    public final ExecutorService d;
    public final ScheduledExecutorService e;
    public final int f;
    public final Map g;
    public final ekrg h;
    public final boolean i;
    public final Map j;
    private final Map k;
    private final eygg l;

    static {
        ecnk ecnkVar = new ecnk();
        ecnkVar.c("CREATE TABLE ListenerSuccessfulRuns (listener_key, version_code INTEGER NOT NULL);");
        ecnkVar.c("CREATE TABLE AllListenersSucceededVersionTable (version_code INTEGER PRIMARY KEY ON CONFLICT REPLACE);");
        a = ecnkVar.a();
    }

    public ehms(Context context, ebbw ebbwVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, int i, Map map, Map map2, eygg eyggVar) {
        context.getClass();
        executorService.getClass();
        scheduledExecutorService.getClass();
        eyggVar.getClass();
        this.b = context;
        this.c = ebbwVar;
        this.d = executorService;
        this.e = scheduledExecutorService;
        this.f = i;
        this.k = map;
        this.g = map2;
        this.l = eyggVar;
        if (!fcva.as(((ekgp) map).keySet(), ((ekgp) map2).keySet()).isEmpty()) {
            Set setAs = fcva.as(((ekgp) map).keySet(), ((ekgp) map2).keySet());
            Objects.toString(setAs);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(setAs.toString()));
        }
        this.h = ekrg.c("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner");
        Boolean bool = false;
        bool.getClass();
        this.i = false;
        this.j = ebbwVar.a() ? fcwa.j(map, map2) : map2;
    }

    public final ecmd a() {
        Object objB = this.l.b();
        objB.getClass();
        return (ecmd) objB;
    }
}

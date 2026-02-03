package defpackage;

import android.app.Service;
import android.os.IBinder;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esty {
    private static final ekrg a = ekrg.c("com/google/frameworks/client/data/android/server/Endpoint");
    private final lvp b;
    private final ScheduledExecutorService c;
    private final fbpc d;
    private final ejwi e;
    private final fbuh f;

    public esty(Service service, ScheduledExecutorService scheduledExecutorService, fbpc fbpcVar, ejwi ejwiVar) {
        ejwl.b(service instanceof lvp, "A service hosting an Endpoint must be a LifecycleService");
        this.b = (lvp) service;
        this.c = scheduledExecutorService;
        this.d = fbpcVar;
        this.e = ejwiVar;
        this.f = new fbuh();
        ((ekrd) ((ekrd) a.h()).h("com/google/frameworks/client/data/android/server/Endpoint", "<init>", 59, "Endpoint.java")).t("Created gRPC endpoint for service %s", service.getClass());
    }

    public final IBinder a() {
        IBinder iBinder = this.f.a;
        iBinder.getClass();
        return iBinder;
    }

    public final void b(fbut fbutVar) {
        c(fbutVar, fbuj.a);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.List] */
    public final void c(fbut fbutVar, fbuj fbujVar) throws ClassNotFoundException {
        drgk.a();
        fbug fbugVar = new fbug(fbty.b(this.b), this.f);
        fbugVar.g(fbutVar);
        fbvb fbvbVar = fbugVar.b;
        fbujVar.getClass();
        fbvbVar.f = fbujVar;
        ScheduledExecutorService scheduledExecutorService = this.c;
        fbugVar.e(scheduledExecutorService);
        scheduledExecutorService.getClass();
        fbvbVar.d = new fcdj(scheduledExecutorService);
        fbugVar.f(this.d);
        fboo fbooVar = new fboo();
        fcly fclyVar = fbugVar.a;
        fclyVar.k = fbooVar;
        fclyVar.l = fbns.a();
        Iterator it = ((ejwt) this.e).a.iterator();
        while (it.hasNext()) {
            fbugVar.c((fbso) it.next());
        }
        fbsj fbsjVarA = fbugVar.a();
        try {
            fbsjVarA.d();
            fbul.a(this.b.P(), fbsjVarA);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to start Server for Endpoint Service ".concat(String.valueOf(String.valueOf(this.b.getClass()))), e);
        }
    }
}

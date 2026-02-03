package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class estx {
    private final Context a;
    private final Executor b;
    private final ScheduledExecutorService c;
    private final ScheduledExecutorService d;

    public estx(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.a = context;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.d = scheduledExecutorService2;
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    final fbqm a(fbty fbtyVar, fbud fbudVar, fbub fbubVar, fbur fburVar, fbuj fbujVar, ejwi ejwiVar, ejwi ejwiVar2) {
        ejwl.b(true, "Cross-User channel must not be used with the current UserHandle.");
        fbuc fbucVar = new fbuc(fbtyVar, this.a, fbudVar);
        fbucVar.v(this.b);
        ScheduledExecutorService scheduledExecutorService = this.c;
        fbucVar.w(scheduledExecutorService);
        fbucVar.g(scheduledExecutorService);
        fbucVar.k(this.d);
        fbucVar.y(fbubVar);
        fbucVar.x(fburVar);
        fbujVar.getClass();
        fbucVar.a.h = fbujVar;
        fbucVar.d(new fboo());
        fbucVar.c(fbns.a());
        fbucVar.h(1L, TimeUnit.MINUTES);
        Iterator it = ((ejwt) ejwiVar).a.iterator();
        while (it.hasNext()) {
            fbucVar.i((fbni) it.next());
        }
        if (ejwiVar2.g()) {
            fbucVar.h(((Long) ejwiVar2.c()).longValue(), TimeUnit.SECONDS);
        }
        return fbucVar.a();
    }
}

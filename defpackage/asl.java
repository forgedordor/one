package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asl {
    private final Executor a;
    private final ScheduledExecutorService b;
    private final Handler c;
    private final aqq d;
    private final bly e;
    private final bly f;

    public asl(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, aqq aqqVar, bly blyVar, bly blyVar2) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = handler;
        this.d = aqqVar;
        this.e = blyVar;
        this.f = blyVar2;
    }

    final ask a() {
        return new asy(this.e, this.f, this.d, this.a, this.b, this.c);
    }
}

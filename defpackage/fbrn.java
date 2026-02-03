package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbrn {
    public final int a;
    public final fbsh b;
    public final fbtk c;
    public final fbrt d;
    public final ScheduledExecutorService e;
    public final Executor f;
    private final fbnf g;
    private final fchw h;

    public fbrn(fbrm fbrmVar) {
        Integer num = fbrmVar.a;
        num.getClass();
        this.a = num.intValue();
        fbsh fbshVar = fbrmVar.b;
        fbshVar.getClass();
        this.b = fbshVar;
        fbtk fbtkVar = fbrmVar.c;
        fbtkVar.getClass();
        this.c = fbtkVar;
        fbrt fbrtVar = fbrmVar.d;
        fbrtVar.getClass();
        this.d = fbrtVar;
        this.e = fbrmVar.e;
        this.g = fbrmVar.f;
        this.f = fbrmVar.g;
        this.h = fbrmVar.h;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.f("defaultPort", this.a);
        ejwfVarB.b("proxyDetector", this.b);
        ejwfVarB.b("syncContext", this.c);
        ejwfVarB.b("serviceConfigParser", this.d);
        ejwfVarB.b("customArgs", null);
        ejwfVarB.b("scheduledExecutorService", this.e);
        ejwfVarB.b("channelLogger", this.g);
        ejwfVarB.b("executor", this.f);
        ejwfVarB.b("overrideAuthority", null);
        ejwfVarB.b("metricRecorder", this.h);
        return ejwfVarB.toString();
    }
}

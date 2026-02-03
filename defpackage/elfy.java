package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elfy {
    public ejwi a;
    public elga b;
    private ejwi c;
    private final ejya d;

    public elfy() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.c = ejudVar;
        this.d = ejya.b;
        this.b = elgb.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elgb a(ejxr ejxrVar, elfq elfqVar, ejwm ejwmVar) {
        boolean z = true;
        if (!this.a.g() && !this.c.g()) {
            z = false;
        }
        ejwl.m(z, "Either executor or scheduledExecutorService needs to be set.");
        return new elgb(ejxrVar, elfqVar, ejwmVar, (Executor) this.a.a(this.c).c(), this.c.g() ? this.c.c() : elfz.a, this.d, this.b);
    }

    public final void b(ScheduledExecutorService scheduledExecutorService) {
        this.c = ejwi.j(scheduledExecutorService);
    }
}

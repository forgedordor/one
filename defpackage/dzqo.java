package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzqo {
    private static final dzqn g = new dzqn() { // from class: dzqi
        @Override // defpackage.dzqn
        public final void a(int i, String str) {
        }
    };
    public final eygg a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile dzqn d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public dzqo(dzjd dzjdVar, eosd eosdVar, Executor executor, eygg eyggVar) {
        this.a = eyggVar;
        this.b = executor;
        dzjdVar.a(new dzqm(this, eosdVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        ScheduledFuture scheduledFuture2 = this.f;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f = null;
        }
    }
}

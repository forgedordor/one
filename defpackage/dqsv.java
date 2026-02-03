package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqsv {
    public final dqss a;
    private final kog b;
    private final Runnable c;
    private final AtomicBoolean d = new AtomicBoolean(true);

    public dqsv(Runnable runnable, kog kogVar, dqss dqssVar) {
        this.c = runnable;
        this.b = kogVar;
        this.a = dqssVar;
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            this.b.d();
        }
    }

    public final void b() {
        if (this.d.getAndSet(false)) {
            this.c.run();
            this.b.b(null);
        }
    }
}

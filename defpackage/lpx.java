package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpx {
    public final lpu a;
    final Executor b;

    public lpx(Executor executor, lpu lpuVar) {
        this.a = lpuVar;
        this.b = executor;
    }

    final void a(final Throwable th) {
        this.b.execute(new Runnable() { // from class: lpw
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a(th);
            }
        });
    }

    final void b() {
        this.b.execute(new Runnable() { // from class: lpv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b();
            }
        });
    }
}

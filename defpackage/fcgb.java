package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcgb implements Executor {
    private final fchy a;
    private Executor b;

    public fcgb(fchy fchyVar) {
        this.a = fchyVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    final synchronized Executor a() {
        if (this.b == null) {
            ?? A = this.a.a();
            A.getClass();
            this.b = A;
        }
        return this.b;
    }

    final synchronized void b() {
        Executor executor = this.b;
        if (executor != null) {
            this.a.b(executor);
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a().execute(runnable);
    }
}

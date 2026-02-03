package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fboc implements Runnable {
    final fboa a;
    public final fbog b;
    private final Executor c;

    public fboc(Executor executor, fboa fboaVar, fbog fbogVar) {
        this.c = executor;
        this.a = fboaVar;
        this.b = fbogVar;
    }

    final void a() {
        try {
            this.c.execute(this);
        } catch (Throwable th) {
            fbog.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}

package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbny implements Runnable {
    final /* synthetic */ fbnz a;

    public fbny(fbnz fbnzVar) {
        this.a = fbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.j(new TimeoutException("context timed out"));
        } catch (Throwable th) {
            fbog.c.logp(Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th);
        }
    }
}

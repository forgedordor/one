package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbzw implements fckr {
    private static final Logger c = Logger.getLogger(fbzw.class.getName());
    public fbtj a;
    public fcdg b;
    private final ScheduledExecutorService d;
    private final fbtk e;

    public fbzw(ScheduledExecutorService scheduledExecutorService, fbtk fbtkVar) {
        this.d = scheduledExecutorService;
        this.e = fbtkVar;
    }

    @Override // defpackage.fckr
    public final void a() {
        fbtk fbtkVar = this.e;
        fbtkVar.d();
        fbtkVar.execute(new Runnable() { // from class: fbzv
            @Override // java.lang.Runnable
            public final void run() {
                fbzw fbzwVar = this.a;
                fbtj fbtjVar = fbzwVar.a;
                if (fbtjVar != null && fbtjVar.b()) {
                    fbtjVar.a();
                }
                fbzwVar.b = null;
            }
        });
    }

    @Override // defpackage.fckr
    public final void b(Runnable runnable) {
        fbtk fbtkVar = this.e;
        fbtkVar.d();
        if (this.b == null) {
            this.b = new fcdg();
        }
        fbtj fbtjVar = this.a;
        if (fbtjVar == null || !fbtjVar.b()) {
            long jA = this.b.a();
            this.a = fbtkVar.a(runnable, jA, TimeUnit.NANOSECONDS, this.d);
            c.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        }
    }
}

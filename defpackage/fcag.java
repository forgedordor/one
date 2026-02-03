package defpackage;

import io.grpc.Status;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcag implements Runnable, fboa {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ fcam f;

    public fcag(fcam fcamVar, fbol fbolVar, boolean z) {
        long jB;
        this.f = fcamVar;
        this.a = z;
        if (fbolVar == null) {
            this.b = false;
            jB = 0;
        } else {
            this.b = true;
            jB = fbolVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = jB;
    }

    @Override // defpackage.fboa
    public final void a(fbog fbogVar) {
        if (this.b && this.a && (fbogVar.c() instanceof TimeoutException)) {
            this.f.h.c(b());
        } else {
            this.f.h.c(fboi.b(fbogVar));
        }
    }

    final Status b() {
        long j = this.c;
        long jAbs = Math.abs(j) / TimeUnit.SECONDS.toNanos(1L);
        long jAbs2 = Math.abs(j) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.a ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb.append("s. ");
        fcam fcamVar = this.f;
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) fcamVar.g.h(fbnm.f)) == null ? 0.0d : r1.longValue() / fcam.a)));
        if (fcamVar.h != null) {
            fceg fcegVar = new fceg();
            fcamVar.h.b(fcegVar);
            sb.append(" ");
            sb.append(fcegVar);
        }
        return Status.f.withDescription(sb.toString());
    }

    final void c() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.e.g(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.h.c(b());
    }
}

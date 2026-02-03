package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofc {
    public final ScheduledExecutorService a = mgb.S("WatchdogTimer");
    private final long b;
    private ScheduledFuture c;
    private final odz d;

    public ofc(long j, odz odzVar) {
        this.b = j;
        this.d = odzVar;
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.c;
        mee.f(scheduledFuture);
        scheduledFuture.cancel(false);
    }

    public final void b() {
        final odz odzVar = this.d;
        this.c = this.a.schedule(new Runnable() { // from class: ofb
            @Override // java.lang.Runnable
            public final void run() {
                oeg oegVar = odzVar.a;
                ocp ocpVar = new ocp("Muxer error", new IllegalStateException(mgb.I("Abort: no output sample written in the last %d milliseconds. DebugTrace: %s", Long.valueOf(oegVar.b), mjr.a())), 7002);
                oer oerVar = oegVar.g;
                mee.f(oerVar);
                oerVar.b(ocpVar);
            }
        }, this.b, TimeUnit.MILLISECONDS);
    }
}

package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import internal.J.N;
import org.chromium.base.TraceEvent;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffym extends ffyl implements MessageQueue.IdleHandler {
    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    private final void c() {
        if (TraceEvent.a && !this.f) {
            this.a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.f = true;
            Log.v("TraceEvt_LooperMonitor", "attached idle handler");
            return;
        }
        if (!this.f || TraceEvent.a) {
            return;
        }
        Looper.myQueue().removeIdleHandler(this);
        this.f = false;
        Log.v("TraceEvt_LooperMonitor", "detached idle handler");
    }

    private static void d(int i, String str) {
        if (TraceEvent.a) {
            N.ML40H8ed("TraceEvent.LooperMonitor:IdleStats", str);
        }
        Log.println(i, "TraceEvt_LooperMonitor", str);
    }

    @Override // defpackage.ffyl
    public final void a(String str) {
        if (this.e == 0) {
            TraceEvent.d();
        }
        this.b = SystemClock.elapsedRealtime();
        c();
        super.a(str);
    }

    @Override // defpackage.ffyl
    public final void b(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        if (jElapsedRealtime > 16) {
            d(5, "observed a task that took " + jElapsedRealtime + "ms: " + str);
        }
        super.b(str);
        c();
        this.c++;
        this.e++;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a;
        if (j == 0) {
            this.a = jElapsedRealtime;
            j = jElapsedRealtime;
        }
        long j2 = jElapsedRealtime - j;
        this.d++;
        TraceEvent.b("Looper.queueIdle", this.e + " tasks since last idle.");
        if (j2 > 48) {
            d(3, this.c + " tasks and " + this.d + " idles processed so far, " + this.e + " tasks bursted and " + j2 + "ms elapsed since last idle");
        }
        this.a = jElapsedRealtime;
        this.e = 0;
        return true;
    }
}

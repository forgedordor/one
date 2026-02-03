package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhlb extends Thread {
    private static final long b = TimeUnit.SECONDS.toMillis(30);
    final long a;
    private final PowerManager.WakeLock c;

    protected dhlb(String str, Context context, Runnable runnable, long j) {
        super(runnable, str);
        this.c = dhkk.a(context).newWakeLock(1, str);
        this.a = j;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        super.run();
        try {
            dhja.o("Releasing wake lock for %s", getName());
            this.c.release();
        } catch (RuntimeException e) {
            dhja.s(e, "Exception thrown while releasing wakelock.", new Object[0]);
        }
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        dhja.o("Acquiring wake lock for %s", getName());
        long j = this.a;
        if (j == 0) {
            j = b;
        }
        this.c.acquire(j);
        super.start();
    }
}

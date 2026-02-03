package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import internal.J.N;
import java.util.ArrayList;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffyp implements MessageQueue.IdleHandler {
    public static ffyp a;
    private long b;

    public static void a() {
        PostTask.b(new Runnable() { // from class: ffyo
            @Override // java.lang.Runnable
            public final void run() {
                boolean zMnfJQqTB = N.MnfJQqTB();
                ffyp ffypVar = ffyp.a;
                if (ffypVar == null && zMnfJQqTB) {
                    ffyp.a = new ffyp();
                    Looper.myQueue().addIdleHandler(ffyp.a);
                } else {
                    if (ffypVar == null || zMnfJQqTB) {
                        return;
                    }
                    Looper.myQueue().removeIdleHandler(ffyp.a);
                    ffyp.a = null;
                }
            }
        });
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        if (j != 0 && jElapsedRealtime - j <= 1000) {
            return true;
        }
        this.b = jElapsedRealtime;
        if (!TraceEvent.a || !N.MnfJQqTB()) {
            return true;
        }
        TraceEvent.b("instantAndroidViewHierarchy", null);
        ApplicationStatus.b();
        final ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            TraceEvent.d();
            return true;
        }
        final long jHashCode = arrayList.hashCode();
        PostTask.a(0, new Runnable() { // from class: ffyk
            @Override // java.lang.Runnable
            public final void run() {
                N.Ml5G_GLY(jHashCode, arrayList);
            }
        });
        TraceEvent.c(jHashCode);
        return true;
    }
}

package defpackage;

import android.app.Application;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehrt implements Runnable {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Application b;
    final /* synthetic */ Application.ActivityLifecycleCallbacks c;
    final /* synthetic */ long d;

    public ehrt(AtomicBoolean atomicBoolean, Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, long j) {
        this.a = atomicBoolean;
        this.b = application;
        this.c = activityLifecycleCallbacks;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.get()) {
            this.b.unregisterActivityLifecycleCallbacks(this.c);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            dzfj dzfjVarA = dzfj.a();
            dzfjVarA.a.k(new dzfh("ColdLaunchBackground"), this.d, jElapsedRealtime);
            dzfj.a().e(new dzfh("ColdLaunchBackgroundMemory"));
        }
    }
}

package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzor implements dzjg {
    private final eygg a;
    private boolean b = false;
    private Activity c;

    public dzor(eygg<dzpd> eyggVar, final ejwi<fcsu<Boolean>> ejwiVar, Executor executor) {
        this.a = eyggVar;
        executor.execute(new Runnable() { // from class: dzoq
            @Override // java.lang.Runnable
            public final void run() {
                dzor.i(this.a, ejwiVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fcsu, java.lang.Object] */
    public static /* synthetic */ void i(dzor dzorVar, ejwi ejwiVar) {
        if (((Boolean) ((ejwt) ejwiVar).a.b()).booleanValue()) {
            synchronized (dzorVar) {
                dzorVar.b = true;
                Activity activity = dzorVar.c;
                if (activity != null) {
                    dzorVar.d(activity);
                }
                dzorVar.c = null;
            }
        }
    }

    @Override // defpackage.dzjg
    public synchronized void c(Activity activity) {
        if (this.b) {
            ((dzpd) this.a.b()).b(activity);
        } else if (!activity.equals(this.c)) {
            ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 86, "ActivityLevelJankMonitor.java")).D("Activity mismatch (currentActivity=%s, activity=%s)", this.c, activity);
        }
        this.c = null;
    }

    @Override // defpackage.dzjg
    public synchronized void d(Activity activity) {
        if (this.b) {
            ((dzpd) this.a.b()).e(activity);
        } else {
            this.c = activity;
        }
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.dzjg
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}

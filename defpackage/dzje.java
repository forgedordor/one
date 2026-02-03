package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzje extends dziv implements dzjg {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final dzix c;
    private dzfh d;

    public dzje(dzix dzixVar) {
        this.c = dzixVar;
    }

    @Override // defpackage.dzjg
    public final void a(Activity activity, Bundle bundle) {
        this.d = null;
    }

    @Override // defpackage.dzjg
    public final void b(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.dzjg
    public final void d(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.dzjg
    public final void f(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (dzjr.d(applicationContext, dzjr.a(applicationContext, "Primes.onActivityStarted"))) {
            l(dzfh.b(activity.getClass()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 58, "ProcessImportanceForegroundSignalAdapter.java")).q("Activity started with background importance");
        }
    }

    @Override // defpackage.dzjg
    public final void g(Activity activity) {
        dzfh dzfhVarB = dzfh.b(activity.getClass());
        this.d = dzfhVarB;
        Context applicationContext = activity.getApplicationContext();
        if (dzjr.d(applicationContext, dzjr.a(applicationContext, "Primes.onActivityStopped"))) {
            return;
        }
        k(dzfhVarB);
    }

    @Override // defpackage.dzjg
    public final void h(int i) {
        dzfh dzfhVar;
        if (i >= 20 && (dzfhVar = this.d) != null) {
            k(dzfhVar);
        }
        this.d = null;
    }

    @Override // defpackage.dziv
    public final void i(dzfh dzfhVar) {
        this.c.i(dzfhVar);
    }

    @Override // defpackage.dziv
    public final void j(dzfh dzfhVar) {
        this.c.j(dzfhVar);
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.dzjg
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}

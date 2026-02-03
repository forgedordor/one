package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sad implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ sae a;

    public sad(sae saeVar) {
        this.a = saeVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        rzn.c(activity);
        rzn.b(Looper.myLooper() == Looper.getMainLooper());
        sah sahVar = this.a.b;
        sahVar.b.add(activity);
        Iterator it = sahVar.c.iterator();
        while (it.hasNext()) {
            ((sag) it.next()).a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        rzn.c(activity);
        rzn.b(Looper.myLooper() == Looper.getMainLooper());
        sah sahVar = this.a.b;
        if (sahVar.b.remove(activity)) {
            Iterator it = sahVar.c.iterator();
            while (it.hasNext()) {
                ((sag) it.next()).b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

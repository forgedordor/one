package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egof implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ egog a;

    public egof(egog egogVar) {
        this.a = egogVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        egog egogVar = this.a;
        int i = egogVar.c + 1;
        egogVar.c = i;
        if (i == 1) {
            egogVar.a(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        egog egogVar = this.a;
        int i = egogVar.c - 1;
        egogVar.c = i;
        if (i != 0 || activity.isChangingConfigurations()) {
            return;
        }
        egogVar.a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

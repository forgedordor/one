package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztb implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ dztc b;

    public dztb(dztc dztcVar, Application application) {
        this.b = dztcVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        dztc dztcVar = this.b;
        dzst dzstVar = dztcVar.n;
        if (dzstVar.b != null) {
            dzstVar = dztcVar.o;
        }
        dzstVar.a = activity.getClass().getSimpleName();
        dzstVar.b = dzlw.e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        dztc dztcVar = this.b;
        dzst dzstVar = dztcVar.o;
        if (dzstVar.b == null) {
            dzstVar = dztcVar.n;
        }
        if (dzstVar.d == null) {
            dzstVar.d = dzlw.e();
        }
        try {
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new dzsx(this, viewFindViewById));
            viewTreeObserver.addOnPreDrawListener(new dzta(this, viewFindViewById));
        } catch (RuntimeException e) {
            Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onActivityResume", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        dztc dztcVar = this.b;
        dzst dzstVar = dztcVar.o;
        if (dzstVar.b == null) {
            dzstVar = dztcVar.n;
        }
        if (dzstVar.c == null) {
            dzstVar.c = dzlw.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

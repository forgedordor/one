package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqcf implements cqax {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2");

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityCreated", 22, "LoggingApplicationStateManagerV2.java")).t("%s.onCreate", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityDestroyed", 52, "LoggingApplicationStateManagerV2.java")).t("%s.onDestroy", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityPaused", 37, "LoggingApplicationStateManagerV2.java")).t("%s.onPause", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityResumed", 32, "LoggingApplicationStateManagerV2.java")).t("%s.onResume", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivitySaveInstanceState", 47, "LoggingApplicationStateManagerV2.java")).t("%s.onSaveInstanceState", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityStarted", 27, "LoggingApplicationStateManagerV2.java")).t("%s.onStart", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/util/common/LoggingApplicationStateManagerV2", "onActivityStopped", 42, "LoggingApplicationStateManagerV2.java")).t("%s.onStop", activity);
    }
}

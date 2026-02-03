package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eigj implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Application.ActivityLifecycleCallbacks a;
    final /* synthetic */ eigp b;

    public eigj(eigp eigpVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a = activityLifecycleCallbacks;
        this.b = eigpVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (eidc.v()) {
            this.a.onActivityCreated(activity, bundle);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityCreated", 1682);
        try {
            this.a.onActivityCreated(activity, bundle);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityDestroyed(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityDestroyed", 1910);
        try {
            this.a.onActivityDestroyed(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPaused(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPaused", 1796);
        try {
            this.a.onActivityPaused(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (eidc.v()) {
            this.a.onActivityPostCreated(activity, bundle);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostCreated"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostCreated", 1695);
        try {
            this.a.onActivityPostCreated(activity, bundle);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPostDestroyed(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostDestroyed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostDestroyed", 1923);
        try {
            this.a.onActivityPostDestroyed(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPostPaused(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostPaused"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostPaused", 1809);
        try {
            this.a.onActivityPostPaused(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPostResumed(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostResumed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostResumed", 1771);
        try {
            this.a.onActivityPostResumed(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        if (eidc.v()) {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostSaveInstanceState"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostSaveInstanceState", 1885);
        try {
            this.a.onActivityPostSaveInstanceState(activity, bundle);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPostStarted(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStarted"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostStarted", 1733);
        try {
            this.a.onActivityPostStarted(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPostStopped(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStopped"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPostStopped", 1847);
        try {
            this.a.onActivityPostStopped(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (eidc.v()) {
            this.a.onActivityPreCreated(activity, bundle);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreCreated"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreCreated", 1670);
        try {
            this.a.onActivityPreCreated(activity, bundle);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPreDestroyed(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreDestroyed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreDestroyed", 1898);
        try {
            this.a.onActivityPreDestroyed(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPrePaused(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPrePaused"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPrePaused", 1784);
        try {
            this.a.onActivityPrePaused(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPreResumed(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreResumed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreResumed", 1746);
        try {
            this.a.onActivityPreResumed(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        if (eidc.v()) {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreSaveInstanceState"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreSaveInstanceState", 1860);
        try {
            this.a.onActivityPreSaveInstanceState(activity, bundle);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPreStarted(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStarted"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreStarted", 1708);
        try {
            this.a.onActivityPreStarted(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityPreStopped(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStopped"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityPreStopped", 1822);
        try {
            this.a.onActivityPreStopped(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityResumed(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityResumed", 1758);
        try {
            this.a.onActivityResumed(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (eidc.v()) {
            this.a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivitySaveInstanceState", 1872);
        try {
            this.a.onActivitySaveInstanceState(activity, bundle);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityStarted(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityStarted", 1720);
        try {
            this.a.onActivityStarted(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (eidc.v()) {
            this.a.onActivityStopped(activity);
            return;
        }
        eieh eiehVarC = this.b.c(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"), "com/google/apps/tiktok/tracing/TraceCreation$11", "onActivityStopped", 1834);
        try {
            this.a.onActivityStopped(activity);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

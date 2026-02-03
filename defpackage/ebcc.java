package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebcc implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ ejwi c;
    final /* synthetic */ Set d;
    final /* synthetic */ ebbw e;
    final /* synthetic */ fcsu f;

    public ebcc(Application application, ejwi ejwiVar, Set set, ebbw ebbwVar, fcsu fcsuVar) {
        this.b = application;
        this.c = ejwiVar;
        this.d = set;
        this.e = ebbwVar;
        this.f = fcsuVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ejvr, java.lang.Object] */
    private final ekgb a() {
        if (this.a) {
            int i = ekgb.d;
            return ekoe.a;
        }
        this.a = true;
        Application application = this.b;
        application.unregisterActivityLifecycleCallbacks(this);
        ekhv ekhvVar = new ekhv();
        ekhvVar.j(this.d);
        if (this.e.a()) {
            ekhvVar.j((Iterable) this.f.b());
        } else {
            Boolean bool = false;
            bool.getClass();
        }
        ekhx ekhxVarG = ekhvVar.g();
        ekfw ekfwVarD = ekgb.d(ekhxVarG.size());
        ekqg ekqgVarListIterator = ekhxVarG.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((ejwt) this.c).a.apply((Application.ActivityLifecycleCallbacks) ekqgVarListIterator.next());
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            ekfwVarD.h(activityLifecycleCallbacks);
        }
        return ekfwVarD.g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ekgb ekgbVarA = a();
        int i = ((ekoe) ekgbVarA).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) ekgbVarA.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ejwl.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ejwl.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        ekgb ekgbVarA = a();
        int i = ((ekoe) ekgbVarA).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) ekgbVarA.get(i2)).onActivityPreCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ejwl.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ejwl.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ejwl.l(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ejwl.l(this.a);
    }
}

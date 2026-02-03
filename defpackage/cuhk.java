package defpackage;

import android.app.Activity;
import android.os.Bundle;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuhk implements cqax {
    public static final /* synthetic */ int a = 0;
    private final fcsu b;
    private final fcsu c;

    public cuhk(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    private final void a(final Activity activity) {
        Optional optionalA = ((cuhf) this.b.b()).a();
        final fdap fdapVar = new fdap() { // from class: cuhi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                int i = cuhk.a;
                num.getClass();
                activity.getTheme().applyStyle(num.intValue(), true);
                return fctx.a;
            }
        };
        optionalA.ifPresent(new Consumer() { // from class: cuhj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i = cuhk.a;
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (((asgj) this.c.b()).a() || craf.c) {
            return;
        }
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (!((asgj) this.c.b()).a() && craf.c) {
            a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

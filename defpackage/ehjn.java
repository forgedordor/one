package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjn implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ehjt a;

    public ehjn(ehjt ehjtVar) {
        this.a = ehjtVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        this.a.a.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        this.a.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        this.a.b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        final ehjt ehjtVar = this.a;
        Set set = ehjtVar.b;
        set.remove(activity);
        ecem.c();
        if (!ehjtVar.d && set.isEmpty() && ehjtVar.a()) {
            MessageQueue messageQueueMyQueue = Looper.myQueue();
            final MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() { // from class: ehjk
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() throws IOException {
                    final ehjt ehjtVar2 = ehjtVar;
                    if (ehjtVar2.d || !ehjtVar2.b.isEmpty()) {
                        return false;
                    }
                    eieu eieuVarA = eiiy.a("Recreating all activities");
                    try {
                        if (ehjtVar2.a()) {
                            ehjtVar2.d = true;
                            ecem.e(eiid.k(new Runnable() { // from class: ehjl
                                /* JADX WARN: Type inference failed for: r2v5, types: [ehea, java.lang.Object] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    for (ehey eheyVar : ehjtVar2.c.values()) {
                                        if (eheyVar.d()) {
                                            ecem.c();
                                            for (ehhv ehhvVar : eheyVar.b.values()) {
                                                if (ehhvVar.f()) {
                                                    try {
                                                        ehgf ehgfVar = (ehgf) eork.q(ehhvVar.v.c());
                                                        ehgfVar.c();
                                                        ehhr ehhrVarB = ehgfVar.b();
                                                        ehho.a(ehhvVar.s.b().b(ehhrVarB.b, ehhrVarB.d), "Failed to commit to config");
                                                    } catch (ExecutionException e) {
                                                        throw new RuntimeException(e.getCause());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }));
                            Iterator it = ehjtVar2.a.iterator();
                            while (it.hasNext()) {
                                kul.a((Activity) it.next());
                            }
                            ecem.e(new Runnable() { // from class: ehjm
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ehjtVar2.d = false;
                                }
                            });
                        }
                        fczl.a(eieuVarA, null);
                        return false;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            fczl.a(eieuVarA, th);
                            throw th2;
                        }
                    }
                }
            };
            long j = eiid.a;
            final eifn eifnVarE = eidc.e();
            messageQueueMyQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: eihl
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    long j2 = eiid.a;
                    eifn eifnVarH = eidc.h(eidc.b(), eifnVarE);
                    try {
                        return idleHandler.queueIdle();
                    } finally {
                    }
                }
            });
        }
    }
}

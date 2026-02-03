package defpackage;

import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aynk implements Runnable {
    final /* synthetic */ aynl a;

    public aynk(aynl aynlVar) {
        this.a = aynlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cqaz.h();
        final aynl aynlVar = this.a;
        ainv ainvVar = aynlVar.m;
        if (ainvVar != null) {
            ainvVar.c();
        } else {
            cqaz.c("ActionRunnable should have been queued before execution");
        }
        eiju eijuVarG = ((aoon) aynlVar.l.b()).a() ? eijx.g(new Callable() { // from class: aynj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aynl aynlVar2 = aynlVar;
                try {
                    PowerManager powerManager = (PowerManager) ((ActionExecutorImpl) aynlVar2.c).c.getSystemService("power");
                    if (powerManager == null) {
                        return null;
                    }
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, aynlVar2.f.getClass().getName());
                    wakeLockNewWakeLock.acquire(TimeUnit.SECONDS.toMillis(3L));
                    return wakeLockNewWakeLock;
                } catch (RuntimeException e) {
                    ekrw ekrwVarJ = aynl.a.j();
                    ekrwVarJ.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/execution/ActionRunnable", "acquireWakeLock", 157, "ActionRunnable.java")).t("failed to grab wakelock for %s", aynlVar2.f);
                    return null;
                }
            }
        }, aynlVar.i) : eijx.e(null);
        aynm aynmVar = aynlVar.c;
        Action action = aynlVar.f;
        String str = aynlVar.e;
        long j = aynlVar.g;
        ainv ainvVarA = ((ActionExecutorImpl) aynmVar).d.a(str, action.y, action.u);
        ainvVarA.d(j);
        try {
            aynlVar.b();
        } finally {
            ainvVarA.c();
            aynlVar.a(eijuVarG);
        }
    }
}

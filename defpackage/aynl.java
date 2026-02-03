package defpackage;

import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class aynl implements Runnable {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/execution/ActionRunnable");
    public static final cczi b = cdag.h(cdag.b, "action_exceptions_crash", false);
    protected final aynm c;
    protected final aymr d;
    protected final String e;
    public final Action f;
    protected final long g;
    protected final int h;
    protected final eosc i;
    protected final fcsu j;
    protected final fcsu k;
    protected final fcsu l;
    public ainv m;
    private final Runnable n = eiid.k(new aynk(this));

    public aynl(aymr aymrVar, Action action, String str, long j, aynm aynmVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.c = aynmVar;
        this.e = str;
        this.d = aymrVar;
        this.f = action;
        this.g = j;
        this.h = ((ActionExecutorImpl) aynmVar).n.getAndIncrement();
        this.i = eoscVar;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.l = fcsuVar3;
    }

    public final void a(eiju eijuVar) {
        ejvr ejvrVar = new ejvr() { // from class: ayni
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                if (wakeLock == null) {
                    return null;
                }
                try {
                    wakeLock.release();
                    return null;
                } catch (RuntimeException e) {
                    aynl aynlVar = this.a;
                    ekrw ekrwVarH = aynl.a.h();
                    ekrwVarH.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/execution/ActionRunnable", "releaseWakeLock", 175, "ActionRunnable.java")).t("%s took so long that the OS released the wakelock before it finished", aynlVar.f);
                    return null;
                }
            }
        };
        eosc eoscVar = this.i;
        eijuVar.h(ejvrVar, eoscVar).k(auvh.b(), eoscVar);
    }

    public abstract void b();

    public final void c(ainv ainvVar) {
        if (this.m != null) {
            throw new IllegalStateException("An ActionRunnable can only be queued once");
        }
        this.m = ainvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.run();
    }
}

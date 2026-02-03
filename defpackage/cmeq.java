package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmeq implements efaq {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/service/JibeServiceListenerPropagator");
    public final boolean a;
    private final List c = new CopyOnWriteArrayList();

    public cmeq(fcsu fcsuVar) {
        boolean z = true;
        if (((arhb) fcsuVar.b()).a() && !dfog.L()) {
            z = false;
        }
        this.a = z;
    }

    public final void a(efaq efaqVar) {
        if (this.a) {
            this.c.add(efaqVar);
            return;
        }
        ekrw ekrwVarJ = b.j();
        ekrwVarJ.X(eksq.a, "BugleRcsJibe");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.V(10, TimeUnit.MINUTES);
        ekrdVar.Z(eksk.FULL);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/service/JibeServiceListenerPropagator", "registerJibeServiceListener", 61, "JibeServiceListenerPropagator.java")).q("JibeServiceListenerPropagator#registerJibeServiceListener called when dual reg sip is disabled");
    }

    @Override // defpackage.efaq
    public final void d(String str, efap efapVar) {
        if (!this.a) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "BugleRcsJibe");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/service/JibeServiceListenerPropagator", "handleServiceConnectFailed", 90, "JibeServiceListenerPropagator.java")).t("JibeServiceListenerPropagator#handleServiceConnectFailed[%s] called when dual reg sip is disabled. No JibeServiceListener should be attempting to connect.", str);
            return;
        }
        eieu eieuVarK = eiiy.k("JibeServiceListenerPropagator#handleServiceConnectFailed");
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((efaq) it.next()).d(str, efapVar);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaq
    public final void e(String str) {
        if (!this.a) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "BugleRcsJibe");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/service/JibeServiceListenerPropagator", "handleServiceConnected", 108, "JibeServiceListenerPropagator.java")).t("JibeServiceListenerPropagator#handleServiceConnected[%s] called when dual reg sip is disabled. No JibeServiceListener should be attempting to connect.", str);
            return;
        }
        eieu eieuVarK = eiiy.k("JibeServiceListenerPropagator#handleServiceConnected");
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((efaq) it.next()).e(str);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaq
    public final void f(String str) {
        if (!this.a) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "BugleRcsJibe");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/service/JibeServiceListenerPropagator", "handleServiceDisconnected", 72, "JibeServiceListenerPropagator.java")).t("JibeServiceListenerPropagator#handleServiceDisconnected[%s] called when dual reg sip is disabled. No JibeServiceListener should be attempting to connect.", str);
            return;
        }
        eieu eieuVarK = eiiy.k("JibeServiceListenerPropagator#handleServiceDisconnected");
        try {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((efaq) it.next()).f(str);
            }
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

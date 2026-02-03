package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqgt extends PhoneStateListener {
    final /* synthetic */ Consumer a;
    final /* synthetic */ cqgu b;

    public cqgt(cqgu cqguVar, Consumer consumer) {
        this.a = consumer;
        this.b = cqguVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(final ServiceState serviceState) {
        cqgu cqguVar = this.b;
        eieh eiehVarC = cqguVar.c.c("onServiceStateChanged", "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState$2", "onServiceStateChanged", 150);
        try {
            final Consumer consumer = this.a;
            auvh.h(eijx.f(new Runnable() { // from class: cqgs
                @Override // java.lang.Runnable
                public final void run() {
                    cqgu cqguVar2 = this.a.b;
                    consumer.z(cqguVar2.e.a(serviceState, cqguVar2.f));
                }
            }, cqguVar.b));
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

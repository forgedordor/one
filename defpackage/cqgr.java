package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqgr extends PhoneStateListener {
    final /* synthetic */ Consumer a;
    final /* synthetic */ cqgu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqgr(cqgu cqguVar, Executor executor, Consumer consumer) {
        super(executor);
        this.a = consumer;
        this.b = cqguVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        cqgu cqguVar = this.b;
        eieh eiehVarC = cqguVar.c.c("onServiceStateChanged", "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState$1", "onServiceStateChanged", 139);
        try {
            this.a.z(cqguVar.e.a(serviceState, cqguVar.f));
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

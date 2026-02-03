package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dguf extends Handler {
    private static final ekgp a = ekgp.p(0, "START_RCS_STACK", 1, "UPDATE_RCS_CONFIG", 2, "NOTIFY_UPTIME_IGNORE_STATE_CHANGED", 3, "SEND_SIM_EVENT_TO_PROVISIONING_ENGINE", 4, "STOP_RCS_STACK");
    private final dhip b;
    private final WeakReference c;
    private final WeakReference d;

    public dguf(Looper looper, RcsEngineImpl rcsEngineImpl, dfyd dfydVar) {
        super(looper);
        this.b = rcsEngineImpl.m.b("Handler");
        this.c = new WeakReference(rcsEngineImpl);
        this.d = new WeakReference(dfydVar);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [dezc, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = a.get(Integer.valueOf(message.what));
        WeakReference weakReference = this.c;
        Object[] objArr = {obj, weakReference.get() == null ? "null" : "non-null"};
        dhip dhipVar = this.b;
        dhja.l(dhipVar, "handleMessage processing message:[%s] with [%s]:RcsEngineImpl reference", objArr);
        int i = message.what;
        if (i == 0) {
            RcsEngineImpl rcsEngineImpl = (RcsEngineImpl) weakReference.get();
            if (rcsEngineImpl != null) {
                rcsEngineImpl.startRcsStackInternal();
                return;
            } else {
                dhja.h(dhipVar, "skipping doStartRcsStack, engine is null, this should not happen", new Object[0]);
                return;
            }
        }
        if (i == 1) {
            RcsEngineImpl rcsEngineImpl2 = (RcsEngineImpl) weakReference.get();
            if (rcsEngineImpl2 != null) {
                rcsEngineImpl2.updateRcsConfig();
                return;
            } else {
                dhja.h(dhipVar, "skipping doUpdateRcsConfig, engine is null, this should not happen", new Object[0]);
                return;
            }
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    dhja.r(this.b, "Unexpected RCS engine handler message: %s", message);
                    return;
                }
                dhip dhipVar2 = this.b;
                dhja.l(dhipVar2, "RCS engine STOP RCS stack", new Object[0]);
                RcsEngineImpl rcsEngineImpl3 = (RcsEngineImpl) this.c.get();
                if (rcsEngineImpl3 != null) {
                    rcsEngineImpl3.stopRcsStackInternal();
                    return;
                } else {
                    dhja.h(dhipVar2, "skipping doStopImsStack, engine is null, this should not happen", new Object[0]);
                    return;
                }
            }
            return;
        }
        dfyd dfydVar = (dfyd) this.d.get();
        if (dfydVar == null) {
            dhja.h(this.b, "skipping doNotifyUptimeIgnoreStateChanged, tracker is null, this should not happen", new Object[0]);
            return;
        }
        if (dfydVar.n()) {
            try {
                ewfw ewfwVarC = dfydVar.c();
                if (dfyd.o(ewfwVarC)) {
                    dfydVar.k(ewfwVarC);
                } else if (dfydVar.r.isPresent() && dfydVar.r.get().isRegistered()) {
                    dfydVar.l();
                } else {
                    dfydVar.m(dezf.UNKNOWN);
                }
            } catch (dhkf unused) {
                dhja.g("Missing permission to calculate uptime metric.", new Object[0]);
            }
        }
    }
}

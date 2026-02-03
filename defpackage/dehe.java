package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.time.trustedtime.dto.GlobalState;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dehe implements deic {
    public final deis a;
    private final dehy b;
    private final deiq c;
    private final Object d;
    private final dehz e;
    private boolean f;

    public dehe(Context context, dehy dehyVar, GlobalState globalState, Executor executor) {
        deiu deiuVar = new deiu(context, globalState);
        deiq deiqVar = new deiq(globalState);
        dehz dehzVar = new dehz(executor, new dzfh("BasicInternalTimeSignalSupplier"));
        this.d = new Object();
        this.a = deiuVar;
        this.b = dehyVar;
        this.c = deiqVar;
        this.e = dehzVar;
    }

    @Override // defpackage.deic
    public final defn a() {
        synchronized (this.d) {
            if (this.f) {
                return degc.c(null);
            }
            b();
            return this.b.a();
        }
    }

    final void b() {
        synchronized (this.d) {
            this.e.e();
            deis deisVar = this.a;
            synchronized (((deiu) deisVar).d) {
                BroadcastReceiver broadcastReceiver = ((deiu) deisVar).e;
                if (broadcastReceiver != null) {
                    ((deiu) deisVar).e = null;
                    ((deiu) deisVar).b.unregisterReceiver(broadcastReceiver);
                    deiu.a.decrementAndGet();
                }
            }
            this.f = true;
        }
    }

    final void c(TimeSignalResult timeSignalResult) {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            deib deibVar = new deib(timeSignalResult.a, timeSignalResult.b, new degq(this.c.a, timeSignalResult.c.b), timeSignalResult.d, timeSignalResult.e);
            dehz dehzVar = this.e;
            deib deibVar2 = (deib) dehzVar.c();
            if (deibVar2 != null) {
                degq degqVar = deibVar2.c;
                degq degqVar2 = deibVar.c;
                if (degqVar.a != degqVar2.a) {
                    throw new IllegalArgumentException("Ticks must be from the same origin");
                }
                if (degqVar.b > degqVar2.b) {
                    return;
                }
            }
            dehzVar.f(deibVar);
        }
    }

    @Override // defpackage.deic
    public final void d(deig deigVar) {
        synchronized (this.d) {
            if (this.f) {
                throw new IllegalStateException("dispose() has been called");
            }
            dehz dehzVar = this.e;
            if (dehzVar.b() != 0) {
                throw new IllegalStateException("Listener already set");
            }
            deigVar.getClass();
            dehzVar.d(deigVar);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.d) {
            str = "BasicInternalTimeSignalSupplier{parentInitializer=" + this.b.toString() + ", tickerFactory=TickerFactory, internalListenersManager=" + this.e.toString() + ", timeSignalResultReceiver=" + this.a.toString() + ", disposed=" + this.f + "}";
        }
        return str;
    }
}

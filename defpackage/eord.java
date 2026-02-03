package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eord implements Runnable {
    final Future a;
    final eora b;

    public eord(Future future, eora eoraVar) {
        this.a = future;
        this.b = eoraVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thJ;
        Future future = this.a;
        if ((future instanceof eotf) && (thJ = ((eotf) future).j()) != null) {
            this.b.hi(thJ);
            return;
        }
        try {
            this.b.b(eork.q(future));
        } catch (ExecutionException e) {
            this.b.hi(e.getCause());
        } catch (Throwable th) {
            this.b.hi(th);
        }
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.a(this.b);
        return ejwfVarB.toString();
    }
}

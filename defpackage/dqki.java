package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqki extends eoqx implements eosb {
    public volatile eosb a;

    public dqki(ListenableFuture listenableFuture, eosb eosbVar) {
        super(listenableFuture);
        this.a = eosbVar;
        listenableFuture.b(new Runnable() { // from class: dqkh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.cancel(false);
            }
        }, eoqg.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}

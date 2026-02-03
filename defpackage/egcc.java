package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egcc implements egyi {
    private final egcd a;
    private final egcq b;

    public egcc(egcd egcdVar, egcq egcqVar) {
        this.a = egcdVar;
        this.b = egcqVar;
    }

    @Override // defpackage.egyi
    public final eopy a() {
        final ListenableFuture listenableFutureE = this.b.e();
        final ListenableFuture listenableFutureE2 = this.a.e();
        return new eopy(eork.d(listenableFutureE, listenableFutureE2).a(eiid.l(new Callable() { // from class: egcb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                egcx egcxVar = (egcx) eork.q(listenableFutureE);
                return (egcxVar.b & 1) != 0 ? egyh.a((List) eork.q(listenableFutureE2), Instant.ofEpochMilli(egcxVar.c)) : egyh.a;
            }
        }), eoqg.a));
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        return this.b.a();
    }

    @Override // defpackage.egyi
    public final Object c() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}

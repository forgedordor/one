package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdo implements egsc {
    public final egca a;
    private final egcq b;
    private final Executor c;

    public egdo(egcq egcqVar, egca egcaVar, Executor executor) {
        this.b = egcqVar;
        this.a = egcaVar;
        this.c = executor;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        return eooq.f(eooq.g(eoqt.t(this.b.e()), eiid.d(new eooz() { // from class: egdn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return (((egcx) obj).b & 1) != 0 ? eork.i(null) : this.a.a.b();
            }
        }), this.c), eiid.a(new ejvt(new qao())), eoqg.a);
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}

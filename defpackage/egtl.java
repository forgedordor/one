package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtl implements egsc {
    public final fcsu a;
    private final egsq b;

    public egtl(fcsu fcsuVar, egsq egsqVar) {
        this.a = fcsuVar;
        this.b = egsqVar;
    }

    @Override // defpackage.egsp
    public final ListenableFuture a(WorkerParameters workerParameters) {
        return ((egsc) this.a.b()).a(workerParameters);
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        final eieu eieuVarK = eiiy.k("NoAccountWorkerFactory startWork()");
        try {
            ListenableFuture listenableFutureB = this.b.b(new eooy() { // from class: egtk
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    ListenableFuture listenableFutureB2 = ((egsc) this.a.a.b()).b(workerParameters);
                    eieuVarK.b(listenableFutureB2);
                    return listenableFutureB2;
                }
            });
            eieuVarK.close();
            return listenableFutureB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}

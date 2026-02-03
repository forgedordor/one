package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egui implements egsc {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/contrib/work/impl/WipeoutWorker");
    public static final eora b = new egud();
    public final Executor c;
    public final egtw d;
    private final egcd f;
    private final eora g = new egue();
    private final eora h = new eguf();
    public final eora e = new egug();
    private final eora i = new eguh();

    public egui(egcd egcdVar, Executor executor, egtw egtwVar) {
        this.f = egcdVar;
        this.c = executor;
        this.d = egtwVar;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        final ListenableFuture listenableFutureH = this.d.a.h(qbs.a("tiktok_account_work"));
        final ListenableFuture listenableFutureD = this.f.d();
        eijz eijzVarD = eika.d(listenableFutureH, listenableFutureD);
        Callable callable = new Callable() { // from class: egub
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Set set = (Set) eork.q(listenableFutureD);
                Collection collection = (Collection) eork.q(listenableFutureH);
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    efwo efwoVarA = eguk.a(((qbp) it.next()).c);
                    if (!set.contains(efwoVarA)) {
                        ekfwVar.h(eguk.c(efwoVarA));
                    }
                }
                return ekfwVar.g();
            }
        };
        Executor executor = this.c;
        ListenableFuture listenableFutureA = eijzVarD.a(callable, executor);
        eika.l(listenableFutureA, this.g, executor);
        ListenableFuture listenableFutureJ = eika.j(listenableFutureA, new ejvr() { // from class: eguc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    egui eguiVar = this.a;
                    ListenableFuture listenableFutureF = eooq.f(eguiVar.d.a.a((String) it.next()), new ejvr() { // from class: egto
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, eoqg.a);
                    eika.l(listenableFutureF, eguiVar.e, eguiVar.c);
                    ekfwVar.h(listenableFutureF);
                }
                return ekfwVar.g();
            }
        }, executor);
        eika.l(listenableFutureJ, this.h, executor);
        ListenableFuture listenableFutureK = eika.k(listenableFutureJ, new eooz() { // from class: egtz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                egtw egtwVar = this.a.d;
                return eooq.f(egtwVar.a.i(), new ejvr() { // from class: egtu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, egtwVar.b);
            }
        }, executor);
        eika.l(listenableFutureK, this.i, executor);
        return eika.d(listenableFutureJ, listenableFutureK).a(new Callable() { // from class: egua
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new qao();
            }
        }, executor);
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}

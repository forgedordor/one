package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzo implements egsc {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker");
    static final egsl b = new egsa(1, TimeUnit.DAYS);
    public final egsh c;
    public final ehyu d;
    public final ebbw e;
    public final eosc f;
    private final ehwx g;
    private final boolean h;

    public ehzo(ehwx ehwxVar, egsh egshVar, ehyu ehyuVar, eosc eoscVar, ebbw ebbwVar, boolean z) {
        this.g = ehwxVar;
        this.c = egshVar;
        this.d = ehyuVar;
        this.f = eoscVar;
        this.e = ebbwVar;
        this.h = z;
    }

    static String e(ejwi ejwiVar) {
        return "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker".concat("");
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        if (!this.h) {
            return d(workerParameters);
        }
        if (!(this.d instanceof ehzz)) {
            return eika.k(this.g.a(), eiid.d(new eooz() { // from class: ehzn
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.d(workerParameters);
                }
            }), this.f);
        }
        ListenableFuture listenableFutureK = eika.k(this.g.b(), new eooz() { // from class: ehzk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ehzo ehzoVar = this.a;
                ehzz ehzzVar = (ehzz) ehzoVar.d;
                if (ehzoVar.e.a()) {
                    WorkerParameters workerParameters2 = workerParameters;
                    if (!workerParameters2.c.contains(ehzo.e(ehzzVar.c()))) {
                        ((ekrd) ((ekrd) ehzo.a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker", "maybeCancelThisWorkerIfItHasWrongMainProcessTag", 141, "SyncPeriodicWorker.java")).q("Cancelling Sync worker since it has the wrong tag");
                        return ehzoVar.c.b(workerParameters2.a);
                    }
                }
                return eorv.a;
            }
        }, this.f);
        ejvr ejvrVar = new ejvr() { // from class: ehzl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrg ekrgVar = ehzo.a;
                return new qao();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eooh.f(eika.j(listenableFutureK, ejvrVar, eoqgVar), Throwable.class, eiid.a(new ejvr() { // from class: ehzm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrg ekrgVar = ehzo.a;
                return new qan();
            }
        }), eoqgVar);
    }

    public final ListenableFuture d(final WorkerParameters workerParameters) {
        return egot.a(eika.k(this.c.e((String) ekis.g(workerParameters.c, new ejwm() { // from class: ehzh
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                ekrg ekrgVar = ehzo.a;
                return ((String) obj).startsWith("com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker");
            }
        })), new eooz() { // from class: ehzi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    final WorkerParameters workerParameters2 = workerParameters;
                    final ehzo ehzoVar = this.a;
                    if (!it.hasNext()) {
                        return eika.a(arrayList).b(new eooy() { // from class: ehzg
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                return ehzoVar.c.b(workerParameters2.a);
                            }
                        }, ehzoVar.f);
                    }
                    qbp qbpVar = (qbp) it.next();
                    UUID uuid = workerParameters2.a;
                    UUID uuid2 = qbpVar.a;
                    if (!uuid.equals(uuid2)) {
                        arrayList.add(ehzoVar.c.b(uuid2));
                    }
                }
            }
        }, this.f), new Callable() { // from class: ehzj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new qam();
            }
        }, eoqg.a);
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}

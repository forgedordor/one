package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehze implements egsc {
    public final egsh a;
    public final eosc b;
    private final ehwx c;
    private final ehyu d;
    private final boolean e;

    public ehze(ehwx ehwxVar, egsh egshVar, ehyu ehyuVar, eosc eoscVar, boolean z) {
        this.c = ehwxVar;
        this.a = egshVar;
        this.d = ehyuVar;
        this.b = eoscVar;
        this.e = z;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        return !this.e ? eork.i(new qao()) : this.d instanceof ehzt ? eooq.f(this.c.b(), eiid.a(new ejvr() { // from class: ehzc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new qao();
            }
        }), eoqg.a) : eooq.g(this.c.a(), eiid.d(new eooz() { // from class: ehzd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ehze ehzeVar = this.a;
                egsh egshVar = ehzeVar.a;
                final WorkerParameters workerParameters2 = workerParameters;
                return egot.a(eooq.g(egshVar.e("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"), eiid.d(new eooz() { // from class: ehyz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) obj2).iterator();
                        while (true) {
                            final WorkerParameters workerParameters3 = workerParameters2;
                            final ehze ehzeVar2 = ehzeVar;
                            if (!it.hasNext()) {
                                return eork.a(arrayList).b(eiid.c(new eooy() { // from class: ehzb
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        return ehzeVar2.a.b(workerParameters3.a);
                                    }
                                }), ehzeVar2.b);
                            }
                            qbp qbpVar = (qbp) it.next();
                            UUID uuid = workerParameters3.a;
                            UUID uuid2 = qbpVar.a;
                            if (!uuid.equals(uuid2)) {
                                arrayList.add(ehzeVar2.a.b(uuid2));
                            }
                        }
                    }
                }), ehzeVar.b), new Callable() { // from class: ehza
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new qam();
                    }
                }, eoqg.a);
            }
        }), this.b);
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}

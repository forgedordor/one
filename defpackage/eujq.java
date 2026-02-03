package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujq {
    private final eukz d;
    public List b = new ArrayList();
    public List c = new ArrayList();
    public eosc a = null;

    public eujq(eukz eukzVar) {
        this.d = eukzVar;
    }

    public final ListenableFuture a() {
        SettableFuture settableFutureCreate = SettableFuture.create();
        synchronized (this) {
            if (!this.c.isEmpty()) {
                this.b.add(settableFutureCreate);
                return settableFutureCreate;
            }
            this.c.add(settableFutureCreate);
            this.a = eosj.a(Executors.newSingleThreadExecutor());
            b();
            return settableFutureCreate;
        }
    }

    public final void b() {
        final ListenableFuture listenableFutureH = this.d.a.h(this.a);
        listenableFutureH.b(new Runnable() { // from class: eujp
            @Override // java.lang.Runnable
            public final void run() {
                List<SettableFuture> list;
                eosc eoscVar;
                boolean z;
                eujq eujqVar = this.a;
                ListenableFuture listenableFuture = listenableFutureH;
                synchronized (eujqVar) {
                    list = eujqVar.c;
                    eujqVar.c = eujqVar.b;
                    eujqVar.b = new ArrayList();
                    eoscVar = null;
                    if (eujqVar.c.isEmpty()) {
                        eosc eoscVar2 = eujqVar.a;
                        eujqVar.a = null;
                        eoscVar = eoscVar2;
                        z = false;
                    } else {
                        z = true;
                    }
                }
                for (SettableFuture settableFuture : list) {
                    try {
                        settableFuture.set(listenableFuture.get());
                    } catch (Throwable th) {
                        settableFuture.setException(th);
                    }
                }
                if (z) {
                    eujqVar.b();
                }
                if (eoscVar != null) {
                    eoscVar.shutdown();
                }
            }
        }, this.a);
    }
}

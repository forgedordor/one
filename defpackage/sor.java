package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sor {
    public final Object a = new Object();
    public final List b = new ArrayList();
    public boolean c;

    final ListenableFuture a(final ListenableFuture listenableFuture, final ejxr ejxrVar) {
        return kol.a(new koi() { // from class: sop
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final ListenableFuture listenableFuture2 = listenableFuture;
                kogVar.a(new Runnable() { // from class: son
                    @Override // java.lang.Runnable
                    public final void run() {
                        listenableFuture2.cancel(false);
                    }
                }, eoqg.a);
                final ejxr ejxrVar2 = ejxrVar;
                Runnable runnable = new Runnable() { // from class: soo
                    @Override // java.lang.Runnable
                    public final void run() {
                        kogVar.c((Throwable) ejxrVar2.get());
                    }
                };
                sor sorVar = this.a;
                synchronized (sorVar.a) {
                    if (sorVar.c) {
                        runnable.run();
                    } else {
                        sorVar.b.add(runnable);
                    }
                }
                eork.r(listenableFuture2, new soq(sorVar, kogVar, runnable), eoqg.a);
                return "FailureSignal.propagate";
            }
        });
    }

    public final void b(Runnable runnable) {
        synchronized (this.a) {
            boolean z = true;
            if (!this.b.remove(runnable) && !this.c) {
                z = false;
            }
            ejyb.a(z);
        }
    }

    final void c() {
        ekgb ekgbVarN;
        synchronized (this.a) {
            this.c = true;
            List list = this.b;
            ekgbVarN = ekgb.n(list);
            list.clear();
        }
        int size = ekgbVarN.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) ekgbVarN.get(i)).run();
        }
    }
}

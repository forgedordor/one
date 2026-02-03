package defpackage;

import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdd {
    private final ArrayDeque b = new ArrayDeque();
    public ListenableFuture a = null;

    public final synchronized ListenableFuture a(eooy eooyVar) {
        SettableFuture settableFutureCreate;
        settableFutureCreate = SettableFuture.create();
        this.b.add(new Pair(settableFutureCreate, eooyVar));
        if (this.a == null) {
            b();
        }
        return settableFutureCreate;
    }

    public final synchronized void b() {
        final Pair pair = (Pair) this.b.poll();
        if (pair == null) {
            return;
        }
        try {
            ListenableFuture listenableFutureA = ((eooy) pair.second).a();
            this.a = listenableFutureA;
            listenableFutureA.b(new Runnable() { // from class: dwdb
                @Override // java.lang.Runnable
                public final void run() {
                    dwdd dwddVar = this.a;
                    Pair pair2 = pair;
                    synchronized (dwddVar) {
                        try {
                            ((SettableFuture) pair2.first).set(dwddVar.a.get());
                            dwddVar.a = null;
                            dwddVar.b();
                        } finally {
                        }
                    }
                }
            }, eoqg.a);
        } catch (Throwable th) {
            ((SettableFuture) pair.first).setException(th);
            this.a = null;
            c(th);
        }
    }

    public final synchronized void c(Throwable th) {
        while (true) {
            Pair pair = (Pair) this.b.poll();
            if (pair != null) {
                ((SettableFuture) pair.first).setException(new dwdc(th));
            }
        }
    }
}

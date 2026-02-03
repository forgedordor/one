package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjo implements ddix {
    public final AtomicReference b;
    private final String d;
    private final ddjy e;
    private final ExecutorService f;
    private final etpk g;
    public final Deque a = new ArrayDeque();
    public final AtomicInteger c = new AtomicInteger();

    public ddjo(ddjy ddjyVar, String str, etpk etpkVar, etph etphVar, ExecutorService executorService) {
        this.f = executorService;
        this.e = ddjyVar;
        this.d = str;
        this.g = etpkVar;
        this.b = new AtomicReference(etphVar);
    }

    @Override // defpackage.ddix
    public final void a(ddkb ddkbVar) {
        ListenableFuture listenableFutureF;
        if (Log.isLoggable("ExampleIterator", 3)) {
            Log.d("ExampleIterator", "next() called");
        }
        Deque deque = this.a;
        synchronized (deque) {
            if (deque.isEmpty()) {
                final ddjy ddjyVar = this.e;
                final String str = this.d;
                final etpk etpkVar = this.g;
                final etph etphVar = (etph) this.b.get();
                int i = etpkVar.h;
                final int iMin = i > 0 ? Math.min(100, i - this.c.get()) : 100;
                listenableFutureF = eooq.f(eork.n(new eooy() { // from class: ddjv
                    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
                    @Override // defpackage.eooy
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a() {
                        /*
                            Method dump skipped, instructions count: 578
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddjv.a():com.google.common.util.concurrent.ListenableFuture");
                    }
                }, ddjyVar.d), new ejvr() { // from class: ddjm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        List list = (List) obj;
                        if (list == null || list.isEmpty()) {
                            return null;
                        }
                        ddjo ddjoVar = this.a;
                        ddjoVar.b.set((etph) ((ejwj) list.get(list.size() - 1)).a);
                        ddjoVar.c.addAndGet(list.size());
                        Deque deque2 = ddjoVar.a;
                        synchronized (deque2) {
                            deque2.addAll(list);
                        }
                        return null;
                    }
                }, this.f);
            } else {
                listenableFutureF = eork.i(null);
            }
        }
        eork.r(listenableFutureF, new ddjn(this, ddkbVar), this.f);
    }

    @Override // defpackage.ddix
    public final void b() {
        if (Log.isLoggable("ExampleIterator", 3)) {
            Log.d("ExampleIterator", "request() called");
        }
    }

    @Override // defpackage.ddix, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (Log.isLoggable("ExampleIterator", 3)) {
            Log.d("ExampleIterator", "close() called");
        }
    }
}

package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feya {
    public final ArrayDeque a;
    public final ArrayDeque b;
    private int c;
    private int d;
    private ExecutorService e;
    private final ArrayDeque f;

    public feya() {
        this.c = 64;
        this.d = 5;
        this.a = new ArrayDeque();
        this.b = new ArrayDeque();
        this.f = new ArrayDeque();
    }

    private final void g(Deque deque, Object obj) {
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        e();
    }

    public final synchronized ExecutorService a() {
        ExecutorService executorService;
        if (this.e == null) {
            this.e = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new fezq(String.valueOf(fezr.e).concat(" Dispatcher"), false));
        }
        executorService = this.e;
        executorService.getClass();
        return executorService;
    }

    public final synchronized void b(ffaj ffajVar) {
        this.f.add(ffajVar);
    }

    public final void c(ffag ffagVar) {
        ffagVar.a.decrementAndGet();
        g(this.b, ffagVar);
    }

    public final void d(ffaj ffajVar) {
        g(this.f, ffajVar);
    }

    public final void e() {
        byte[] bArr = fezr.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                ffag ffagVar = (ffag) it.next();
                ArrayDeque arrayDeque = this.b;
                if (arrayDeque.size() >= this.c) {
                    break;
                }
                if (ffagVar.a.get() < this.d) {
                    it.remove();
                    ffagVar.a.incrementAndGet();
                    ffagVar.getClass();
                    arrayList.add(ffagVar);
                    arrayDeque.add(ffagVar);
                }
            }
            f();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ffag) arrayList.get(i)).b(a());
        }
    }

    public final synchronized void f() {
        this.b.size();
        this.f.size();
    }

    public feya(ExecutorService executorService) {
        this();
        this.e = executorService;
    }
}

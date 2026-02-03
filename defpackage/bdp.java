package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdp {
    public static final Range a = bms.h;
    public final Size c;
    public final azv d;
    public final Range e;
    public final biu f;
    public final int h;
    final ListenableFuture i;
    public final bjz j;
    public bdn k;
    public bdo l;
    public Executor m;
    private final kog n;
    private final ListenableFuture o;
    private final kog p;
    private final kog q;
    public final Object b = new Object();
    public final boolean g = true;

    public bdp(Size size, biu biuVar, boolean z, azv azvVar, int i, Range range, Runnable runnable) {
        this.c = size;
        this.f = biuVar;
        lcg.b(azvVar.b(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.d = azvVar;
        this.h = i;
        this.e = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        ListenableFuture listenableFutureA = kol.a(new koi() { // from class: bdc
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                Range range2 = bdp.a;
                atomicReference.set(kogVar);
                return str.concat("-cancellation");
            }
        });
        kog kogVar = (kog) atomicReference.get();
        lcg.i(kogVar);
        this.q = kogVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        ListenableFuture listenableFutureA2 = kol.a(new koi() { // from class: bdd
            @Override // defpackage.koi
            public final Object a(kog kogVar2) {
                Range range2 = bdp.a;
                atomicReference2.set(kogVar2);
                return str.concat("-status");
            }
        });
        this.o = listenableFutureA2;
        bqk.i(listenableFutureA2, new bdg(kogVar, listenableFutureA), bpc.a());
        kog kogVar2 = (kog) atomicReference2.get();
        lcg.i(kogVar2);
        final AtomicReference atomicReference3 = new AtomicReference(null);
        ListenableFuture listenableFutureA3 = kol.a(new koi() { // from class: bde
            @Override // defpackage.koi
            public final Object a(kog kogVar3) {
                Range range2 = bdp.a;
                atomicReference3.set(kogVar3);
                return str.concat("-Surface");
            }
        });
        this.i = listenableFutureA3;
        kog kogVar3 = (kog) atomicReference3.get();
        lcg.i(kogVar3);
        this.n = kogVar3;
        bdh bdhVar = new bdh(this, size);
        this.j = bdhVar;
        ListenableFuture listenableFutureC = bdhVar.c();
        bqk.i(listenableFutureA3, new bdi(listenableFutureC, kogVar2, str), bpc.a());
        listenableFutureC.b(new Runnable() { // from class: bdf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i.cancel(true);
            }
        }, bpc.a());
        Executor executorA = bpc.a();
        final AtomicReference atomicReference4 = new AtomicReference(null);
        bqk.i(kol.a(new koi() { // from class: bdb
            @Override // defpackage.koi
            public final Object a(kog kogVar4) {
                atomicReference4.set(kogVar4);
                return "SurfaceRequest-surface-recreation(" + this.a.hashCode() + ")";
            }
        }), new bdk(runnable), executorA);
        kog kogVar4 = (kog) atomicReference4.get();
        lcg.i(kogVar4);
        this.p = kogVar4;
    }

    public final void a(Executor executor, Runnable runnable) {
        this.q.a(runnable, executor);
    }

    public final void b(final Surface surface, Executor executor, final lbz lbzVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: bcy
                @Override // java.lang.Runnable
                public final void run() {
                    Range range = bdp.a;
                    lbzVar.accept(new ayt(2, surface));
                }
            });
            return;
        }
        if (!this.n.b(surface)) {
            ListenableFuture listenableFuture = this.i;
            if (!listenableFuture.isCancelled()) {
                lcg.c(listenableFuture.isDone());
                try {
                    listenableFuture.get();
                    executor.execute(new Runnable() { // from class: bcz
                        @Override // java.lang.Runnable
                        public final void run() {
                            Range range = bdp.a;
                            lbzVar.accept(new ayt(3, surface));
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: bda
                        @Override // java.lang.Runnable
                        public final void run() {
                            Range range = bdp.a;
                            lbzVar.accept(new ayt(4, surface));
                        }
                    });
                    return;
                }
            }
        }
        bqk.i(this.o, new bdj(lbzVar, surface), executor);
    }

    public final void c(Executor executor, final bdo bdoVar) {
        final bdn bdnVar;
        synchronized (this.b) {
            this.l = bdoVar;
            this.m = executor;
            bdnVar = this.k;
        }
        if (bdnVar != null) {
            executor.execute(new Runnable() { // from class: bcx
                @Override // java.lang.Runnable
                public final void run() {
                    Range range = bdp.a;
                    bdoVar.a(bdnVar);
                }
            });
        }
    }

    public final boolean d() {
        return this.i.isDone();
    }

    public final void e() {
        f();
        this.p.b(null);
    }

    public final void f() {
        this.n.c(new bjy());
    }
}

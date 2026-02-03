package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyzm implements dyyv {
    public final ejxr a;
    public final AtomicReference b = new AtomicReference();
    private final eosc c;

    public dyzm(ExecutorService executorService, ejxr ejxrVar) {
        this.c = eosj.a(executorService);
        this.a = ejxx.a(ejxrVar);
    }

    private final ListenableFuture h(final ejvr ejvrVar) {
        AtomicReference atomicReference = this.b;
        if (atomicReference.get() != null) {
            return (ListenableFuture) ejvrVar.apply((dyyv) atomicReference.get());
        }
        final ejxr ejxrVar = this.a;
        ejxrVar.getClass();
        return eiju.g(eika.h(new Callable() { // from class: dyzg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (dyyv) ejxrVar.get();
            }
        }, this.c)).i(new eooz() { // from class: dyzh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dyyv dyyvVar = (dyyv) obj;
                this.a.b.set(dyyvVar);
                return (ListenableFuture) ejvrVar.apply(dyyvVar);
            }
        }, eoqg.a);
    }

    private final void i(final Runnable runnable) {
        if (this.b.get() != null) {
            runnable.run();
        } else {
            this.c.execute(eiid.k(new Runnable() { // from class: dyzf
                @Override // java.lang.Runnable
                public final void run() {
                    dyzm dyzmVar = this.a;
                    dyzmVar.b.set((dyyv) dyzmVar.a.get());
                    runnable.run();
                }
            }));
        }
    }

    @Override // defpackage.dyyv
    public final ListenableFuture a() {
        return h(new ejvr() { // from class: dyzd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dyyv) obj).a();
            }
        });
    }

    @Override // defpackage.dyyv
    public final ListenableFuture b(final String str) {
        return h(new ejvr() { // from class: dyze
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dyyv) obj).b(str);
            }
        });
    }

    @Override // defpackage.dyyv
    public final ListenableFuture c() {
        return h(new ejvr() { // from class: dyzl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dyyv) obj).c();
            }
        });
    }

    @Override // defpackage.dyyv
    public final void d(final eglg eglgVar) {
        i(new Runnable() { // from class: dyzi
            @Override // java.lang.Runnable
            public final void run() {
                ((dyyv) this.a.b.get()).d(eglgVar);
            }
        });
    }

    @Override // defpackage.dyyv
    public final void e(final eglg eglgVar) {
        i(new Runnable() { // from class: dyzc
            @Override // java.lang.Runnable
            public final void run() {
                ((dyyv) this.a.b.get()).e(eglgVar);
            }
        });
    }

    @Override // defpackage.dyyv
    public final ListenableFuture f(final String str, final int i) {
        return h(new ejvr() { // from class: dyzj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dyyv) obj).f(str, i);
            }
        });
    }

    @Override // defpackage.dyyv
    public final ListenableFuture g(final String str, final int i) {
        return h(new ejvr() { // from class: dyzk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dyyv) obj).g(str, i);
            }
        });
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esrn extends fbnh {
    public fbng c;
    private final ListenableFuture e;
    private final Executor f = new eoss(eoqg.a);
    public final Queue a = new ArrayDeque();
    public fbnh b = null;
    public boolean d = false;

    public esrn(ListenableFuture listenableFuture) {
        this.e = listenableFuture;
    }

    private final void b(final Runnable runnable) {
        this.f.execute(eiid.k(new Runnable() { // from class: esri
            @Override // java.lang.Runnable
            public final void run() {
                esrn esrnVar = this.a;
                if (esrnVar.d) {
                    return;
                }
                Runnable runnable2 = runnable;
                if (esrnVar.b == null) {
                    esrnVar.a.add(runnable2);
                    return;
                }
                try {
                    runnable2.run();
                } catch (Throwable th) {
                    esrnVar.c.a(Status.c(th), new fbrg());
                }
            }
        }));
    }

    @Override // defpackage.fbnh
    public final void a(final fbng fbngVar, final fbrg fbrgVar) {
        this.c = fbngVar;
        eika.l(this.e, new esrm(this, fbngVar), this.f);
        b(new Runnable() { // from class: esrh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a(fbngVar, fbrgVar);
            }
        });
    }

    @Override // defpackage.fbnh
    public final void c(final String str, final Throwable th) {
        b(new Runnable() { // from class: esrg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.c(str, th);
            }
        });
    }

    @Override // defpackage.fbnh
    public final void d() {
        b(new Runnable() { // from class: esrl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.d();
            }
        });
    }

    @Override // defpackage.fbnh
    public final void e(final int i) {
        b(new Runnable() { // from class: esrk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.e(i);
            }
        });
    }

    @Override // defpackage.fbnh
    public final void f(final Object obj) {
        b(new Runnable() { // from class: esrj
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.f(obj);
            }
        });
    }

    public final String toString() {
        return super.toString() + "delegate=[" + String.valueOf(this.b) + "]";
    }
}

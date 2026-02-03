package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes5.dex */
public class eclm {
    public final String a;
    public final ecln b;
    public final egpe c;
    public final Object d;
    public final eidp e;
    public List f;
    private final ListenableFuture g;
    private final eoqr h;
    private final egpe i;

    public eclm(ecln eclnVar, ListenableFuture listenableFuture, boolean z) {
        eclj ecljVar = new eclj(this);
        eoqg eoqgVar = eoqg.a;
        this.i = new egpe(ecljVar, eoqgVar);
        this.d = new Object();
        this.f = new ArrayList();
        this.b = eclnVar;
        this.g = listenableFuture;
        this.a = eclnVar.f();
        this.c = new egpe(eclnVar.a(), eoqgVar);
        this.h = new eoqr();
        if (z) {
            this.e = new eido();
        } else {
            this.e = new eidn();
        }
        d(new eooz() { // from class: eclf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.c.c();
            }
        });
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFutureI;
        eidp eidpVar = this.e;
        eidpVar.a();
        ejxm.c(ejsz.a);
        egpe egpeVar = this.i;
        if (egpeVar.e()) {
            listenableFutureI = this.b.i();
        } else {
            eieu eieuVarB = eidpVar.b("Get ".concat(String.valueOf(this.a)));
            try {
                ListenableFuture listenableFutureG = eooq.g(egpeVar.c(), eiid.d(new eooz() { // from class: eclh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return this.a.b.i();
                    }
                }), eoqg.a);
                eieuVarB.b(listenableFutureG);
                eieuVarB.close();
                listenableFutureI = listenableFutureG;
            } catch (Throwable th) {
                try {
                    eieuVarB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        eork.j(this.g);
        return eork.j(listenableFutureI);
    }

    public final ListenableFuture b(final ejvr ejvrVar, Executor executor) {
        return c(eiid.d(new eooz() { // from class: eclc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eork.i(ejvrVar.apply(obj));
            }
        }), executor);
    }

    public final ListenableFuture c(final eooz eoozVar, final Executor executor) {
        ejxm.c(ejsz.a);
        eieu eieuVarB = this.e.b("Update ".concat(String.valueOf(this.a)));
        try {
            final ListenableFuture listenableFutureC = this.i.c();
            eoqr eoqrVar = this.h;
            eooy eooyVar = new eooy() { // from class: ecld
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return listenableFutureC;
                }
            };
            eoqg eoqgVar = eoqg.a;
            eoqrVar.b(eooyVar, eoqgVar);
            ListenableFuture listenableFutureB = eoqrVar.b(eiid.c(new eooy() { // from class: ecle
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final eclm eclmVar = this.a;
                    final eooz eoozVar2 = eoozVar;
                    final Executor executor2 = executor;
                    return eooq.g(listenableFutureC, eiid.d(new eooz() { // from class: eclg
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return eclmVar.b.h(eoozVar2, executor2);
                        }
                    }), eoqg.a);
                }
            }), eoqgVar);
            eork.t(listenableFutureB, listenableFutureC);
            eork.j(this.g);
            ListenableFuture listenableFutureA = eclq.a(listenableFutureB);
            eieuVarB.b(listenableFutureA);
            eieuVarB.close();
            return listenableFutureA;
        } catch (Throwable th) {
            try {
                eieuVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(eooz eoozVar) {
        synchronized (this.d) {
            this.f.add(eoozVar);
        }
    }
}

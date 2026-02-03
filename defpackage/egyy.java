package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egyy {
    public final Object a = new Object();
    public eopw b;
    private eopy c;

    public egyy(eopy eopyVar) {
        ecem.c();
        this.c = eopyVar;
    }

    private final void d() {
        synchronized (this.a) {
            ejwl.l(this.c.h().isDone());
            this.c.m(new eopx() { // from class: egyx
                @Override // defpackage.eopx
                public final void a(eopw eopwVar) {
                    egyy egyyVar = this.a;
                    synchronized (egyyVar.a) {
                        egyyVar.b = eopwVar;
                    }
                }
            }, eoqg.a);
            this.c = null;
        }
    }

    final egyh a() {
        egyh egyhVar;
        synchronized (this.a) {
            if (this.c != null) {
                d();
            }
            try {
                egyhVar = (egyh) this.b.a();
            } catch (ExecutionException e) {
                throw new egzx(e.getCause());
            }
        }
        return egyhVar;
    }

    final ListenableFuture b() {
        synchronized (this.a) {
            eopy eopyVar = this.c;
            if (eopyVar != null) {
                return eopyVar.h();
            }
            return eork.i(null);
        }
    }

    final void c() {
        synchronized (this.a) {
            eopy eopyVar = this.c;
            if (eopyVar != null) {
                eopyVar.n();
                d();
            }
            this.b.b();
        }
    }
}

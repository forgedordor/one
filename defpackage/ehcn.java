package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehcn implements Closeable, egzn {
    public final egyk a;
    final /* synthetic */ ehco b;
    private final Executor c;
    private final ehaw d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private boolean f = false;

    public ehcn(ehco ehcoVar, ehaw ehawVar, Executor executor) {
        this.b = ehcoVar;
        this.d = ehawVar;
        this.c = executor;
        this.a = ehawVar.a();
    }

    @Override // defpackage.egzn
    public final void a(egzm egzmVar) {
        if (egzmVar.c.ordinal() != 0) {
            return;
        }
        boolean andSet = this.e.getAndSet(true);
        if (ecem.g()) {
            b();
        } else {
            if (andSet) {
                return;
            }
            this.c.execute(eiid.k(new Runnable() { // from class: ehcm
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            }));
        }
    }

    public final void b() {
        ecem.c();
        if (this.f) {
            return;
        }
        ehco ehcoVar = this.b;
        if (ehcoVar.c != null && ehcoVar.d && this.e.getAndSet(false)) {
            ehcoVar.c.a(this.d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ecem.c();
        this.f = true;
    }
}

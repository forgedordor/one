package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eirg implements eira {
    final /* synthetic */ Function a;
    final /* synthetic */ kog b;

    public eirg(Function function, kog kogVar) {
        this.a = function;
        this.b = kogVar;
    }

    @Override // defpackage.eira
    public final void a(Throwable th) {
        this.b.c(th);
    }

    @Override // defpackage.eira
    public final void b(Object obj) {
        try {
            eiri.a((ListenableFuture) this.a.apply(obj), new eire(this.b, Function$CC.identity()), new Executor() { // from class: eirf
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            });
        } catch (Throwable th) {
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.b.c(th);
        }
    }
}

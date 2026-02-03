package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class soq implements eora {
    final /* synthetic */ kog a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ sor c;

    public soq(sor sorVar, kog kogVar, Runnable runnable) {
        this.a = kogVar;
        this.b = runnable;
        this.c = sorVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        this.a.b(obj);
        this.c.b(this.b);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof smo) {
            this.a.c(th);
        } else if (th instanceof CancellationException) {
            this.a.c(new smo(4, 7, "Operation was cancelled.", th));
        } else {
            this.a.c(new smo(4, 0, "AiCore request could not be completed.", th));
        }
        this.c.b(this.b);
    }
}

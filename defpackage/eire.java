package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eire implements eira {
    final /* synthetic */ kog a;
    final /* synthetic */ Function b;

    public eire(kog kogVar, Function function) {
        this.a = kogVar;
        this.b = function;
    }

    @Override // defpackage.eira
    public final void a(Throwable th) {
        this.a.c(th);
    }

    @Override // defpackage.eira
    public final void b(Object obj) {
        try {
            this.a.b(this.b.apply(obj));
        } catch (Throwable th) {
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.a.c(th);
        }
    }
}

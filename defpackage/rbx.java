package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rbx implements Callable {
    final /* synthetic */ rcc a;

    public rbx(rcc rccVar) {
        this.a = rccVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        rcc rccVar = this.a;
        synchronized (rccVar) {
            if (rccVar.f == null) {
                return null;
            }
            rccVar.h();
            if (rccVar.i()) {
                rccVar.f();
                rccVar.h = 0;
            }
            return null;
        }
    }
}

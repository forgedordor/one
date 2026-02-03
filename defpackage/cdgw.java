package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgw extends cmwg {
    private final fcsu a;
    private final eosc b;

    public cdgw(fcsu fcsuVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("FirebaseInitStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        final fcsu fcsuVar = this.a;
        fcsuVar.getClass();
        return eijx.g(new Callable() { // from class: cdgv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (cdgu) fcsuVar.b();
            }
        }, this.b);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return false;
    }
}

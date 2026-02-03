package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class darm implements cldw {
    public final fcsu a;
    private final fcsu b;

    public darm(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.cldw
    public final eiju d(final boolean z) {
        return eijx.g(new Callable() { // from class: darl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (!z) {
                    return null;
                }
                data dataVar = (data) this.a.a.b();
                caxr caxrVar = new caxr();
                caxrVar.b = "sync_data_to_wearable_app_dedupe";
                dataVar.a(caxrVar.a());
                return null;
            }
        }, (Executor) this.b.b());
    }
}

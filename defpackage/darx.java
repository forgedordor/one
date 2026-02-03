package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class darx extends cmwg {
    public final fcsu a;
    private final eosc b;

    public darx(fcsu fcsuVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("WearableSyncStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        return eijx.g(new Callable() { // from class: darw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                data dataVar = (data) this.a.a.b();
                caxr caxrVar = new caxr();
                caxrVar.b = "sync_data_to_wearable_app_dedupe";
                dataVar.b(caxrVar.a());
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}

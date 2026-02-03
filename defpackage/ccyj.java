package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyj extends cmwg {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final eosc d;

    public ccyj(fcsu fcsuVar, eosc eoscVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.d = eoscVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("BroadcastProvisioningInfoStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        return eijx.f(new Runnable() { // from class: ccyi
            @Override // java.lang.Runnable
            public final void run() {
                ccyj ccyjVar = this.a;
                ccyjVar.b.b();
                ((cczr) ccyjVar.c.b()).a();
                ((chwq) ccyjVar.a.b()).r();
            }
        }, this.d);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}

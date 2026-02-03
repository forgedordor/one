package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckho extends cmwg {
    public final fcsu a;
    private final eosc b;

    public ckho(fcsu fcsuVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("RcsProvisioningStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        return eijx.f(new Runnable() { // from class: ckhn
            @Override // java.lang.Runnable
            public final void run() {
                ((chtr) this.a.a.b()).g();
            }
        }, this.b);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}

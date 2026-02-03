package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgp extends cmwg {
    final /* synthetic */ fcsu a;
    final /* synthetic */ fcsu b;
    final /* synthetic */ eosc c;

    public acgp(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("GrowthKitStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        final fcsu fcsuVar = this.a;
        final fcsu fcsuVar2 = this.b;
        return eijx.f(new Runnable() { // from class: acgo
            @Override // java.lang.Runnable
            public final void run() {
                ((dssy) fcsuVar.b()).a();
                ((acgu) fcsuVar2.b()).a(2);
            }
        }, this.c);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}

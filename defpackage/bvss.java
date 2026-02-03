package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvss extends cayv implements bvsn {
    public static final cqce a = cqce.g("BugleJobs", "ConnectToTachyonWorker");
    static final cczi b = cdag.h(cdag.b, "tachyon_autoconnect_on_metered_network", false);
    public final eygg c;
    private final eygg d;
    private final eosc e;
    private final eosc f;

    public bvss(eygg eyggVar, eygg eyggVar2, eosc eoscVar, eosc eoscVar2) {
        this.c = eyggVar;
        this.d = eyggVar2;
        this.e = eoscVar;
        this.f = eoscVar2;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        boolean zBooleanValue = ((Boolean) b.e()).booleanValue();
        caxz caxzVarL = caya.l();
        caxzVarL.f(pza.a);
        pzh pzhVar = new pzh();
        pzhVar.c(true != zBooleanValue ? 3 : 2);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ConnectToTachyonWorkerImpl");
    }

    @Override // defpackage.bvsn
    public final void c() {
        a.m("Scheduling ConnectToTachyonWorker.");
        ((cazj) ((bvsm) this.c.b()).a.b()).g(cbcu.f("connect_to_tachyon_anonymously", caxy.a));
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final void g() {
        a.m("Canceling previously scheduled ConnectToTachyonWorker.");
        eijx.g(new Callable() { // from class: bvso
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((cazj) ((bvsm) this.a.c.b()).a.b()).f("connect_to_tachyon_anonymously");
                return true;
            }
        }, this.f).k(auwc.a(new bvsr()), this.e);
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        a.m("Attempting to auto-connect to Tachyon for anonymous device ID...");
        return ((cfzf) this.d.b()).d().h(new ejvr() { // from class: bvsp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = bvss.a;
                return cbcw.i();
            }
        }, this.e).e(fbtf.class, new ejvr() { // from class: bvsq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvss.a.s("Failed to start anonymous bind handler", (fbtf) obj);
                return cbcw.k();
            }
        }, eoqg.a);
    }
}

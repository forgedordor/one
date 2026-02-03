package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawe extends cayv {
    public final fcsu a;
    private final eosc b;

    public cawe(eosc eoscVar, fcsu fcsuVar) {
        this.b = eoscVar;
        this.a = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        pzh pzhVar = new pzh();
        pzhVar.b = true;
        pzhVar.c = true;
        pzhVar.d = true;
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RunAnalyzeHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        return eijx.g(new Callable() { // from class: cawd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ((dqsy) this.a.a.b()).v("ANALYZE");
                return cbcw.i();
            }
        }, this.b);
    }
}

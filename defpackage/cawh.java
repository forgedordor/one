package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawh extends cayv {
    public final fcsu a;
    private final eosc b;

    public cawh(fcsu fcsuVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("UpdateArchiveStatusHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cawj.a.getParserForType();
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cawj cawjVar = (cawj) evuhVar;
        return eijx.g(new Callable() { // from class: cawg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bxjh bxjhVar = (bxjh) this.a.a.b();
                cawj cawjVar2 = cawjVar;
                bxjhVar.b(barn.e(cawjVar2.c), bvdk.values()[cawjVar2.d]);
                return cbcw.i();
            }
        }, this.b);
    }
}

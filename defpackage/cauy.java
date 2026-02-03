package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cauy extends cayv {
    public static final cqce a = cqce.g("BugleDataModel", "LowStorageHandler");
    public final cmqa b;
    private final eosc c;

    public cauy(cmqa cmqaVar, eosc eoscVar) {
        this.b = cmqaVar;
        this.c = eoscVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WAKELOCK);
        pzh pzhVar = new pzh();
        pzhVar.c = false;
        pzhVar.d = false;
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("LowStorageHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cavc.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cavc cavcVar = (cavc) evuhVar;
        return eijx.g(new Callable() { // from class: caux
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cauy.a.m("Receiving clean up messages for low storage");
                cavc cavcVar2 = cavcVar;
                int iA = cava.a(cavcVar2.c);
                if (iA == 0) {
                    iA = 1;
                }
                this.a.b.c(iA - 1, cavcVar2.d);
                return cbcw.i();
            }
        }, this.c);
    }
}

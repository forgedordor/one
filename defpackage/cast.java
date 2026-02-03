package defpackage;

import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cast extends cayv {
    public final chwq a;
    private final eosc b;

    public cast(eosc eoscVar, chwq chwqVar) {
        this.b = eoscVar;
        this.a = chwqVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CancelRcsFileTransferHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return casv.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final casv casvVar = (casv) evuhVar;
        return eijx.g(new Callable() { // from class: cass
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator<E> it = casvVar.b.iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    if (jLongValue != -1) {
                        this.a.a.v(jLongValue);
                        cqbd cqbdVarC = cast.E.c();
                        cqbdVarC.I("Deleting file transfer from RCS engine.");
                        cqbdVarC.z("rcsFileTransferSessionId", jLongValue);
                        cqbdVarC.r();
                    }
                }
                return cbcw.i();
            }
        }, this.b);
    }
}

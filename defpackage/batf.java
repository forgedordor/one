package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class batf {
    public final ekgp a;
    public final eosc b;
    public final eosc c;
    public final Map d;
    public final cvw e = new cvw();
    private final Executor f;

    public batf(Map map, eosc eoscVar, eosc eoscVar2, Map map2) {
        this.a = ekgp.j(map);
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = map2;
        this.f = new eoss(eoscVar);
    }

    public final eiju a(final bvdj bvdjVar, final eooz eoozVar) {
        return eijx.g(new Callable() { // from class: basw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Set set = (Set) this.a.e.get(bvdjVar);
                return set == null ? new css() : new css(set);
            }
        }, this.f).i(new eooz() { // from class: basx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                batf batfVar = this.a;
                Map map = batfVar.d;
                bvdj bvdjVar2 = bvdjVar;
                css cssVar = (css) obj;
                eiju eijuVarE = eijx.e(null);
                fcsu fcsuVar = (fcsu) map.get(bvdjVar2);
                final eooz eoozVar2 = eoozVar;
                if (fcsuVar != null) {
                    for (final bate bateVar : (Set) fcsuVar.b()) {
                        eijuVarE = eijuVarE.i(new eooz() { // from class: basz
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return eoozVar2.a(bateVar);
                            }
                        }, batfVar.b);
                    }
                }
                csr csrVar = new csr(cssVar);
                while (csrVar.hasNext()) {
                    final bate bateVar2 = (bate) csrVar.next();
                    eijuVarE = eijuVarE.i(new eooz() { // from class: bata
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return eoozVar2.a(bateVar2);
                        }
                    }, batfVar.b);
                }
                return eijuVarE;
            }
        }, this.b);
    }
}

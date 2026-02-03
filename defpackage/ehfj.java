package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfj implements eyif {
    public static Map a(Map map, Map map2, Map map3, Map map4) {
        map4.getClass();
        ekgi ekgiVar = new ekgi();
        for (Map.Entry entry : ((ekgp) map).entrySet()) {
            ehhz ehhzVar = (ehhz) entry.getKey();
            final fcsu fcsuVar = (fcsu) entry.getValue();
            ekgiVar.i(ehfh.a(map3, ehhzVar), new eooy() { // from class: ehfb
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return eork.i(((evuh) fcsuVar.b()).toByteArray());
                }
            });
        }
        for (Map.Entry entry2 : ((ekgp) map2).entrySet()) {
            ehhz ehhzVar2 = (ehhz) entry2.getKey();
            final fcsu fcsuVar2 = (fcsu) entry2.getValue();
            ekgiVar.i(ehfh.a(map3, ehhzVar2), new eooy() { // from class: ehfc
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    ListenableFuture listenableFutureA = ((eooy) fcsuVar2.b()).a();
                    final ehfg ehfgVar = ehfg.a;
                    return eika.j(listenableFutureA, new ejvr() { // from class: ehfa
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return ehfgVar.invoke(obj);
                        }
                    }, eoqg.a);
                }
            });
        }
        ekgp ekgpVarC = ekgiVar.c();
        Set setKeySet = map4.keySet();
        ekhx ekhxVarKeySet = ekgpVarC.keySet();
        ekhxVarKeySet.getClass();
        if (setKeySet.containsAll(ekhxVarKeySet)) {
            return ekgpVarC;
        }
        throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map4.keySet() + ", params provided: " + ekgpVarC.keySet());
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}

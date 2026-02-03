package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfk implements eyif {
    public static Map a(Map map, Map map2, Map map3, Map map4, Map map5) {
        map4.getClass();
        map5.getClass();
        ekgi ekgiVar = new ekgi();
        for (Map.Entry entry : ((ekgp) map).entrySet()) {
            ehia ehiaVar = (ehia) entry.getKey();
            final fcsu fcsuVar = (fcsu) entry.getValue();
            ekgiVar.i(ehfh.b(map3, ehiaVar), new eooy() { // from class: ehfd
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return eork.i(fcsuVar.b());
                }
            });
        }
        for (Map.Entry entry2 : ((ekgp) map2).entrySet()) {
            ehia ehiaVar2 = (ehia) entry2.getKey();
            final fcsu fcsuVar2 = (fcsu) entry2.getValue();
            ekgiVar.i(ehfh.b(map3, ehiaVar2), new eooy() { // from class: ehfe
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return ((eooy) fcsuVar2.b()).a();
                }
            });
        }
        ekgp ekgpVarC = ekgiVar.c();
        Set setKeySet = map4.keySet();
        ekhx ekhxVarKeySet = ekgpVarC.keySet();
        ekhxVarKeySet.getClass();
        if (!setKeySet.containsAll(ekhxVarKeySet)) {
            throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map4.keySet() + ", params provided: " + ekgpVarC.keySet());
        }
        ekhx ekhxVarKeySet2 = ekgpVarC.keySet();
        ekhxVarKeySet2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ekhxVarKeySet2) {
            if (map5.keySet().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return ekgpVarC;
        }
        arrayList.toString();
        throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList.toString()));
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}

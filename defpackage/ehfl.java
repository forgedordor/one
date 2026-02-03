package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfl implements eyif {
    public static Map a(Map map, Map map2, Map map3, Map map4) {
        map3.getClass();
        map4.getClass();
        ekgi ekgiVar = new ekgi();
        for (Map.Entry entry : ((ekgp) map).entrySet()) {
            ehia ehiaVar = (ehia) entry.getKey();
            fcsu fcsuVar = (fcsu) entry.getValue();
            String strA = ehiaVar.a();
            if (fdgn.G(strA, "#", false)) {
                throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(strA)));
            }
            String str = (String) map2.get(strA);
            if (str != null) {
                strA = a.q(str, strA, "#");
            }
            ekgiVar.i(strA, fcsuVar.b());
        }
        ekgp ekgpVarC = ekgiVar.c();
        Set setKeySet = map3.keySet();
        ekhx ekhxVarKeySet = ekgpVarC.keySet();
        ekhxVarKeySet.getClass();
        if (!setKeySet.containsAll(ekhxVarKeySet)) {
            throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map3.keySet() + ", params provided: " + ekgpVarC.keySet());
        }
        ekhx ekhxVarKeySet2 = ekgpVarC.keySet();
        ekhxVarKeySet2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ekhxVarKeySet2) {
            if (map4.keySet().contains((String) obj)) {
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

package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctmk implements fdpm {
    final /* synthetic */ ctmn a;

    public ctmk(ctmn ctmnVar) {
        this.a = ctmnVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        fduf fdufVar;
        Object objC;
        Map map;
        LinkedHashMap linkedHashMap;
        ekgp ekgpVar = (ekgp) obj;
        do {
            fdufVar = this.a.f;
            objC = fdufVar.c();
            map = (Map) objC;
            ekgpVar.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(fcwa.a(ekgpVar.size()));
            for (Map.Entry entry : ekgpVar.entrySet()) {
                Object key = entry.getKey();
                anyy anyyVar = (anyy) entry.getValue();
                anyyVar.getClass();
                linkedHashMap2.put(key, ctmn.f(anyyVar));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (((ctmo) entry2.getValue()).a != 1) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } while (!fdufVar.g(objC, fcwa.j(map, linkedHashMap)));
        return fctx.a;
    }
}

package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ektu extends ektv {
    private final Map a;

    public ektu(ekte ekteVar, ekte ekteVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, ekteVar);
        e(linkedHashMap, ekteVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((ekrz) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, ekte ekteVar) {
        for (int i = 0; i < ekteVar.b(); i++) {
            ekrz ekrzVarC = ekteVar.c(i);
            Object obj = map.get(ekrzVarC);
            if (ekrzVarC.b) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(ekrzVarC, arrayList);
                }
                arrayList.add(ekrzVarC.c(ekteVar.e(i)));
            } else {
                map.put(ekrzVarC, ekrzVarC.c(ekteVar.e(i)));
            }
        }
    }

    @Override // defpackage.ektv
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.ektv
    public final Object b(ekrz ekrzVar) {
        ekwr.a(!ekrzVar.b, "key must be single valued");
        Object obj = this.a.get(ekrzVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.ektv
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.ektv
    public final void d(ektl ektlVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            ekrz ekrzVar = (ekrz) entry.getKey();
            Object value = entry.getValue();
            if (ekrzVar.b) {
                ektlVar.b(ekrzVar, ((List) value).iterator(), obj);
            } else {
                ektlVar.a(ekrzVar, value, obj);
            }
        }
    }
}

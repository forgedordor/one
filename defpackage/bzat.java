package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class bzat {
    public static /* synthetic */ Object a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new bzaw(entry.getValue()));
        }
        return linkedHashMap;
    }
}

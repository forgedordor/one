package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwz {
    public static final azvz a;
    private static final Set b = fcwm.b(new azwa(aywb.c.b, bodn.c.b, azvt.a));
    private static final Map c;

    static {
        aywc aywcVar = aywc.a;
        Map map = aywc.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            ayvl ayvlVar = (ayvl) entry.getKey();
            if (!fdbq.f(ayvlVar, aywb.c.a) && !fdbq.f(ayvlVar, aywb.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new azvz(azwh.a, azwo.a, azwy.a, linkedHashMap, null, b, 0, null, 208);
    }
}

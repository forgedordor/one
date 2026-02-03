package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzx {
    public static final azvz a;
    private static final Set b = fcwm.b(new azwa(azgl.c.b, bqsm.c.b, azvt.b));
    private static final Map c;

    static {
        azgm azgmVar = azgm.a;
        Map map = azgm.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            azfw azfwVar = (azfw) entry.getKey();
            if (!fdbq.f(azfwVar, azgl.c.a) && !fdbq.f(azfwVar, azgl.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new azvz(azxw.a, azyg.a, azzw.a, linkedHashMap, null, b, 0, null, 208);
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzu {
    public static final Set a = fcwm.d(new azwa(azfi.c.a, bqmc.c.a, azvt.b), new azwa(azfi.c.b, bqmc.c.b, azvt.b));
    public static final Map b;
    public static final azzt c;

    static {
        azfj azfjVar = azfj.a;
        Map map = azfj.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            azer azerVar = (azer) entry.getKey();
            if (!fdbq.f(azerVar, azfi.c.a) && !fdbq.f(azerVar, azfi.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        b = linkedHashMap;
        c = new azzt();
    }
}

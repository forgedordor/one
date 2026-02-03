package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzi {
    public static final Set a = fcwm.b(new azwa(azcg.c.a, bqbb.c.a, azvt.b));
    public static final Map b;
    public static final azzh c;

    static {
        azch azchVar = azch.a;
        Map map = azch.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!fdbq.f((azbs) entry.getKey(), azcg.c.a)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        b = linkedHashMap;
        c = new azzh();
    }
}

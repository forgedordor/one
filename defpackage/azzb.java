package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzb {
    public static final azvz a;
    private static final Set b = fcwm.b(new azwa(azbe.c.b, bpxj.c.b, azvt.b));
    private static final Map c;

    static {
        azbf azbfVar = azbf.a;
        Map map = azbf.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            azaj azajVar = (azaj) entry.getKey();
            if (!fdbq.f(azajVar, azbe.c.a) && !fdbq.f(azajVar, azbe.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new azvz(azxs.a, azyc.a, azza.a, linkedHashMap, null, b, 0, null, 208);
    }
}

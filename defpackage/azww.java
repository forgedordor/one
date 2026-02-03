package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azww {
    public static final azvz a;
    private static final Set b = fcwm.d(new azwa(ayuu.c.b, bocg.c.b, azvt.a), new azwa(ayuu.c.c, bocg.c.c, azvt.c));
    private static final Map c;

    static {
        Map map = ayuw.a;
        Map map2 = ayuw.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            ayub ayubVar = (ayub) entry.getKey();
            if (!fdbq.f(ayubVar, ayuu.c.a) && !fdbq.f(ayubVar, ayuu.c.b) && !fdbq.f(ayubVar, ayuu.c.c)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new azvz(azwg.a, azwn.a, azwv.a, linkedHashMap, null, b, 0, null, 208);
    }
}

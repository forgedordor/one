package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class babl {
    public static final azvz a;
    private static final Set b = fcwm.d(new azwa(azph.c.b, btbt.c.b, azvt.b), new azwa(azph.c.c, btbt.c.c, azvt.c));
    private static final Map c;

    static {
        azpi azpiVar = azpi.a;
        Map map = azpi.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            azop azopVar = (azop) entry.getKey();
            if (!fdbq.f(azopVar, azph.c.a) && !fdbq.f(azopVar, azph.c.b) && !fdbq.f(azopVar, azph.c.c)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new azvz(azxz.a, azyj.a, babk.a, linkedHashMap, null, b, 0, null, 208);
    }
}

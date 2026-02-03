package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzn {
    public static final azvz a;
    private static final Set b = fcwm.d(new azwa(azdx.c.b, bqkl.c.b, azvt.b), new azwa(azdx.c.d, bqkl.c.d, azvt.b, true));
    private static final Map c;

    static {
        azdy azdyVar = azdy.a;
        Map map = azdy.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            azde azdeVar = (azde) entry.getKey();
            if (!fdbq.f(azdeVar, azdx.c.a) && !fdbq.f(azdeVar, azdx.c.b) && !fdbq.f(azdeVar, azdx.c.d)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c = linkedHashMap;
        a = new azvz(azxu.a, azye.a, azzm.a, linkedHashMap, null, b, 0, null, 208);
    }
}

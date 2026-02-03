package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum krh {
    SPREAD,
    SPREAD_INSIDE,
    PACKED;

    public static final Map d;
    public static final Map e;

    static {
        krh krhVar = SPREAD;
        krh krhVar2 = SPREAD_INSIDE;
        krh krhVar3 = PACKED;
        HashMap map = new HashMap();
        d = map;
        HashMap map2 = new HashMap();
        e = map2;
        map.put("packed", krhVar3);
        map.put("spread_inside", krhVar2);
        map.put("spread", krhVar);
        map2.put("packed", 2);
        map2.put("spread_inside", 1);
        map2.put("spread", 0);
    }

    public static int a(String str) {
        Map map = e;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }
}

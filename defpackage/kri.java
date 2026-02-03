package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kri {
    NONE,
    CHAIN,
    ALIGNED;

    public static final Map d;
    public static final Map e;

    static {
        kri kriVar = NONE;
        kri kriVar2 = CHAIN;
        kri kriVar3 = ALIGNED;
        HashMap map = new HashMap();
        d = map;
        HashMap map2 = new HashMap();
        e = map2;
        map.put("none", kriVar);
        map.put("chain", kriVar2);
        map.put("aligned", kriVar3);
        map2.put("none", 0);
        map2.put("chain", 3);
        map2.put("aligned", 2);
    }
}

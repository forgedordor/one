package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdx {
    public static final erdy a(Map map, Map map2) {
        return new erdy(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
    }

    public static final void b(Enum r0, Object obj, Map map, Map map2) {
        map.put(r0, obj);
        map2.put(obj, r0);
    }
}

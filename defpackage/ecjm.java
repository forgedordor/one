package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecjm {
    public static final void a(eclo ecloVar, HashMap map) {
        String strB = ecloVar.b();
        ejwl.f(!map.containsKey(strB), "There is already a factory registered for the ID %s", strB);
        map.put(strB, ecloVar);
    }
}

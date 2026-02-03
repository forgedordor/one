package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqrt {
    private static final Map a = new HashMap();

    public static synchronized Integer a(String str) {
        return (Integer) a.get(str);
    }

    public static synchronized void b(String str, Integer num) {
        a.put(str, num);
    }
}

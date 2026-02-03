package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdf {
    public static long a(Map map) {
        long length = 0;
        if (map == null) {
            return 0L;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) != null) {
                length += r3.length();
            }
            if (entry.getValue() != null) {
                while (((List) entry.getValue()).iterator().hasNext()) {
                    length += ((String) r2.next()).length();
                }
            }
        }
        return length;
    }

    public static int b(int i) {
        if (i != 0) {
            return i != 1 ? 3 : 2;
        }
        return 1;
    }
}

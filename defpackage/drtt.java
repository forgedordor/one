package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drtt {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/flag/FlagFactory");

    public static drtr a(String str, long j) {
        return drtw.a.a(Long.class, str, Long.valueOf(j));
    }

    public static drtr b(String str, String str2) {
        return drtw.a.a(String.class, str, str2);
    }

    public static void c(drts drtsVar, drtr... drtrVarArr) {
        Map map = drtw.a.c;
        synchronized (map) {
            ekhx ekhxVar = (ekhx) map.get(drtsVar);
            if (ekhxVar == null) {
                map.put(drtsVar, ekhx.p(drtrVarArr));
            } else {
                ekhv ekhvVar = new ekhv();
                ekhvVar.j(ekhxVar);
                ekhvVar.h(drtrVarArr);
                map.put(drtsVar, ekhvVar.g());
            }
        }
    }

    public static drtr d(String str) {
        return drtw.a.a(Boolean.class, str, false);
    }
}

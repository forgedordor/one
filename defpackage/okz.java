package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okz {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final String b(Class cls) {
        cls.getClass();
        Map map = ola.a;
        String strA = (String) map.get(cls);
        if (strA == null) {
            okx okxVar = (okx) cls.getAnnotation(okx.class);
            strA = okxVar != null ? okxVar.a() : null;
            if (!a(strA)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(String.valueOf(cls.getSimpleName())));
            }
            map.put(cls, strA);
        }
        strA.getClass();
        return strA;
    }
}

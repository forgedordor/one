package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cinj {
    public static final int a(String str, int i) throws cind {
        try {
            return str.offsetByCodePoints(0, i);
        } catch (IndexOutOfBoundsException e) {
            throw new cind(a.e(i, "Code point ", " is out of bounds for message text"), e);
        }
    }

    public static final cinh b(eyga eygaVar) throws cind {
        Map mapUnmodifiableMap;
        String str;
        eyge eygeVar = (eyge) DesugarCollections.unmodifiableMap(eygaVar.b).get(civa.MENTIONS_NAMESPACE.q);
        if (eygeVar == null || (mapUnmodifiableMap = DesugarCollections.unmodifiableMap(eygeVar.b)) == null || (str = (String) mapUnmodifiableMap.get("Mentions")) == null) {
            return null;
        }
        try {
            return (cinh) evsn.parseFrom(cinh.a, eldz.e.k(str));
        } catch (evtj e) {
            throw new cind("Failed to parse mentions header", e);
        }
    }
}

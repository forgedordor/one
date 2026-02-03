package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfh {
    public static final String a(Map map, ehhz ehhzVar) {
        String strA = ehhzVar.a();
        if (fdgn.G(strA, "#", false)) {
            throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(strA));
        }
        String str = (String) map.get(strA);
        return str != null ? a.q(str, strA, "#") : strA;
    }

    public static final String b(Map map, ehia ehiaVar) {
        String strA = ehiaVar.a();
        if (fdgn.G(strA, "#", false)) {
            throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(strA)));
        }
        String str = (String) map.get(strA);
        return str != null ? a.q(str, strA, "#") : strA;
    }
}

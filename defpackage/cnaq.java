package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnaq {
    public static final aueb a(Map map) {
        boolean z;
        auea aueaVar = (auea) aueb.a.createBuilder();
        aueaVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (fdbq.f(str, "is_upgrade_from_mms_group")) {
                if (fdbq.f(str2, "0")) {
                    z = false;
                } else {
                    if (!fdbq.f(str2, "1")) {
                        throw new IllegalArgumentException(String.valueOf(str).concat(" must be either 0 or 1."));
                    }
                    z = true;
                }
                auec.b(z, aueaVar);
            }
        }
        return auec.a(aueaVar);
    }
}

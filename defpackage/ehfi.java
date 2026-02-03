package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfi implements eyif {
    public static Map a(Map map, Map map2) {
        ekgi ekgiVarH = ekgp.h(((ekoj) map).d);
        for (Map.Entry entry : ((ekgp) map).entrySet()) {
            String str = (String) entry.getKey();
            ehde ehdeVar = (ehde) entry.getValue();
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                ekgiVarH.i(a.q(str2, str, "#"), ehdeVar);
            } else {
                ekgiVarH.i(str, ehdeVar);
            }
        }
        return ekgiVarH.c();
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}

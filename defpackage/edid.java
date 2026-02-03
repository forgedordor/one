package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edid {
    private final Map a = new HashMap();
    private final edhy b;

    public edid(edhy edhyVar) {
        this.b = edhyVar;
    }

    public final edhx a(long j) {
        Map map = this.a;
        Long lValueOf = Long.valueOf(j);
        if (!map.containsKey(lValueOf)) {
            edhy edhyVar = this.b;
            map.put(lValueOf, new edib(edhyVar.a, edhyVar.b, edhyVar.c, edhyVar.d, edhyVar.e, j));
        }
        return (edhx) map.get(lValueOf);
    }
}

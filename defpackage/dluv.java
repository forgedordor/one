package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dluv implements eyif {
    public static Map a(Map map) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(((ekoj) map).d));
        for (Map.Entry entry : ((ekgp) map).entrySet()) {
            dluy dluyVar = (dluy) entry.getKey();
            int i = doif.b;
            Iterator it = doic.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (fdbq.f(((doif) next).b(), dluyVar.a())) {
                    break;
                }
            }
            Object dohzVar = (doif) next;
            if (dohzVar == null) {
                dohzVar = new dohz(dluyVar.a());
            }
            linkedHashMap.put(dohzVar, entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}

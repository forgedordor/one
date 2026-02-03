package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvoq {
    private final Map a;
    private final Map b;

    public dvoq() {
        ekka ekkaVar = new ekka();
        ekkaVar.f(ekkp.WEAK);
        this.a = ekkaVar.e();
        this.b = new HashMap();
    }

    public final synchronized dwwy a(dwpx dwpxVar) {
        Collection collectionValues;
        Map map = this.a;
        if (map.containsKey(dwpxVar)) {
            return (dwwy) map.get(dwpxVar);
        }
        Map map2 = this.b;
        if (map2.containsKey(dwpxVar)) {
            collectionValues = ((Map) map2.get(dwpxVar)).values();
        } else {
            int i = ekgb.d;
            collectionValues = ekoe.a;
        }
        dwxe dwxeVar = new dwxe(ekgb.n(collectionValues));
        map.put(dwpxVar, dwxeVar);
        return dwxeVar;
    }

    public final synchronized void b(dwpx dwpxVar, String str) {
        Map map = this.b;
        if (map.containsKey(dwpxVar)) {
            ((Map) map.get(dwpxVar)).remove(str);
            Map map2 = this.a;
            if (map2.containsKey(dwpxVar)) {
                ((dwxe) map2.get(dwpxVar)).c(ekgb.n(((Map) map.get(dwpxVar)).values()));
            }
            if (((Map) map.get(dwpxVar)).isEmpty()) {
                map.remove(dwpxVar);
            }
        }
    }

    public final synchronized void c(dwpx dwpxVar) {
        Map map = this.b;
        if (map.containsKey(dwpxVar)) {
            map.remove(dwpxVar);
            Map map2 = this.a;
            if (map2.containsKey(dwpxVar)) {
                dwxe dwxeVar = (dwxe) map2.get(dwpxVar);
                int i = ekgb.d;
                dwxeVar.c(ekoe.a);
            }
        }
    }
}

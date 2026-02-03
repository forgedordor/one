package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehnc {
    private final Map a = new HashMap();
    private final fcsu b;

    public ehnc(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    public final Object a(efwo efwoVar) {
        Object obj;
        Map map = this.a;
        synchronized (map) {
            if (!map.containsKey(efwoVar)) {
                ahik ahikVar = (ahik) this.b.b();
                ahikVar.b = efwoVar;
                map.put(efwoVar, new ahjr(ahikVar.a, ahikVar.b));
            }
            obj = map.get(efwoVar);
        }
        return obj;
    }
}

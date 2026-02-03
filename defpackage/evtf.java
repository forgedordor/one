package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evtf extends AbstractMap {
    public final evtb a;
    private final Map b;

    public evtf(Map map, evtb evtbVar) {
        this.b = map;
        this.a = evtbVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new evte(this, this.b.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            return null;
        }
        return this.a.a(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut = this.b.put(obj, Integer.valueOf(((evst) obj2).a()));
        if (objPut == null) {
            return null;
        }
        return this.a.a(objPut);
    }
}

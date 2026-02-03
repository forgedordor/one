package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxp {
    public final Map a = new LinkedHashMap();

    public final lxd a(String str) {
        str.getClass();
        return (lxd) this.a.get(str);
    }

    public final Set b() {
        return new HashSet(this.a.keySet());
    }

    public final void c() {
        Map map = this.a;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((lxd) it.next()).fB();
        }
        map.clear();
    }
}

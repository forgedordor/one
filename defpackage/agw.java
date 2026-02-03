package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agw {
    public final Set a;
    public final Set b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final boolean h;
    public final int i;

    public agw(Set set, Set set2, Map map, Map map2, Map map3, Map map4, Map map5, boolean z, int i) {
        lcg.i(set);
        this.a = set;
        lcg.i(set2);
        this.b = set2;
        lcg.i(map);
        this.c = map;
        lcg.i(map2);
        this.d = map2;
        lcg.i(map3);
        this.e = map3;
        lcg.i(map4);
        this.f = map4;
        lcg.i(map5);
        this.g = map5;
        this.h = z;
        this.i = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static csq a(Map map) {
        csq csqVar = new csq(((cvw) map).d);
        for (Map.Entry entry : map.entrySet()) {
            css cssVar = new css();
            Iterator it = ((Set) entry.getValue()).iterator();
            while (it.hasNext()) {
                cssVar.add(new css((Set) it.next()));
            }
            csqVar.put((String) entry.getKey(), cssVar);
        }
        return csqVar;
    }

    public final Map b() {
        return DesugarCollections.unmodifiableMap(this.e);
    }

    public final Map c() {
        return a(this.d);
    }

    public final Map d() {
        csq csqVar = new csq();
        for (Map.Entry entry : this.f.entrySet()) {
            csqVar.put((String) entry.getKey(), new css((Collection) entry.getValue()));
        }
        return csqVar;
    }

    public final Map e() {
        csq csqVar = new csq();
        for (Map.Entry entry : this.c.entrySet()) {
            csqVar.put((String) entry.getKey(), new css((Collection) entry.getValue()));
        }
        return csqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agw)) {
            return false;
        }
        agw agwVar = (agw) obj;
        return this.a.equals(agwVar.a) && this.b.equals(agwVar.b) && this.c.equals(agwVar.c) && this.d.equals(agwVar.d) && this.e.equals(agwVar.e) && this.f.equals(agwVar.f) && this.g.equals(agwVar.g) && this.h == agwVar.h && this.i == agwVar.i;
    }

    public final Set f() {
        return DesugarCollections.unmodifiableSet(this.a);
    }

    public final Set g() {
        return DesugarCollections.unmodifiableSet(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Integer.valueOf(this.i));
    }
}

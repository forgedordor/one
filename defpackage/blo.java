package defpackage;

import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class blo implements bjq {
    protected static final Comparator a;
    public static final blo b;
    protected final TreeMap c;

    static {
        Comparator comparator = new Comparator() { // from class: bln
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                blo bloVar = blo.b;
                return ((bjo) obj).c().compareTo(((bjo) obj2).c());
            }
        };
        a = comparator;
        b = new blo(new TreeMap(comparator));
    }

    public blo(TreeMap treeMap) {
        this.c = treeMap;
    }

    public static blo f(bjq bjqVar) {
        if (blo.class.equals(bjqVar.getClass())) {
            return (blo) bjqVar;
        }
        TreeMap treeMap = new TreeMap(a);
        for (bjo bjoVar : bjqVar.s()) {
            Set<bjp> setR = bjqVar.r(bjoVar);
            ArrayMap arrayMap = new ArrayMap();
            for (bjp bjpVar : setR) {
                arrayMap.put(bjpVar, bjqVar.o(bjoVar, bjpVar));
            }
            treeMap.put(bjoVar, arrayMap);
        }
        return new blo(treeMap);
    }

    @Override // defpackage.bjq
    public final bjp i(bjo bjoVar) {
        Map map = (Map) this.c.get(bjoVar);
        if (map != null) {
            return (bjp) Collections.min(map.keySet());
        }
        Objects.toString(bjoVar);
        throw new IllegalArgumentException("Option does not exist: ".concat(String.valueOf(bjoVar)));
    }

    @Override // defpackage.bjq
    public final Object m(bjo bjoVar) {
        Map map = (Map) this.c.get(bjoVar);
        if (map != null) {
            return map.get((bjp) Collections.min(map.keySet()));
        }
        Objects.toString(bjoVar);
        throw new IllegalArgumentException("Option does not exist: ".concat(String.valueOf(bjoVar)));
    }

    @Override // defpackage.bjq
    public final Object n(bjo bjoVar, Object obj) {
        try {
            return m(bjoVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // defpackage.bjq
    public final Object o(bjo bjoVar, bjp bjpVar) {
        Map map = (Map) this.c.get(bjoVar);
        if (map == null) {
            Objects.toString(bjoVar);
            throw new IllegalArgumentException("Option does not exist: ".concat(String.valueOf(bjoVar)));
        }
        if (map.containsKey(bjpVar)) {
            return map.get(bjpVar);
        }
        throw new IllegalArgumentException(a.i(bjpVar, bjoVar, "Option does not exist: ", " with priority="));
    }

    @Override // defpackage.bjq
    public final Set r(bjo bjoVar) {
        Map map = (Map) this.c.get(bjoVar);
        return map == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.bjq
    public final Set s() {
        return DesugarCollections.unmodifiableSet(this.c.keySet());
    }

    @Override // defpackage.bjq
    public final boolean t(bjo bjoVar) {
        return this.c.containsKey(bjoVar);
    }

    @Override // defpackage.bjq
    public final void v(ayf ayfVar) {
        for (Map.Entry entry : this.c.tailMap(new bhd("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((bjo) entry.getKey()).c().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            bjo bjoVar = (bjo) entry.getKey();
            ayg aygVar = ayfVar.a;
            bjq bjqVar = ayfVar.b;
            aygVar.a.d(bjoVar, bjqVar.i(bjoVar), bjqVar.m(bjoVar));
        }
    }
}

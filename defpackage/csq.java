package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csq extends cvw implements Map, j$.util.Map {
    csk a;
    csm b;
    cso c;

    public csq() {
    }

    public final boolean a(Collection collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(d(i2))) {
                e(i2);
            }
        }
        return i != this.d;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        csk cskVar = this.a;
        if (cskVar != null) {
            return cskVar;
        }
        csk cskVar2 = new csk(this);
        this.a = cskVar2;
        return cskVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        csm csmVar = this.b;
        if (csmVar != null) {
            return csmVar;
        }
        csm csmVar2 = new csm(this);
        this.b = csmVar2;
        return csmVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        h(this.d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        cso csoVar = this.c;
        if (csoVar != null) {
            return csoVar;
        }
        cso csoVar2 = new cso(this);
        this.c = csoVar2;
        return csoVar2;
    }

    public csq(int i) {
        super(i);
    }

    public csq(cvw cvwVar) {
        super((byte[]) null);
        if (cvwVar != null) {
            i(cvwVar);
        }
    }
}

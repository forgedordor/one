package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hvr extends fcum implements Map, huw {
    public hwt a = new hwt();
    public hwg b;
    public Object c;
    public int d;
    public int e;
    private hvp f;

    public hvr(hvp hvpVar) {
        this.f = hvpVar;
        hvp hvpVar2 = this.f;
        this.b = hvpVar2.b;
        this.e = hvpVar2.b();
    }

    @Override // defpackage.fcum
    public final int b() {
        return this.e;
    }

    @Override // defpackage.huw
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public hvp a() {
        hwg hwgVar = this.b;
        hvp hvpVar = this.f;
        if (hwgVar != hvpVar.b) {
            this.a = new hwt();
            hvpVar = new hvp(hwgVar, b());
        }
        this.f = hvpVar;
        return hvpVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = hwg.a;
        g(0);
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.fcum
    public final Collection d() {
        return new hvx(this);
    }

    @Override // defpackage.fcum
    public final Set e() {
        return new hvt(this);
    }

    @Override // defpackage.fcum
    public final Set f() {
        return new hvv(this);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final void g(int i) {
        this.e = i;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.c = null;
        this.b = this.b.e(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        hvp hvpVarA = map instanceof hvp ? (hvp) map : null;
        if (hvpVarA == null) {
            hvr hvrVar = map instanceof hvr ? (hvr) map : null;
            hvpVarA = hvrVar != null ? hvrVar.a() : null;
        }
        if (hvpVarA == null) {
            super.putAll(map);
            return;
        }
        hwq hwqVar = new hwq(null);
        int iB = b();
        hwg hwgVar = this.b;
        hwg hwgVar2 = hvpVarA.b;
        hwgVar2.getClass();
        this.b = hwgVar.f(hwgVar2, 0, hwqVar, this);
        int iB2 = (hvpVarA.b() + iB) - hwqVar.a;
        if (iB != iB2) {
            g(iB2);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.c = null;
        hwg hwgVarG = this.b.g(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (hwgVarG == null) {
            hwgVarG = hwg.a;
        }
        this.b = hwgVarG;
        return this.c;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iB = b();
        hwg hwgVarH = this.b.h(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (hwgVarH == null) {
            hwgVarH = hwg.a;
        }
        this.b = hwgVarH;
        return iB != b();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}

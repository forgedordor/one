package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekgp<K, V> implements Map<K, V>, Serializable, j$.util.Map<K, V> {
    static final Map.Entry[] b = new Map.Entry[0];
    private static final long serialVersionUID = 912559;
    private transient ekhx a;
    private transient ekhx c;
    private transient ekfn d;
    private transient ekib e;

    public static ekgi h(int i) {
        ekcw.c(i, "expectedSize");
        return new ekgi(i);
    }

    public static ekgp i(Iterable iterable) {
        ekgi ekgiVar = new ekgi(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        ekgiVar.l(iterable);
        return ekgiVar.c();
    }

    public static ekgp j(Map map) {
        if ((map instanceof ekgp) && !(map instanceof SortedMap)) {
            ekgp ekgpVar = (ekgp) map;
            if (!ekgpVar.hs()) {
                return ekgpVar;
            }
        }
        return i(map.entrySet());
    }

    public static ekgp k() {
        return ekoj.a;
    }

    public static ekgp l(Object obj, Object obj2) {
        ekcw.a(obj, obj2);
        return ekoj.a(1, new Object[]{obj, obj2});
    }

    public static ekgp m(Object obj, Object obj2, Object obj3, Object obj4) {
        ekcw.a(obj, obj2);
        ekcw.a(obj3, obj4);
        return ekoj.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static ekgp n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ekcw.a(obj, obj2);
        ekcw.a(obj3, obj4);
        ekcw.a(obj5, obj6);
        return ekoj.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static ekgp o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        ekcw.a(obj, obj2);
        ekcw.a(obj3, obj4);
        ekcw.a(obj5, obj6);
        ekcw.a(obj7, obj8);
        return ekoj.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static ekgp p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        ekcw.a(obj, obj2);
        ekcw.a(obj3, obj4);
        ekcw.a(obj5, obj6);
        ekcw.a(obj7, obj8);
        ekcw.a(obj9, obj10);
        return ekoj.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static ekgp q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        ekcw.a(obj, obj2);
        ekcw.a(obj3, obj4);
        ekcw.a(obj5, obj6);
        ekcw.a(obj7, obj8);
        ekcw.a(obj9, obj10);
        ekcw.a(obj11, obj12);
        return ekoj.a(6, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12});
    }

    public static ekgp r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        ekcw.a(obj, obj2);
        ekcw.a(obj3, obj4);
        ekcw.a(obj5, obj6);
        ekcw.a(obj7, obj8);
        ekcw.a(obj9, obj10);
        ekcw.a(obj11, obj12);
        ekcw.a(obj13, obj14);
        ekcw.a(obj15, obj16);
        return ekoj.a(8, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16});
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static Collector v() {
        return ekcv.a(new Function() { // from class: ekge
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: ekgf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public abstract ekfn c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
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
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ekfn values() {
        ekfn ekfnVar = this.d;
        if (ekfnVar != null) {
            return ekfnVar;
        }
        ekfn ekfnVarC = c();
        this.d = ekfnVarC;
        return ekfnVarC;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return ekmi.m(this, obj);
    }

    public abstract ekhx f();

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public abstract ekhx g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return ekpg.a(entrySet());
    }

    public ekqg hr() {
        return new ekgg(entrySet().listIterator());
    }

    public abstract boolean hs();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ekhx entrySet() {
        ekhx ekhxVar = this.a;
        if (ekhxVar != null) {
            return ekhxVar;
        }
        ekhx ekhxVarF = f();
        this.a = ekhxVarF;
        return ekhxVarF;
    }

    @Override // java.util.Map
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ekhx keySet() {
        ekhx ekhxVar = this.c;
        if (ekhxVar != null) {
            return ekhxVar;
        }
        ekhx ekhxVarG = g();
        this.c = ekhxVarG;
        return ekhxVarG;
    }

    public final String toString() {
        return ekmi.g(this);
    }

    public final ekib u() {
        if (isEmpty()) {
            return ekdz.a;
        }
        ekib ekibVar = this.e;
        if (ekibVar != null) {
            return ekibVar;
        }
        ekib ekibVar2 = new ekib(new ekgn(this), size());
        this.e = ekibVar2;
        return ekibVar2;
    }

    public Object writeReplace() {
        return new ekgo(this);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}

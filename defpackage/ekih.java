package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekih extends ekgp implements NavigableMap, Map {
    public static final Comparator a;
    private static final ekih e;
    private static final long serialVersionUID = 0;
    public final transient ekoo c;
    public final transient ekgb d;
    private transient ekih f;

    static {
        ekno eknoVar = ekno.a;
        a = eknoVar;
        ekoo ekooVarG = ekik.G(eknoVar);
        int i = ekgb.d;
        e = new ekih(ekooVarG, ekoe.a);
    }

    public ekih(ekoo ekooVar, ekgb ekgbVar, ekih ekihVar) {
        this.c = ekooVar;
        this.d = ekgbVar;
        this.f = ekihVar;
    }

    private final ekih C(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return w(comparator());
        }
        return new ekih(this.c.K(i, i2), this.d.subList(i, i2));
    }

    public static ekih a(java.util.Map map, Comparator comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == a) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof ekih)) {
            ekih ekihVar = (ekih) map;
            if (!ekihVar.hs()) {
                return ekihVar;
            }
        }
        return x(comparator, zEquals, map.entrySet());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static ekih w(Comparator comparator) {
        if (ekno.a.equals(comparator)) {
            return e;
        }
        ekoo ekooVarG = ekik.G(comparator);
        int i = ekgb.d;
        return new ekih(ekooVarG, ekoe.a);
    }

    public static ekih x(final Comparator comparator, boolean z, Iterable iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) ekis.t(iterable, b);
        int length = entryArr.length;
        if (length == 0) {
            return w(comparator);
        }
        int i = 1;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            entry.getClass();
            return z(comparator, entry.getKey(), entry.getValue());
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (z) {
            for (int i2 = 0; i2 < length; i2++) {
                Map.Entry entry2 = entryArr[i2];
                entry2.getClass();
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                ekcw.a(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new Comparator() { // from class: ekic
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    Map.Entry entry4 = (Map.Entry) obj2;
                    Comparator comparator2 = ekih.a;
                    entry3.getClass();
                    entry4.getClass();
                    return comparator.compare(entry3.getKey(), entry4.getKey());
                }
            });
            Map.Entry entry3 = entryArr[0];
            entry3.getClass();
            Object key2 = entry3.getKey();
            objArr[0] = key2;
            Object value2 = entry3.getValue();
            objArr2[0] = value2;
            ekcw.a(objArr[0], value2);
            while (i < length) {
                Map.Entry entry4 = entryArr[i - 1];
                entry4.getClass();
                Map.Entry entry5 = entryArr[i];
                entry5.getClass();
                Object key3 = entry5.getKey();
                Object value3 = entry5.getValue();
                ekcw.a(key3, value3);
                objArr[i] = key3;
                objArr2[i] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException(a.c(entry5, entry4, "Multiple entries with same key: ", " and "));
                }
                i++;
                key2 = key3;
            }
        }
        return new ekih(new ekoo(ekgb.h(objArr), comparator), ekgb.h(objArr2));
    }

    public static ekih z(Comparator comparator, Object obj, Object obj2) {
        return new ekih(new ekoo(ekgb.r(obj), comparator), ekgb.r(obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ekih subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        ejwl.i(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ekih tailMap(Object obj, boolean z) {
        obj.getClass();
        return C(this.c.J(obj, z), size());
    }

    @Override // defpackage.ekgp
    public final ekfn c() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ekmi.e(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((ekik) this.c).a;
    }

    @Override // defpackage.ekgp
    /* renamed from: d */
    public final ekfn values() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        ekih ekihVar = this.f;
        return ekihVar == null ? isEmpty() ? w(eknw.d(comparator()).c()) : new ekih((ekoo) this.c.descendingSet(), this.d.a(), this) : ekihVar;
    }

    @Override // defpackage.ekgp, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // defpackage.ekgp
    public final ekhx f() {
        return isEmpty() ? ekon.a : new ekie(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ekmi.e(floorEntry(obj));
    }

    @Override // defpackage.ekgp
    public final ekhx g() {
        throw new AssertionError("should never be called");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // defpackage.ekgp, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            ekoo r0 = r3.c
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            ekgb r2 = r0.d     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.a     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            ekgb r0 = r3.d
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekih.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ekmi.e(higherEntry(obj));
    }

    @Override // defpackage.ekgp
    public final boolean hs() {
        return this.c.l() || this.d.l();
    }

    @Override // defpackage.ekgp, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ekmi.e(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.ekgp
    /* renamed from: t */
    public final /* synthetic */ ekhx keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // defpackage.ekgp, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.d;
    }

    @Override // defpackage.ekgp
    public Object writeReplace() {
        return new ekig(this);
    }

    @Override // java.util.NavigableMap
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final ekih headMap(Object obj, boolean z) {
        obj.getClass();
        return C(0, this.c.I(obj, z));
    }

    public ekih(ekoo ekooVar, ekgb ekgbVar) {
        this(ekooVar, ekgbVar, null);
    }
}

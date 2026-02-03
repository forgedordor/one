package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzu<K, V> extends hzw<K, V, Map.Entry<K, V>> {
    public hzu(iaf iafVar) {
        super(iafVar);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        iag.a();
        throw new fcta();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        iag.a();
        throw new fcta();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!fdcm.c(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return fdbq.f(this.a.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hut, java.util.Set] */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        iaf iafVar = this.a;
        return new ias(iafVar, iafVar.c().a.entrySet().iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        return fdcm.c(obj) && this.a.remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        hux huxVar;
        int i;
        hzg hzgVarB;
        boolean zF;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(collection, 10)), 16));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            fcti fctiVar = new fcti(entry.getKey(), entry.getValue());
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        iaf iafVar = this.a;
        boolean z = false;
        do {
            synchronized (iag.a) {
                iay iayVar = iafVar.a;
                iayVar.getClass();
                iae iaeVar = (iae) hzt.e(iayVar);
                huxVar = iaeVar.a;
                i = iaeVar.b;
            }
            huxVar.getClass();
            Set<Map.Entry> set = iafVar.b;
            huw huwVarA = huxVar.a();
            for (Map.Entry entry2 : set) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !fdbq.f(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    huwVarA.remove(entry2.getKey());
                    z = true;
                }
            }
            hux huxVarA = huwVarA.a();
            if (fdbq.f(huxVarA, huxVar)) {
                break;
            }
            iay iayVar2 = iafVar.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zF = iaf.f((iae) hzt.l(iayVar2, iafVar, hzgVarB), i, huxVarA);
            }
            hzt.t(hzgVarB, iafVar);
        } while (!zF);
        return z;
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzv extends hzw {
    public hzv(iaf iafVar) {
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
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hut, java.util.Set] */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        iaf iafVar = this.a;
        return new iau(iafVar, iafVar.c().a.entrySet().iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.remove(it.next()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        hux huxVar;
        int i;
        hzg hzgVarB;
        boolean zF;
        iaf iafVar = this.a;
        Set setAv = fcva.av(collection);
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
            for (Map.Entry entry : set) {
                if (!setAv.contains(entry.getKey())) {
                    huwVarA.remove(entry.getKey());
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

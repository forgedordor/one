package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekps<K, V> extends ekqb<Map.Entry<K, Collection<V>>> {
    private static final long serialVersionUID = 0;

    public ekps(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.ekpv, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.g) {
            zContains = !(obj instanceof Map.Entry) ? false : a().contains(ekmi.k((Map.Entry) obj));
        }
        return zContains;
    }

    @Override // defpackage.ekpv, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        boolean zA;
        synchronized (this.g) {
            zA = ekcz.a(a(), collection);
        }
        return zA;
    }

    @Override // defpackage.ekqb, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zL;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zL = ekpg.l(a(), obj);
        }
        return zL;
    }

    @Override // defpackage.ekpv, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new ekpr(this, super.iterator());
    }

    @Override // defpackage.ekpv, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.g) {
            zRemove = !(obj instanceof Map.Entry) ? false : a().remove(ekmi.k((Map.Entry) obj));
        }
        return zRemove;
    }

    @Override // defpackage.ekpv, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        boolean zN;
        synchronized (this.g) {
            zN = ekjc.n(a().iterator(), collection);
        }
        return zN;
    }

    @Override // defpackage.ekpv, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean zO;
        synchronized (this.g) {
            zO = ekjc.o(a().iterator(), collection);
        }
        return zO;
    }

    @Override // defpackage.ekpv, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr;
        synchronized (this.g) {
            Set setA = a();
            objArr = new Object[setA.size()];
            eknr.h(setA, objArr);
        }
        return objArr;
    }

    @Override // defpackage.ekpv, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.g) {
            tArr2 = (T[]) eknr.d(a(), tArr);
        }
        return tArr2;
    }
}

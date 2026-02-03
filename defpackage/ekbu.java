package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekbu<E> extends AbstractCollection<E> implements ekni<E> {
    private transient Set a;
    private transient Set b;

    public int a(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ekni
    public final boolean add(E e) {
        a(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (!(collection instanceof ekni)) {
            if (collection.isEmpty()) {
                return false;
            }
            return ekjc.l(this, collection.iterator());
        }
        ekni ekniVar = (ekni) collection;
        if (!(ekniVar instanceof ekbm)) {
            if (ekniVar.isEmpty()) {
                return false;
            }
            for (eknh eknhVar : ekniVar.j()) {
                a(eknhVar.b(), eknhVar.a());
            }
            return true;
        }
        ekbm ekbmVar = (ekbm) ekniVar;
        if (ekbmVar.isEmpty()) {
            return false;
        }
        for (int iA = ekbmVar.a.a(); iA >= 0; iA = ekbmVar.a.e(iA)) {
            a(ekbmVar.a.i(iA), ekbmVar.a.c(iA));
        }
        return true;
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ekni
    public final boolean contains(Object obj) {
        return b(obj) > 0;
    }

    public int d(Object obj, int i) {
        throw null;
    }

    public abstract Iterator e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return eknn.a(this, obj);
    }

    public abstract Iterator f();

    public boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return j().hashCode();
    }

    @Override // defpackage.ekni
    public final Set i() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        ekbs ekbsVar = new ekbs(this);
        this.a = ekbsVar;
        return ekbsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return j().isEmpty();
    }

    @Override // defpackage.ekni
    public final Set j() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        ekbt ekbtVar = new ekbt(this);
        this.b = ekbtVar;
        return ekbtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ekni
    public final boolean remove(Object obj) {
        return d(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof ekni) {
            collection = ((ekni) collection).i();
        }
        return i().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof ekni) {
            collection = ((ekni) collection).i();
        }
        return i().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }
}

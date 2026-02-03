package defpackage;

import j$.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hva<E> extends fcuh<E> implements List<E>, huv {
    @Override // defpackage.fcub, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.fcub, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.huv
    public huv e(Collection collection) {
        huu huuVarB = b();
        huuVarB.addAll(collection);
        return huuVarB.a();
    }

    @Override // defpackage.huv
    public final huv f(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? i(iIndexOf) : this;
    }

    @Override // defpackage.huv
    public final huv g(final Collection collection) {
        return h(new fdap() { // from class: huz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    @Override // defpackage.fcuh, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // defpackage.fcuh, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return new hur(this, i, i2);
    }
}

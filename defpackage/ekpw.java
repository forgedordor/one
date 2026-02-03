package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekpw<E> extends ekpv<E> implements List<E> {
    private static final long serialVersionUID = 0;

    public ekpw(List list, Object obj) {
        super(list, obj);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        synchronized (this.g) {
            a().add(i, e);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        boolean zAddAll;
        synchronized (this.g) {
            zAddAll = a().addAll(i, collection);
        }
        return zAddAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ekpv
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a() {
        return (List) super.a();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.List
    public final E get(int i) {
        E e;
        synchronized (this.g) {
            e = (E) a().get(i);
        }
        return e;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.g) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.g) {
            iIndexOf = a().indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.g) {
            iLastIndexOf = a().lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return a().listIterator();
    }

    @Override // java.util.List
    public final E remove(int i) {
        E e;
        synchronized (this.g) {
            e = (E) a().remove(i);
        }
        return e;
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        E e2;
        synchronized (this.g) {
            e2 = (E) a().set(i, e);
        }
        return e2;
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        List<E> listB;
        Object obj = this.g;
        synchronized (obj) {
            listB = ekqd.b(a().subList(i, i2), obj);
        }
        return listB;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return a().listIterator(i);
    }
}

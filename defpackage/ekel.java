package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekel<E> extends ekei<E> implements List<E> {
    protected ekel() {
    }

    @Override // java.util.List
    public void add(int i, E e) {
        c().add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return c().addAll(i, collection);
    }

    @Override // defpackage.ekei
    /* renamed from: b */
    protected /* bridge */ /* synthetic */ Collection hp() {
        throw null;
    }

    protected abstract List c();

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        return (E) c().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return c().listIterator();
    }

    @Override // java.util.List
    public final E remove(int i) {
        return (E) c().remove(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return (E) c().set(i, e);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return c().subList(i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return c().listIterator(i);
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekei<E> extends eker implements Collection<E> {
    protected ekei() {
    }

    public boolean add(E e) {
        return hp().add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return hp().addAll(collection);
    }

    /* renamed from: b */
    protected abstract Collection hp();

    @Override // java.util.Collection
    public final void clear() {
        hp().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return hp().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return hp().containsAll(collection);
    }

    public final boolean d(Object obj) {
        return ekjc.m(iterator(), obj);
    }

    protected final Object[] e() {
        return toArray(new Object[size()]);
    }

    @Override // defpackage.eker
    protected /* bridge */ /* synthetic */ Object hp() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return hp().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return hp().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return hp().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return hp().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return hp().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return hp().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return hp().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) hp().toArray(tArr);
    }
}

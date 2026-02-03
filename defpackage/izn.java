package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izn implements Collection, j$.util.Collection, fdcn {
    public final cuv a;

    public izn() {
        this(null);
    }

    @Override // java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        return this.a.d(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.g(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.g(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.h();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new cux(new cuy(this.a));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.e(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        return this.a.e(collection);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate<? super Object> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        return this.a.f(collection);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.a.g;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return fdbj.a(this);
    }

    public /* synthetic */ izn(byte[] bArr) {
        int i = cvl.a;
        this.a = new cuv((byte[]) null);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) fdbj.b(this, tArr);
    }
}

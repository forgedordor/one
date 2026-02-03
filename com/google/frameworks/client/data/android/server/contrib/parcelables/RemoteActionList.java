package com.google.frameworks.client.data.android.server.contrib.parcelables;

import android.app.RemoteAction;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.akc$$ExternalSyntheticApiModelOutline0;
import defpackage.esur;
import defpackage.fdbj;
import defpackage.fdbq;
import defpackage.fdcn;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class RemoteActionList implements Parcelable, List<RemoteAction>, j$.util.List<RemoteAction>, fdcn {
    public static final Parcelable.Creator<RemoteActionList> CREATOR = new esur();
    private final List<RemoteAction> data;

    public RemoteActionList(List<RemoteAction> list) {
        list.getClass();
        this.data = list;
    }

    private final List<RemoteAction> component1() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteActionList copy$default(RemoteActionList remoteActionList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = remoteActionList.data;
        }
        return remoteActionList.copy(list);
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, RemoteAction remoteAction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends RemoteAction> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(RemoteAction remoteAction) {
        remoteAction.getClass();
        return this.data.contains(remoteAction);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        collection.getClass();
        return this.data.containsAll(collection);
    }

    public final RemoteActionList copy(List<RemoteAction> list) {
        list.getClass();
        return new RemoteActionList(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RemoteActionList) && fdbq.f(this.data, ((RemoteActionList) obj).data);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public RemoteAction get(int i) {
        return akc$$ExternalSyntheticApiModelOutline0.m133m((Object) this.data.get(i));
    }

    public int getSize() {
        return this.data.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.data.hashCode();
    }

    public int indexOf(RemoteAction remoteAction) {
        remoteAction.getClass();
        return this.data.indexOf(remoteAction);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<RemoteAction> iterator() {
        return this.data.iterator();
    }

    public int lastIndexOf(RemoteAction remoteAction) {
        remoteAction.getClass();
        return this.data.lastIndexOf(remoteAction);
    }

    @Override // java.util.List
    public ListIterator<RemoteAction> listIterator() {
        return this.data.listIterator();
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public RemoteAction remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator<RemoteAction> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public RemoteAction set2(int i, RemoteAction remoteAction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super RemoteAction> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public java.util.List<RemoteAction> subList(int i, int i2) {
        return this.data.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return fdbj.a(this);
    }

    public String toString() {
        return "RemoteActionList(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        java.util.List<RemoteAction> list = this.data;
        parcel.writeInt(list.size());
        Iterator<RemoteAction> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, RemoteAction remoteAction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends RemoteAction> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (akc$$ExternalSyntheticApiModelOutline0.m150m(obj)) {
            return contains(akc$$ExternalSyntheticApiModelOutline0.m133m(obj));
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (akc$$ExternalSyntheticApiModelOutline0.m150m(obj)) {
            return indexOf(akc$$ExternalSyntheticApiModelOutline0.m133m(obj));
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (akc$$ExternalSyntheticApiModelOutline0.m150m(obj)) {
            return lastIndexOf(akc$$ExternalSyntheticApiModelOutline0.m133m(obj));
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<RemoteAction> listIterator(int i) {
        return this.data.listIterator(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ RemoteAction remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ RemoteAction set(int i, RemoteAction remoteAction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    public boolean add(RemoteAction remoteAction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) fdbj.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

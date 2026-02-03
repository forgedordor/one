package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoma<E> extends ekel<E> {
    final List a;

    public eoma(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.ekel, java.util.List
    public final void add(int i, E e) {
        e.getClass();
        this.a.add(i, e);
    }

    @Override // defpackage.ekel, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.a.addAll(i, eome.a(collection));
    }

    @Override // defpackage.ekel, defpackage.ekei
    /* renamed from: b */
    protected final /* synthetic */ Collection hp() {
        return this.a;
    }

    @Override // defpackage.ekel
    protected final List c() {
        return this.a;
    }

    @Override // defpackage.ekei, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }

    @Override // defpackage.ekel, java.util.List
    public final ListIterator<E> listIterator() {
        return new eomb(this.a.listIterator());
    }

    @Override // defpackage.ekel, java.util.List
    public final E set(int i, E e) {
        e.getClass();
        return (E) this.a.set(i, e);
    }

    @Override // defpackage.ekel, java.util.List
    public final List<E> subList(int i, int i2) {
        return new eoma(this.a.subList(i, i2));
    }

    @Override // defpackage.ekel, java.util.List
    public final ListIterator<E> listIterator(int i) {
        return new eomb(this.a.listIterator(i));
    }

    @Override // defpackage.ekei, java.util.Collection, java.util.Queue
    public final boolean add(E e) {
        e.getClass();
        return this.a.add(e);
    }

    @Override // defpackage.ekei, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(eome.a(collection));
    }
}

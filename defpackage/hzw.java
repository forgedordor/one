package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class hzw<K, V, E> implements Set<E>, fdcs {
    public final iaf a;

    public hzw(iaf iafVar) {
        this.a = iafVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return fdbj.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) fdbj.b(this, tArr);
    }
}

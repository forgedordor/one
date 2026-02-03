package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsz<T> extends AbstractList<T> {
    private final evsx a;
    private final evsy b;

    public evsz(evsx evsxVar, evsy evsyVar) {
        this.a = evsxVar;
        this.b = evsyVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.b.a(this.a.d(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}

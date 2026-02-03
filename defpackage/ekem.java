package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekem extends ekek implements ListIterator {
    protected ekem() {
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        c().add(obj);
    }

    @Override // defpackage.ekek
    protected /* bridge */ /* synthetic */ Iterator b() {
        throw null;
    }

    protected abstract ListIterator c();

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        c().set(obj);
    }
}

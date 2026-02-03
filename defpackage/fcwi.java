package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcwi implements ListIterator, fdcn {
    final /* synthetic */ fcwj a;
    private final ListIterator b;

    public fcwi(fcwj fcwjVar, int i) {
        this.a = fcwjVar;
        List list = fcwjVar.a;
        if (i >= 0 && i <= fcwjVar.a()) {
            this.b = list.listIterator(fcwjVar.a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new fddq(0, fcwjVar.a()) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return fcvi.C(this.a, this.b.previousIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return fcvi.C(this.a, this.b.nextIndex());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

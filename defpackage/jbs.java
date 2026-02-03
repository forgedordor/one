package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbs implements ListIterator, fdcn {
    final /* synthetic */ jbu a;
    private int b;
    private final int c;
    private final int d;

    public jbs(jbu jbuVar, int i, int i2, int i3) {
        this.a = jbuVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        Object objL = this.a.a.l(i);
        objL.getClass();
        return (icr) objL;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b - this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        int i = this.b - 1;
        this.b = i;
        Object objL = this.a.a.l(i);
        objL.getClass();
        return (icr) objL;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.b - this.c) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ jbs(jbu jbuVar, int i, int i2) {
        this(jbuVar, 1 == (i2 & 1) ? 0 : i, 0, jbuVar.a());
    }
}

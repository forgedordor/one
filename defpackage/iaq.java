package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaq implements ListIterator, fdcn {
    private final iac a;
    private int b;
    private int c = -1;
    private int d;

    public iaq(iac iacVar, int i) {
        this.a = iacVar;
        this.b = i - 1;
        this.d = iacVar.b();
    }

    private final void a() {
        if (this.a.b() != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b + 1;
        iac iacVar = this.a;
        iacVar.add(i, obj);
        this.c = -1;
        this.b++;
        this.d = iacVar.b();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a() + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.b + 1;
        this.c = i;
        iac iacVar = this.a;
        iad.a(i, iacVar.a());
        Object obj = iacVar.get(i);
        this.b = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.b;
        iac iacVar = this.a;
        iad.a(i, iacVar.a());
        int i2 = this.b;
        this.c = i2;
        this.b--;
        return iacVar.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        iac iacVar = this.a;
        iacVar.f(this.b);
        this.b--;
        this.c = -1;
        this.d = iacVar.b();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.c;
        if (i < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        iac iacVar = this.a;
        iacVar.set(i, obj);
        this.d = iacVar.b();
    }
}

package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjl implements ListIterator {
    int a;
    ekjk b;
    ekjk c;
    ekjk d;
    int e;
    final /* synthetic */ ekjn f;

    public ekjl(ekjn ekjnVar, int i) {
        this.f = ekjnVar;
        this.e = ekjnVar.e;
        int i2 = ekjnVar.d;
        ejwl.x(i, i2);
        if (i >= i2 / 2) {
            this.d = ekjnVar.b;
            this.a = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.b = ekjnVar.a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.c = null;
    }

    private final void c() {
        if (this.f.e != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekjk next() {
        c();
        ekjk ekjkVar = this.b;
        if (ekjkVar == null) {
            throw new NoSuchElementException();
        }
        this.c = ekjkVar;
        this.d = ekjkVar;
        this.b = ekjkVar.c;
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekjk previous() {
        c();
        ekjk ekjkVar = this.d;
        if (ekjkVar == null) {
            throw new NoSuchElementException();
        }
        this.c = ekjkVar;
        this.b = ekjkVar;
        this.d = ekjkVar.d;
        this.a--;
        return this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        c();
        return this.b != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        c();
        return this.d != null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        ejwl.m(this.c != null, "no calls to next() since the last call to remove()");
        ekjk ekjkVar = this.c;
        if (ekjkVar != this.b) {
            this.d = ekjkVar.d;
            this.a--;
        } else {
            this.b = ekjkVar.c;
        }
        ekjn ekjnVar = this.f;
        ekjnVar.f(ekjkVar);
        this.c = null;
        this.e = ekjnVar.e;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
